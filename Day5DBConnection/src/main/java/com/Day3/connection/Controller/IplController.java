package com.Day3.connection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Day3.connection.Model.IplModel;
import com.Day3.connection.Service.IplService;
@RestController
public class IplController {
	@Autowired
	public IplService iser;
	@PostMapping("/saveIpl")
	public IplModel addDetails(@RequestBody IplModel ia)
	{
		return iser.saveInfo(ia);
	}

}
