package cn.ncu.retest.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ncu.retest.mapper.ScoreMapper;
import cn.ncu.retest.pojo.IdSortVo;
import cn.ncu.retest.pojo.PageVo;
import cn.ncu.retest.pojo.Score;
import cn.ncu.retest.pojo.ScoreExample;
import cn.ncu.retest.pojo.SearchVo;
import cn.ncu.retest.service.ScoreService;
import cn.ncu.retest.utils.Result;
import cn.ncu.retest.utils.SortListUtil;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	private ScoreMapper scoreMapper;

	// 将excel数据导入到数据库中
	public Result importDatoFromExcel(List<Score> scoreList, String collegeCode) {
		if (collegeCode.equals("099")) {
			for (Score score : scoreList) {
				scoreMapper.insertSelective(score);
			}
		}
		if (collegeCode.equals("004")) {

			for (Score score : scoreList) {
				scoreMapper.updateSingleKy(score);
			}
		}
		if (!collegeCode.equals("004") && !collegeCode.equals("099")) {
			for (Score score : scoreList) {

				scoreMapper.updateSingle(score);
			}
		}

		return Result.ok();
	}

	// 更新单条记录(信工院)
	public Result updateSingle(Score score) {
		int num = scoreMapper.updateSingle(score);
		if (num > 0) {
			return Result.ok();
		}
		return Result.build(201, "更新失败");
	}

	// 根据考生编号查考生信息
	public Score getScoreByKsbh(String ksbh) {
		Score student = scoreMapper.selectByPrimaryKey(ksbh);
		return student;
	}

	// 删除单个考生信息
	public Result deleteSingle(String ksbh) {
		scoreMapper.deleteByPrimaryKey(ksbh);
		return Result.ok();
	}

	// 更新单条记录(外院)
	public Result updateSingleKy(Score score) {
		int num = scoreMapper.updateSingleKy(score);
		if (num > 0) {
			return Result.ok();
		}
		return Result.build(201, "更新失败");
	}

	// 批量删除
	public Result deleteList(String[] ksbhs) {
		for (String string : ksbhs) {
			scoreMapper.deleteByPrimaryKey(string);
		}
		return Result.ok();
	}

	// 按照初试成绩排序 sort为1升序否则降序
	public List sort(String keyWord, String page, String sort, String collegeCode) {
		List resultList = getStudentByKeyword(keyWord, page, collegeCode);
		List<Score> originalScoreList = (List<Score>) resultList.get(0);

		List<Score> scoreList = new ArrayList<>();
		if (sort.equals("1")) {
			scoreList = (List<Score>) SortListUtil.sort(originalScoreList, "cszf", SortListUtil.ASC);
		}
		if (sort.equals("0")) {
			scoreList = (List<Score>) SortListUtil.sort(originalScoreList, "cszf", SortListUtil.DESC);
		}
		resultList.set(0, scoreList);
		return resultList;
	}

	// 根据学生姓名关键字寻找学生
	public List getStudentByKeyword(String keyWord, String page, String bkyxsm) {
		Integer pageNo = Integer.valueOf(page);
		// 封装page工具类,作为查询条件
		SearchVo searchVo = new SearchVo();
		if (bkyxsm.equals("004") || bkyxsm.equals("099")) {
			searchVo.setPageSize(50);
			searchVo.setStartRow((pageNo - 1) * 50);
			searchVo.setPageNo(pageNo);
			if (keyWord != null) {
				searchVo.setKeyWord(keyWord.trim());
			}

			// 一系列条件组装后查询出的总记录数
			int totalRecord = scoreMapper.getCountByKeyword(searchVo);

			// 一系列条件组装后查询出的总记录
			List<Score> scoreList = scoreMapper.getStudentListByKeyword(searchVo);

			List resultList = new ArrayList<>();
			resultList.add(scoreList);
			resultList.add(totalRecord);

			return resultList;
		} else {
			searchVo.setPageSize(50);
			searchVo.setStartRow((pageNo - 1) * 50);
			searchVo.setPageNo(pageNo);
			searchVo.setBkyxsm(bkyxsm);
			if (keyWord != null) {
				searchVo.setKeyWord(keyWord.trim());
			}

			// 一系列条件组装后查询出的总记录数
			int totalRecord = scoreMapper.getCountByKeywordAndCollegeCode(searchVo);

			// 一系列条件组装后查询出的总记录
			List<Score> scoreList = scoreMapper.getStudentListByKeywordAndCollegeCode(searchVo);

			List resultList = new ArrayList<>();
			resultList.add(scoreList);
			resultList.add(totalRecord);

			return resultList;
		}

	}

	// 查出所有数据
	public List<Score> getAll(String collegeCode) {
		if (collegeCode.equals("004") || collegeCode.equals("099")) {
			ScoreExample example = new ScoreExample();
			example.createCriteria();
			List<Score> scoreList = scoreMapper.selectByExample(example);
			return scoreList;
		} else {
			ScoreExample example = new ScoreExample();
			example.createCriteria().andBkyxsmEqualTo(collegeCode);
			List<Score> scoreList = scoreMapper.selectByExample(example);
			return scoreList;
		}

	}

	// 根据id排序
	public List<Score> IdSort(String[] ksbhs, String sort) {
		List<IdSortVo> idSortVos = new ArrayList<>();
		List<Score> studentListOneList = new ArrayList<>();

		// 一边取得学生信息，一边把数据放入工具类中，以便于改成long类型比较大小
		for (String string : ksbhs) {
			IdSortVo idSortVo = new IdSortVo();
			Score score = scoreMapper.selectByPrimaryKey(string);
			studentListOneList.add(score);
			idSortVo.setKsbh(string);
			idSortVo.setBmddm(Long.valueOf(score.getBmddm()));
			idSortVos.add(idSortVo);
		}

		// 定义一个集合，用来存放排过序的数据
		List<IdSortVo> afterSortVo = new ArrayList<>();
		if (sort.equals("1")) {
			afterSortVo = (List<IdSortVo>) SortListUtil.sort(idSortVos, "bmddm", SortListUtil.ASC);
		}
		if (sort.equals("0")) {
			afterSortVo = (List<IdSortVo>) SortListUtil.sort(idSortVos, "bmddm", SortListUtil.DESC);
		}

		// 定义一个集合，存放最终数据
		List<Score> finalStuList = new ArrayList<>();

		// 再通过遍历afterSortVo找到最后顺序的学生集合
		for (IdSortVo idSortVo : afterSortVo) {
			Score score = scoreMapper.selectByPrimaryKey(idSortVo.getKsbh());
			finalStuList.add(score);
		}

		return finalStuList;
	}

	// 对考生编号进行排序
	public List<Score> KsbhSort(String[] ksbhs, String sort) {
		Long[] ksbhArray = new Long[ksbhs.length];
		for (int i = 0; i < ksbhs.length; i++) {
			ksbhArray[i] = Long.valueOf(ksbhs[i]);
		}

		if (sort.equals("1")) {
			Arrays.sort(ksbhArray);
		}

		if (sort.equals("0")) {
			Arrays.sort(ksbhArray);
			ArrayUtils.reverse(ksbhArray);
		}

		// 定义一个数组，用来存放排过序的考生编号
		String[] finalKsbh = new String[ksbhs.length];

		for (int i = 0; i < ksbhs.length; i++) {
			finalKsbh[i] = String.valueOf(ksbhArray[i]);
		}

		// 到数据库找数据，并返回
		List<Score> scoreList = new ArrayList<>();
		for (String ksbh : finalKsbh) {
			Score score = scoreMapper.selectByPrimaryKey(ksbh);
			scoreList.add(score);
		}

		return scoreList;
	}

	// 根据当前学院查找总记录数
	public int getCountByCollegeCode(String collegeCode) {
		int count = 0;
		if (collegeCode.equals("099") || collegeCode.equals("004")) {
			ScoreExample example = new ScoreExample();
			example.createCriteria();
			count = scoreMapper.countByExample(example);
		} else {
			ScoreExample example = new ScoreExample();
			example.createCriteria().andBkyxsmEqualTo(collegeCode);
			count = scoreMapper.countByExample(example);
		}
		return count;
	}

	// 分页查找各学院数据
	public List<Score> getAllByLimit(String collegeCode, String pageNo) {
		int page = Integer.valueOf(pageNo);
		if (collegeCode.equals("004") || collegeCode.equals("099")) {
			// 封装page工具类
			PageVo pageVo = new PageVo();
			pageVo.setPageSize(50);
			pageVo.setStartRow((page - 1) * 50);
			pageVo.setPageNo(page);

			List<Score> scoreList = scoreMapper.selectByLimit(pageVo);
			return scoreList;
		} else {
			// 封装page工具类
			PageVo pageVo = new PageVo();
			pageVo.setPageSize(50);
			pageVo.setStartRow((page - 1) * 50);
			pageVo.setPageNo(page);
			pageVo.setBkyxsm(collegeCode);
			List<Score> scoreList = scoreMapper.selectByLimitAndCollegeCode(pageVo);
			return scoreList;
		}

	}

	// 清空数据库数据
	public Result deleteDatabase() {
		scoreMapper.deleteDatabase();
		return Result.ok();
	}

}
