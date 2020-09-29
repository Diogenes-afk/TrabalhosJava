
public class Partida {
	
	private int qtd_rodada;
	private double tempo;
	private int pontos_t1;
	private int pontos_t2;
	private Time time1;
	private Time time2;
	private Item item[];
	
	public Partida()
	{
		
	}
	
	public int getQtd_rodada() {
		return qtd_rodada;
	}
	public void setQtd_rodada(int qtd_rodada) {
		this.qtd_rodada = qtd_rodada;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public int getPontos_t1() {
		return pontos_t1;
	}
	public void setPontos_t1(int pontos_t1) {
		this.pontos_t1 = pontos_t1;
	}
	public int getPontos_t2() {
		return pontos_t2;
	}
	public void setPontos_t2(int pontos_t2) {
		this.pontos_t2 = pontos_t2;
	}
	
	
	public void defineVencedor()
	{
		if(this.pontos_t1 > this.pontos_t2)
		{
			System.out.println("Time vencedor: "+ this.getTime1().getNome());
		}
		else
		{
			System.out.println("Time vencedor: "+ this.getTime2().getNome());
		}
	}
	
	public void imprimirPartida()
	{
		System.out.println("------------------------------");
		System.out.println("Times participantes: ");
		this.getTime1().imprimirTime();
		this.getTime2().imprimirTime();
		System.out.println("------------------------");
		System.out.println("Quantidade de rodadas: "+this.qtd_rodada);
		System.out.println("Tempo da partida: "+this.tempo);
		System.out.println("Pontuação do time "+this.getTime1().getNome() +" : "+this.pontos_t1);
		System.out.println("Pontuação do time "+this.getTime2().getNome() +" : "+this.pontos_t2);
		System.out.println("------------------------");
		}

	public Time getTime1() {
		return time1;
	}

	public void setTime1(Time time1) {
		this.time1 = time1;
	}

	public Time getTime2() {
		return time2;
	}

	public void setTime2(Time time2) {
		this.time2 = time2;
	}
	
	
	
	
	
}