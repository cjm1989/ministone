package kr.co.ministone.control;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ministone.dao.DAO;
import kr.co.ministone.dao.DeckDAO;
import kr.co.ministone.dao.DeckService;

@Service("DeckService")
public class DeckServiceImple implements DeckService{

	@Inject
	private DeckDAO deckDAO;
	
	public void setDeck(DeckDAO deckDAO) {
		this.deckDAO = deckDAO;
	}
	
	
	
	@Override
	public void insert(HashMap<String, String> checkok) {
		// TODO Auto-generated method stub
	
		deckDAO.insert(checkok);
	}

}
