package com.example.book.dao;

import com.example.book.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> selectUser();
}