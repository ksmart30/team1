package ksmart30.team00.baseinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ksmart30.team00.baseinfo.domain.Client;
import ksmart30.team00.baseinfo.service.ClientService;

@RestController
public class ClientRestController {
	
	@Autowired
	ClientService clientService;
	//왼쪽 검색화면에서 검색기능을 위한 메서드
	@PostMapping("/baseInfo/Client/in")
	public List<Client> baseInfoClientIn(Client client) {
		System.out.println("ClientRestController  baseInfoClientIn왔나");
		System.out.println("client확인 ="+client);
		List<Client> re = clientService.clientSearch(client);
		System.out.println("re확인 ="+re);
		return re;	
	}
	
	//검색 후 해당 거래처의 모든 정보를 가져와서 오른쪽의 상세화면(기본정보)를 위한 메서드 
	@PostMapping("/baseInfo/Client/Sangse/in")
	public Client baseInfoClientAllIn(String CUST_CD) {
		System.out.println("ClientRestController  baseInfoClientAllIn왔나");
		
		
		return clientService.clientAllSearch(CUST_CD);	
	}
	
}