class EstruturaClasseJavaNomesDeMembros{
	//membro de classe
	//variavel de classe
	static String EstruturaClasseJavaNomesDeMembros = "Hello";
	
	//membro de instancia de classe
	//variavel de instancia
	String v;
	
	EstruturaClasseJavaNomesDeMembros(){
	}
	
	
	//this referencia o objeto atual / não pode ser usado no contexto static
	static String EstruturaClasseJavaNomesDeMembros(){
		return " retorno do metodo";
	}
	
	public static void main(String[] args){
	
	//acesso a variavel de instancia de classe
	System.out.println(new EstruturaClasseJavaNomesDeMembros().EstruturaClasseJavaNomesDeMembros);
	
	//acesso a metodo de instancia de classe
	System.out.println(new EstruturaClasseJavaNomesDeMembros().EstruturaClasseJavaNomesDeMembros());
	
	//acesso a variavel membro da classe
	System.out.println(EstruturaClasseJavaNomesDeMembros);
	
	//acesso a metodo membro da classe
	System.out.println(EstruturaClasseJavaNomesDeMembros());
	
	}
	
}