
public class Jogador {
	
	private String nome;
	private String nick;
	private float salario;
	
	public Jogador(String nome, String nick, float salario)
	{
		this.nome = nome;
		this.nick = nick;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	public void imprimirJogador()
	{
		System.out.println("------------------------------");
		System.out.println("Nome do jogador: "+this.nome);
		
		System.out.println("Nickname: "+this.nick);
		
		System.out.println("Salário: "+this.salario);
		System.out.println("------------------------------");
		
	}
}
