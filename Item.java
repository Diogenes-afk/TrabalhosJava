
public class Item {

		private String nome;
		private String preço;
		private String munição;
		private String lado;
		private String descrição;
		
		
		public Item(String nome, String preço, String munição, String lado, String descrição) {

			this.nome = nome;
			this.preço = preço;
			this.munição = munição;
			this.lado = lado;
			this.descrição = descrição;
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getPreço() {
			return preço;
		}
		public void setPreço(String preço) {
			this.preço = preço;
		}
		public String getMunição() {
			return munição;
		}
		public void setMunição(String munição) {
			this.munição = munição;
		}
		public String getLado() {
			return lado;
		}
		public void setLado(String lado) {
			this.lado = lado;
		}
		public String getDescrição() {
			return descrição;
		}
		public void setDescrição(String descrição) {
			this.descrição = descrição;
		}
		
		
		public void imprimirItem()
		{
			System.out.println("------------------------------");
			System.out.println("Nome do item: "+this.nome);
			System.out.println("Preço: "+this.preço);
			System.out.println("Munição: "+this.munição);
			System.out.println("Lado do item: "+this.lado);
			System.out.println("Descrição: "+this.descrição);
			System.out.println("------------------------------");
		}
}