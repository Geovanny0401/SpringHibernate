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



@Transactional
@Repository
public class AdminDaoimpl implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Admin admin) {
		getSession().save(admin);
	}


	@Override
	public List<Admin> finAll() {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Admin");
		return query.list();
	}

	@Override
	public Admin findById(int id) {
		
		Criteria crit = getSession().createCriteria(Admin.class);
		crit.add(Restrictions.eq("idAd", id));
		return (Admin) crit.uniqueResult();
	}

	@Override
	public List<Admin> finByNombre(String nombre) {
		Criteria crit = getSession().createCriteria(Admin.class);
		crit.add(Restrictions.eq("nombre", "%" + nombre + "%"));
		return crit.list();
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
	     getSession().update(admin);	
	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub
		getSession().delete(admin);
	}

	
}