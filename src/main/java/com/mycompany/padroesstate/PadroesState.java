/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.padroesstate;

/**
 *
 * @author eva
 */
public class PadroesState {

    public static void main(String[] args) {
        
        CaixaEletronico caixa = new CaixaEletronico();
        caixa.emUso();
        caixa.emUso();
        caixa.livre();
        caixa.consertarCaixa();
        caixa.emUso();
        caixa.emManutencao();
        caixa.emManutencao();
        caixa.consertarCaixa();
        
        
    }
}
