package kr.co.ministone.dao;


import java.util.List;

import kr.co.ministone.dto.cardDTO;
import kr.co.ministone.dto.UserCardDTO;
import kr.co.ministone.dto.UserDTO;

public interface DAO {
	//경민 selectAll
	public List<cardDTO> selectAll(int offset, int noOfrecords);
	public UserDTO selectOneByUser(String id);
	public void updateOne(UserDTO dto);
	public void insertOne(UserCardDTO cardDto);
	public int getCOunt();
	//문기 select all
	public List<UserCardDTO> selectAllMarket();
	
/*	public List<cardDTO> select();*/
	

}
