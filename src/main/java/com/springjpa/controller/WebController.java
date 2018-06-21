package com.springjpa.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.springjpa.model.Utente;
import com.springjpa.repo.UserRepository;

@Controller
public class WebController {
	@Autowired
	UserRepository repository;
	
	
	@RequestMapping("/e")
	public String getHome()
	{
		return "princip";
	}
	
	
	
	
	
	
	@RequestMapping("/addUser")
	public void addUser() {
		Utente user=new Utente("ChuckBartowski","ivory94@hotmail.it",true);
		repository.save(user);
		
	}
	
	
	
	@RequestMapping("/findall")
	public String findAll(){
		String result = "";
		
		for(Utente cust : repository.findAll()){
			result += cust.toString() + "<br>";
		}
		
		return result;
	}
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
	
	
}

