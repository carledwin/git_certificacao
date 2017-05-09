
class NomesRepetidosMembrosDiferentes{
  static String batata = "batata";
  static String maracuja = "maracuja";
  String laranja = "laranja";
 /*
  * Pode gerar problemas
  * GERA CONFLITO, CANNOT FIND SYMBOL NomesRepetidosMembrosDiferentes
  * O nome de uma variavel static sendo declarado exatamente igual ao nome da class 
  * gera conflito no momento em que tentamos chamar uma variavel static conforme abaixo.
  * 
  * Situação que não geraria problemas caso não ocorrece este tipo de declaração.
  * 
  * Ao tentar chamar NomesRepetidosMembrosDiferentes(class) acredita que está chamando a NomesRepetidosMembrosDiferentes(variable static String NomesRepetidosMembrosDiferentes)
  * 
  */
  static String NomesRepetidosMembrosDiferentes = "NOME IGUALZINHO";
  
 static String nomesRepetidosMembrosDiferentes = "NOME IGUALZINHO minusculo";
  
  
  NomesRepetidosMembrosDiferentes(){
  }
  
  static String NomesRepetidosMembrosDiferentes(int i, String NomesRepetidosMembrosDiferentes){
    return NomesRepetidosMembrosDiferentes;
  }
  
  String NomesRepetidosMembrosDiferentes(String NomesRepetidosMembrosDiferentes){
    return NomesRepetidosMembrosDiferentes;
  }
   
  public static void main(String a [] ){
   System.out.println( new NomesRepetidosMembrosDiferentes().NomesRepetidosMembrosDiferentes("NomesRepetidosMembrosDiferentes ss  2"));
   
   /* não pode ser chamado desta maneira, pois o compilador entende 
    * que o chamado neste caso é o type NomesRepetidosMembrosDiferentes
    * System.out.println(NomesRepetidosMembrosDiferentes.NomesRepetidosMembrosDiferentes);
    */
   
   System.out.println("new NomesRepetidosMembrosDiferentes().NomesRepetidosMembrosDiferentes >>>> " + new NomesRepetidosMembrosDiferentes().NomesRepetidosMembrosDiferentes);
   System.out.println( "  NomesRepetidosMembrosDiferentes >>> "+ NomesRepetidosMembrosDiferentes);
   System.out.println(" nomesRepetidosMembrosDiferentes  >>> " + nomesRepetidosMembrosDiferentes);
   
   /*
    * GERA CONFLITO, CANNOT FIND SYMBOL NomesRepetidosMembrosDiferentes
    * O nome de uma variavel static sendo declarado exatamente igual ao nome da class 
    * gera conflito no momento em que tentamos chamar uma variavel static conforme abaixo.
    * 
    * Situação que não geraria problemas caso não ocorrece este tipo de declaração.
    * 
    * Ao tentar chamar NomesRepetidosMembrosDiferentes(class) acredita que está chamando a NomesRepetidosMembrosDiferentes(variable static String NomesRepetidosMembrosDiferentes)
    * 
   System.out.println("NomesRepetidosMembrosDiferentes.nomesRepetidosMembrosDiferentes >>>> " + NomesRepetidosMembrosDiferentes.nomesRepetidosMembrosDiferentes);
   System.out.println("NomesRepetidosMembrosDiferentes.NomesRepetidosMembrosDiferentes >>>> " + NomesRepetidosMembrosDiferentes.NomesRepetidosMembrosDiferentes);
   System.out.println("NomesRepetidosMembrosDiferentes.maracuja " + NomesRepetidosMembrosDiferentes.maracuja); 
   */ 
    
   System.out.println("new NomesRepetidosMembrosDiferentes().laranja >>>> " + new NomesRepetidosMembrosDiferentes().laranja);
   System.out.println("new NomesRepetidosMembrosDiferentes().batata >>> " + new NomesRepetidosMembrosDiferentes().batata);
   System.out.println("batata >>>" + batata);
   System.out.println("maracuja >>>" + maracuja);
   

  }
   
}