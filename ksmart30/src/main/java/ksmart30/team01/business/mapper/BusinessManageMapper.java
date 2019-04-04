package ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.business.domain.BusinessMarket;

@Mapper
public interface BusinessManageMapper {
	
	List<Map<String,Object>> getBusinessManageList(BusinessMarket vo);

}
