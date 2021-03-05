package br.com.impacta.models;

public class Carro {
	private String cor;
	private Integer ano;
	private Double valor;

	public Carro(){}
	
	public Carro(String cor, Integer ano, Double valor) {
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
	}
	
	public String getCor(){
		return this.cor;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public Integer getAno(){
		return this.ano;
	}

	public void setAno(Integer ano){
		this.ano = ano;
	}

	public Double getValor(){
		return this.valor;
	}

	public void setValor(Double valor){
		this.valor = valor;
	}

}