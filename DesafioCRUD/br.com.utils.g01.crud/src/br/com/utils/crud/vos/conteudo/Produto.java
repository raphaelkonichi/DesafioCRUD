package br.com.utils.crud.vos.conteudo;

import br.com.utils.crud.enums.Cor;
import br.com.utils.crud.enums.Marca;
import br.com.utils.crud.enums.Tamanho;
import br.com.utils.crud.enums.Tipo;
import br.com.utils.g01.crud.basis.Entidade;

import java.util.Date;

public class Produto extends Entidade {

    private String dataEntrada;
    private String localCompra;
    private String caracteristicas;
    private double valorEtiqueta;
    private double valorPago;
    private double valorMargem100;
    private double precoSugerido;
    private Cor cor;
    private Marca marca;
    private Tamanho tamanho;
    private Tipo tipo;

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getLocalCompra() {
        return localCompra;
    }

    public void setLocalCompra(String localCompra) {
        this.localCompra = localCompra;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getValorEtiqueta() {
        return valorEtiqueta;
    }

    public void setValorEtiqueta(double valorEtiqueta) {
        this.valorEtiqueta = valorEtiqueta;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorMargem100() {
        return valorMargem100;
    }

    public void setValorMargem100(double valorMargem100) {
        this.valorMargem100 = valorMargem100;
    }

    public double getPrecoSugerido() {
        return precoSugerido;
    }

    public void setPrecoSugerido(double precoSugerido) {
        this.precoSugerido = precoSugerido;
    }

    public Cor getCor() { return cor; }

    public void setCor(Cor cor) { this.cor = cor; }

    public Marca getMarca() { return marca; }

    public void setMarca(Marca marca) { this.marca = marca; }

    public Tamanho getTamanho() { return tamanho; }

    public void setTamanho(Tamanho tamanho) { this.tamanho = tamanho; }

    public Tipo getTipo() { return tipo; }

    public void setTipo(Tipo tipo) { this.tipo = tipo; }
}
