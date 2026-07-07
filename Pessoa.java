
  public class Pessoa{
	  
	  //atributos
	  private String nome;
	  private int idade;
	  private String sexo;
	  
	  
	  public Pessoa(String n, int id, String s){
		  this.nome = n;
		  this.idade = id;
		  this.sexo = s;
	  }
	  
	  
	  //metodos especiais
	  public String getNome(){
		  return this.nome;
	  }
	  public void setNome(String n){
		  this.nome = n;
	  }
	  
	  public int getIdade(){
		  return this.idade;
	  }
	  public void setIdade(int i){
		  this.idade = i;
	  }
	  
	  public String getSexo(){
		  return this.sexo;
	  }
	  public void setSexo(String s){
		  this.sexo = s;
	  }
	  
	  
	  //Metodos principais
	  public void fazerAni(){
		  this.idade = this.idade + 1;
	  }
	  public void sobP(){
		  System.out.println("Nome: " +this.nome);
		  System.out.println("Idade: " +this.idade);
		  System.out.println("Sexo: " +this.sexo);
	  }
  }