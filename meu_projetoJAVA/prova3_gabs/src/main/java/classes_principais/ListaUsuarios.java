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
    
    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
    
    public boolean existeUsuario(String nome){
        for (int i = 0; i< this.usuarios.size(); i++){
            if (this.usuarios.get(i).getNome().equals(nome)){
                return true;
                
            }
        }
        return false;
    }

}
