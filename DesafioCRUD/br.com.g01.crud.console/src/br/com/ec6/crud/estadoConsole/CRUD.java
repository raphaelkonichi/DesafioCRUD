package br.com.ec6.crud.estadoConsole;

public class CRUD {

    public static MaquinaEstadoConsole estadoConsole;

    public static void main(String[] args) {

        estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();;
        Boolean saida = false;
        while (!saida) {
            saida = estadoConsole.Executa();
        }
    }
}
