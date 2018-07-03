package kr.co.ministone.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ministone.dto.UserCardDTO;
import kr.co.ministone.dto.UserDTO;
import kr.co.ministone.dto.cardDTO;
@Repository("DAO")
public class MYSQLDao implements DAO {

	//SqlSession ss;
	
	@Autowired
	private SqlSession ss;
	int noOfRecords;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}



	@Override
	public List<cardDTO> selectAll(int offset, int noOfRecords) {
		List<cardDTO> list = new ArrayList<cardDTO>();
		
		HashMap<String, Object> params = new HashMap<String, Object>(); 
		
		
		params.put("offset", offset);
		params.put("noOfRecords", noOfRecords); 
		
		
		list = ss.selectList("selectAllCard", params);
		this.noOfRecords = ss.selectOne("count");
		return list;
		
		
	}



	@Override
	public int getCOunt() {
		// TODO Auto-generated method stub
		return ss.selectOne("count");
	}



	@Override
	public UserDTO selectOneByUser(String id) {
		
		return ss.selectOne("selectOneByUser", id);
	}

	@Override
	public void updateOne(UserDTO dto) {
		ss.update("updateOneUser",dto);
		
	}

	@Override
	public void insertOne(UserCardDTO cardDto) {
		ss.insert("insertOneUserCard", cardDto);
		
	}



	@Override
	public List<UserCardDTO> selectAllMarket() {
		return ss.selectList("selectAllUserCard");
	}


/*	@Override
	public List<cardDTO> select() {
		
		return ss.selectList("selectCard");
	}
*/



}
