/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padroesstate;

/**
 *
 * @author eva
 */
public class CaixaEmManutencao implements State{
    
    @Override
    public State emUso(){
        System.out.println("O caixa está impossiblitado de ser usado,aguarde!");
        return new CaixaEmUso();
    }
    
    @Override
    public State livre(){
        System.out.println("caixa livre!");
        return this;
    }
    
    @Override 
    public State emManutencao(){
        System.out.println("caixa em manutenção, aguarde!"); 
        return this;
                
    }
    @Override 
    public State consertarCaixa(){
        System.out.println("caixa livre para o uso!");
        return new CaixaLivre();
    }
    
}
