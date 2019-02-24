package br.com.senaigo.mobile.simpleadapter.entidades;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {

    protected Long id;
    protected String cliente;
    protected String data;
    protected BigDecimal valor;
    protected List<Produto> produtos;

    public Pedido(Long id, String cliente, String data, BigDecimal valor, List<Produto> produtos) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.valor = valor;
        this.produtos = produtos;
    }

    public Pedido(Long id, String cliente, String data, BigDecimal valor) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", produtos=" + produtos +
                '}';
    }
}
