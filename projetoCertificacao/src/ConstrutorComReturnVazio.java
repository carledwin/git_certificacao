class ConstrutorComReturnVazio{

	int j = -100;
	
	ConstrutorComReturnVazio(int i){
		System.out.println("Valor inicial de j : " + j);
		if(i > 1)
			return;
		j = i;
		System.out.println("Se i for maior que 1, nao devera retornar nada. ");
		System.out.println("Valor apos if de i : " + i);
		System.out.println("Valor apos if de j : " + j);
		System.out.println("\n ------------------- ");
	}
	
	public static void main(String[] args){
		int valor = 0;
		System.out.println("\n Valor informado: " + valor);
		new ConstrutorComReturnVazio(valor);
		
		int valor2 = 2;
		System.out.println("\n Valor2 informado: " + valor2);
		new ConstrutorComReturnVazio(valor2);
	}

}