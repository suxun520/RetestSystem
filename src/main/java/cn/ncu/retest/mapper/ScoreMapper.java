package cn.ncu.retest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ncu.retest.pojo.PageVo;
import cn.ncu.retest.pojo.Score;
import cn.ncu.retest.pojo.ScoreExample;
import cn.ncu.retest.pojo.SearchVo;

public interface ScoreMapper {
	int countByExample(ScoreExample example);

	int deleteByExample(ScoreExample example);

	int deleteByPrimaryKey(String ksbh);

	int insert(Score record);

	int insertSelective(Score record);

	List<Score> selectByExample(ScoreExample example);

	Score selectByPrimaryKey(String ksbh);

	int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

	int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

	int updateByPrimaryKeySelective(Score record);

	int updateByPrimaryKey(Score record);

	int updateSingle(Score record);

	int updateSingleKy(Score record);

	List<Score> selectByLimit(PageVo pageVo);

	List<Score> selectByLimitAndCollegeCode(PageVo pageVo);

	int getCountByKeyword(SearchVo searchVo);

	List<Score> getStudentListByKeyword(SearchVo searchVo);

	List<Score> getStudentListByBkyxsm(PageVo pageVo);

	int getCountByKeywordAndCollegeCode(SearchVo searchVo);

	List<Score> getStudentListByKeywordAndCollegeCode(SearchVo searchVo);

	void deleteDatabase();
}