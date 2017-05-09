class Ex5_3{
static int i = 3;

public static void main ( String [] a ){
  for(new Ex5_3().i=11; (new Ex5_3()).i < 100;  (new Ex5_3()).i++){
    System.out.println(i);
    //System.out.println(this.i);//erro pois this é para acessar instance 
    System.out.println(Ex5_3.i);
  } 
}
}