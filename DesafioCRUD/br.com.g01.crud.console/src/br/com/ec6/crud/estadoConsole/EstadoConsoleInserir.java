package br.com.ec6.crud.estadoConsole;

import basis.DAO;
import br.com.utils.crud.enums.Cor;
import br.com.utils.crud.enums.Marca;
import br.com.utils.crud.enums.Tamanho;
import br.com.utils.crud.enums.Tipo;
import br.com.utils.crud.vos.conteudo.Produto;
import validacoes.ValidacaoCRUD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EstadoConsoleInserir extends MaquinaEstadoConsole{

    @Override
    public boolean Executa() {

        boolean sair = false;
        DAO dao = new DAO();
        Produto produto = new Produto();

        try {
            System.out.println("Indique o código do produto.");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setId(Integer.parseInt(reader.readLine()));

            System.out.println("Informe a data de entrada (dd/mm/yyyy): ");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setDataEntrada(reader.readLine());

            System.out.println("Indique o local de compra do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setLocalCompra(reader.readLine());

            System.out.println("Indique as características do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setCaracteristicas(reader.readLine());

            System.out.println("Indique o valor da etiqueta do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setValorEtiqueta(Double.parseDouble(reader.readLine()));

            System.out.println("Indique o valor pago do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setValorPago(Double.parseDouble(reader.readLine()));
            produto.setValorMargem100(produto.getValorPago()*2);

            System.out.println("Indique o preço sugerido do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setPrecoSugerido(Double.parseDouble(reader.readLine()));

            System.out.println("Indique a cor do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setCor(Cor.valueOf(reader.readLine().toUpperCase()));

            System.out.println("Indique a marca do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setMarca(Marca.valueOf(reader.readLine().toUpperCase()));

            System.out.println("Indique o Tamanho do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setTamanho(Tamanho.valueOf(reader.readLine().toUpperCase()));

            System.out.println("Indique o Tipo do produto.");
            reader = new BufferedReader(
                    new InputStreamReader(System.in));

            produto.setTipo(Tipo.valueOf(reader.readLine().toUpperCase()));

            ValidacaoCRUD validacao = new ValidacaoCRUD();
            validacao.validaInsercao(produto);

            System.out.println("Produto inserido com sucesso.");

            CRUD.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
            CRUD.estadoConsole.Executa();

        } catch(Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }
        return false;
    }

}