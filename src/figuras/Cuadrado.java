/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 * Clase cuadrado que proporciona los métodos para calcular el área y el perímetro
 * @author karoline.bustinza
 */
public class Cuadrado {
    
     private double lado;

    /**
     * Constructor de la clase cuadrado
     * @param lado El valor del lado del cuadrado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    /**
     * Obtiene el valor del lado del cuadrado
     * @return El valor del lado
     */
    public double getLado() {
        return lado;
    }
    
    /**
     * Establece un valor del lado del cuadrado
     * @param lado El nuevo valor del lado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    /**
     * Calcula el área del cuadrado
     * @return El área del cuadrado
     */
    public double calcularArea() {
        return lado * lado;
    }
    /**
     * Calcula el perímetro del cuadrado
     * @return El perímetro del cuadrado
     */
    public double calcularPerimetro() {
        return lado * 4;
    }
}
    
