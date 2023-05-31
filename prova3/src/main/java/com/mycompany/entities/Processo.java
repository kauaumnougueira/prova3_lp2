package com.mycompany.entities;

public class Processo {
    private String tipo;
    private String codigo;
    private double valor;
    private String data;
    private String objetivo;
    private String descricao;

    public Processo(){}
    
    public Processo(String tipo, String codigo, double valor, String data, String objetivo, String descricao) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
        this.objetivo = objetivo;
        this.descricao = descricao;
    }

    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
