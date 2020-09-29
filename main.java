//Diogenes Pereira      RA: 107675
//Giovanna Santos           106089
//Isabella Cainélles        107414
//João Romário              107472
//Matheus Grillo            107390

public class main {

	public static void main(String[] args) {
		 // Jogador.java
		Jogador j1 = new Jogador("Marcelo Augusto David", "coldzera", 12000);
		
		Jogador j2 = new Jogador("Epitácio Pessoa de Melo Filho","Taco", 10000);
		Jogador j3 = new Jogador("Gabriel Toledo de Alcântara Sguario","Fallen", 20000);
		Jogador j4 = new Jogador("Fernando Alvarenga","FER", 10000);
		Jogador j5 = new Jogador("Lincoln Lau","FnX 22naregua", 30000);
		
		Jogador j6 = new Jogador("Russel David Van Dulken", "Twistzz", 7000);
		Jogador j7 = new Jogador("Christopher Alesund","GeT_RiGhT", 10000);
		Jogador j8 = new Jogador("Nicolai Hvilshøj Reedtz","Dev1ce", 10000);
		Jogador j9 = new Jogador("Oleksandr Kostyliev","S1mple", 10000);
		Jogador j10 = new Jogador("Mathieu Herbaut","ZywOo", 6000);
		
		
		//Time.java
		
		Jogador vetor_jogadores1[] = {j1, j2, j3,j4,j5};
		Jogador vetor_jogadores2[] = {j6, j7, j8,j9,j10};
		
		Time t1 = new Time("SAFADO'S Team", vetor_jogadores2);
		Time t2 = new Time("DreamTeam", vetor_jogadores1);
		
		 // partida.java
		
		
		Partida p1 = new Partida();
		p1.setQtd_rodada(18);
		p1.setTempo(27.12);
		p1.setPontos_t1(2);
		p1.setPontos_t2(16);
		
		p1.setTime1(t1);
		p1.setTime2(t2);
		p1.defineVencedor();
		
		Partida p2 = new Partida();
		p2.setQtd_rodada(14);
		p2.setTempo(16.10);
		p2.setPontos_t1(1);
		p2.setPontos_t2(16);
		
		p2.setTime1(t1);
		p2.setTime2(t2);
		p2.defineVencedor();
		
		
		Partida p3 = new Partida();
		p3.setQtd_rodada(12);
		p3.setTempo(40.20);
		p3.setPontos_t1(16);
		p3.setPontos_t2(10);
		
		p3.setTime1(t1);
		p3.setTime2(t2);
		p3.defineVencedor();
		
		
		Partida vetor_partida[] = {p1, p2, p3};
		
		
		
		// item.java	
		
		Item Tr = new Item("AK-47", "$2.700", "30/90", "Terrorista", "Dano alto, rifle principal");
		Tr.imprimirItem();
		
		System.out.println("------------------------------");	
		
		Item Ct = new Item("AUG", "$3.300", "30/90", "Contra Terrorista", "Dano alto, rifle com lente de precisão");
		Ct.imprimirItem();
		
		System.out.println("------------------------------");	
		
		Item Any = new Item("Desert-Eagle", "$700,00", "7/35", "Ambas as Equipes", "Dano alto, pistola de eco");
		Any.imprimirItem();
		
		System.out.println("------------------------------");//campeonato.java
		
		
		Campeonato camp = new Campeonato ("Eleague Major 2017", "Atlanta, Geórgia, EUA", "22 de janeiro - 29 de janeiro de 2017", "$1.000.000", 1, vetor_partida);
		camp.imprimirCampeonato();
	}
}