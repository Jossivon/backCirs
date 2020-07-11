package jibp.nv.model.service;

import java.util.List;

import jibp.nv.entity.Credito;

public interface CreditoService {
	
	public List <Credito> findAll(); 
	
	public Credito save(Credito credito); 
	
	public void delete(Integer id); 
	
	public Credito findById(Integer id); 
	
}
