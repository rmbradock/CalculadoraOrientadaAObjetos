/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraorientadaaobjetos;

import java.util.Scanner;

/**
 *
 * @author batista.4995
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        //Instanciar = criar um objeto do tipo calculadora
        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        CalculadoraCientifica cc = new CalculadoraCientifica();
        
        float num1 = 0, num2 = 0; float resultado = 0;
        int opcao;
        
        String opcaoEscolha;
        
        Boolean continuar = true;
        
        System.out.println("==========================");
        System.out.println("CALCULADORA");
        System.out.println("==========================");
        System.out.println("QUAL OPERAÇÃO DESEJA REALIZAR");
        
        while (continuar){
            System.out.println("Selecione uma opção");
            System.out.println("                   ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potencialização");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("                   ");
        
        opcao= entrada.nextInt();
        
        if (opcao == 1){
                System.out.println("Informe o primeiro número");
                num1 = entrada.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = entrada.nextFloat();
                System.out.println("Resultado da soma: " + calculadora.somar(num1, num2));
        
        }else if(opcao == 2){
                System.out.println("Informe o primeiro número");
                num1 = entrada.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = entrada.nextFloat();
                System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
        
        }else if(opcao == 3){
                System.out.println("Informe o primeiro número");
                num1 = entrada.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = entrada.nextFloat();
                System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(num1, num2));
        
        }else if(opcao == 4){
                System.out.println("Informe o primeiro número");
                num1 = entrada.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = entrada.nextFloat();
                System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));
        
        }else if(opcao == 5){
                System.out.println("Informe o primeiro número");
                num1 = entrada.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = entrada.nextFloat();    
                System.out.println("Resultado da potencialização: " + cc.potencia(num1, num2));
        
        }else if(opcao == 6){
                System.out.println("Informe o valor desejado");
                num1 = entrada.nextFloat();
                System.out.println("Resultado da raiz quadrada: " + cc.raizQuadrada(num1));
                
        }else{
                System.err.println("Opção Inexistente");
            }
            System.out.println("Deseja realizar outra operação? S/N");
            opcaoEscolha = entrada.next();
            
            if (opcaoEscolha.equals("S") || opcaoEscolha.equals("s")){
                continuar = true;
            }else{
                continuar = false;
            }
        }
    }
}