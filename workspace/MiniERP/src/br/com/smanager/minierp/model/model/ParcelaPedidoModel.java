package br.com.smanager.minierp.model.model;

import java.io.Serializable;
import java.util.Calendar;

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
@Table(name = "pedido_parcela")
public class ParcelaPedidoModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_parcela")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idparcela;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "numero_pedido", name = "id_pedido")
	PedidoModel pedidoModel;
	
	@Column(name = "data_emissao", nullable = false)
	Calendar dataemissao;
	
	@Column(name = "data_vencimento", nullable = false)
	Calendar data_vencimento;
	
	@Column(name = "numero_parcela", nullable = false)
	Integer numeroparcela;
	
	@Column(name = "valor_parcela", nullable = false)
	Float valorparcela;
	
	@Column(name = "valor_pedido", nullable = false)
	Float valorpedido;

	public Long getIdparcela() {
		return idparcela;
	}

	public void setIdparcela(Long idparcela) {
		this.idparcela = idparcela;
	}

	public PedidoModel getPedidoModel() {
		return pedidoModel;
	}

	public void setPedidoModel(PedidoModel pedidoModel) {
		this.pedidoModel = pedidoModel;
	}

	public Calendar getDataemissao() {
		return dataemissao;
	}

	public void setDataemissao(Calendar dataemissao) {
		this.dataemissao = dataemissao;
	}

	public Calendar getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(Calendar data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public Integer getNumeroparcela() {
		return numeroparcela;
	}

	public void setNumeroparcela(Integer numeroparcela) {
		this.numeroparcela = numeroparcela;
	}

	public Float getValorparcela() {
		return valorparcela;
	}

	public void setValorparcela(Float valorparcela) {
		this.valorparcela = valorparcela;
	}

	public Float getValorpedido() {
		return valorpedido;
	}

	public void setValorpedido(Float valorpedido) {
		this.valorpedido = valorpedido;
	}

	public ParcelaPedidoModel(){}
	public ParcelaPedidoModel(Long idparcela, PedidoModel pedidoModel, Calendar dataemissao, Calendar data_vencimento,
			Integer numeroparcela, Float valorparcela, Float valorpedido) {
		this.idparcela = idparcela;
		this.pedidoModel = pedidoModel;
		this.dataemissao = dataemissao;
		this.data_vencimento = data_vencimento;
		this.numeroparcela = numeroparcela;
		this.valorparcela = valorparcela;
		this.valorpedido = valorpedido;
	}
	
	
}
