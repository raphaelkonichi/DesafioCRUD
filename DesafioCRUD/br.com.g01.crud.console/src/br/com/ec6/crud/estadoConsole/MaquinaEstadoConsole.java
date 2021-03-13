package br.com.ec6.crud.estadoConsole;

public abstract class MaquinaEstadoConsole {

    public abstract boolean Executa();

    public int opcaoSelecionada;

    public int getOpcaoSelecionada() { return this.opcaoSelecionada; }
}