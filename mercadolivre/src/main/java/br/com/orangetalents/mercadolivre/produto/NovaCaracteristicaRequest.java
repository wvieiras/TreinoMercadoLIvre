package br.com.orangetalents.mercadolivre.produto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class NovaCaracteristicaRequest {
	
	@NotBlank
	@Column(unique = true)
	private String nome;
	
	@NotBlank
	private String descricao;

	public NovaCaracteristicaRequest(@NotBlank String nome, @NotBlank String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "NovaCaracteristicaRequest [nome=" + nome + ", descricao=" + descricao + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public CaracteristicaProduto toModel(Produto produto) {
		
		return new CaracteristicaProduto(nome, descricao, produto);
	}	
	
}
