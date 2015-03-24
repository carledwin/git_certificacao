public class VariaveisComMesmoNome{
	
	static int a = 12;
	
	static int c = 22; //variavel de instancia 
	
	//int a;//erro de compilação error: variabel a is already defined in class
			//VariaveisComMesmoNome	
			
	//static int 10; //identifier expected (nome da variavel não declarado)
	
	
	public static void bla(){
		//static int b;// illegal start expression - declarada variavel static 
						//dentro do metodo
		
		//int b ';' expected
		
		//int b; 
		int b;//erro de compilacao error: variabel b is already defined in method bla() 
	}
	
	//permitido e compila
	public void metodoComVariavelMesmoNomeVariavelClasseOutroTipo(String a){
		System.out.println("Variavel de instancia: " + VariaveisComMesmoNome.a);
		System.out.println("Variavel do parametro do metodo: " + a);
	}
	
	
	//permitido e compila
	public void metodoComVariavelMesmoNomeVariavelClasseMesmoTipo(int a){
		
		int c = 34; //shadowing
		
		System.out.println("Variavel do parametro do metodo: " + a);
		
		/*Sempre utiliza a variavel de menor escopo, quando não utilizada
		* a palava chave this - escopo de classe
		*/
		System.out.println("Shadowing: " + c);//imprime 34 a variavel local
		
		
		System.out.println("Variavel de instancia, usando o this: " + this.c);
		System.out.println("Variavel de instancia, usando a referencia da classe: " + VariaveisComMesmoNome.c);
		
		/*para referenciar variaveis da propria classe(variaveis 
		* de instancia) com a palavra chave this.
		*/
		System.out.println("Variavel de instancia: " + this.a); //imprime a variavel de instancia
										
	}
	
	public void metodoParametroMesmoNomeVariavelLocal(String z){
		//int z = 3; //error: variable z is already defined in method metodoParametroMesmoNomeVariavelLocal
		
		System.out.println(z);
	}
	
	public static void main(String[] args){
		new VariaveisComMesmoNome().metodoComVariavelMesmoNomeVariavelClasseOutroTipo(" Uma palavra");
		new VariaveisComMesmoNome().metodoComVariavelMesmoNomeVariavelClasseMesmoTipo(50);
		
	}
}