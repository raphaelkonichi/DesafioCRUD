package acesso;

import basis.DAO;
import br.com.utils.crud.vos.acesso.Usuario;
import br.com.utils.g01.crud.basis.Entidade;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class UsuarioTextoDAO extends DAO {

    public Usuario UsuarioTextoDAO()
    {
        Usuario masterUser = new Usuario();
        masterUser.setLogin("admin");
        masterUser.setSenha("admin");
        return masterUser;
    }



}
