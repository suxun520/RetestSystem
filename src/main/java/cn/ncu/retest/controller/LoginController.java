package cn.ncu.retest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.ncu.retest.pojo.Score;
import cn.ncu.retest.pojo.User;
import cn.ncu.retest.service.LoginService;
import cn.ncu.retest.service.ScoreService;
import cn.ncu.retest.utils.Result;

/**  
* <p>Title: LoginController.java</p>  
* <p>Description:用户登录controller </p>  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: 南昌大学</p>  
* @author 经成
* @date 2019年4月17日  
* @version 1.0  
*/
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private ScoreService scoreService;

	@RequestMapping("/index")
	public String showLogin(HttpServletRequest request) {
		request.removeAttribute("errormessage");
		return "login";
	}

	@RequestMapping("/login.action")
	public String login(@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo, String username,
			String password, HttpServletRequest request, Model model) {
		Result result = loginService.UserLogin(pageNo, username, password);
		// 登录成功，带着错误信息回到登录页面
		if (result.getStatus() == 201) {
			request.setAttribute("errormessage", "用户名不存在");
			return "login";
		}
		if (result.getStatus() == 202) {
			request.setAttribute("errormessage", "密码错误");
			return "login";
		}
		List resultList = (List) result.getData();

		// 从结果集获得学院编号
		User user = (User) resultList.get(1);

		// 根据result里的用户信息，如果是用户所属学院是外院，显示全部数据
		if (result.getStatus() == 200 && user.getCollegeCode().equals("004")) {
			model.addAttribute("scoreList", resultList.get(0));
			// 总数据量
			model.addAttribute("totalRecord", resultList.get(4));
			// 当前页
			model.addAttribute("pageNo", resultList.get(3));
			model.addAttribute("username", username);
			return "list_004";
		}

		// 根据result里的用户信息，如果是用户所属学院是研院，显示全部数据
		if (result.getStatus() == 200 && user.getCollegeCode().equals("099")) {
			model.addAttribute("scoreList", resultList.get(0));
			// 总数据量
			model.addAttribute("totalRecord", resultList.get(4));
			// 当前页
			model.addAttribute("pageNo", resultList.get(3));
			model.addAttribute("username", username);
			return "list_001";
		}

		// 获得本院成绩集合
		List<Score> scoreList = loginService.getScoreListByBkyxsm(pageNo, password, user.getCollegeCode());
		// 根据result里的用户信息，如果是用户所属学院是除了外院的其他学院，显示该学院的数据
		if (result.getStatus() == 200 && !user.getCollegeCode().equals("004")) {
			model.addAttribute("scoreList", scoreList);
			// 总数据量
			model.addAttribute("totalRecord", resultList.get(2));
			// 当前页
			model.addAttribute("pageNo", resultList.get(3));
			model.addAttribute("username", username);
			return "list_010";
		}
		return null;
	}
}
