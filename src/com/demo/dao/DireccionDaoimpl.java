package com.demo.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.pojo.Admin;
import com.demo.pojo.Direccion;



@Transactional
@Repository
public class DireccionDaoimpl implements DireccionDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Direccion direccion) {
		// TODO Auto-generated method stub
		getSession().save(direccion);
		
	}

	@Override
	public List<Direccion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}