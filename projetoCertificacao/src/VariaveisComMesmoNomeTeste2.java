public class VariaveisComMesmoNomeTeste2{

	static int x = 15;
	
	public static void main(String[] x){
		
		x = 200; /*error: incompatible types
				* required String[] 
				* found int
				* erro ao tentar imprimir pois ao tentar recuperar a variavel
				 * de menor escopo e atribuir um inteiro a um array não é compilado.
				 */
		System.out.println(x);
	 
	}
}