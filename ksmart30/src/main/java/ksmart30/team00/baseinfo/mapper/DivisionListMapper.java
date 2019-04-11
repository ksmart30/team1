package ksmart30.team00.baseinfo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DivisionListMapper {

	//10.2.2. 예산서 인건비 및 배부 단가표	
	//회계연도에 해당하는 직급 단가 리스트
	List<Map<String, Object>> getJikgupDangaList(String REG_YYMM);
	//회계연도에 해당하는 배부 단가 리스트
	Map<String, Object> getDivisionDangaList(String REG_YYMM);
	//회계연도에 해당하는 제조원가1 단가 리스트
	List<Map<String, Object>> getJejo1DangaList(String REG_YYMM);

}
