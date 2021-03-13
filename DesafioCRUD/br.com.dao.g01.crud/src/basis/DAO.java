package basis;

import br.com.utils.crud.enums.Cor;
import br.com.utils.crud.enums.Marca;
import br.com.utils.crud.enums.Tamanho;
import br.com.utils.crud.enums.Tipo;
import br.com.utils.crud.vos.conteudo.Produto;

import java.io.*;
import java.util.*;

public class DAO {

    private final String caminho;

    public DAO() { this.caminho = "produtos.txt";}

    private void rewriteFile(List<Produto> items, boolean append) throws IOException {
        FileWriter writer = new FileWriter(this.caminho, append);

        for (Produto item : items) {
            String line
                    = item.getId() + "|"
                    + item.getDataEntrada().toString() + "|"
                    + item.getLocalCompra() + "|"
                    + item.getCaracteristicas() + "|"
                    + item.getValorEtiqueta() + "|"
                    + item.getValorPago() + "|"
                    + item.getValorMargem100() + "|"
                    + item.getPrecoSugerido() + "|"
                    + item.getCor() + "|"
                    + item.getMarca() + "|"
                    + item.getTamanho() + "|"
                    + item.getTipo() + "|"
                    + "\r\n";

            writer.write(line);
        }
        writer.close();
    }

    public void insert(Produto model) throws FileNotFoundException, InstantiationException, IllegalAccessException, IOException {
        List<Produto> items = this.list();
        if (items == null){
            items = new List<Produto>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<Produto> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(Produto produto) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends Produto> c) {
                    return false;
                }

                @Override
                public boolean addAll(int index, Collection<? extends Produto> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }

                @Override
                public Produto get(int index) {
                    return null;
                }

                @Override
                public Produto set(int index, Produto element) {
                    return null;
                }

                @Override
                public void add(int index, Produto element) {

                }

                @Override
                public Produto remove(int index) {
                    return null;
                }

                @Override
                public int indexOf(Object o) {
                    return 0;
                }

                @Override
                public int lastIndexOf(Object o) {
                    return 0;
                }

                @Override
                public ListIterator<Produto> listIterator() {
                    return null;
                }

                @Override
                public ListIterator<Produto> listIterator(int index) {
                    return null;
                }

                @Override
                public List<Produto> subList(int fromIndex, int toIndex) {
                    return null;
                }
            };
        }
        items.add(model);

        rewriteFile(items, false);
    }

    public void update(Produto prod) throws FileNotFoundException, InstantiationException, IllegalAccessException, IOException {
        List<Produto> items = list();

        if (items != null && items.size() > 0) {
            for (Produto item : items) {
                if (item.getId() == prod.getId()) {
                    item.setMarca(prod.getMarca());
                    item.setLocalCompra(prod.getLocalCompra());
                    item.setDataEntrada(prod.getDataEntrada());
                    item.setCaracteristicas(prod.getCaracteristicas());
                    item.setValorEtiqueta(prod.getValorEtiqueta());
                    item.setValorPago(prod.getValorPago());
                    item.setValorMargem100(prod.getValorMargem100());
                    item.setPrecoSugerido(prod.getPrecoSugerido());
                    item.setCor(prod.getCor());
                    item.setMarca(prod.getMarca());
                    item.setTamanho(prod.getTamanho());
                    item.setTipo(prod.getTipo());

                    break;
                }
            }

            rewriteFile(items, false);
        }
    }

    public void delete(int id) throws FileNotFoundException, InstantiationException, IllegalAccessException, IOException {
        List<Produto> itens = this.list();

        if (itens != null && itens.size() > 0) {
            for (Produto item : itens) {
                if (item.getId() == id) {
                    itens.remove(item);
                    break;
                }
            }

            rewriteFile(itens, false);
        }
    }

    public List<Produto> list() throws FileNotFoundException, InstantiationException, IllegalAccessException {
        File myObj = new File(this.caminho);

        if (!myObj.exists()) {
            return null;
        }

        ArrayList<Produto> items;

        try (Scanner reader = new Scanner(myObj)) {
            items = new ArrayList<Produto>();

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                Produto model = new Produto();
                String[] parts = data.split("[|]");

                model.setId(Integer.parseInt(parts[0]));

                model.setDataEntrada(parts[1]);
                model.setLocalCompra(parts[2]);
                model.setCaracteristicas(parts[3]);
                model.setValorEtiqueta(Double.parseDouble(parts[4]));
                model.setValorPago(Double.parseDouble(parts[5]));
                model.setValorMargem100(Double.parseDouble(parts[6]));
                model.setPrecoSugerido(Double.parseDouble(parts[7]));
                model.setCor((Cor.valueOf(parts[8])));
                model.setMarca((Marca.valueOf(parts[9])));
                model.setTamanho((Tamanho.valueOf(parts[10])));
                model.setTipo((Tipo.valueOf(parts[11])));

                items.add(model);
            }
        }

        return items;
    }
}
