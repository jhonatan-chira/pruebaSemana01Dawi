package com.empresa.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Cliente;
import com.empresa.service.ClienteService;

@RestController
@RequestMapping("/url/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping
	public List<Cliente> listaCliente(){
		List<Cliente> lstSalida = service.listaCliente();
		return lstSalida;	
	}
	
	@PostMapping							//Jsonn se transforma en objeto
	public ResponseEntity<?> insertaModalidad(@RequestBody Cliente obj){
		List<String> lstSalida = new ArrayList<String>();
		
		obj.setEstado(1);
		obj.setFechaRegistro(new Date());
		
		Cliente objSalida = service.insertaCliente(obj);
		if (objSalida == null) {
			lstSalida.add("Error en el registro");
		} else {
			lstSalida.add("Se registra la modalidad con el id :" + objSalida.getIdCliente());
		}
		
		return ResponseEntity.ok(lstSalida);
	}
}
