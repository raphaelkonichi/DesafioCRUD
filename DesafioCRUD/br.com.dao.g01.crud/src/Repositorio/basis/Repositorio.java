package Repositorio.basis;

import br.com.utils.crud.enums.EntidadesDisponiveis;
import br.com.utils.g01.crud.basis.Entidade;

public abstract class Repositorio {

    public abstract Entidade localiza(String codigo, EntidadesDisponiveis tipoEntidade);
}
