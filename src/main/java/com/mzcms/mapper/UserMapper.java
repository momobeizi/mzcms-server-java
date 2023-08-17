package com.mzcms.mapper;

import com.mzcms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    List<User> findAllUser();
    Users findUser();
    Integer findUserCount(@Param("account") String account);
}
