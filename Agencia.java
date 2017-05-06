package br.com.sistema.Entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Agencia.findAll", query="SELECT a FROM Agencia a")
public class Agencia implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private int id;
	private String codigoSTO;
	private String diretoriaRegional;
	private String regiao;
	private int responsavel;
	private String tipoOrgao;

	
	
	public Agencia() {
		
	}



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=6)
	public int getId() {
		return id;
	}

	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Column(length=10)
	public String getCodigoSTO() {
		return codigoSTO;
	}

	public void setCodigoSTO(String codigoSTO) {
		this.codigoSTO = codigoSTO;
	}

	@Column(length=45)
	public String getDiretoriaRegional() {
		return diretoriaRegional;
	}

	public void setDiretoriaRegional(String diretoriaRegional) {
		this.diretoriaRegional = diretoriaRegional;
	}

	@Column(length=40)
	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	@Column(length=6)
	public int getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(int responsavel) {
		this.responsavel = responsavel;
	}

	@Column(length=6)
	public String getTipoOrgao() {
		return tipoOrgao;
	}

	public void setTipoOrgao(String tipoOrgao) {
		this.tipoOrgao = tipoOrgao;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		if (id != other.id)
			return false;
		return true;
	}



	
	
	
}
