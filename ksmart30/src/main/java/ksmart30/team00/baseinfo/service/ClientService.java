package ksmart30.team00.baseinfo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ksmart30.team00.baseinfo.domain.Client;
import ksmart30.team00.baseinfo.domain.ClientList;
import ksmart30.team00.baseinfo.mapper.ClientMapper;

@Service
public class ClientService {
	@Autowired
	ClientMapper clientMapper;
	
	//왼쪽 상단 검색기능 - 거래처코드와 거래처이름을 검색하는 메서드
	public List<Client> clientSearch(Client client) {
		
		return clientMapper.clientSelect(client);
		
	}
	//왼쪽 상단 검색기능에서 거래처코드를 매개변수로 넘겨 해당 거래처의 상세정보를 불러오는 메서드
	public Client clientAllSearch(String CUST_CD){
		
		if(CUST_CD.length() < 5) {
			for(int i=CUST_CD.length(); i<5; i++) {
				CUST_CD = "0"+CUST_CD;
			}
		}
		
		return clientMapper.clientAllSelect(CUST_CD);
		
	}

	//거래처 정보를 출력하기위해 전체 리스트화면에 보여주는 매서드
	public List<Map<String, Object>> clientListView(ClientList clientList) {
		
		return clientMapper.clientListOutput(clientList);
	}
	
	//화면에서 입력받은 거래처정보를 DB에 저장하는 메서드
	public void clientViewInsert(Client client) {
		
		clientMapper.clientInsert(client);
	}
}
