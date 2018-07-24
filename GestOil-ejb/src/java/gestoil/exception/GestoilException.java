/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoil.exception;
import javax.ejb.ApplicationException; 
 
@ApplicationException(rollback=true) 
 
public class GestoilException extends RuntimeException { 

/**
 *
 * @author aissatou
 */

 // champs privés    
    private int code = 0;   
// constructeurs 
    public GestoilException() {    
        super();   
    } 
    public GestoilException(String message) {    
        super(message);   
    } 
    public GestoilException(String message, Throwable cause) {     
        super(message, cause);   
    } 
    public GestoilException(Throwable cause) {   
        super(cause);  
    } 
    public GestoilException(String message, int code) {    
        super(message);    
        setCode(code);  
    }
    public GestoilException(Throwable cause, int code) {    
        super(cause);    
        setCode(code);  
    } 
    public GestoilException(String message, Throwable cause, int code) {    
        super(message, cause);    
        setCode(code);  
    } 
// getters and setters  
    public int getCode() {       
        return code;   
    }   
    public void setCode(int code) {       
        this.code = code;   
    }
}
