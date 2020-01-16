/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author kroctus
 */
public class Main {

    public static void main(String[] args) {

        Ordenador ord1 = new Ordenador(2,2,"azul");
        Ordenador ord2 = new Ordenador();
        
        ord1.toString();
        ord2.toString();
        
        System.out.println(ord1.getColor()+" " + ord1.getProcesador()+ " " + ord1.ram );
               
    }

}
