package br.com.ec6.crud.estadoConsole;

import basis.DAO;
import br.com.utils.crud.vos.conteudo.Produto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstadoConsoleExcluir extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {

        boolean sair = false;
        DAO dao = new DAO();
        Produto produto = new Produto();
        System.out.println("Informe o código do produto a ser exluído: ");
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        try {
            int code = Integer.parseInt(reader.readLine());
            dao.delete(code);
            System.out.println("Produto com o código "+ code + " excluído com sucesso.");

            CRUD.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
            CRUD.estadoConsole.Executa();

        } catch (Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }

        return sair;
    }
}
