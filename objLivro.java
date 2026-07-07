
 public class objLivro{
	 public static void main(String [] args){
		 Pessoa v[] = new Pessoa[2];
		 
		System.out.println("=====Dados da pessoa=====");
		System.out.println();
        v[0] = new Pessoa("Americo", 21, "M");
		v[1] = new Pessoa("Zuerinha", 14, "M");
		v[0].sobP();
		System.out.println();
		/*v[1].sobP();
		System.out.println();
		System.out.println();
		System.out.println("Dados das pessoas Depois");
		System.out.println();
		v[0].fazerAni();
		v[1].fazerAni();
		//v[0] = new Pessoa("Americo", 21, "M");
		//v[1] = new Pessoa("Americo", 21, "M");
		v[0].sobP();
		System.out.println();
		v[1].sobP();
		*/
		
		
		Livro l[] = new Livro[2];
		l[0] = new Livro("A historia da Caida de Zuera", "Americo", 100);
		l[0].setLeitor(v[0]);
		l[0].abrir();
		l[0].folhear(55);
		l[0].voltarPag();
		l[0].detalhes();
		
		
	 }
 }