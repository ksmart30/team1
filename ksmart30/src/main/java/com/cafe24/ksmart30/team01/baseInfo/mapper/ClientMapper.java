package com.cafe24.ksmart30.team01.baseInfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.ksmart30.team01.baseInfo.vo.Client;

@Mapper
public interface ClientMapper {

	List<Client> clientSelect(Client client);
	
	Client clientAllSelect(String CUST_CD);
}
