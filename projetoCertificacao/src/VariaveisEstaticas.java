public class VariaveisEstaticas{
	
	public static void main(String[] args){
	
	Pessoa p = new Pessoa();
	
	System.out.println("Id: " + p.id); //acessando a variavel static pelo objeto.
	System.out.print("Id: " + Pessoa.id); //acessando direto pela classe.
	
	}
	
}