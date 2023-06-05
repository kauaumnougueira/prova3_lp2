
package classes_principais;

import java.util.ArrayList;

public class Advogado {
    private String nome;
    private String codigo;
    ArrayList <Processo> processos = new ArrayList<>();
    private int qnt_processos;
    
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
    
    public void addProcesso(Processo processo){
        this.processos.add(processo);
        this.qnt_processos++;
        
    }
    
    public void removeProcesso(Processo processo){
        this.processos.remove(processo);
        this.qnt_processos--;
    }
    
    public int qnt_processos(){
        return this.qnt_processos;
    }
    
}
