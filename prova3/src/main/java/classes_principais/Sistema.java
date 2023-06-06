/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_principais;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kaua
 */
public class Sistema {
    //para recuperar do banco
    private ArrayList<Processo> processos = new ArrayList<>();
    String pathpro = "processos.txt";
    private ArrayList<Advogado> advogados = new ArrayList<>();
    String pathadv = "advogados.txt";
    
    public Sistema(){
    }
    
    public Processo getProcessoLista(int get){
        return this.processos.get(get);
    }
    public ArrayList<Processo> getProcessos(){
        return this.processos;
    }
    public void addProcesso(Processo processo){
        this.processos.add(processo);
    }
    
    public Advogado getAdvogadoLista(int get){
        return this.advogados.get(get);
    }
    public ArrayList<Advogado> getAdvogados(){
        return this.advogados;
    }
    public void addAdvogado(Advogado advogado){
        this.advogados.add(advogado);
    }

    //funções de arquivo
    public void writingFileAdvogados(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathadv, true))) {
            for(int i = 0; i < this.advogados.size(); i++){
                Advogado escrever = getAdvogadoLista(i);
                bw.write("I##########");
                bw.write(escrever.getId());
                bw.write(escrever.getNome());
                bw.write(escrever.getCodigo());
                bw.write("F##########");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void writingFileProcessos(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathpro, true))) {
            for(int i = 0; i < this.processos.size(); i++){
                Processo escrever = getProcessoLista(i);
                bw.write("I##########");
                bw.write(escrever.getId());
                bw.write(escrever.getTipo());
                bw.write(Double.toString(escrever.getValor()));
                bw.write(escrever.getData());
                bw.write(escrever.getObjetivo());
                bw.write(escrever.getDescricao());
                bw.write("Advogados participantes:");
                ArrayList<Advogado> advogadosEscrever = escrever.getAdvogados();
                for(int j = 0; j < advogadosEscrever.size(); j++){
                    Advogado advogadoEscrever = getAdvogadoLista(j);
                    bw.write(advogadoEscrever.getNome());
                    bw.write(advogadoEscrever.getCodigo());
                }
                bw.write("F##########");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //doidera
    public void readingFileProcessos(){
        try (BufferedReader br = new BufferedReader(new FileReader(pathpro))) {
            String line = br.readLine();
            
            while(line != null){
                line = br.readLine();
                if(line != null){
                    if(line.equals("I##########")){
                        String tipo = br.readLine();
                        String id = br.readLine(); //mudar pra id
                        String valor = br.readLine();
                        String data = br.readLine(); //mudar para double
                        String objetivo = br.readLine();
                        String descricao = br.readLine();
                       
                        int idI = Integer.parseInt(id);
                        double valorD = Double.parseDouble(valor);
                        
                        Processo ler = new Processo(tipo, idI, valorD, data, objetivo, descricao);
                        br.readLine(); //nada util
                        while(true){
                            String idA;
                            String nome;
                            String codigo;
                            line = br.readLine();
                            if(line.equals("F##########")){
                                break;
                            }else{
                               idA = line; 
                            }
                            line = br.readLine();
                            if(line.equals("F##########")){
                                break;
                            }else{
                               nome = line; 
                            }
                            line = br.readLine();
                            if(line.equals("F##########")){
                                break;
                            }else{
                                codigo = line;
                            }
                            int idIA = Integer.parseInt(idA);
                            Advogado advogadoLido = new Advogado(nome, codigo, idIA);
                            ler.addAdvogado(advogadoLido);
                        }
                        
                        addProcesso(ler);
                        line = br.readLine();
                        
                    }
                }
               
            }
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void readingFileAdvogados(){
        try (BufferedReader br = new BufferedReader(new FileReader(pathadv))) {
            String line = br.readLine();
            
            while(line != null){
                line = br.readLine();
                if(line != null){
                   if(line.equals("I##########")){
                       String id = br.readLine();
                       int idI = Integer.parseInt(id);
                       String nome = br.readLine();
                       String codigo = br.readLine();
                       
                       Advogado lido = new Advogado(nome, codigo, idI);
                       addAdvogado(lido);
                   }
                }
            }
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
