/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Vanessa Furtado
 */
public class InstrucaoException extends Exception{
    
    
    @Override
    public String getMessage(){
        return "Não há mais instruções";
    }
    
}
