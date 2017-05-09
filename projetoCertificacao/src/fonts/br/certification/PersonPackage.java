// 0 (default package) or 1 package (somente 1 package)
package br.certification; //deve ser finalizado com (;)
//package br.certification; //erro de compilação, pois mais de um package foi informado

//0 or more imports
import java.util.Date;

//0 or more types
class PersonPackage{
  //class content
  
  /**
   *JavaDoc, starts with slash, then two *
   * and it is multiple lines.
   */
  static void main(String [] a){ /* compila mas,
                                  * não executa pois (RuntimeException),
                                  * não é public
                                  */
 // public static void main(String [] a){ //single line comment again
  System.out.print(new Date());
  
  //single line comment
  /*
   * multiple 
   * lines 
   * comment
   */ 
  
  }
}