public class VariaveisLocaisLoopInfinitoFor{
	
	public static void main(String[] args ){
	
	for(int i = 0, j = 0; i < 10; i++){
		j++;
	}
	//j++ not a statement 
	
	//drror: cannot find symbol
	System.out.print("J --> " + j);//erro, j� n�o est� mais no escopo
	
	}
}