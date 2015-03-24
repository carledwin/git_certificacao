class TestePassandoParametrosViaLinhaDeComando{

	/* Funciona perfeitamente com varargs que não define 
	a quantidade de parametros que serão passados
	*/
	/*
	public static void main(String... args){
		for(String s : args){
			int contador = 1;
			System.out.println("Argumento n " + contador + " parametro --> " + s);
		}
	}
	*/
	
	/*
	Chamada:
	F:\Certificacao>jdk1.7.0_71\bin\java TestePassandoParametrosViaLinhaDeComando primeiro segundo terceiro quarto
	
	Resultado:
	Parametro 1: primeiro
	Parametro 1: segundo
	
	
	Chamada:
	F:\Certificacao>jdk1.7.0_71\bin\java TestePassandoParametrosViaLinhaDeComando primeiro
	
	Resultado: 
	Erro de execucao a posicao de array 1 nao foi encontrada
	
	Exception:
	Exception in thread main: java.lang.ArrayIndexOutOfBoundsExceptions: 1
	at TestePassandoParametrosViaLinhaDeComando.main(TestePassandoParametrosViaLinhaDeComando.java: 33)
	*/
	public static void main(String args[]){
		System.out.println("Parametro 1: " + args[0]);
		System.out.println("Parametro 1: " + args[1]);
	}
	
}