package br.com.utils.crud.enums;

public enum Tamanho {

    PP("PP"),
    P("P"),
    M("M"),
    G("G"),
    GG("GG"),
    GGG("GGG"),
    XG("XG"),
    XXG("XXG");

    private String descricao;

    Tamanho(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
