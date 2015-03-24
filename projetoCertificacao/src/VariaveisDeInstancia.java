public class VariaveisDeInstancia{

/* vari�veis de instancia ou vari�veis de objetos s�o os atributos dos objetos, 
* declaradas dentro da classe, mas fora de qualquer m�dodo ou construtor, podendo
* ser acessadas por qualquer membro da classe enquanto o objeto existir. 
*/

	//vari�vel de inst�ncia ou vari�vel de objeto
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