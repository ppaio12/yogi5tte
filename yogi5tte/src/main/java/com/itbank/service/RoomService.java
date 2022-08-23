package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.room.MotelDAO;
import com.itbank.room.MotelDTO;

@Service
public class RoomService {
	
	@Autowired private MotelDAO motelDAO;
	
	public List<MotelDTO> selectList() {
		return motelDAO.selectList();
	}

//	public List<MotelDTO> showList() {
//		return motelDAO.showList();
//	}
	
//	public List<MotelDTO> selectList(String target) {
//		return motelDAO.selectList(target);
//	}

//	public List<MotelDTO> selectList(MotelDTO dto) {
//		return motelDAO.selectList(dto);
//	}

}
