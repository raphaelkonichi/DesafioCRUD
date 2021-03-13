package br.com.ec6.crud.estadoConsole;

public enum EnumEstadoConsole {

    INSERIR(new EstadoConsoleInserir()),

    LOGIN(new EstadoConsoleLogin()),

    MENU_PRINCIPAL (new EstadoConsoleMenu()),

    LISTAR (new EstadoConsoleListar()),

    EXCLUIR (new EstadoConsoleExcluir());

    private final MaquinaEstadoConsole estadoMaquina;

    EnumEstadoConsole(MaquinaEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public MaquinaEstadoConsole getEstadoMaquina() {
        return estadoMaquina;
    }
}
