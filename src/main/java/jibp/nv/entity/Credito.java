package jibp.nv.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "credito")
public class Credito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;

	
	private Float valor; 
	private String motivo; 
	private Integer cuotas; 
	
	private Date fecha;
	
	@PrePersist
	public void prePresist() {
		fecha = new Date(); 
	}
	
	
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Integer getCuotas() {
		return cuotas;
	}
	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
