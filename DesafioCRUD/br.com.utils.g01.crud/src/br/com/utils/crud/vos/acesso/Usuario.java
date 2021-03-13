package br.com.utils.crud.vos.acesso;

import br.com.utils.g01.crud.basis.Entidade;

public class Usuario extends Entidade {
    private String senha;
    private String login;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
