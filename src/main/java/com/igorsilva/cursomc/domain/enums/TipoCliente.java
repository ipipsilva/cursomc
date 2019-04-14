package com.igorsilva.cursomc.domain.enums;

public enum TipoCliente {

	PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica");

	private Integer codigo;
	private String descricao;

	private TipoCliente(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String descricao() {
		return descricao;
	}

	public static TipoCliente obterPorCodigo(Integer codigo) {

		if (null != codigo) {
			for (TipoCliente tipoCliente : TipoCliente.values()) {
				if (codigo.intValue() == tipoCliente.getCodigo().intValue()) {
					return tipoCliente;
				}
			}
		}

		return null;
	}
}