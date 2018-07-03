package kr.co.ministone.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.ministone.dto.deckDTO;

public interface DeckDAO {
	/*public List<deckDTO> list(String title);
	public void create(deckDTO dto2);
	public void delete(String name);*/
	public void insert(HashMap<String, String>checkok);
	
	
}
