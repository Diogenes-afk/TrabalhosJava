public class Time {
	
	private String nome;
	private Jogador jogador[];
	
	public Time(String nome, Jogador jogador[])
	{
		this.setNome(nome);
		this.jogador = jogador;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirTime()
	{
		System.out.println("------------------------------");
		System.out.println("Nome do time: "+this.nome);
		for(int i = 0; i < jogador.length; i++) {
			this.jogador[i].imprimirJogador();
		}
		System.out.println("------------------------------");
	}
}
