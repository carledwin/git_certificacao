class PersonShadowing{
static int x =0;
int y = 0;

public static void setX(int x){
  //type (class) explicit access
  PersonShadowing.x = x;
}

public void setY(int y){
  //instance (this) explict access
  this.y = y;
}
}

class TestPersonShadowing{
  public static void main(String[] args){
    PersonShadowing p = new PersonShadowing();
    p.setY(8);
    System.out.println("Y >>>>> " + p.y);
    PersonShadowing.setX(10);
    System.out.print("X >>>>  " + PersonShadowing.x);
  }
}