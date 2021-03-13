package br.com.utils.crud.enums;

public enum Marca {

    ADIDAS("adidas"),
    AMARO("amaro"),
    NIKE("nike"),
    HERING("hering"),
    MOFFICER("mofficer"),
    FORUM("forum"),
    COLCCI("colcci"),
    CALVINKLEIN("calvinlklein"),
    MICHAELKORS("michaelkors");

    private String descricao;

    Marca(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
