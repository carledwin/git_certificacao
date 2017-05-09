class Person{
String name;
static int count = 15;
static final int CONSTANTE = 34;

public static void main(String[] args){
  System.out.println("Person.count  " + Person.count);
  System.out.println("count  " + count);
}

public void setName(String n){
this.name =n;
}
}