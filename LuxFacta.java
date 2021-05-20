package luxfacta;

/*******************************************************************************
  A classe LuxFacta recebe um parâmetro no seu construtor que é sempre um número
   inteiro.
  Com base nesse numero n, escreva o corpo do método say, de forma que:
    - Se o número n for divisível por 3, o retorno deve ser "Lux"
    - Se o número n for divisível por 5, o retorno deve ser "Facta"
    - Se o número n for divisível por 3 e por 5, o retorno deve ser "LuxFacta"
    - Qualquer outra condição o retorno deve ser o próprio número n;
*******************************************************************************/

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
	    	//E utilizei operado logicos assim fiz, caso n�o seja divisivel por 3 mas e divisivel por 5
	    }else if (divisivelPorTres == false && divisivelPorCinco == true) {
	    	System.out.println("Lux");
	    	//E utilizei operado logicos assim fiz, caso n�o seja divisivel por 5 mas e divisivel por 3
	    }else if(divisivelPorCinco == false && divisivelPorTres == true) {
	    	System.out.println("Facto");
	    	//Caso n�o seja divisivel nem por 3 nem por 5 imprimisse LuxFactor 
	    }else if(divisivelPorTres == false && divisivelPorCinco == false) {
	    	System.out.println("LuxFacta");
	    }else if(divisivelPorTres) {
	    	System.out.println(n);	
	    }else if(divisivelPorCinco) {
	    	System.out.println(n);
	    }
    return "n";
  }
}
