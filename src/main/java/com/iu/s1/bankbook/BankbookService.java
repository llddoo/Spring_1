package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankbookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public BankbookService() {
		//결합도가 높다, 강함
		bankBookDAO = new BankBookDAO();
		
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.getSelect(bankBookDTO);
	}
	
	public List<BankBookDTO> getList()throws Exception{
		return bankBookDAO.getList();
	}

}