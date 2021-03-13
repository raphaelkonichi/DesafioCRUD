package br.com.ec6.crud.estadoConsole;

import acesso.Acesso;
import acesso.UsuarioTextoDAO;
import br.com.utils.crud.vos.acesso.Usuario;

import java.util.Scanner;

public class EstadoConsoleLogin extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean sair = false;
        Usuario user = new Usuario();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** LOGIN ****");
        System.out.println("Digite seu usuário");
        user.setLogin(scan.nextLine());
        System.out.println("Digite sua senha");
        user.setSenha(scan.nextLine());
        // TODO - Validação de senha
        Acesso acesso = new Acesso();
        UsuarioTextoDAO getUsuario = new UsuarioTextoDAO();
        Usuario master = getUsuario.UsuarioTextoDAO();
        boolean senhaValida = acesso.validaUsuario(master, user);

        /*CRUD.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
        else {
            System.out.println("Dados inválidos!");
        }*/
        return sair;
    }
}