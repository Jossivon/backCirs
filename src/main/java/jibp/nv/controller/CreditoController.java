package jibp.nv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jibp.nv.entity.Credito;
import jibp.nv.model.service.CreditoService;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/api")

public class CreditoController {
	
	@Autowired
	private CreditoService creditoService; 
	
	@GetMapping("/creditos")
	public List<Credito> index(){
		return creditoService.findAll(); 
	}
	
	@PostMapping("/creditos")
	@ResponseStatus(HttpStatus.CREATED)
	public Credito create(@RequestBody Credito credito) {
		return creditoService.save(credito); 
	}

	@GetMapping("/creditos/{id}")
	public Credito show (@PathVariable Integer id) { 
		return creditoService.findById(id);
	}
	
	@PutMapping("/creditos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Credito update(@RequestBody Credito credito, @PathVariable Integer id) {
		Credito creditoActual = creditoService.findById(id); 
		creditoActual.setMotivo(credito.getMotivo());
		creditoActual.setCuotas(credito.getCuotas());
		creditoActual.setValor(credito.getValor());
		creditoActual.setFecha(credito.getFecha());
		
		return creditoService.save(creditoActual);
	}
	
	@DeleteMapping ("/creditos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		creditoService.delete(id);
	}
}
