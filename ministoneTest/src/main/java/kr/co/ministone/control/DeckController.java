package kr.co.ministone.control;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ministone.dao.DeckDAO;
import kr.co.ministone.dao.DeckService;
import kr.co.ministone.dto.deckDTO;



@Controller

public class DeckController {

	@Resource(name = "DeckService")
	DeckService deckservice;
	
	/*@Autowired
	deckDTO dto2;*/
	
	
	@RequestMapping("/insert")
	public String insert(/*HttpSession session,*/
			@RequestParam String title, HttpServletRequest req) throws Exception {
		
		//String page = "";

		/*String name = (String) session.getAttribute("name");*/
		
		HashMap<String, String> insertValue = new HashMap<String, String>();
		/*if(name != null) {*/
		insertValue.put("title", title);
		//insertValue.put("title", req.getParameter("title"));
		insertValue.put("cid", req.getParameter("cid"));
		insertValue.put("checkok", req.getParameter("checkok").toString());
		deckservice.insert(insertValue);
		//return "deck";
		return "redirect:/";
		
		/*} else {
			//return "deck";
			return "redirect:/";
		}*/
		
		//return "deck";
		//page = "redirect:";
		
	}
	
	/*@RequestMapping("/list")
	public ModelAndView list(@RequestParam String title, ModelAndView mav ) {
		List<deckDTO>list = dao.list(title);
		mav.setViewName("/");
		mav.addObject("deck", list);
		return mav;
	}*/
}
