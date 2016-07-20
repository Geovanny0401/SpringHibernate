package com.demo.dao;

import java.util.List;


import com.demo.pojo.Admin;

public interface AdminDao {

	public void save(Admin admin);
	public List<Admin> finAll();
	public Admin findById(int id);
	public List<Admin> finByNombre(String nombre);
	public void update(Admin admin);
	public void delete(int idAd);
	
	
}
