package model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ValueGenerationType;

@Entity
public class Produto {
	@Id
	private int id;
	private String marca;
	private String modelo;
	private String cor;
	private String categoria;
	private String descricao;
	private double vCompra;
	private double vVenda;
	private int estoque;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getvCompra() {
		return vCompra;
	}

	public void setvCompra(double vCompra) {
		this.vCompra = vCompra;
	}

	public double getvVenda() {
		return vVenda;
	}

	public void setvVenda(double vVenda) {
		this.vVenda = vVenda;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
