package web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import web.model.SmUser;
import web.model.SmUserExample;

public interface SmUserMapper {
    int countByExample(SmUserExample example);

    int deleteByExample(SmUserExample example);

    int deleteByPrimaryKey(String useroid);

    int insert(SmUser record);

    int insertSelective(SmUser record);

    List<SmUser> selectByExample(SmUserExample example);

    SmUser selectByPrimaryKey(String useroid);

    int updateByExampleSelective(@Param("record") SmUser record, @Param("example") SmUserExample example);

    int updateByExample(@Param("record") SmUser record, @Param("example") SmUserExample example);

    int updateByPrimaryKeySelective(SmUser record);

    int updateByPrimaryKey(SmUser record);
}