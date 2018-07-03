package kr.co.ministone.control;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ministone.dao.DAO;
import kr.co.ministone.dto.UserCardDTO;
import kr.co.ministone.dto.UserDTO;

@Controller
public class StoreController {
	
	@Inject
	DAO dao;
	
	public void setDAO(DAO dao) {
		this.dao=dao;
	}
	

	@RequestMapping("/store.do")
	public String point(Model model) {
		/*UserDTO dto=dao.selectOneByUser("mong");
		model.addAttribute("dto",dto);*/
		
		return "store";
	}
	
	@RequestMapping("/storeOk.do")
	public ModelAndView pointout(HttpServletRequest req, HttpServletRequest resp) {
		String value=req.getParameter("value");//value가 카드팩 값이 넘어온다.
		String number=req.getParameter("number");//카드의 갯수가 넘어온다.
		
		ModelAndView mav=new ModelAndView("storeOk");
		int no=Integer.parseInt(value);//넘어온 값을 int로 변환
		int num=Integer.parseInt(number);
		
		
		UserDTO dto=dao.selectOneByUser("mong");//mong유저의 point값을 가져와서 dto에 담는다.
		UserDTO dto1=new UserDTO();
		List<UserCardDTO> list=dao.selectAllMarket();
	
		
	   Random r = new Random();    // Random형 객체를 만듭니다.
		
	  
		
		if(no!=0 && num!=0) {	
			
			if(no>dto.getPoint()) {
				return new ModelAndView("store","dto",dto);//유저가 가지고있는 포인트보다 상점가격이 높으면 상점페이지로 return
			}
			int sum=dto.getPoint()-no;//구매 버튼 눌렀을시 유저가 가지고있는 point에서 상점가격을 빼서 넘긴다.
			
			dto1.setUid("mong");
			dto1.setPoint(sum);
			dao.updateOne(dto1);
			
			
			for(int i=1; i<=num; i++) {
				int ran = r.nextInt(10)+1; 
				UserCardDTO dto3=new UserCardDTO(ran, "mong");
				dao.insertOne(dto3);
			}			
			
			mav.addObject("dto",dto);
			mav.addObject("sum",sum);
		}else {
			return new ModelAndView("store","dto",dto);
		}
		
		return mav;
		
	}
}


/* for (int i=0; i<arr.length; i++) {   
ran = r.nextInt(15)+1;   
cheak = true;  
for (int j=0; j<i; j++) {    
    if(arr[j] == ran) {
        i--;   
        cheak=false;   
    }
}
if(cheak)   
    arr[i] = ran;   
}

for(int i=0; i<arr.length; i++) {
for(UserCardDTO dto3 : list) {
	if(arr[i]==dto3.getCid()) {
		 i++;			    			
	}
	
}
	

UserCardDTO dto2=new UserCardDTO(arr[i],"mong");

dao.insertOne(dto2);	
}*/



/*for(int i=1; i<=num; i++) {
randomnumber = (int)(Math.random()*9)+1;

for(UserCardDTO dto3 : list) {
if(randomnumber==dto3.getCid()) {
	continue;
}
}//for dto3 end

UserCardDTO dto2=new UserCardDTO(randomnumber,"mong");

dao.insertOne(dto2);
}//for end
*/			
/*for(UserCardDTO dto3 : list) {

for(int i=1; i<=num; i++) {
randomnumber = (int)(Math.random()*9+1);				

if(randomnumber!=dto3.getCid()) {
	continue;
}
}

UserCardDTO dto2=new UserCardDTO(randomnumber,"mong");

dao.insertOne(dto2);
}*/



/* UserCardDTO dto6=new UserCardDTO();
int[] a=new int[10];
for(int i=0; i<dto6.getCid(); i++) {
	a[i]=dto6.getCid();
}*/
/*for (int i=0; i<arr.length; i++) {   
    ran = r.nextInt(10)+1;   
    cheak = true;  
    for (int j=0; j<i; j++) {    
        if(arr[j] == ran) {
            i--;   
            cheak=false;   
        }
    }
    if(cheak)   
        arr[i] = ran;   
}

for(int i=0; i<arr.length; i++) {
	
		
	
	UserCardDTO dto2=new UserCardDTO(arr[i],"mong");
	
	dao.insertOne(dto2);	
}*/
/*int[] arr = new int[num];  //1차원배열 방 10개를 만듭니다.
int ran=0;    //랜덤값을 받을 변수를 만듭니다.
boolean cheak;    // 비교하기 위해 boolean형 변수를 만듭니다.
*/	 