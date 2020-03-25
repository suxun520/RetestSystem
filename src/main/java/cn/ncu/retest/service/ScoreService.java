package cn.ncu.retest.service;

import java.util.List;

import cn.ncu.retest.pojo.Score;
import cn.ncu.retest.utils.Result;

public interface ScoreService {

	public Result importDatoFromExcel(List<Score> scoreList, String collegeCode);

	Result updateSingle(Score score);

	Score getScoreByKsbh(String ksbh);

	public Result deleteSingle(String ksbh);

	public Result updateSingleKy(Score score);

	Result deleteList(String[] ksbhs);

	List sort(String keyWord, String page, String sort, String collegeCode);

	List getStudentByKeyword(String keyWord, String page, String collegeCode);

	List<Score> getAll(String collegeCode);

	List<Score> IdSort(String[] ksbhs, String sort);

	List<Score> KsbhSort(String[] ksbhs, String sort);

	int getCountByCollegeCode(String collegeCode);

	List<Score> getAllByLimit(String collegeCode, String pageNo);

	Result deleteDatabase();

}
