package com.wyh.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wyh.entity.Testuser;

//这里可以不使用注解，在启动类中加上MapperScan注解，里面添加该mapper所在的包路径即可
public interface UserMapper {

	//使用注解式开发查询语句
	@Select("SELECT * FROM TESTUSER WHERE NAME = #{name}")
	Testuser getUserByName(@Param("name") String name);
	
	@Insert("INSERT INTO TESTUSER(NAME, AGE) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);
	
	
	
	
	
	
	
	
}
