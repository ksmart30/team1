package com.cafe24.ksmart30.team01.baseInfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.ksmart30.team01.baseInfo.mapper.ClientMapper;
import com.cafe24.ksmart30.team01.baseInfo.vo.Client;

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
