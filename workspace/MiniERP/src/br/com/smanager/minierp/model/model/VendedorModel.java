package br.com.smanager.minierp.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="vendedor")
public class VendedorModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//abaixo variáveis para tratamento dos vendedores
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_vendedor")
	Integer codigovendedor;
	
	@Column(name = "nome_vendedor", nullable = false, length = 60)
	String nomevendedor;
	
	@Column(name = "email_vendedor", nullable = true, length = 60)
	String emailvendedor; 
	
	@Column(name = "telefone", nullable = true, length = 14)
	String telefonevendedor;
	
	//abaixo estão os getters e setters para acessar as variáveis acima
	public Integer getCodigovendedor() {
		return codigovendedor;
	}
	public void setCodigovendedor(Integer codigovendedor) {
		this.codigovendedor = codigovendedor;
	}
	public String getNomevendedor() {
		return nomevendedor;
	}
	public void setNomevendedor(String nomevendedor) {
		this.nomevendedor = nomevendedor;
	}
	public String getEmailvendedor() {
		return emailvendedor;
	}
	public void setEmailvendedor(String emailvendedor) {
		this.emailvendedor = emailvendedor;
	}
	public String getTelefonevendedor() {
		return telefonevendedor;
	}
	public void setTelefonevendedor(String telefonevendedor) {
		this.telefonevendedor = telefonevendedor;
	}
	
	//chamada de método construtor
	public VendedorModel() {
	}
	
	
	
	public VendedorModel(Integer codigovendedor, String nomevendedor, String emailvendedor, String telefonevendedor) {
		this.codigovendedor = codigovendedor;
		this.nomevendedor = nomevendedor;
		this.emailvendedor = emailvendedor;
		this.telefonevendedor = telefonevendedor;
	}
	
	//abaixo os hash para auxiliar nas buscas/remoção
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigovendedor == null) ? 0 : codigovendedor.hashCode());
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
		VendedorModel other = (VendedorModel) obj;
		if (codigovendedor == null) {
			if (other.codigovendedor != null)
				return false;
		} else if (!codigovendedor.equals(other.codigovendedor))
			return false;
		return true;
	}	
}
