/* Declaracao de pacote - Todas as classes pertecem a um pacote, 
caso o mesmo n�o seja declarado a classe far� parte do 'pacote padr�o' ou 
'default package' - todas as classes no default package se enxergam;
				  - classes no default package n�o podem ser importadas 
				  	para uso em outros pacotes.
	
/*erro de execucao - wrong name - nome errado
caso o nome do pacote esteja errado ou n�o exista
Exception in thread "main" java.lang.NoClassDefFoundError:
*/
//1� instru��o do c�digo
//palavra chave package define o pacote, somente um pacote pode ser definido
package br.com.caelum.certificacao; // classe em um pacote
//sem pacote  						// classe no pacote padr�o
//2� instru��o do c�digo
import java.util.Date;

//3� instru��o do c�digo
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
	  *que pode ser utilizado para gerar uma documenta��o HTML a partir
	  *do c�digo.
	  */
	  
	  
	  
}
