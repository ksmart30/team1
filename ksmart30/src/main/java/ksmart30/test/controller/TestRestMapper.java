package ksmart30.test.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestRestMapper {
	
	List<Map> testSelect(String pjtCd);

}
