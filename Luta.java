import java.util.Random;
  public class Luta{
	  
	  //Atributos
	  private Lutador desafiado;
	  private Lutador desafiante;
	  private int rounds;
	  private boolean aprovada;
	  
	  
	  //metodos especias
	  public Lutador getDesafiado(){
		  return this.desafiado;
	  }
	  public void setDesafiado(Lutador dd){
		  this.desafiado = dd;
	  }
	  
	  public Lutador getDesafiante(){
		  return this.desafiante;
	  }
	  public void setDesafiante(Lutador dt){
		  this.desafiante = dt;
	  }
	  
	  public int getRounds(){
		  return this.rounds;
	  }
	  public void setRounds(int r){
		  this.rounds = r;
	  }
	  
	  //Metodos especias
	  public void marcarLuta(Lutador l1, Lutador l2, int rd){
		  if(l1 != l2 && l1.getCategoria().equals(l2.getCategoria())){
				  this.aprovada = true;
				  this.desafiado = l1;
		          this.desafiante = l2;
		          this.rounds = rd;
			  }else{
				  this.aprovada = false;
				  this.desafiado = null;
				  this.desafiante = null;
				  System.out.println("A luta nao pode acontecer, porque o personagem e o mesmo ou a categoria dos participantes sao diferentes");
			  }
		  }
	  
	  public void Lutar(){
		  if(this.aprovada){
			  this.desafiado.apresentacao();
			  this.desafiante.apresentacao();
			  
			  Random aleatorio = new Random();
			  int vencedor = aleatorio.nextInt(3);
			  
			  System.out.println("[Resultados da luta]");
			  switch(vencedor){
				  case 0:
				  System.out.println("Luta impatada");
				  this.desafiado.impataLuta();
				  this.desafiante.impataLuta();
				  break;
				  
				  case 1:
				  System.out.println("Vitoria do: " +this.desafiado);
				  this.desafiado.ganhaLuta();
				  this.desafiante.perdeLuta();
				  break;
				  
				  case 2:
				  System.out.println("Vitoria de: " +this.desafiante);
				  this.desafiado.perdeLuta();
				  this.desafiante.ganhaLuta();
				  break;
				  
			  }
				  
			  }else{
				  System.out.println("A luta nao pode acontecer porque nao foi aprovada.");
			  }
			  
		  }
	  
	  
  }