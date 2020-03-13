package com.certificatic.tarjetas.api;

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

import com.certificatic.tarjetas.model.TarjetaEntity;
import com.certificatic.tarjetas.model.TarjetaMongo;
import com.certificatic.tarjetas.service.TarjetaServiceMongo;


@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1/tarjeta")
public class TarjetaMongoApi {
	
	@Autowired
	private TarjetaServiceMongo tarjetaService;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TarjetaMongo creartarjeta(@RequestBody TarjetaMongo tarjeta) {
		return tarjetaService.creartarjeta(tarjeta);	
	}
	
	@GetMapping("/{numeroTarjeta}")
	public TarjetaMongo obtenerTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
		return tarjetaService.obtenerTarjeta(numeroTarjeta);		
	}

	@GetMapping
	public  List<TarjetaMongo> obtenerTarjetas(){
		return tarjetaService.obtenerTarjetas();
	}


	@DeleteMapping("/{numeroTarjeta}")
	public void eliminarTarjeta(@PathVariable(name="numeroTarjeta") String numeroTarjeta) {
		tarjetaService.eliminarTarjeta(numeroTarjeta);
	}

	@PutMapping("/{index}")
	public TarjetaEntity actualizarTarjeta(@PathVariable(name="index") int index, @RequestBody TarjetaEntity tarjeta) {
		//return tarjetaService.actualizarTarjeta(index, tarjeta);
	return null;
	}
	
	@DeleteMapping("/todos")
	public void eliminarTodos() {
		
	}


}
