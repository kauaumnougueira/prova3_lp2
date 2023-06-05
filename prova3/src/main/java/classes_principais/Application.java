/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes_principais;

import frames.Menu;

/**
 *
 * @author kaua
 */
public class Application {
    public static void main(String[] args){
        ListaUsuarios usuarios = new ListaUsuarios();
        
        new Menu(usuarios).setVisible(true);
    }
}
