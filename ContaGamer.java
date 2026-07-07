 
  public class ContaGamer implements ControlGamer{
	  
	  private String nome;
	  private int saldo;
	  private int horas;
	  private int soma = 0;
	  private int trocos = 0; 
	  
	  //construtor
	  public ContaGamer(){
		 this.nome = "";
		 this.saldo = 0;
		 this.horas = 0;
		 this.trocos = 0;
	  }
	  
	  public int getTrocos(){
		  return this.trocos;
	  }
  public void setTrocos(int t){
	  this.trocos = t;
  }
	  
	  public String getNome(){
		  return this.nome;
	  }
	  public void setNome(String n){
		  this.nome = n;
	  }
	  
	  public int getSaldo(){
		  return this.saldo;
	  } 
	  
	  
	  /*
	  public int getHoras(){
		  return this.horas;
	  }
	  public void setHoras(int hr){
		  this.horas = hr;
	  }
	  */
	  
	   @Override
	  public int recarregar(int valor){
		   if(valor < 50){
			  System.out.println("Impossivel depositar, deposita um valor a cima de 50");
		  }else{
			  this.saldo = valor;
		  }
		  return this.saldo;
		  
	  }
	  @Override
	  public int jogarHora(int h){
		  this.horas = h;
		  for(int i = 1; i <= h; i++ ){
			  soma = soma + 1; 
		  }
		  int vezes = soma * 50;
		  			    //dando os trocos ao JOSE
		         this.setTrocos(this.saldo - vezes);
		  if(this.saldo < vezes){
			  System.out.println("Saldo insuficiente por favor Insira: " +vezes);
			  this.saldo = 0;
			  this.horas = 0;
		  }else{
			  
			  return this.horas;

		  }
		
		  
		  
		 /* 
		  if(this.saldo >= vezes){
			  this.saldo = this.saldo - vezes;
		  }else{
			   System.out.println("Impossivel o seu saldo E insuficiente");
		  }
		  
		  return this.horas;
		  */
		  return this.horas;
		  }
		  
		  
		  
		  
		 
	  }
  