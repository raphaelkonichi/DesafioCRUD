package br.com.ec6.crud.estadoConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EstadoConsoleMenu extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean sair = false;

        System.out.println("\nMenu de opções:\r\n");
        System.out.println("1 - Listar roupas");
        System.out.println("2 - Cadastrar roupa");
        System.out.println("3 - Excluir roupa");
        System.out.println("4 - Sair");

        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 1:
                CRUD.estadoConsole = EnumEstadoConsole.LISTAR.getEstadoMaquina();
                break;
            case 2:
                CRUD.estadoConsole = EnumEstadoConsole.INSERIR.getEstadoMaquina();
                break;
            case 3:
                CRUD.estadoConsole = EnumEstadoConsole.EXCLUIR.getEstadoMaquina();
                break;
            case 4:
                sair = true;
                break;
        }

        return sair;
    }

}