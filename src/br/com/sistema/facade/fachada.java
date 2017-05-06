package br.com.sistema.facade;

import java.util.List;

import br.com.sistema.Entidades.Agencia;
//import br.com.sistema.Entidades.Bairro;
//import br.com.sistema.Entidades.Cidade;
//import br.com.sistema.Entidades.Contato;
//import br.com.sistema.Entidades.Endereco;
//import br.com.sistema.Entidades.Estado;
//import br.com.sistema.Entidades.Pessoa;
//import br.com.sistema.Entidades.PessoaFisica;
//import br.com.sistema.Entidades.PessoaJuridica;
//import br.com.sistema.Entidades.Terminal;
//import br.com.sistema.Entidades.Usuario;

import br.com.sistema.IRepositorio.IRepositorioAgencia;
/*import br.com.sistema.IRepositorio.IRepositorioBairro;
import br.com.sistema.IRepositorio.IRepositorioCidade;
import br.com.sistema.IRepositorio.IRepositorioContato;
import br.com.sistema.IRepositorio.IRepositorioEndereco;
import br.com.sistema.IRepositorio.IRepositorioEstado;
import br.com.sistema.IRepositorio.IRepositorioPessoa;
import br.com.sistema.IRepositorio.IRepositorioPessoaFisica;
import br.com.sistema.IRepositorio.IRepositorioPessoaJuridica;
import br.com.sistema.IRepositorio.IRepositorioTerminal;
import br.com.sistema.IRepositorio.IRepositorioUsuario;
*/
import br.com.sistema.Repositorio.RepositorioAgencia;
/*import br.com.sistema.Repositorio.RepositorioBairro;
import br.com.sistema.Repositorio.RepositorioCidade;
import br.com.sistema.Repositorio.RepositorioContato;
import br.com.sistema.Repositorio.RepositorioEndereco;
import br.com.sistema.Repositorio.RepositorioEstado;
import br.com.sistema.Repositorio.RepositorioPessoa;
import br.com.sistema.Repositorio.RepositorioPessoaFisica;
import br.com.sistema.Repositorio.RepositorioPessoaJuridica;
import br.com.sistema.Repositorio.RepositorioTerminal;
import br.com.sistema.Repositorio.RepositorioUsuario;

*/
public class fachada {

	private static fachada instance;
		
		private IRepositorioAgencia repositorioAgencia;
	/*	private IRepositorioBairro repositorioBairro;
		private IRepositorioCidade repositorioCidade;
		private IRepositorioContato repositorioContato;
		private IRepositorioEndereco repositorioEndereco;
		private IRepositorioEstado repositorioEstado;
		private IRepositorioPessoa repositorioPessoa;
		private IRepositorioPessoaFisica repositorioPessoaFisica;
		private IRepositorioPessoaJuridica repositorioPessoaJuridica;
		private IRepositorioTerminal repositorioTerminal;
		private IRepositorioUsuario repositorioUsuario;
*/
	private fachada() {
		
		repositorioAgencia = new RepositorioAgencia();
	/*	repositorioBairro  = new RepositorioBairro();
		repositorioCidade  = new RepositorioCidade();
		repositorioContato = new RepositorioContato();
		repositorioEndereco = new RepositorioEndereco();
		repositorioEstado = new RepositorioEstado();
		repositorioPessoa = new RepositorioPessoa();
		repositorioPessoaFisica = new RepositorioPessoaFisica();
		repositorioPessoaJuridica = new RepositorioPessoaJuridica();
		repositorioTerminal = new RepositorioTerminal();
		repositorioUsuario = new RepositorioUsuario();  */
	}

	
	
	public static fachada getInstance() {
		if (instance == null)
			instance = new fachada();
		return instance;

	}
	

	public boolean cadastrarAgencia(Agencia c) {
		return repositorioAgencia.cadastrarAgencia(c);
	}



	public boolean atualizarAgencia(Agencia c) {
		return repositorioAgencia.atualizarAgencia(c);
	}



	public boolean deletarAgencia(Agencia c) {
		return repositorioAgencia.deletarAgencia(c);
	}



	public List<?> listarAgencia(Class<?> classe) {
		return repositorioAgencia.listarAgencia(classe);
	}



	public <T> Object buscarAgenciaId(Class<T> clazz, long id) {
		return repositorioAgencia.buscarAgenciaId(clazz, id);
	}
	
	
	
/*	

// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO CONTATOS
	
	public boolean cadastrarContato(Contato c) {
		return repositorioContato.cadastrarContato(c);
	}

	public boolean atualizarContato(Contato c) {
		return repositorioContato.atualizarContato(c);
	}

	public boolean deletarContato(Contato c) {
		return repositorioContato.deletarContato(c);
	}

	public List<?> listarContato(Class<?> classe) {
		return repositorioContato.listarContato(classe);
	}

	public <T> Object buscarContatoId(Class<T> clazz, long id) {
		return repositorioContato.buscarContatoId(clazz, id);
	}

	
// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO CONTATOS

	public boolean cadastrarPessoa(Pessoa c) {
		return repositorioPessoa.cadastrarPessoa(c);
	}



	public boolean atualizarPessoa(Pessoa c) {
		return repositorioPessoa.atualizarPessoa(c);
	}



	public boolean deletarPessoa(Pessoa c) {
		return repositorioPessoa.deletarPessoa(c);
	}



	public List<?> listarPessoa(Class<?> classe) {
		return repositorioPessoa.listarPessoa(classe);
	}



	public <T> Object buscarPessoaId(Class<T> clazz, long id) {
		return repositorioPessoa.buscarPessoaId(clazz, id);
	}
	
// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO AGENCIA

// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO BAIRRO

	public boolean cadastrarBairro(Bairro c) {
		return repositorioBairro.cadastrarBairro(c);
	}



	public boolean atualizarBairro(Bairro c) {
		return repositorioBairro.atualizarBairro(c);
	}



	public boolean deletarBairro(Bairro c) {
		return repositorioBairro.deletarBairro(c);
	}



	public List<?> listarBairro(Class<?> classe) {
		return repositorioBairro.listarBairro(classe);
	}



	public <T> Object buscarBairroId(Class<T> clazz, long id) {
		return repositorioBairro.buscarBairroId(clazz, id);
	}

// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO CIDADE

	public boolean cadastrarCidade(Cidade c) {
		return repositorioCidade.cadastrarCidade(c);
	}



	public boolean atualizarCidade(Cidade c) {
		return repositorioCidade.atualizarCidade(c);
	}



	public boolean deletarCidade(Cidade c) {
		return repositorioCidade.deletarCidade(c);
	}



	public List<?> listarCidade(Class<?> classe) {
		return repositorioCidade.listarCidade(classe);
	}



	public <T> Object buscarCidadeId(Class<T> clazz, long id) {
		return repositorioCidade.buscarCidadeId(clazz, id);
	}	
	
// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO ENDERECO


	public boolean cadastrarEndereco(Endereco e) {
		return repositorioEndereco.cadastrarEndereco(e);
	}



	public boolean atualizarEndereco(Endereco e) {
		return repositorioEndereco.atualizarEndereco(e);
	}



	public boolean deletarEndereco(Endereco e) {
		return repositorioEndereco.deletarEndereco(e);
	}



	public List<?> listarEndereco(Class<?> classe) {
		return repositorioEndereco.listarEndereco(classe);
	}



	public <T> Object buscarEnderecoId(Class<T> clazz, long id) {
		return repositorioEndereco.buscarEnderecoId(clazz, id);
	}
	
// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO ESTADO

	public boolean cadastrarEstado(Estado e) {
		return repositorioEstado.cadastrarEstado(e);
	}



	public boolean atualizarEstado(Estado e) {
		return repositorioEstado.atualizarEstado(e);
	}



	public boolean deletarEstado(Estado e) {
		return repositorioEstado.deletarEstado(e);
	}



	public List<?> listarEstado(Class<?> classe) {
		return repositorioEstado.listarEstado(classe);
	}



	public <T> Object buscarEstadoId(Class<T> clazz, long id) {
		return repositorioEstado.buscarEstadoId(clazz, id);
	}

// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO PESSOA FISICA

	public boolean cadastrarPessoaFisica(PessoaFisica p) {
		return repositorioPessoaFisica.cadastrarPessoaFisica(p);
	}



	public boolean atualizarPessoaFisica(PessoaFisica p) {
		return repositorioPessoaFisica.atualizarPessoaFisica(p);
	}



	public boolean deletarPessoaFisica(PessoaFisica p) {
		return repositorioPessoaFisica.deletarPessoaFisica(p);
	}



	public List<?> listarPessoaFisica(Class<?> classe) {
		return repositorioPessoaFisica.listarPessoaFisica(classe);
	}



	public <T> Object buscarPessoaFisicaId(Class<T> clazz, long id) {
		return repositorioPessoaFisica.buscarPessoaFisicaId(clazz, id);
	}
	
// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO PESSOA JURIDICA

	public boolean cadastrarPessoaJuridica(PessoaJuridica p) {
		return repositorioPessoaJuridica.cadastrarPessoaJuridica(p);
	}



	public boolean atualizarPessoaJuridica(PessoaJuridica p) {
		return repositorioPessoaJuridica.atualizarPessoaJuridica(p);
	}



	public boolean deletarPessoaJuridica(PessoaJuridica p) {
		return repositorioPessoaJuridica.deletarPessoaJuridica(p);
	}



	public List<?> listarPessoaJuridica(Class<?> classe) {
		return repositorioPessoaJuridica.listarPessoaJuridica(classe);
	}



	public <T> Object buscarPessoaJuridicaId(Class<T> clazz, long id) {
		return repositorioPessoaJuridica.buscarPessoaJuridicaId(clazz, id);
	}

	// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO TERMINAL

	public boolean cadastrarTerminal(Terminal t) {
		return repositorioTerminal.cadastrarTerminal(t);
	}



	public boolean atualizarTerminal(Terminal t) {
		return repositorioTerminal.atualizarTerminal(t);
	}



	public boolean deletarTerminal(Terminal t) {
		return repositorioTerminal.deletarTerminal(t);
	}



	public List<?> listarTerminal(Class<?> classe) {
		return repositorioTerminal.listarTerminal(classe);
	}



	public <T> Object buscarTerminalId(Class<T> clazz, long id) {
		return repositorioTerminal.buscarTerminalId(clazz, id);
	}		
	
	
// CRIA플O DOS METODOS BASEADOS NO REPOSITORIO USUARIO



	public boolean cadastrarUsuario(Usuario u) {
		return repositorioUsuario.cadastrarUsuario(u);
	}



	public boolean atualizarUsuario(Usuario u) {
		return repositorioUsuario.atualizarUsuario(u);
	}



	public boolean deletarUsuario(Usuario u) {
		return repositorioUsuario.deletarUsuario(u);
	}



	public List<?> listarUsuario(Class<?> classe) {
		return repositorioUsuario.listarUsuario(classe);
	}



	public <T> Object buscarUsuarioId(Class<T> clazz, long id) {
		return repositorioUsuario.buscarUsuarioId(clazz, id);
	}

	*/

}
	