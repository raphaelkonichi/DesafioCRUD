package br.com.utils.crud.enums;

public enum Cor {

    AMARELO("amarelo"),
    AZUL("azul"),
    BEGE("bege"),
    BRANCO("branco"),
    CIANO("ciano"),
    CINZA("cinza"),
    DOURADO("dourado"),
    FUCSIA("fucsia"),
    LARANJA("laranja"),
    LILAS("lilás"),
    MAGENTA("magenta"),
    MARROM("marrom"),
    PRATA("prata"),
    PRETO("preto"),
    ROSA("rosa"),
    ROXO("roxo"),
    SALMAO("salmao"),
    TURQUESA("turquesa"),
    VERDE("verde"),
    VERMELHO("vermelho"),
    VINHO("vinho");


    private String descricao;

    Cor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
