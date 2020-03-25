package cn.ncu.retest.service;

import java.util.List;

import cn.ncu.retest.pojo.Score;
import cn.ncu.retest.pojo.User;
import cn.ncu.retest.utils.Result;

public interface LoginService {

	Result UserLogin(Integer pageNo, String username, String password);

	List<Score> getScoreListByBkyxsm(Integer pageNo, String password, String bkyxsm);

	User getUserByUsername(String username);
}
