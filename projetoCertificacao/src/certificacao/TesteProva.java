package certificacao;
class TesteProva{
	public static void main(String... args){
		Prova prova = new Prova();
		prova.tempo = 34;
		System.out.println("Tempo da prova: " + prova.tempo);
		System.out.println("Tempo da prova: " + TesteProva.parametro);
		//F:\Certificacao>jdk1.7.0_71\bin\java -Dparametro=4474 certificacao.TesteProva
		//recebendo parametro do -D parasso para JVM
		System.out.println("-D Parametro: " + System.getProperty("parametro"));
		System.out.println("\nTempo da prova2 static: " + Prova.tempo2);
	}
	
	//-D identifica uma passagem de parametros ou propriedades para a JVM
}