package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.Client;

@Mapper
public interface ClientMapper {

	List<Client> clientSelect(Client client);
	
	Client clientAllSelect(String CUST_CD);
}
