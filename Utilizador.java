  
  
   public class Utilizador implements ControlAutenticado{
	   
	   private String username;
	   private String passwordCriptografada;
	   private  String tentativa;
	   private boolean acertou;
	   
	   //Constructor
	   public Utilizador(){
		   this.username = "Americo";
		   this.passwordCriptografada = "12americo";
		   this.acertou = false;
	   }
	   
	   //getrs//setrs//
	   public String getUsername(){
		   return this.username;
	   }
	   public void setUsername(String u){
		   this.username = u;
	   }
	   
	   public String getTentativa(){
		   return this.tentativa;
	   }
	   public void setTentativa(String t){
		   this.tentativa = t;
	   }
	   
	   public boolean isAcertou(){
		   return this.acertou;
	   }
	   /*public void setAcerto(String a){
		   this.acertou = a;
	   }*/
	   
	   
	   //metodo
	   @Override
	   public boolean validarPassw(String senhaTentativa){
		  this.tentativa = senhaTentativa;
		  if(this.tentativa.equals(passwordCriptografada)){
			  this.acertou(true);
		  }else{
			  this.acertou = false;
		  }
		  
		  return this.acertou;
	   }
	   
	   
	   
	   
   }