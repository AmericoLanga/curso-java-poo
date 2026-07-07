 
  public class objLutador{
	  public static void main(String [] args){
		  Lutador v[] = new Lutador[2];
		  
		  v[0] = new Lutador("Americo","Moz",21,71.2,85,50,15,1);
		  v[1] = new Lutador("Lackson","Brasil",25,109.2,85,90,15,1);
		  v[0].apresentacao();
		  System.out.println();
		  v[1].apresentacao();
		  
		  
		  Luta UEC01 = new Luta();
		  //UEC01.Luta();
		  UEC01.marcarLuta(v[0], v[1], 2);
		  UEC01.Lutar();
		  v[0].status();
		  v[1].status();
		 
	  }
  }
  
         