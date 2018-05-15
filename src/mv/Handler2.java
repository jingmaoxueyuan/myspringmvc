package mv;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 

import po.Items;
import po.User;
@org.springframework.stereotype.Controller
public class Handler2 implements Controller{
    @RequestMapping("/user3.action")
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List<Items> list=new ArrayList<Items>(); 
		Items u1=new Items();
		u1.setId(10);
		u1.setDetail("11");
		u1.setName("d");
		list.add(u1);
		
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",list);
		mv.setViewName("/jsp/itemslist.jsp");
		return mv;
	}

}
