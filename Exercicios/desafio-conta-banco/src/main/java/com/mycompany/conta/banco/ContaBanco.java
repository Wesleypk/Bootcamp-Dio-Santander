/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta.banco;

/**
 *
 * @author Wesley
 */
public class ContaBanco {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ContaTerminal agencia1 = new ContaTerminal();
        agencia1.criarConta();
        
        System.out.println("Fim da execução");
    }
}
