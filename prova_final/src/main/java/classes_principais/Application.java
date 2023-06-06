/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.classes_principais;

import main.java.frames.Menu;

/**
 *
 * @author kaua
 */
public class Application {
    public static void main(String[] args){
        ListaUsuarios usuarios = new ListaUsuarios();
        Usuario admin = new Usuario("admin", "admin");
        usuarios.addUsuario(admin);
        
        Sistema banco = new Sistema();
        new Menu(usuarios,banco).setVisible(true);
    }
}
