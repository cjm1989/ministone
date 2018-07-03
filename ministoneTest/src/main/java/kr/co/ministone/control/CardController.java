package kr.co.ministone.control;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import kr.co.ministone.dao.DAO;
import kr.co.ministone.dao.Paging;
import kr.co.ministone.dto.cardDTO;

@Controller
public class CardController {

	@Inject
	DAO dao;

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	

	
	@RequestMapping("/cardlist.do")
	public String list(Model model, HttpServletRequest req) {
		
		int currentPageNo = 1; 
		int maxPost = 8;	
		
		if(req.getParameter("pages") != null)														 
			currentPageNo = Integer.parseInt(req.getParameter("pages")); 	
		
		
		
		Paging paging = new Paging(currentPageNo, maxPost); 
		
		int offset = (paging.getCurrentPageNo() -1) * paging.getmaxPost(); 
		
		
		ArrayList<cardDTO> list = new ArrayList<cardDTO>();
		list = (ArrayList<cardDTO>)dao.selectAll(offset, paging.getmaxPost());
		
		paging.setNumberOfRecords(dao.getCOunt());
		
		paging.makePaging();
		
		
		
		
		//List<cardDTO> list = dao.selectAll(offset, noOfrecords);
		
				
		
	
		
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		
		return "deck";
		
	}
/*	
	@RequestMapping("/")
	public String cardlist(Model model) {
		List<cardDTO> cardlist = dao.select();
		
	
		
		model.addAttribute("cardlist", cardlist);
		
		return "deck";
		
	}*/
	
	
	
}
