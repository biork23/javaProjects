package Tarea16;

public class AñoBisiesto {
	
	 private int año;
	    
	    public AñoBisiesto(int año) {
	        this.año = año;
	    }
	    
	    public int getAño() {
	    	return this.año;
	    }
	    
	    public boolean esBisiesto() {
	       
	        
	        if (año % 4 == 0) {
	            if (año % 100 == 0) {
	                if (año % 400 == 0) {
	                    return true;
	                } else {
	                    return false;
	                }
	            } else {
	                return true;
	            }
	        } else {
	            return false;
	        }
	    }

}
