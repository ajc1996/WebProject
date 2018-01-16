package web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import web.model.SmMessage;
import web.model.SmMessageExample;

public interface SmMessageMapper {
    int countByExample(SmMessageExample example);

    int deleteByExample(SmMessageExample example);

    int deleteByPrimaryKey(String messageoid);

    int insert(SmMessage record);

    int insertSelective(SmMessage record);

    List<SmMessage> selectByExample(SmMessageExample example);

    SmMessage selectByPrimaryKey(String messageoid);

    int updateByExampleSelective(@Param("record") SmMessage record, @Param("example") SmMessageExample example);

    int updateByExample(@Param("record") SmMessage record, @Param("example") SmMessageExample example);

    int updateByPrimaryKeySelective(SmMessage record);

    int updateByPrimaryKey(SmMessage record);
}