
public class Item {

		private String nome;
		private String pre�o;
		private String muni��o;
		private String lado;
		private String descri��o;
		
		
		public Item(String nome, String pre�o, String muni��o, String lado, String descri��o) {

			this.nome = nome;
			this.pre�o = pre�o;
			this.muni��o = muni��o;
			this.lado = lado;
			this.descri��o = descri��o;
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getPre�o() {
			return pre�o;
		}
		public void setPre�o(String pre�o) {
			this.pre�o = pre�o;
		}
		public String getMuni��o() {
			return muni��o;
		}
		public void setMuni��o(String muni��o) {
			this.muni��o = muni��o;
		}
		public String getLado() {
			return lado;
		}
		public void setLado(String lado) {
			this.lado = lado;
		}
		public String getDescri��o() {
			return descri��o;
		}
		public void setDescri��o(String descri��o) {
			this.descri��o = descri��o;
		}
		
		
		public void imprimirItem()
		{
			System.out.println("------------------------------");
			System.out.println("Nome do item: "+this.nome);
			System.out.println("Pre�o: "+this.pre�o);
			System.out.println("Muni��o: "+this.muni��o);
			System.out.println("Lado do item: "+this.lado);
			System.out.println("Descri��o: "+this.descri��o);
			System.out.println("------------------------------");
		}
}