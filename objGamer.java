
  public class objGamer{
	  public static void main(String [] args){
		  ContaGamer C1 = new ContaGamer();
		  
		   C1.recarregar(500);
		  int resultado = C1.jogarHora(4);
		  C1.setNome("Americo");
		  
		  
		  System.out.println("Saldo: " +C1.getSaldo());
		System.out.println("Horas a jogar: " +resultado +"H");
		  System.out.println("Nome: " +C1.getNome());
		  System.out.println("Os seus trocos sao: " +C1.getTrocos());
		 
		  
		  
	  }
  }