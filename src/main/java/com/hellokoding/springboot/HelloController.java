package com.hellokoding.springboot;

import java.awt.PageAttributes.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ketnoi.GetNoiDungCKeditor;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    
    
    @RequestMapping("/edit")
    public String welcome(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
    	
    	GetNoiDungCKeditor get = new GetNoiDungCKeditor();
    	String noidung = get.layNoidung();
    	
    	System.out.print("\nNoi dung lay ra duoc la "+noidung);
    
    	
    	
   
        model.addAttribute("text",noidung);
        
        return "edit";
    }
    
    @RequestMapping("/tagicsse")
    public String tagicsse(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "icsse17";
    }
    
    @RequestMapping(value ="/upload", method = RequestMethod.POST)
    public String uploadck(@RequestParam("noidung") String noidung) {
    	
    	
    	
    	GetNoiDungCKeditor set = new GetNoiDungCKeditor();
    	set.CapNhat(noidung);
    	
    	
    	System.out.print("cap nhat noi dung la "+noidung);
    	
        return "uploadck";
    }
    
  
}
