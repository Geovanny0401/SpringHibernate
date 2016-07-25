package com.demo.dao;

import java.util.List;

import com.demo.pojo.Direccion;

public interface DireccionDao {

	public void save(Direccion direccion);
	public List<Direccion> findAll();
}
