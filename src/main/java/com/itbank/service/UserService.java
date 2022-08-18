package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.room.MotelDTO;
import com.itbank.user.User_nonsocialDAO;
import com.itbank.user.User_nonsocialDTO;


@Service
public class UserService {

	@Autowired
	private User_nonsocialDAO dao;
	
	public User_nonsocialDTO login(User_nonsocialDTO dto) {
		System.out.println("dto:"+ dto.getEmail());
		System.out.println("dto:"+ dto.getPassword());
		return dao.login(dto) ;
	}


		
	public int join(User_nonsocialDTO dto) {
		return dao.join(dto);
	}



	public List<MotelDTO> selectList() {
		return dao.selectList();
	}
		
		
		
		
	


	
	
	
	
}
