class TesteCap3{
	
	int TesteCap3 = 305;
	
	/*
	TesteCap3(){
		System.out.println("Compila e imprime, pois e o construtor");
	}
	*/
	
	void TesteCap3(){
		System.out.println(TesteCap3);
		System.out.println("Atencao: compila mas, nao imprime nada, pois nao e o construtor");
	}
	
	public static void main(String[] args){
		new TesteCap3();
	}
}