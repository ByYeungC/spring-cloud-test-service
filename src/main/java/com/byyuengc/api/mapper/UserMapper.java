package com.byyuengc.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.byyuengc.api.entity.User;


public interface UserMapper {

    @Select("SELECT * from users")
    List<User> findAll();
    
    @Insert("insert into users (mobile, cash, cash_gift, role, status, created, updated) values(#{mobile}, #{cash}, #{cashGift}, #{role}, #{status}, #{created}, #{updated})")
    int insert(@Param("mobile") String mobile,  @Param("cash") double cash, @Param("cashGift") double cashGift, @Param("role") int role, @Param("status") int status, @Param("created") int created, @Param("updated") int updated);

}
