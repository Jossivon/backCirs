package jibp.nv.model.service;

import java.util.List;

import jibp.nv.entity.Gasto;

public interface GastoService {
    
	public List<Gasto> findAll();
	
	public Gasto save(Gasto gasto);
	
	public void delete(Integer id); 
	
	public Gasto findById(Integer id); 
}
