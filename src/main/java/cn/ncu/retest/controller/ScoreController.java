package cn.ncu.retest.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.ncu.retest.pojo.Score;
import cn.ncu.retest.pojo.User;
import cn.ncu.retest.service.LoginService;
import cn.ncu.retest.service.ScoreService;
import cn.ncu.retest.utils.ExcelUtils;
import cn.ncu.retest.utils.Result;

@Controller
public class ScoreController {

	@Autowired
	private ScoreService scoreService;
	@Autowired
	private LoginService loginService;

	// 清除数据库数据
	@RequestMapping("/deleteDatabase.action")
	@ResponseBody
	public Result deleteDatabase() {
		return scoreService.deleteDatabase();
	}

	// 将excel数据导入到数据库
	@RequestMapping("/excel/import.action")
	public String importE(MultipartFile file, Model model, String username, String pageNo) throws Exception {
		// 获得学院编号，作为跳转页面的标志
		User user = loginService.getUserByUsername(username);
		String collegeCode = user.getCollegeCode();

		List<Score> originalScoreList = new ArrayList<>();
		if (collegeCode.equals("099")) {
			originalScoreList = ExcelUtils.getScoreList(file);
		} else {
			originalScoreList = ExcelUtils.getScoreListForCollege(file);
		}

		scoreService.importDatoFromExcel(originalScoreList, collegeCode);

		if (collegeCode.equals("004")) {

			List<Score> scoreList = scoreService.getAllByLimit(collegeCode, pageNo);
			model.addAttribute("scoreList", scoreList);

			// 总数据量
			int totalRecord = scoreService.getCountByCollegeCode(collegeCode);
			model.addAttribute("totalRecord", totalRecord);

			// 当前页
			model.addAttribute("pageNo", pageNo);

			model.addAttribute("username", username);
			return "list_004";
		}
		if (collegeCode.equals("099")) {
			List<Score> scoreList = scoreService.getAllByLimit(collegeCode, pageNo);
			model.addAttribute("scoreList", scoreList);

			// 总数据量
			int totalRecord = scoreService.getCountByCollegeCode(collegeCode);
			model.addAttribute("totalRecord", totalRecord);

			// 当前页
			model.addAttribute("pageNo", pageNo);

			model.addAttribute("username", username);
			return "list_001";
		}
		if (!collegeCode.equals("099") && !collegeCode.equals("004")) {
			List<Score> scoreList = scoreService.getAllByLimit(collegeCode, pageNo);
			model.addAttribute("scoreList", scoreList);

			// 总数据量
			int totalRecord = scoreService.getCountByCollegeCode(collegeCode);
			model.addAttribute("totalRecord", totalRecord);

			// 当前页
			model.addAttribute("pageNo", pageNo);

			model.addAttribute("username", username);
			return "list_010";
		}
		return null;

	}

	// 修改单条记录(信工院)
	@RequestMapping("/student/update.action")
	@ResponseBody
	public Result updateSingle(String ksbh, String bs, String ms) {
		// 组装数据
		Score score = new Score();
		score.setKsbh(ksbh);
		score.setMs(Double.valueOf(ms));
		score.setBs(Double.valueOf(bs));
		Result result = scoreService.updateSingle(score);
		return result;
	}

	// 修改单条记录(外院)
	@RequestMapping("/student/updateKy.action")
	@ResponseBody
	public Result updateSingleKy(String ksbh, String ky) {
		// 组装数据
		Score score = new Score();
		score.setKsbh(ksbh);
		score.setKy(Double.valueOf(ky));
		Result result = scoreService.updateSingleKy(score);
		return result;
	}

	// 批量删除
	@RequestMapping("/student/deleteList.action")
	@ResponseBody
	// 注意，前台用ajax传数组，后台必须用RequestParam注解接收
	public Result deleteList(@RequestParam(value = "ksbhs[]") String[] ksbhs) {

		return scoreService.deleteList(ksbhs);

	}

	// 批量修改(外院)
	@RequestMapping("/student/updateListKy.action")
	@ResponseBody
	// 注意，前台用ajax传数组，后台必须用RequestParam注解接收
	public String updateKyList(@RequestParam(value = "ksbhs[]") String[] ksbhs) {
		// 如果只修改一个，需要在此处进行判断
		if (!ksbhs[0].contains(",")) {
			Score score = new Score();
			score.setKsbh(ksbhs[0]);
			score.setKy(Double.valueOf(ksbhs[1]));
			scoreService.updateSingleKy(score);
		} else {
			// 循环数组，循环一次修改一次
			for (String ksbh : ksbhs) {
				Score score = new Score();
				String[] split = ksbh.split(",");
				score.setKsbh(split[0]);
				score.setKy(Double.valueOf(split[1]));
				scoreService.updateSingleKy(score);
			}
		}

		return "OK";

	}

	// 批量修改(信工院)
	@RequestMapping("/student/updateList.action")
	@ResponseBody
	// 注意，前台用ajax传数组，后台必须用RequestParam注解接收
	public String updateList(@RequestParam(value = "ksbhs[]") String[] ksbhs) {

		// 如果只修改一个，需要在此处进行判断
		if (!ksbhs[0].contains(",")) {
			Score score = new Score();
			score.setKsbh(ksbhs[0]);
			score.setBs(Double.valueOf(ksbhs[1]));
			score.setMs(Double.valueOf(ksbhs[2]));
			scoreService.updateSingle(score);
		} else {
			// 循环数组，循环一次修改一次
			for (String ksbh : ksbhs) {

				Score score = new Score();
				String[] split = ksbh.split(",");

				score.setKsbh(split[0]);
				score.setBs(Double.valueOf(split[1]));
				score.setMs(Double.valueOf(split[2]));
				scoreService.updateSingle(score);
			}
		}

		return "OK";

	}

	// 根据学生编号找学生
	@RequestMapping("/student/edit.action")
	@ResponseBody
	public Score getScoreByKsbh(String ksbh) {

		Score score = scoreService.getScoreByKsbh(ksbh);

		return score;
	}

	// 删除单挑学生记录
	@RequestMapping("/student/deleteSingle.action")
	@ResponseBody
	public Result deleteSingle(String ksbh) {
		Result result = scoreService.deleteSingle(ksbh);
		return result;
	}

	// 导出
	@RequestMapping(value = "/export.action")
	public String exportExcel(Model model, String username) throws Exception {
		User user = loginService.getUserByUsername(username);
		String collegeCode = user.getCollegeCode();

		List<Score> scoreList = scoreService.getAll(collegeCode);
		model.addAttribute("scoreList", scoreList);
		return "table";
	}

	// 对初试成绩进行排序
	@RequestMapping("/sort.action")
	public String sort(String username, String sort, String pageNo, Model model, String keyWord)
			throws UnsupportedEncodingException {
		// 防止keyWord出现空指针，辅助空串对查询无影响
		if (keyWord == null) {
			keyWord = "";
		}

		// 获得学院编号，作为跳转页面的标志
		User user = loginService.getUserByUsername(username);
		String collegeCode = user.getCollegeCode();

		// 将乱码转为正常汉字
		/*keyWord = new String(keyWord.getBytes("iso8859-1"), "UTF-8");*/

		List resultList = scoreService.sort(keyWord, pageNo, sort, collegeCode);
		String newSort = null;
		if (Integer.valueOf(sort) == 1) {
			newSort = "0";
		}
		if (Integer.valueOf(sort) == 0) {
			newSort = "1";
		}

		// 将从页面拿来的数据再返回给页面
		model.addAttribute("username", username);
		model.addAttribute("sort", newSort);
		model.addAttribute("scoreList", resultList.get(0));
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("totalRecord", resultList.get(1));
		model.addAttribute("keyWord", keyWord);
		if (collegeCode.equals("004")) {
			return "list_004";
		}
		if (collegeCode.equals("099")) {
			return "list_001";
		}
		if (!collegeCode.equals("001") && !collegeCode.equals("004")) {
			return "list_010";
		}
		return null;
	}

	// 对考生编号进行排序
	@RequestMapping("/KsbhSort.action")
	public String KsbhSort(String username, String sort, String pageNo, Model model, String keyWord, String ksbhs,
			String totalRecord) throws UnsupportedEncodingException {
		String[] split = ksbhs.split(",");

		List<Score> scoreList = scoreService.KsbhSort(split, sort);

		// 防止keyWord出现空指针
		if (keyWord == null) {
			keyWord = "";
		}

		// 将乱码转为正常汉字
		/*		keyWord = new String(keyWord.getBytes("iso8859-1"), "UTF-8");*/

		String newSort = null;
		if (Integer.valueOf(sort) == 1) {
			newSort = "0";
		}
		if (Integer.valueOf(sort) == 0) {
			newSort = "1";
		}

		// 获得学院编号，作为跳转页面的标志
		User user = loginService.getUserByUsername(username);
		String collegeCode = user.getCollegeCode();

		// 将从页面拿来的数据再返回给页面
		model.addAttribute("username", username);
		model.addAttribute("sort", newSort);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("keyWord", keyWord);
		model.addAttribute("totalRecord", totalRecord);
		model.addAttribute("scoreList", scoreList);
		if (collegeCode.equals("004")) {
			return "list_004";
		}
		if (collegeCode.equals("099")) {
			return "list_001";
		}
		if (!collegeCode.equals("001") && !collegeCode.equals("004")) {
			return "list_010";
		}
		return null;
	}

	// 对id进行排序
	@RequestMapping("/IdSort.action")
	public String IdSort(String username, String sort, String pageNo, Model model, String keyWord, String ksbhs,
			String totalRecord) throws UnsupportedEncodingException {
		String[] split = ksbhs.split(",");
		List<Score> scoreList = scoreService.IdSort(split, sort);

		// 防止keyWord出现空指针
		if (keyWord == null) {
			keyWord = "";
		}

		/*	// 将乱码转为正常汉字
			keyWord = new String(keyWord.getBytes("iso8859-1"), "UTF-8");*/

		String newSort = null;
		if (Integer.valueOf(sort) == 1) {
			newSort = "0";
		}
		if (Integer.valueOf(sort) == 0) {
			newSort = "1";
		}

		// 获得学院编号，作为跳转页面的标志
		User user = loginService.getUserByUsername(username);
		String collegeCode = user.getCollegeCode();

		// 将从页面拿来的数据再返回给页面
		model.addAttribute("username", username);
		model.addAttribute("sort", newSort);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("keyWord", keyWord);
		model.addAttribute("totalRecord", totalRecord);
		model.addAttribute("scoreList", scoreList);
		if (collegeCode.equals("004")) {
			return "list_004";
		}
		if (collegeCode.equals("099")) {
			return "list_001";
		}
		if (!collegeCode.equals("001") && !collegeCode.equals("004")) {
			return "list_010";
		}
		return null;
	}

	// 访问同一个域名的子域名，参数共享，比如点查询与分页跳转的页面一致，点完查询后，再点分页也能查到点查询时带过去的数据
	@RequestMapping("/page.action")
	public String page(String username, String pageNo, Model model, String keyWord)
			throws UnsupportedEncodingException {

		if (keyWord == null) {
			keyWord = "";
		}
		// 获得学院编号，作为跳转页面的标志
		User user = loginService.getUserByUsername(username);
		String collegeCode = user.getCollegeCode();

		/*// 将乱码转为正常汉字
		keyWord = new String(keyWord.getBytes("iso8859-1"), "UTF-8");*/

		List result = scoreService.getStudentByKeyword(keyWord, pageNo, collegeCode);

		// 将从页面拿来的数据再返回给页面
		model.addAttribute("keyWord", keyWord);
		model.addAttribute("username", username);
		model.addAttribute("scoreList", result.get(0));
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("totalRecord", result.get(1));
		if (collegeCode.equals("004")) {
			return "list_004";
		}
		if (collegeCode.equals("099")) {
			return "list_001";
		}
		if (!collegeCode.equals("001") && !collegeCode.equals("004")) {
			return "list_010";
		}
		return null;
	}

	@RequestMapping("/keyWord.action")
	public String getStudentByKeyword(String username, Model model, String keyWord)
			throws UnsupportedEncodingException {
		if (keyWord == null) {
			keyWord = "";
		}

		// 将乱码转为正常汉字
		/*	String newWord = new String(keyWord.getBytes("iso-8859-1"), "UTF-8");
			System.out.println(newWord);*/

		// 获得学院编号，作为跳转页面的标志
		User user = loginService.getUserByUsername(username);
		String collegeCode = user.getCollegeCode();

		List result = scoreService.getStudentByKeyword(keyWord, "1", collegeCode);

		// 将从页面拿来的数据再返回给页面
		model.addAttribute("keyWord", keyWord);
		model.addAttribute("username", username);
		model.addAttribute("scoreList", result.get(0));
		model.addAttribute("pageNo", 1);
		model.addAttribute("totalRecord", result.get(1));
		if (collegeCode.equals("004")) {
			return "list_004";
		}
		if (collegeCode.equals("099")) {
			return "list_001";
		}
		if (!collegeCode.equals("001") && !collegeCode.equals("004")) {
			return "list_010";
		}
		return null;
	}
}
