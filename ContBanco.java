
  public class ContBanco{
	  
	  public int numConta;
	  protected String tipo;
	  private String dono;
	  private double saldo;
	  private boolean status;


    //Instacia
   public ContBanco(){
	   this.setStatus(false);
	   this.setSaldo(0);
   }   
 
   
   // gets e sets
    public int getNumConta(){
	   return this.numConta;
   }
   public void setNumConta(int n){
	   this.numConta = n;
   }
   
   public String getTipo(){
	   return this.tipo;
   }
   public void setTipo(String t){
	   this.tipo = t;
   }
   
   public String getDono(){
	   return this.dono;
   }
   public void setDono(String d){
	   this.dono = d;
   }
   
   public double getSaldo(){
	   return this.saldo;
   }
   public void setSaldo(double s){
	   this.saldo = s;
   }
   
   public boolean getStatus(){
	   return this.status; 
   }
   public void setStatus(boolean st){
	   this.status = st;
   }
   
   
   

   
   public void abrirConta(String tt){
	   this.setStatus(true);
	   System.out.println("Insira o tipo de conta [Poupanca ou Corrente]");
	   this.setTipo(tt);
	   if(this.getTipo().equals("CC")){
		   this.setSaldo(50);
	   }else if(this.getTipo().equals("CP")){
		   this.setSaldo(150);
	   }
   }
 
   public void fecharConta(){
	   if(this.getSaldo() > 0){
		  // this.setStatus(true);
		   System.out.println("Porfavor zere a conta antes de fechar a conta");
	   }else if(this.getSaldo() < 0){
		   System.out.println("Por favor pague a divida antes de fechar a conta");
	   }else{
		   this.setStatus(false);
	   }
   }
   
   public void depositar(double valor){
	   if(this.getStatus()){
		   this.setSaldo(this.getSaldo() + valor);
	   }else{
		   System.out.println("Impossivel depositar, Abra uma conta primeiro.");
	   }
   }
   
  
  public void sacar(double valor){
	  if(this.getStatus() && this.getSaldo() >= valor){
		  this.setSaldo(this.getSaldo() - valor);
	  }else{
		  System.out.println("Impossivel sacar, ou a Conta esta fechada ou o saldo E insuficl.iente");
	  }
  }
  
  //cobranca de taxa de manuntencao
  public void pagarMensal(){
	  if(this.getStatus()){
		  if(this.getTipo().equals("CC")){
			  this.setSaldo(this.getSaldo() - 12);
		  }else if(this.getTipo().equals("CP")){
			  this.setSaldo(this.getSaldo() - 20);
		  }
	  }
  }
  }