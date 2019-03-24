package com.lv.mapper;

import com.lv.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 14zr on 2019-03-22.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User getUser(Integer id);

    @Select("select * from user")
    public List<User> getAllUser();

    @Insert("Insert into user (username,password,sex)  values(#{userName}, #{passWord},'男')")
    public int addUser(User user);


    @Update("update user set sex = #{sex} , address = #{address} where id = #{id}")
    public int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    public int deleteUser(Integer id);

}
