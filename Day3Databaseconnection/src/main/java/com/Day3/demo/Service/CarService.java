package com.Day3.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day3.demo.Model.CarModel;
import com.Day3.demo.CaarRepository;

@Service
public class CarService {
	@Autowired
	public CaarRepository cser;
	public CarModel saveInfo(CarModel ex)
	{
		return cser.save(ex);
		
	}
}
