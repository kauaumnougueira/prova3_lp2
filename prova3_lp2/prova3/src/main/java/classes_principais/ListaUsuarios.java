/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_principais;

import java.util.ArrayList;

/**
 *
 * @author dpf
 */
public class ListaUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int qntUsuarios = 0;
    
    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        qntUsuarios++;
    }

    public void removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
        qntUsuarios--;
    }
    
    public boolean existeUsuario(String nome){
        for (int i = 0; i< this.usuarios.size(); i++){
            if (this.usuarios.get(i).getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    
    public Usuario getUsuario(String nome){
        if(existeUsuario(nome)){
            for (int i = 0; i< this.usuarios.size(); i++){
                if (this.usuarios.get(i).getNome().equals(nome)){
                    return this.usuarios.get(i);
                }
            }
        }
        return null;
    }

    public boolean validacao(Usuario usuario, String senha){
        return usuario.getSenha().equals(senha);
    }
    
}
