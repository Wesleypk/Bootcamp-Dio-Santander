/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.DesafioControleFluxo;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Contador {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
            
        System.out.println("Digite o primeiro numero");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo numero");
        int parametroDois = input.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        
       
        
        
    }
    static void contar(int parametroUm, int parametroDois)
            throws ParametrosInvalidosException{
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();            
        }
        
       int contagem = parametroDois-parametroUm;
       for (int i = 1; i <= contagem; i++){
           System.out.println("Imprimindo o número " + i);
           
       }
        
        
        
       }
}
