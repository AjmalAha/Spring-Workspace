package com.Day3.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Day3.demo.Model.CarModel;
import com.Day3.demo.Service.CarService;

@RestController
public class CarController {
	@Autowired
	public CarService cser;
	@PostMapping("/savedot")
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return cser.saveInfo(cr);
		
	}

}
