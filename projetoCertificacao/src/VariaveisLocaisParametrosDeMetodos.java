public class VariaveisLocaisParametrosDeMetodos{

	public static void main(String[] args){
		
	
	}
	
	public static void m1(String bla){
		System.out.print(bla);
	}
	
	public static void m2(){
		
		//error: cannot find symbol
		//erro de compila��o, pois bla n�o existe neste escopo
		//variavel fora do ecopo
		System.out.println(bla);
	}
}