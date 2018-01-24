package com.zby.ssmspringboot2.dao;

import com.zby.ssmspringboot2.domain.User;


//@MapperScan     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}