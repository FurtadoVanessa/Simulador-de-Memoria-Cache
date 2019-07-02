
package control;

public class PrincipalException extends Exception{
    
    @Override
    public String getMessage(){
        return "Endereço não existente";
    }
    
}
