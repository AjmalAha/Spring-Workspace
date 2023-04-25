package com.Day3.connection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Day3.connection.Model.IplModel;

public interface IplRepo extends JpaRepository<IplModel, Integer> {

}
