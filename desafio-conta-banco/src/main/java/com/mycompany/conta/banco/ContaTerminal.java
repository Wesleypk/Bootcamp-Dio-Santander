/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta.banco;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class ContaTerminal{
    
  
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;
    Scanner teclado = new Scanner(System.in);
    
    
    public void criarConta(){
        
            System.out.println("Por favor digite o seu nome !");
        nomeCliente = teclado.next();
            System.out.println("Por Favor digite o número de sua Agência!");
        agencia = teclado.next();                
            System.out.println("Por Favor digite o número de sua Conta!");
        numeroConta = teclado.nextInt();        
            System.out.println("Por Favor digite o valor de seu Saldo!");
        saldo = teclado.nextDouble();
        
         System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +  
                agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + 
                " ja está disponível para saque.");       
       
        
                
        
        
    }
    
}
