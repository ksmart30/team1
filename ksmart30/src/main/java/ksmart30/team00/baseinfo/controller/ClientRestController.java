package ksmart30.team00.baseinfo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ksmart30.team00.baseinfo.domain.Client;
import ksmart30.team00.baseinfo.domain.ClientList;
import ksmart30.team00.baseinfo.service.ClientService;

@RestController
public class ClientRestController {
	
	@Autowired
	ClientService clientService;
	//10.2.1왼쪽 검색화면에서 검색기능을 위한 메서드
	@PostMapping("/baseInfo/clientView")
	public List<Client> clientView(Client client) {
		System.out.println("ClientRestController  clientView왔나");
		System.out.println("client확인 ="+client);
		List<Client> re = clientService.clientSearch(client);
		System.out.println("re확인 ="+re);
		return re;	
	}
	
	//10.2.1검색 후 해당 거래처의 모든 정보를 가져와서 오른쪽의 상세화면(기본정보)를 위한 메서드 
	@PostMapping("/baseInfo/clientAllView")
	public Client clientAllView(String CUST_CD) {
		System.out.println("ClientRestController  clientAllView왔나");
		System.out.println("CUST_CD : "+ CUST_CD);
		
		return clientService.clientAllSearch(CUST_CD);	
	}

	
	
	//10.2.2 거래처코드 리스트 출력 (검색조건에 맞는 검색 후 결과 화면 )
	@PostMapping("/baseinfo/clientListView")
	public List<Map<String, Object>> clientListView(ClientList clientList) {
		System.out.println("radio button : "+clientList.getNMCD_TYPE());
		System.out.println("ClientRestController  clientListView왔나");

		return clientService.clientListView(clientList);
	}
	
}