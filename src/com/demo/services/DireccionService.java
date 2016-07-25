package com.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.*;
import com.demo.pojo.Admin;
import com.demo.pojo.Direccion;


@Service
public class DireccionService {

	@Autowired
	private DireccionDao direccionDao;
	
	@Autowired
	private AdminDao adminDao;
	
	public void save(Admin admin, Direccion direccion)
	{		
		direccion.setAdmin(admin);
		direccionDao.save(direccion);
	}
	
	public List<Admin> findAll()
	{
		return null;
		
	}
	
}
