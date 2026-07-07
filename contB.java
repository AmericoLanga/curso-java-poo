import java.util.Scanner;

   public class contB{
	   public static void main(String [] args){
		   ContBanco C1 = new ContBanco();
		   
		   C1.setDono("Americo");
		   C1.setNumConta(879631131);
		   C1.abrirConta("CC");
		   C1.depositar(50000);
		   C1.sacar(49999);
		   C1.pagarMensal();
		   
		   //Resultado4s
		   System.out.println("Numero da Conta: " +C1.getNumConta());
		   System.out.println("Tipo de conta: " +C1.getTipo());
		   System.out.println("Saldo actual: " +C1.getSaldo());
		   System.out.println("Status actual: " +C1.getStatus());
		  
		   
		   
		   System.out.println();
		   
		   ContBanco C2 = new ContBanco();
		   
		   C2.setDono("Americo");
		   C2.setNumConta(879631132);
		   C2.abrirConta("CP");
		   C2.depositar(7000);
		   C2.sacar(6999);
		   C2.pagarMensal();
		   
		   
		   System.out.println("Numero da Conta: " +C2.getNumConta());
		   System.out.println("Tipo de conta: " +C2.getTipo());
		   System.out.println("Saldo actual: " +C2.getSaldo());
		   System.out.println("Status Actual: " +C2.getStatus());
	   }
   }