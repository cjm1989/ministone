package kr.co.ministone.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("DeckDAO")
public class MYSQLDao2 implements DeckDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public void insert(HashMap<String, String> ckeckok) {
		ss.insert("insert", ckeckok);
		
	}

}
