package br.com.sistema.IRepositorio;

import java.util.List;

import br.com.sistema.Entidades.Agencia;

public interface IRepositorioAgencia {
	public boolean cadastrarAgencia(Agencia c);
	public boolean atualizarAgencia(Agencia c);
	public boolean deletarAgencia(Agencia c);
	public List<?> listarAgencia(Class<?> classe);
	public <T> Object buscarAgenciaId(Class<T> clazz, long id);
	
}
