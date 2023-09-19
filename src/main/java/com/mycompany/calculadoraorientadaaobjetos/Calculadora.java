/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraorientadaaobjetos;

/**
 *
 * @author batista.4995
 */
public class Calculadora {
    //declarar uma variavel "private" só pode ser acessada desta classe (Calculadora)
    private float resultado;
   
    
    //alt + tecla esquerda + insert
    //construtor da classe calculadora
    //selecionar "constructor"
    public Calculadora() {
    }
    
    //alt + tecla esquerda + insert
    //construtor da classe calculadora
    //selecionar "Getter and Setter"
    public float getResultado() {
        return resultado;
    }
    //"set" serve para atribuir um valor publico para o resultado
    //void é "vazio" não precisa retornar um valor
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    //declaro um metodo dizendo que a e b serão somados
    //flaot retorna um valor
    public float somar(float a, float b){
        //pensar em return como uma variável que recebe a+b sem o sinal de igual
        return a + b;
    }
    public float subtrair (float a, float b){
        return a - b;
    }
    public float multiplicar (float a, float b){
        return a * b;
    }
    public float dividir (float a, float b){
        return a / b;
    }
}
