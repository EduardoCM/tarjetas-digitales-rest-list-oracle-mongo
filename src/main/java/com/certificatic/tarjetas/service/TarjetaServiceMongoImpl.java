package com.certificatic.tarjetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certificatic.tarjetas.model.TarjetaMongo;
import com.certificatic.tarjetas.repository.TarjetaRepositoryMongo;

@Service
public class TarjetaServiceMongoImpl implements TarjetaServiceMongo {

	
	@Autowired
	private TarjetaRepositoryMongo mongoRepository;

	@Override
	public TarjetaMongo creartarjeta(TarjetaMongo tarjeta) {
		return mongoRepository.save(tarjeta);
	}

	@Override
	public List<TarjetaMongo> obtenerTarjetas() {
		return mongoRepository.findAll();
	}

	@Override
	public TarjetaMongo obtenerTarjeta(String numeroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TarjetaMongo actualizarTarjeta(int index, TarjetaMongo tarjeta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
