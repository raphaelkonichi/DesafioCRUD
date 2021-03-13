package acesso;

import br.com.utils.crud.enums.EntidadesDisponiveis;
import br.com.utils.crud.vos.acesso.Usuario;

public class Acesso {
    private boolean validaSenha(String senhaRepositorio, String senhaDigitada) {
        return (senhaRepositorio.equals(senhaDigitada));
    }

    public boolean validaUsuario(Usuario userRepositorio, Usuario userDigitado) {
        boolean retorno = false;

        if(userDigitado.getLogin() != userRepositorio.getLogin()){
            return retorno;
        }

        retorno = validaSenha(userRepositorio.getSenha(), userDigitado.getSenha());

        return retorno;
    }

}
