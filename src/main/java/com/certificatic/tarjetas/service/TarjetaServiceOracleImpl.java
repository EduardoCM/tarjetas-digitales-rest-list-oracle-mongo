package com.certificatic.tarjetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certificatic.tarjetas.model.TarjetaEntity;
import com.certificatic.tarjetas.repository.TarjetaRepositoryOracle;

@Service
public class TarjetaServiceOracleImpl implements TarjetaServiceOracle {

	@Autowired
	private TarjetaRepositoryOracle oracleRepository;

	@Override
	public TarjetaEntity creartarjeta(TarjetaEntity tarjeta) {
		return oracleRepository.save(tarjeta);
	}

	@Override
	public List<TarjetaEntity> obtenerTarjetas() {
		return oracleRepository.findAll();
	}

	@Override
	public TarjetaEntity obtenerTarjeta(String numeroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TarjetaEntity actualizarTarjeta(int index, TarjetaEntity tarjeta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
