/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padroesstate;

/**
 *
 * @author eva
 */
public class CaixaEletronico {
    
    private State state;
    
    public CaixaEletronico(){
        state = new CaixaLivre();
        
    }
    
    public void emUso(){
        state = state.emUso();
    }
    
    public void livre(){
        state = state.livre();
    }
    
    public void emManutencao(){
        state = state.emManutencao();
    }
    
    public void consertarCaixa(){
        state = state.consertarCaixa();
    }
}
