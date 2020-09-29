

public class Campeonato {
	
	private String nome;
	private String local;
	private String data;
	private Partida partida[];
	private String premio;
	private int ranking;
	
	public Campeonato (String nome, String local, String data, String premio, int ranking, Partida partida[]) {
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.premio = premio;
		this.ranking = ranking;
		this.partida = partida;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Partida[] getPartida() {
		return partida;
	}
	public void setPartida(Partida partida[]) {
		this.partida = partida;
	}
	public String getPremio() {
		return premio;
	}
	public void setPremio(String premio) {
		this.premio = premio;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void imprimirCampeonato()
	{
		System.out.println("------------------------------");
		System.out.println("Nome do Campeonato: "+this.nome);
		System.out.println("Local: "+this.local);
		System.out.println("Data: "+this.data);
		for(int i = 0; i < partida.length; i++) {
			this.partida[i].imprimirPartida();
		}
		System.out.println("------------------------");
		System.out.println("Prêmio: "+this.premio);
		System.out.println("Ranking: "+this.ranking);
		System.out.println("------------------------------");
	}
	
}

