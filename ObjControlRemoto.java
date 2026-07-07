
 public class ObjControlRemoto{
	 public static void main(String [] args){
		 ControlRemoto C1 = new ControlRemoto();
		 
		C1.ligar();
		C1.maisVolume();
		C1.ligarMudo();
		C1.desligarMudo();
		C1.play();
		C1.pause();
		C1.abrirMenu();
		C1.fecharMenu();
		
		 /*
		 System.out.println("Estado: " + this.getLigado());
		 System.out.println("Volme: " + this.getVolume());
		 System.out.println("tocando: " + this.getTocando());
		 */
	 }
 }