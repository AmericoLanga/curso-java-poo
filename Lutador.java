
  public class Lutador{
	  
	  //Atributos
	  private String nome;
	  private String nacionalidade;
	  private int idade;
	  private double altura;
	  private double peso;
	  private String categoria;
	  private int vitorias;
	  private int derrotas;
	  private int impates;
	  
	  
	  //Construtor
	  public Lutador(String no, String na, int id, double al, double pe, int vit, int der, int imp){
		  this.nome = no;
		  this.nacionalidade = na;
		  this.idade = id;
		  this.altura = al;
		  this.setPeso(pe);
		  this.vitorias = vit;
		  this.derrotas = der;
		  this.impates = imp;
	  }
	  
	  public String getNome(){
		  return this.nome;
	  }
	  public void setNome(String no){
		  this.nome = no;
	  }
	  public String getNacionalidade(){
		  return this.nacionalidade;
	  }
	  public void setNacionalidade(String na){
		  this.nacionalidade = na;
	  }
	  public int getIdade(){
		  return this.idade;
	  }
	  public void setIdade(int id){
		  this.idade = id;
	  }
	  public double getAltura(){
		  return this.altura;
	  }
	  public void setAltura(double al){
		  this.altura = al;
	  }
	  
	  public double getPeso(){
		  return this.peso;
	  }
	  public void setPeso(double pe){
		  this.peso = pe;
		  this.setCategoria();
	  }
	  
	  public String getCategoria(){
		  return this.categoria;
	  }
	  private void setCategoria(){

		  if(this.peso < 52.2){
			  this.categoria = "Invalido";
		  }else if(this.peso >= 52.2 && this.peso < 70.3){
			  this.categoria = "LEVE";
		  }else if(this.peso >= 70.3 && this.peso < 83.9){
			  this.categoria = "Medio";
		  }else if(this.peso >= 83.9 && this.peso <= 120.2){
			  this.categoria = "Pesado";
		  }else{
			  this.categoria = "Invalido";
		  } 
	  }
	  
	  public int getVitorias(){
		  return this.vitorias;
	  }
	  public void setVitorias(int vit){
		  this.vitorias = vit;
	  }
	  public int getDerrotas(){
		  return this.derrotas;
	  }
	  public void setDerrotas(int der){
		  this.derrotas = der;
	  }
	  public int getImpates(){
		  return this.impates;
	  }
	  public void setImpates(int imp){
		  this.impates = imp;
	  }
	  
	  public void apresentacao(){
		  System.out.println("");
		  System.out.println("-----Apresentacao-----");
		  System.out.println("Nome: " +nome);
		  System.out.println("Nacionalidade: " +nacionalidade);
		   System.out.println("Idade: " +idade);
		    System.out.println("Altura: " +altura);
			 System.out.println("Peso: " +peso);
			  System.out.println("Categoria: " +categoria);
			   System.out.println("Vitorias: " +vitorias);
			    System.out.println("Derrotas: " +derrotas);
				 System.out.println("Impates: " +impates);
	  }
	 
	  public void ganhaLuta(){
		  this.vitorias = this.vitorias + 1;
	  }
	  public void perdeLuta(){
		  this.derrotas = this.derrotas + 1;
	  }
	  public void impataLuta(){
		  this.impates = this.impates + 1;
	  }
	   public void status(){
		   System.out.println("");
		   System.out.println("========Resultado final===========");
		  System.out.println("A sua categoria E: " +categoria);
		  System.out.println("As suas vitorias: " +vitorias);
		  System.out.println("As suas derrotas: " +derrotas);
		  System.out.println("Os seus empates: " +impates);
		  System.out.println("=====================================");
	  }
  }
