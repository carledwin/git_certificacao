public class VariaveisLocais{
	
	public static void main(String[] args){
		VariaveisLocais.m1();
	}
	
	
	public static void m1(){ //in�cio do bloco do m�todo
		int x = 10; //vari�vel local do m�todo
		
		if(x >= 10){ //in�cio do bloco do if
			int y = 50; //variavel local do if
			System.out.print("Y --> " + y);
		}//fim do bloco if
		
		//tentativa de chamada � vari�vel local y fora do seu escopo
		//erro de compila��o
		//error: cannot find symbol
		System.out.print(y);
		
		
	}//fim do m�todo
	
	
}