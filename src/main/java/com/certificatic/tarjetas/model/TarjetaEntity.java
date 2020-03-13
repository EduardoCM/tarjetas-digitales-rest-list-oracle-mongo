package com.certificatic.tarjetas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Tarjeta")
public class TarjetaEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "titular")
	private String nombreTitular;
	
	@Column(name = "entidad")
	private String nombreEntidad;
	
	private String numeroTarjeta;
	
	private String cvv;
	
	private String fechaCaudicidad;
	
	private String marca;
	
	
	
	
	

}
