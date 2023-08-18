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
    User findUser(@Param("account") String account);
    Integer findUserCount(@Param("account") String account);
    Integer insertUser(@Param("user") User user);
}
