class Bla{
static int a;
//int a;

public static void main(String[] args){
  System.out.print(Bla.a);
}

public void method(int par){
int par = 5; //shadowing
System.out.print(par);
}
}