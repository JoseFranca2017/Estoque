package br.com.sistema.Repositorio;

import java.util.List;

import br.com.sistema.Dao.Dao;
import br.com.sistema.Entidades.Agencia;
import br.com.sistema.IRepositorio.IRepositorioAgencia;

public class RepositorioAgencia implements IRepositorioAgencia {

	@Override
	public boolean cadastrarAgencia(Agencia c) {
		return Dao.getInstance().salvarObjeto(c);
	}

	@Override
	public boolean atualizarAgencia(Agencia c) {
		return Dao.getInstance().salvarOuAtualizarObjeto(c);
	}

	@Override
	public boolean deletarAgencia(Agencia c) {
		return Dao.getInstance().deletarObjeto(c);
	}

	@Override
	public List<?> listarAgencia(Class<?> classe) {
		return Dao.getInstance().listarObjetos(classe);
	}

	@Override
	public <T> Object buscarAgenciaId(Class<T> clazz, long id) {
		return Dao.getInstance().buscarPorId(clazz, id);
	}

	
}
