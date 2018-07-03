package kr.co.ministone.chat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HtmlUtils;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
/*	@RequestMapping(value="chat.do") 
	public String chat() {
		return "chat";
	}
	
	@RequestMapping(value="hello.do") 
	public String hello() {
		return "hello";
	}*/

	@RequestMapping(value="game.do") 
	public String game() {
		return "game0";
	}
	
/*	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public Message send(Message message) throws Exception {
		//String time = new SimpleDateFormat("HH:mm").format(new Date());
		return new Message(message.getName(), message.getText());
	}

	@MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws Exception {
        //Thread.sleep(1000); // simulated delay
        return new Message(message.getName(), "카드를 냈습니다");
    }*/

	@MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws Exception {
        //Thread.sleep(1000); // simulated delay
        return new Message(message.getName(), "카드를 냈습니다");
    }
	
	//In Spring 4.2, destination variable placeholders are supported it's now possible to do something like:
	/*@MessageMapping("/fleet/{fleetId}/driver/{driverId}")
	@SendTo("/topic/fleet/{fleetId}")
	public Message simple(@DestinationVariable String fleetId, @DestinationVariable String driverId) {
	    return new Message(fleetId, driverId);
	}*/
	//Test
	@MessageMapping("/opponent/{name}")
	@SendTo("/topic/opponent/{name}")
	public Message simple(@DestinationVariable String name) {
		System.out.println(name+"에게 메세지가 보내졌습니다");
	    return new Message(name, name+"에게 카드를 냈습니다.");
	}
	
	//카드 뽑았을 때
	@MessageMapping("/opponent/drawCard/{name}")
	@SendTo("/topic/opponent/drawCard/{name}")
	public String drawCard(@DestinationVariable String name, String cardDraw) {
		String me = "temp";
		System.out.println(me+"가 카드를 한 장 뽑았습니다");
	    return cardDraw;
	}
	
	//카드 냈을 때 처리
	@MessageMapping("/opponent/sendCard/{name}")
	@SendTo("/topic/opponent/sendCard/{name}")
	public Card sendCard(@DestinationVariable String name, Card card) {
		System.out.println(name+"에게 카드를 냈다");
	    return card;
	}
	
	//공격했을 때
	@MessageMapping("/opponent/attack/{name}")
	@SendTo("/topic/opponent/attack/{name}")
	public Card attack(@DestinationVariable String name, Card card) {
		System.out.println(name + "의" + card.getPlace() + "를 공격했다.");
	    return card;
	}
	
	//턴 끝냈을 때 
	@MessageMapping("/opponent/changeTurn/{name}")
	@SendTo("/topic/opponent/changeTurn/{name}")
	public String changeTurn(@DestinationVariable String name, String turnOver) {
		System.out.println(name+"에게 턴을 넘긴다");
	    return turnOver;
	}
	
	//항복했을 떄 OR 졌을 때
	@MessageMapping("/opponent/gameOver/{name}")
	@SendTo("/topic/opponent/gameOver/{name}")
	public Card gameOver(@DestinationVariable String name, Card card) {
		System.out.println("게임이 끝낫습니다."+name+"이 이겼습니다.");
	    return card;
	}	
	
}
