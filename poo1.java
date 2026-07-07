
 public class poo1{
	 public static void main(String [] args){
		 Caneta c1 = new Caneta();
		 Caneta c2 = new Caneta();
		 
		 
		 System.out.println("Caneta 1");
		 c1.cor = "Azul";
		 c1.ponta = 0.5f;
		 c1.tampar();
		 c1.Status();
		 c1.rabiscar();
		 
		 System.out.println();
		 
		 System.out.println("Caneta 2");
		 c2.cor = "Preta";
		 c2.ponta = 0.7f;
		 c2.destampada();
		 c2.rabiscar();
		 c2.Status();
		 
		 
		 
	 }
 }