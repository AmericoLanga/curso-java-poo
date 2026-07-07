
 public class Livro implements Publicacao{
	 
	 //Atributos
	 private String titulo;
	 private String autor;
	 private int totPaginas;
	 private int pagAtual;
	 private boolean aberto;
	 private Pessoa leitor;
	 
	 //
	 public Livro(String t, String au, int totP){
		 this.titulo = t;
		 this.autor = au;
		 this.totPaginas = totP;
		// this.pagAtual = at;
		// this.aberto = ab;
		// this.leitor = l;
	 }
	 
	 
	 
	 
	 
	 //metodos especias
	 public String getTitulo(){
		 return this.titulo;
	 }
	 public void setTitulo(String t){
		 this.titulo = t;
	 }
	 
	 public String getAultor(){
		 return this.autor;
	 }
	 public void setAutor(String au){
		 this.autor = au;
	 }
	 
	 public int getTotPaginas(){
		 return this.totPaginas;
	 }
	 public void setTotPaginas(int tot){
		 this.totPaginas = tot;
	 }
	 
	 public int getPagAtual(){
		 return this.pagAtual;
	 }
	 public void setPagAtual(int at){
		 this.pagAtual = at;
	 }
	 
	 public boolean getAberto(){
		 return this.aberto;
	 }
	 public void setAberto(boolean ab){
		 this.aberto = ab;
	 }
	 
	 public Pessoa getLeitor(){
		 return this.leitor;
	 }
	 public void setLeitor(Pessoa p){
		 this.leitor = p;
	 }
	 
	 
	 //Metodos principais 
	 
	 public void abrir(){
		 this.aberto = true;
		 this.pagAtual = 0;
	 }
	  public void fechar(){
		 this.aberto = false;
		 this.pagAtual = 0;
	 }
	  public void folhear(int nf){
		if(this.pagAtual == 0 && nf > 0 && nf <= totPaginas){
			this.pagAtual = nf;
		}else{
			System.out.println("Impossivel Folhear, a pagina nao existe!");
			System.out.println();
			this.pagAtual = 0;
		}
	 }
	 
	  public void avancarPag(){
		 this.pagAtual = this.pagAtual + 1;
	 }
	  public void voltarPag(){
		 this.pagAtual = this.pagAtual - 1;
	 }
	 
	 
	 public void detalhes(){
		System.out.println("Detalhes");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " +this.autor);
        System.out.println("Total de Paginas: " +this.totPaginas);		
		System.out.println("Leitor: " +this.leitor.getNome());
		System.out.println("Pagina actual: " +this.pagAtual);
	 }
 }