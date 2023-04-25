package com.Day3.connection.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day3.connection.Model.IplModel;
import com.Day3.connection.Repository.IplRepo;

import jakarta.persistence.Access;

@Service
public class IplService {
	@Autowired
	public IplRepo irep;
	
	public IplModel saveInfo(IplModel im)
	{
		return irep.save(im);
	}

}
