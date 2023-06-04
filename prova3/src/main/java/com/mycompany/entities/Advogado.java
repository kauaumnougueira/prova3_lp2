
package com.mycompany.entities;

public class Advogado {
    private String nome;
    private String codigo;
    
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
    
}
