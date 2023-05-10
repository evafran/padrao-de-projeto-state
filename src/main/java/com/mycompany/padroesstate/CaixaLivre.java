/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padroesstate;

/**
 *
 * @author eva
 */
public class CaixaLivre implements State{
    
    @Override
    public State emUso(){
        System.out.println("caixa em uso!");
        return new CaixaEmUso();
    }
    
    @Override
    public State livre(){
        System.out.println("caixa livre!");
        return this;
    }
    
    @Override
    public State emManutencao(){
        System.out.println("caixa em manuteção aguarde!");
        return new CaixaEmManutencao();
    }
    
    @Override
    public State consertarCaixa(){
        System.out.println("Este caixa não precisa ser consertado!");
        return this;
    }
    
}
