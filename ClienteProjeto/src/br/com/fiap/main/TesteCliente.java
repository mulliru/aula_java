package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objeto
		
		Cliente objetoCliente = new Cliente ();

		// Entradas
		
		objetoCliente.setNome("Soraya");
		objetoCliente.setIdade(19);
		objetoCliente.setValor(784);
		
		// Saídas
		
		
		
		System.out.println(objetoCliente.getNome());
		System.out.println(objetoCliente.getIdade());
		System.out.println(objetoCliente.getValor());
		
	}

}
