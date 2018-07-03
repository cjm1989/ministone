package kr.co.ministone.control;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.ministone.dao.DAO;

@Controller
public class MainController {

/*	@Inject
	DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}*/
	
	@RequestMapping(value="/")
	public String callMain() {
		return "main";
	
		
	}
	
	
	
}
