package br.com.sistema.Teste;

import br.com.sistema.Entidades.Agencia;
import br.com.sistema.facade.fachada;

public class testarAgencia {

	public static void main(String[] args) {
						
		Agencia a =new Agencia();
		
		a.setCodigoSTO("30300304");
		a.setTipoOrgao("AC");
		a.setDiretoriaRegional("José França");
		a.setRegiao("Reven03");
		a.setResponsavel(1);
				
		boolean cadastro = fachada.getInstance().cadastrarAgencia(a);
		if (cadastro){
			System.out.println("Cadastro realizado com sucesso!!!");
			
		}
		else{
			System.out.println("Falha ao cadastrar !!!");
		}
	}

}
