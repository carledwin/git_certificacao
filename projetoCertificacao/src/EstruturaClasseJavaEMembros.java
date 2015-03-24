class EstruturaClasseJavaEMembros{
	
	//membros da classe(variaveis, metodos e construtores)
	
	String nome;
	String sobrenome;
	
	EstruturaClasseJavaEMembro(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto(){
		return this.nome + this.sobrenome;
	}
}