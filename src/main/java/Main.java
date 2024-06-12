public class Main {
  public static void main(String[] args) {
    //AULA 02/06 INTRODUCAO A POO (CLASSES)
    //INSTANCIANDO/CHAMANDO A CLASSE PARA CHAMAR AS AÇÕES DA CLASSE
     //Cao cachorro = new Cao();
    // cachorro.nome = "Bobby";
     //cachorro.Anda();

    //AULA 03/06 INTRODUCAO A POO (CONSTRUTORES PADRÃO E SOBRECARGA)
    Cao cachorro = new Cao();
    cachorro.Anda();

    Cao cao = new Cao("Bobby", 2);
    cao.DadosCao();
    
    
  }
}