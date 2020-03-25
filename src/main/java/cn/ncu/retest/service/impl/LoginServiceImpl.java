package cn.ncu.retest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ncu.retest.mapper.ScoreMapper;
import cn.ncu.retest.mapper.UserMapper;
import cn.ncu.retest.pojo.PageVo;
import cn.ncu.retest.pojo.Score;
import cn.ncu.retest.pojo.ScoreExample;
import cn.ncu.retest.pojo.User;
import cn.ncu.retest.pojo.UserExample;
import cn.ncu.retest.service.LoginService;
import cn.ncu.retest.utils.Result;

/**  
* <p>Title: LoginServiceImpl.java</p>  
* <p>Description:登录业务 </p>  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: 南昌大学</p>  
* @author 经成
* @date 2019年4月17日  
* @version 1.0  
*/
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ScoreMapper scoreMapper;

	// 校验用户输入的账号密码
	public Result UserLogin(Integer pageNo, String username, String password) {
		// 校验账号
		UserExample userExample = new UserExample();
		if (username == null || username.equals("")) {
			return Result.build(201, "用户名不存在");
		}
		userExample.createCriteria().andUserAccountEqualTo(username);
		List<User> list = userMapper.selectByExample(userExample);
		if (list == null || list.size() == 0) {
			// 返回201说明用户名不存在
			return Result.build(201, "用户名不存在");
		}

		// 校验密码
		String userPassword = list.get(0).getUserPassword();
		if (!userPassword.equals(password)) {
			// 返回202说明用户名不存在
			return Result.build(202, "密码输入错误");
		}

		// 登录通过，从数据库查询数据回显至页面
		ScoreExample scoreExample = new ScoreExample();
		scoreExample.createCriteria().andBkyxsmEqualTo(list.get(0).getCollegeCode());
		// 本学院数据总条数
		int totalRecord = scoreMapper.countByExample(scoreExample);

		ScoreExample scoreExampleAll = new ScoreExample();
		scoreExampleAll.createCriteria();
		// 全校数据总条数
		int totalRecordAll = scoreMapper.countByExample(scoreExampleAll);

		List resultList = new ArrayList<>();
		// 封装page工具类
		PageVo pageVo = new PageVo();
		pageVo.setPageSize(50);
		pageVo.setStartRow((pageNo - 1) * 50);
		pageVo.setPageNo(pageNo);
		// 查到的是全校数据
		List<Score> scoreList = scoreMapper.selectByLimit(pageVo);

		resultList.add(scoreList);
		resultList.add(list.get(0));
		resultList.add(totalRecord);
		resultList.add(pageNo);
		resultList.add(totalRecordAll);
		return Result.ok(resultList);
	}

	// 根据用户名查找用户
	public User getUserByUsername(String username) {
		UserExample example = new UserExample();
		example.createCriteria().andUserAccountEqualTo(username);
		List<User> list = userMapper.selectByExample(example);
		return list.get(0);
	}

	// 通过学院编号和分页查找学生
	public List<Score> getScoreListByBkyxsm(Integer pageNo, String password, String bkyxsm) {
		// 封装page工具类
		PageVo pageVo = new PageVo();
		pageVo.setPageSize(50);
		pageVo.setStartRow((pageNo - 1) * 50);
		pageVo.setPageNo(pageNo);
		pageVo.setBkyxsm(bkyxsm);
		List<Score> scoreList = scoreMapper.getStudentListByBkyxsm(pageVo);
		return scoreList;
	}

}
