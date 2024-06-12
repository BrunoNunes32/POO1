//AULA 02/06 INTRODUCAO A POO (CLASSES)

//CRIANDO CLASSES
class Cao{
  //DEFININDO ATRIBUTOS
  String nome;
  String cor;
  int idade;
  double peso;

  //CRIANDO CONSTRUTOR
  public Cao(){
    cor = "Caramelo";
  }

  //SOBRECARGA
  public Cao(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  
  //CRIANDO METODOS
  public void Anda(){
    System.out.println("O cão está andando " + cor);
  }

  public void DadosCao(){
    System.out.println("O " + nome + " tem " + idade + " anos");
  }
  
}