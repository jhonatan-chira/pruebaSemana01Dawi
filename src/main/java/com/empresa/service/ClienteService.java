package com.empresa.service;

import java.util.List;

import com.empresa.entity.Cliente;

public interface ClienteService {

	public abstract List<Cliente> listaCliente();
	public abstract Cliente insertaCliente(Cliente obj);
}
