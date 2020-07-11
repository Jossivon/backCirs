package jibp.nv.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jibp.nv.entity.Credito;
import jibp.nv.model.ISCredito;


@Service
public class CreditoServiceIm implements CreditoService{
	
	@Autowired
	private ISCredito creditoModel; 
	
	public List<Credito> findAll(){
		return (List<Credito>) creditoModel.findAll();
	}

	@Override
	public Credito save(Credito credito) {
		return creditoModel.save(credito); 
	}
	
	@Override
	public void delete (Integer id) {
		creditoModel.deleteById(id);
	}
	
	
	@Override
	public Credito findById(Integer id) {
		return creditoModel.findById(id).orElseThrow(null);
	}
	
}
