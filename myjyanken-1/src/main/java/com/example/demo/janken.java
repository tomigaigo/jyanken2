package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class janken {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @PostMapping("/submit")
    public String submit(@RequestParam("action") String action, Model model) {
    	
    	int i =0;
		switch (action) {
			case "button1":
				i=1;
				break;
			case "button2":
				i=2;
				break;
			case "button3":
				i=3;
				break;
//			default:
//				return "index";
		}
		
//		System.out.println(action);
//		System.out.println("i " +i);
		
    	int ram = 0; //pc
		ram = (int)Math.ceil(Math.random()*3);
		System.out.println("ram " + ram);
//		i=2;
		ram =1;
		
    	if(i==1 && ram==1){
    		return "result1";
        }else if(i==1 && ram==2){
        	return "result2";
        }else if(i==1 && ram==3){
        	return "result3";
        }else if(i==2 && ram==1){
    		return "result4";
        }else if(i==2 && ram==2){
        	return "result5";
        }else if(i==2 && ram==3){
        	return "result6";
        }else if(i==3 && ram==1){
    		return "result7";
        }else if(i==3 && ram==2){
        	return "result8";
        }else if(i==3 && ram==3){
        	return "result9";
        }else {
        	return "index";
        }
    	
//    	i=0;
    	
    	
//        switch (action) {
//            case "button1":
//                return "result1";
//            case "button2":
//                return "result2";
//            case "button3":
//                return "result3";
//            default:
//                return "index";
//        }
    }

//    @PostMapping("/submit")
//    public String submit(@RequestParam("action") String action, Model model) {
//        switch (action) {
//            case "button1":
//                return "result1";
//            case "button2":
//                return "result2";
//            case "button3":
//                return "result3";
//            default:
//                return "index";
//        }
//    }
}
