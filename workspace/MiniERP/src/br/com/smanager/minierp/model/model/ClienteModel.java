package br.com.smanager.minierp.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "cliente")
public class ClienteModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//abaixo variáveis para tratamento do cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_cliente")
	Integer codigocliente;
	
	@Column(name = "razao_cliente", nullable = false, length = 60)
	String razaocliente;
	
	@Column(name = "fantasia_cliente", nullable = true, length = 60)
	String fantasiacliente;
	
	@Column(name = "cpfcnpj_cliente", nullable = true, length = 14)
	String cnpjcliente;
	
	@Column(name = "logradouro_cliente", nullable = true, length = 60)
	String enderecocliente;
	
	@Column(name = "numero_logr_cliente", nullable = true, length = 60)
	String numeroenderecocliente;
	
	@Column(name = "bairro_cliente", nullable = true, length = 60)
	String bairrocliente;
	
	@Column(name = "cep_cliente", nullable = true, length = 8)
	String cepcliente;
	
	@Column(name = "complemento_logr_cliente", nullable = true, length = 60)
	String complementoenderecocliente;
	
	@Column(name = "cidade_cliente", nullable = true, length = 60)
	String cidadecliente;
	
	@Column(name = "uf_cliente", nullable = true, length = 2)
	String ufcliente;
	
	@Column(name = "telefone1", nullable = true, length = 14)
    String telefone1;
    
	@Column(name = "telefone2", nullable = true, length = 14)
	String telefone2;
	
	@Column(name = "email_cliente", nullable = true, length = 60)
    String emailcliente;
	
    //abaixo trata-se de um campo estrangeiro
	@ManyToOne
	@JoinColumn(name = "vendedor", nullable = true, referencedColumnName = "codigo_vendedor")
    VendedorModel vendedorModel;
    
    //abaixo os getters e setters para manipulação/acesso aos dados
	public Integer getCodigocliente() {
		return codigocliente;
	}
	public void setCodigocliente(Integer codigocliente) {
		this.codigocliente = codigocliente;
	}
	public String getRazaocliente() {
		return razaocliente;
	}
	public void setRazaocliente(String razaocliente) {
		this.razaocliente = razaocliente;
	}
	public String getFantasiacliente() {
		return fantasiacliente;
	}
	public void setFantasiacliente(String fantasiacliente) {
		this.fantasiacliente = fantasiacliente;
	}
	public String getCnpjcliente() {
		return cnpjcliente;
	}
	public void setCnpjcliente(String cnpjcliente) {
		this.cnpjcliente = cnpjcliente;
	}
	public String getEnderecocliente() {
		return enderecocliente;
	}
	public void setEnderecocliente(String enderecocliente) {
		this.enderecocliente = enderecocliente;
	}
	public String getNumeroenderecocliente() {
		return numeroenderecocliente;
	}
	public void setNumeroenderecocliente(String numeroenderecocliente) {
		this.numeroenderecocliente = numeroenderecocliente;
	}
	public String getBairrocliente() {
		return bairrocliente;
	}
	public void setBairrocliente(String bairrocliente) {
		this.bairrocliente = bairrocliente;
	}
	public String getCepcliente() {
		return cepcliente;
	}
	public void setCepcliente(String cepcliente) {
		this.cepcliente = cepcliente;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getEmailcliente() {
		return emailcliente;
	}
	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}
		
	public String getComplementoenderecocliente() {
		return complementoenderecocliente;
	}
	public void setComplementoenderecocliente(String complementoenderecocliente) {
		this.complementoenderecocliente = complementoenderecocliente;
	}
	public String getCidadecliente() {
		return cidadecliente;
	}
	public void setCidadecliente(String cidadecliente) {
		this.cidadecliente = cidadecliente;
	}
	public String getUfcliente() {
		return ufcliente;
	}
	public void setUfcliente(String ufcliente) {
		this.ufcliente = ufcliente;
	}
	public void setVendedoresModel(VendedorModel vendedorModel) {
		this.vendedorModel = vendedorModel;
	}
	public VendedorModel getVendedoresModel() {
		return vendedorModel;
	}
	public void setVendedorModel(VendedorModel vendedorModel) {
		this.vendedorModel = vendedorModel;
	}
	

	public ClienteModel() {}
	
	public ClienteModel(Integer codigocliente, String razaocliente, String fantasiacliente, String cnpjcliente,
			String enderecocliente, String numeroenderecocliente, String bairrocliente, String cepcliente,
			String complementoenderecocliente, String cidadecliente, String ufcliente, String telefone1,
			String telefone2, String emailcliente, VendedorModel vendedorModel) {
		this.codigocliente = codigocliente;
		this.razaocliente = razaocliente;
		this.fantasiacliente = fantasiacliente;
		this.cnpjcliente = cnpjcliente;
		this.enderecocliente = enderecocliente;
		this.numeroenderecocliente = numeroenderecocliente;
		this.bairrocliente = bairrocliente;
		this.cepcliente = cepcliente;
		this.complementoenderecocliente = complementoenderecocliente;
		this.cidadecliente = cidadecliente;
		this.ufcliente = ufcliente;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.emailcliente = emailcliente;
		this.vendedorModel = vendedorModel;
	}
	//abaixo o Hash para identificação única de cliente
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigocliente == null) ? 0 : codigocliente.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return true;
		if (getClass() != obj.getClass())
			return true;
		ClienteModel other = (ClienteModel) obj;
		if (codigocliente == null) {
			if (other.codigocliente != null)
				return true;
		} else if (!codigocliente.equals(other.codigocliente))
			return true;
		return true;
	}
	
	
    
    
}
