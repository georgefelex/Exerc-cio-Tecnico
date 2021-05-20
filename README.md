# Exerc-cio-Tecnico

public class LuxFacta {
  private int n;

  public LuxFacta(int n) {
    this.n = n;
  }

  public String say() {
	  
	  //utilizei operadores logicos para caso o numero seja divisivel por 3 ou 5
	  
		boolean divisivelPorTres = (n%3 == 0);
	    boolean divisivelPorCinco =  (n%5 == 0);
	        
	    if(divisivelPorTres && divisivelPorCinco) {
	    	System.out.println(n);
	    	//E utilizei operado logicos assim fiz, caso não seja divisivel por 3 mas e divisivel por 5
	    }else if (divisivelPorTres == false && divisivelPorCinco == true) {
	    	System.out.println("Lux");
	    	//E utilizei operado logicos assim fiz, caso não seja divisivel por 5 mas e divisivel por 3
	    }else if(divisivelPorCinco == false && divisivelPorTres == true) {
	    	System.out.println("Facto");
	    	//Caso não seja divisivel nem por 3 nem por 5 imprimisse LuxFactor 
	    }else if(divisivelPorTres == false && divisivelPorCinco == false) {
	    	System.out.println("LuxFacto");
	    }else if(divisivelPorTres) {
	    	System.out.println(n);	
	    }else if(divisivelPorCinco) {
	    	System.out.println(n);
	    }
    return "n";
  }
}
