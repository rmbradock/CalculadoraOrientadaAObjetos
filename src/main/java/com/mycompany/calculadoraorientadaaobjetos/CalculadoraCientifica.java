/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraorientadaaobjetos;

/**
 *
 * @author batista.4995
 */
//gerar herança "extends"
public class CalculadoraCientifica extends Calculadora{
    //criar um metodo chamado raiz quadrada usando double
    public double raizQuadrada (float a){
        //Metodo que haverá um tipo de retorno pré estabelecido
        return Math.sqrt(a);
    }
    public double potencia (double a, double b){
        return Math.pow(a, b);
    }
}
