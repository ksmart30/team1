package ksmart30.team00.baseinfo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ksmart30.team00.baseinfo.domain.Client;
import ksmart30.team00.baseinfo.domain.ClientList;

@Mapper
public interface ClientMapper {

	List<Client> clientSelect(Client client);
	
	Client clientAllSelect(String CUST_CD);

	List<Map<String,Object>> clientListOutput(ClientList clientList);
}
