/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.padroesstate;

/**
 *
 * @author eva
 */
public interface State {
    State emUso();
    State livre();
    State emManutencao();
    State consertarCaixa();
     
}
