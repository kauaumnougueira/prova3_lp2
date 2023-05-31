
package com.mycompany.entities;

import java.util.ArrayList;

public class Advogado {
    private String nome;
    private String codigo;
    private ArrayList<Processo> processos = new ArrayList<>();
    
    public Advogado(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    } 
    
    public Advogado(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Processo> getProcessos() {
        return processos;
    }

    public void addProcesso(Processo processo) {
        processos.add(processo);
    }
    
    public void removeProcesso(Processo processo){
        processos.remove(processo);
    }
    
}
