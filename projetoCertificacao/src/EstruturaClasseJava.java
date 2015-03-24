/* Declaracao de pacote - Todas as classes pertecem a um pacote, 
caso o mesmo não seja declarado a classe fará parte do 'pacote padrão' ou 
'default package' - todas as classes no default package se enxergam;
				  - classes no default package não podem ser importadas 
				  	para uso em outros pacotes.
	
/*erro de execucao - wrong name - nome errado
caso o nome do pacote esteja errado ou não exista
Exception in thread "main" java.lang.NoClassDefFoundError:
*/
//1ª instrução do código
//palavra chave package define o pacote, somente um pacote pode ser definido
package br.com.caelum.certificacao; // classe em um pacote
//sem pacote  						// classe no pacote padrão
//2ª instrução do código
import java.util.Date;

//3ª instrução do código
//Declaracao da classe
public class /* Comentario no meio da linha. */ EstruturaClasseJava{
	         
	//conteudo da classe
	/*
	public static void main(String[] args){
		System.out.print("Hello");
	}
	*/
	
	// comentario de uma linha
	
	/*comentario
		de
	  multiplas linhas.	*/
	
	  /**
	  *JavaDoc, repare que a prinheira linha 
	  *de comentario tem 2 asteriscos
	  *que pode ser utilizado para gerar uma documentação HTML a partir
	  *do código.
	  */
	  
	  
	  
}
