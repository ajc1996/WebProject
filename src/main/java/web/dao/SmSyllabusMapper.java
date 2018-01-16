package web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import web.model.SmSyllabus;
import web.model.SmSyllabusExample;

public interface SmSyllabusMapper {
    int countByExample(SmSyllabusExample example);

    int deleteByExample(SmSyllabusExample example);

    int deleteByPrimaryKey(String syllabusoid);

    int insert(SmSyllabus record);

    int insertSelective(SmSyllabus record);

    List<SmSyllabus> selectByExample(SmSyllabusExample example);

    SmSyllabus selectByPrimaryKey(String syllabusoid);

    int updateByExampleSelective(@Param("record") SmSyllabus record, @Param("example") SmSyllabusExample example);

    int updateByExample(@Param("record") SmSyllabus record, @Param("example") SmSyllabusExample example);

    int updateByPrimaryKeySelective(SmSyllabus record);

    int updateByPrimaryKey(SmSyllabus record);
}