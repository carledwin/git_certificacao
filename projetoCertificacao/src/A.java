/*
o nome do arquivo nnao pode ser A pois e o uma class nao public e neste caso 
existe uma class/interface public no arquivo

Se nao tivesse sido declarada nenhuma class/interface public no arquivo
poderia ser qualquer nome entre as class/interfaces declaradas abaixo
*/
class A implements B{
	
	public static void main(String... args){}
	
}

/* o nome do arquivo obrigatoriamente deve ser o nome da
class ou interface public 

no arquivo pode existir somente uma class/interface public

 23: ERROR: class B is public , should be declared in a file named B.java
 								deveria ser 
 
 public interface B{
        ^
 
*/
interface B{

}

interface F{

}

class C extends A{

}


/*

Nao pode ser colocada virgula para separar extends e implements

 45: ERROR: '{' expected 
 
 class D extends A, implements B{
 				  ^
 1 error
*/

//class D extends A implements B{
//class D extends A, implements B,F{Nao compila
//class D extends A implements B,{ Nao compila
class D extends A implements B,F{


}