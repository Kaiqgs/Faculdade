/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitthread;

/**
 *
 * @author CC04735125990
 */
public class Carteira {
    
    public String sym;
    public double moedaBase;
    public double moedaCotacao;
    
    public Carteira(String sym, double moedaBase, double moedaCotacao){
        this.sym = sym;
        this.moedaBase = moedaBase;
        this.moedaCotacao = moedaCotacao;
    }
}
