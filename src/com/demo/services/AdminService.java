package com.demo.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.*;
import com.demo.pojo.Admin;


@Service
public class AdminService {

	@Autowired
	public AdminDao adminDao;
	
	public void save(Admin admin)
	{		
		admin.setFechaCreacion(new Timestamp(new Date().getTime()));	
		adminDao.save(admin);
	}
	
	public List<Admin> finAll()
	{
		return adminDao.finAll();
	}
	
	public Admin FinById(int id)
	{
		return adminDao.findById(id);		
	}

	public void SaveOrUpdate(Admin admin) {
		if(admin.getIdAd()==0)
		{
			//Insert
			admin.setFechaCreacion(new Timestamp(new Date().getTime()));
			adminDao.save(admin);	
		}
		else
		{
			//Update
			adminDao.update(admin);
		}
	}
	public void delete(int idAd) {
		// TODO Auto-generated method stub
		adminDao.delete(idAd);
	}
}
