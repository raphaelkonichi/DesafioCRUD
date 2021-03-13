package validacoes;

import basis.DAO;
import br.com.utils.crud.vos.conteudo.Produto;

import java.util.List;

public class ValidacaoCRUD {

    public void validaInsercao(Produto prod) throws Exception {

        DAO dao = new DAO();
        List<Produto> items = dao.list();

        if (items != null && items.size() > 0) {
            for (Produto item : items) {
                if (item.getId() == prod.getId()) {
                    throw new Exception("Favor informar outro código.");
                }
            }
        }

        prod.setLocalCompra(prod.getLocalCompra().trim());
        if (prod.getLocalCompra() == null || prod.getLocalCompra().length() == 0) {
            throw new Exception("Local de compra não foi informado.");
        }

        prod.setMarca(prod.getMarca());
        if (prod.getMarca() == null) {
            throw new Exception("A marca não foi informada.");
        }

        prod.setCaracteristicas(prod.getCaracteristicas().trim());
        if (prod.getCaracteristicas() == null || prod.getCaracteristicas().length() == 0) {
            throw new Exception("Características não informadas.");
        }

        if (prod.getValorPago() <= 0) {
            throw new Exception("O valor pago deve ser maior que zero.");
        }

        if (prod.getPrecoSugerido() <= 0) {
            throw new Exception("O preço sugerido deve ser maior que zero.");
        }

        if (prod.getValorEtiqueta() <= 0) {
            throw new Exception("O valor da etiqueta deve ser maior que zero.");
        }

        prod.setTipo(prod.getTipo());
        if (prod.getTipo() == null) {
            throw new Exception("O tipo do produto não é válido.");
        }

        dao.insert(prod);
    }
}
