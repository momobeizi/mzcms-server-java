package com.mzcms.mapper;

import com.mzcms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    List<User> findAllUserList();
    User findUser();
    Integer findUserCount(@Param("account") String account);
    User insertUser(@Param("user") User user);
}
