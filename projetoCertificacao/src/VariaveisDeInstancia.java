public class VariaveisDeInstancia{

/* variáveis de instancia ou variáveis de objetos são os atributos dos objetos, 
* declaradas dentro da classe, mas fora de qualquer médodo ou construtor, podendo
* ser acessadas por qualquer membro da classe enquanto o objeto existir. 
*/

	//variável de instância ou variável de objeto
	String nome;

	
	public static void main(String[] args){
		VariaveisDeInstancia vi = new VariaveisDeInstancia();
		
		vi.setNome("Carl Edwin.");
		
		System.out.print( "Nome: " + vi.nome);
	}
	
	
	
	public void setNome(String n){
		
		//acessando a variavel de instancia no metodo
		this.nome = n;
	}
	
}