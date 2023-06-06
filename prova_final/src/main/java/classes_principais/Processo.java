package main.java.classes_principais;

import java.util.ArrayList;

public class Processo {
    private String tipo;
    private int id; // simplesmente id++
    private double valor;
    private String data;
    private String objetivo;
    private String descricao;
    Advogado advogado;
    int qntAdv = 0;

    public Processo(){}
    
    public Processo(String tipo, int id, double valor, String data, String objetivo, String descricao, Advogado advogado) {
        this.tipo = tipo;
        this.id = id; //recebe a quantidade de processos + 1
        this.valor = valor;
        this.data = data;
        this.objetivo = objetivo;
        this.descricao = descricao;
        this.advogado = advogado;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public Advogado getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }
    
    public int getId(){
        return this.id;
    }
    
}
