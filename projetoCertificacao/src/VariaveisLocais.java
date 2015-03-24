public class VariaveisLocais{
	
	public static void main(String[] args){
		VariaveisLocais.m1();
	}
	
	
	public static void m1(){ //início do bloco do método
		int x = 10; //variável local do método
		
		if(x >= 10){ //início do bloco do if
			int y = 50; //variavel local do if
			System.out.print("Y --> " + y);
		}//fim do bloco if
		
		//tentativa de chamada à variável local y fora do seu escopo
		//erro de compilação
		//error: cannot find symbol
		System.out.print(y);
		
		
	}//fim do método
	
	
}