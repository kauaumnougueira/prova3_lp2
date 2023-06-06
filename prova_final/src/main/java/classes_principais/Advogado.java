
package main.java.classes_principais;

public class Advogado {
    private int id;
    private String nome;
    private String codigo;
    
    public Advogado(String nome, String codigo, int id){
        this.id = id;
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

    public int getId(){
        return this.id;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }   
}
