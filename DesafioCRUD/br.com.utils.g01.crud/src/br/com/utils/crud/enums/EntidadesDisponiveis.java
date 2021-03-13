package br.com.utils.crud.enums;

import br.com.utils.crud.vos.acesso.Usuario;

public enum EntidadesDisponiveis {

    USUARIO("usuario"),
    PRODUTO("produto");

    private String descricao;

    EntidadesDisponiveis(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
