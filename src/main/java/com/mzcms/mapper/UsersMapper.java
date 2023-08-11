package com.mzcms.mapper;

import com.mzcms.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UsersMapper {
    List<Users> findAllUsers();
    Users findUser();
    Integer findUserCount(@Param("account") String account);
}
