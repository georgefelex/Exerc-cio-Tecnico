package luxfacta;

import javax.swing.JOptionPane;

/*******************************************************************************
  Uma palÃ­ndroma Ã© uma palavra que se lÃª da mesma forma de trÃ¡s para frente.

  Escreva o corpo do mÃ©todo isPalindrome que verifica se uma palavra Ã©
  palÃ­ndroma. A validaÃ§Ã£o deve desconsiderar diferenÃ§a entre maiÃºsculas e
  minÃºsculas (case insensitive).

  Por exemplo, isPalindrome(â€œDeleveledâ€�) deve retornar true.
*******************************************************************************/

public class Palindrome {
  public static boolean isPalindrome(String word) {
		     String palavra, palavraInvertida="";
		      int tamanho,i;


		      // Armazena a palavra numa String
		      palavra = JOptionPane.showInputDialog(null,"Digite uma palavra"); 


		      //tamanho recebe o qtd de letras q possui a palavra
		      tamanho=palavra.length(); 
		      
		      
		      //pega a ultima letra da variavel palavra, e inseri na primeira de palavraInvertida, depois pega penultima e inseri na 2ª, e assim em diante, até pegar a primeira, e colocar na ultima.
		      for(i=tamanho-1;i>=0;i--){  
		          palavraInvertida += palavra.charAt(i);
		       }
		       

		      //Compara as Duas Strings e Exibe o Resultado
		      if(palavra.equalsIgnoreCase(palavraInvertida)) 
		           JOptionPane.showMessageDialog(null,palavra + " É uma palavra palindroma"); 
		      else 
		           JOptionPane.showMessageDialog(null,palavra + " Não é uma palavra palindroma");
		    
    return true; 
  }
}
