/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author Chiri
 */
public class Ordenador {
    int ram;
    int procesador;
    String color;

    public Ordenador() {
    }

    public Ordenador(int ram, int procesador, String color) {
        this.ram = ram;
        this.procesador = procesador;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getProcesador() {
        return procesador;
    }

    public void setProcesador(int procesador) {
        this.procesador = procesador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "ram=" + ram + ", procesador=" + procesador + ", color=" + color + '}';
    }
    
    
    
}
