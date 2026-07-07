
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//metodo, fazer algo
	void Status(){
		System.out.println("Uma caneta " + this.cor);
		 if (this.tampada == false){
			 System.out.println("A caneta Esta Aberta");
		 }else{
			 System.out.println("A caneta Esta Fechada");
		 }
		 System.out.println("A caneta E do bico: " +this.ponta);
		
	}
	void rabiscar(){
		if(this.tampada == true){
			System.out.println("Erro, nao posso Rabiscar");
		}else{
			System.out.println("Rabiscando");
		}
	}
	void tampar(){
		this.tampada = true;
	}
	void destampada(){
		this.tampada = false;
	}
}