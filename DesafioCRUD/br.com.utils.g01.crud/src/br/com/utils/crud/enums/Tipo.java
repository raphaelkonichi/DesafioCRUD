package br.com.utils.crud.enums;

public enum Tipo {

    VESTIDO("vestido"),
    SAIA("saia"),
    CONJUNTO("conjunto"),
    CALCA("calca"),
    CAMISETA("camiseta"),
    CAMISA("camisa"),
    PIJAMA("pijama"),
    SHORTS("shorts"),
    BLUSA("blusa"),
    INTIMAS("intimas"),
    CASACO("casaco");

    private String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
