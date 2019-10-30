package br.com.smanager.minierp.model.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="produto")
public class ProdutoModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	@Id //indica a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //gerar código automático
	@Column(name="codigo_produto")
	Long codigoproduto;
	
	@Column(name="descricao_produto", length = 50, nullable = false)
	String descricaoproduto;
	
	@Column(name = "preco_produto", nullable = true)
	Float precoproduto;
	
	@Column(name = "codigofabricante_produto", length = 60, nullable = true)
	String codigofabricanteproduto;
	
	@Column(name = "codigofornecedor_produto", length = 60, nullable = true)
	String codigofornecedorproduto;
	
	@Column(name = "ean_produto", nullable = true, length = 14)
	String eanproduto;
	
	@Column(name = "ncm_produto", nullable = true, length = 8)
	String ncmproduto;
	
	@Column(name = "unidade_produto", nullable = true, length = 6)
	String unidadeproduto;
	
	@OneToMany(mappedBy = "produtoModel", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<PedidoProdutoModel> pedido;
	
	public ProdutoModel() {}
	
	public ProdutoModel(Long codigoproduto, String descricaoproduto, Float precoproduto,
			String codigofabricanteproduto, String codigofornecedorproduto, String eanproduto, String ncmproduto, String unidadeproduto) {
		this.codigoproduto = codigoproduto;
		this.descricaoproduto = descricaoproduto;
		this.precoproduto = precoproduto;
		this.codigofabricanteproduto = codigofabricanteproduto;
		this.codigofornecedorproduto = codigofornecedorproduto;
		this.eanproduto = eanproduto;
		this.ncmproduto = ncmproduto;
		this.unidadeproduto = unidadeproduto;
	}

	//aplicação de indexação para buscas/remoção
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoproduto == null) ? 0 : codigoproduto.hashCode());
		return result;
	}

	//getter e setter para acesso as variáveis
	public Long getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(Long codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public String getUnidadeproduto() {
		return unidadeproduto;
	}

	public void setUnidadeproduto(String unidadeproduto) {
		this.unidadeproduto = unidadeproduto;
	}



	public String getDescricaoproduto() {
		return descricaoproduto;
	}




	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}




	public Float getPrecoproduto() {
		return precoproduto;
	}




	public void setPrecoproduto(Float precoproduto) {
		this.precoproduto = precoproduto;
	}




	public String getCodigofabricanteproduto() {
		return codigofabricanteproduto;
	}




	public void setCodigofabricanteproduto(String codigofabricanteproduto) {
		this.codigofabricanteproduto = codigofabricanteproduto;
	}




	public String getCodigofornecedorproduto() {
		return codigofornecedorproduto;
	}




	public void setCodigofornecedorproduto(String codigofornecedorproduto) {
		this.codigofornecedorproduto = codigofornecedorproduto;
	}




	public String getEanproduto() {
		return eanproduto;
	}




	public void setEanproduto(String eanproduto) {
		this.eanproduto = eanproduto;
	}




	public String getNcmproduto() {
		return ncmproduto;
	}




	public void setNcmproduto(String ncmproduto) {
		this.ncmproduto = ncmproduto;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoModel other = (ProdutoModel) obj;
		if (codigoproduto == null) {
			if (other.codigoproduto != null)
				return false;
		} else if (!codigoproduto.equals(other.codigoproduto))
			return false;
		return true;
	}
}
