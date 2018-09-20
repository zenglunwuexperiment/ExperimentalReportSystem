package com.nanwulife.dao;

import com.nanwulife.pojo.User;
import com.nanwulife.vo.StuBasicInfoVo;

import java.util.List;

public interface UserMapper {
    
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int selectByUsername(Integer username);

    User checkByUsername (Integer username);
    
    StuBasicInfoVo queryMajornameAndClassById(Integer stu_id);
}