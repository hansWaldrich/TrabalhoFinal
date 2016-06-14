package model;

public class Cotacao {

	private Fornecedor fornecedor;
	private String valorUnit;
	private String qtdProduto;
	private String valorTotal;
	private String prazo;	
	
	public Cotacao(Fornecedor fornecedor, String valorUnit, String qtdProduto,
			String valorTotal, String prazo) {
		this.fornecedor = fornecedor;
		this.valorUnit = valorUnit;
		this.qtdProduto = qtdProduto;
		this.valorTotal = valorTotal;
		this.prazo = prazo;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(String valorUnit) {
		this.valorUnit = valorUnit;
	}
	public String getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(String qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getPrazo() {
		return prazo;
	}
	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}
	
	@Override
	public String toString() {
		String cotacao = "";
		cotacao+= "Fornecedor: " + fornecedor.getNome();
		cotacao+= " - ";
		cotacao+= "Valor Unitário: " + valorUnit;
		cotacao+= " - ";
		cotacao+= "Quant.: " + qtdProduto;
		cotacao+= " - ";
		cotacao+= "Valor Total: " + valorTotal;
		return cotacao;
	}
	
}
