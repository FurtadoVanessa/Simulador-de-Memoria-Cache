/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author thoma
 */
public class Principal {
    
    public static void main(String[] args){
        MapeamentoDireto direto = new MapeamentoDireto();
        direto.addPrincipal("00000000000000000001", "10101010101010101010101010101010");
        direto.addPrincipal("00000000000000000010", "10101010101010101010101010101010");
        direto.addPrincipal("00000000000000000011", "10101010101010101010101010101010");
        direto.addPrincipal("00000000000000000100", "10101010101010101010101010101010");
        direto.addPrincipal("00000000000000000101", "10101010101010101010101010101010");
        direto.addPrincipal("00000000000000000110", "10101010101010101010101010101010");
        direto.addPrincipal("00000000000000000111", "10101010101010101010101010101010");
        
        direto.addCpu("L", "00000000000000000001");
        direto.addCpu("S", "00000000000000000110");
        direto.addCpu("L", "00000000000000000001");
        direto.addCpu("S", "00000000000000000010");
        direto.addCpu("L", "00000000000000000110");
        
        direto.getRAM().imprimePrincipal();
        direto.imprimeCpu();
        
        direto.mapeamento();
        direto.getCache().imprimeCache();
        
    }
    
}
