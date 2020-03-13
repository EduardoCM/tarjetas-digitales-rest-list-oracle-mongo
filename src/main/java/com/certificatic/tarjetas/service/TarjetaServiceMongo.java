package com.certificatic.tarjetas.service;

import java.util.List;

import com.certificatic.tarjetas.model.TarjetaMongo;

public interface TarjetaServiceMongo {

	TarjetaMongo creartarjeta(TarjetaMongo tarjeta);

	List<TarjetaMongo> obtenerTarjetas();

	TarjetaMongo obtenerTarjeta(String numeroTarjeta);

	void eliminarTarjeta(String numeroTarjeta);

	TarjetaMongo actualizarTarjeta(int index, TarjetaMongo tarjeta);

}
