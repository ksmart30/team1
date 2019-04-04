package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.Client;
import ksmart30.team00.baseinfo.mapper.ClientMapper;

@Service
public class ClientService {
	@Autowired
	ClientMapper clientMapper;
	
	public List<Client> clientSearch(Client client) {
		
		return clientMapper.clientSelect(client);
		
	}
	
	public Client clientAllSearch(String CUST_CD){
		
		return clientMapper.clientAllSelect(CUST_CD);
		
	}
	
}
