package com.ProyectowebAbc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ProyectowebAbc.model.Provider;
import com.ProyectowebAbc.util.JpaUtil;

public class ProviderDao {
	
	EntityManager  entityManager  = JpaUtil.getEntityManagerFactory().createEntityManager();

	public void deleteProvider(Provider provider) {
		entityManager.getTransaction().begin();
		entityManager.remove(provider);
		entityManager.getTransaction().commit();
	
	}
	public void updateProviders(Provider provider) {
		entityManager.getTransaction().begin();
		entityManager.merge(provider);
		entityManager.getTransaction().commit();
		
	}
	public void  createProviders(Provider provider) {
		entityManager.getTransaction().begin();
		entityManager.persist(provider);
		entityManager.getTransaction().commit();
		
		
	}
	public List<Provider>  searchProviders(String id , String name) {
		
		if(id.equals("")){
			id="-";
		}
		if(name.isEmpty()) {
			name="-";
		}
		if( id.equals("-") && name.equals("-")){
			id="";
			name="";
		}
		Query query = entityManager.createQuery("SELECT p FROM Provider p WHERE p.id LIKE '%"+id+"%' OR p.nameProvider LIKE '%"+name+"%'");
		List<Provider> listProvider = query.getResultList();
		return  listProvider  ;
		
	}
	
	public List<Provider> searchAllProviders() {
		Query query = entityManager.createQuery("SELECT p FROM Provider p" );
		List<Provider> listProvider = query.getResultList();
		return  listProvider  ;
	}
	

}


//declaracion de metodos va prublic , private  luego va el tipo de obj a devolver ejp String , int , List<obj> etc  nombre del metodoto () o () con parametros 