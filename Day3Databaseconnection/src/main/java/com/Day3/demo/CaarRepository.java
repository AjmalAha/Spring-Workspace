package com.Day3.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Day3.demo.Model.CarModel;

public interface CaarRepository extends JpaRepository<CarModel, Integer> {

}
