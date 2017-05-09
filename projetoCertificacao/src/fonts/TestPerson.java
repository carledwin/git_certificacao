class TestPerson{
Person person;
public static void main(String[] args){
  System.out.println("class >>> " + Person.count);
  Person.count += 30;
  System.out.println("class >>> "+ Person.count);
  Person.count = 2222;
  System.out.println("new instance >>> " + (new TestPerson()).person.count);
  
  TestPerson t = new TestPerson();
  System.out.println("second instance >>> " + t.person.count);
  t.person.count = 20;
  System.out.println("instance >>> " + t.person.count);
  System.out.println(t.person.CONSTANTE);
  //t.person.CONSTANTE = 38;
  System.out.println("constant >>> " +t.person.CONSTANTE);
}
}