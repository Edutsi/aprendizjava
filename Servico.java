package petshop;

public class Servico {
	//private int IdCliente;
	private String nomeServico;
	private double precoServico;
	private int duracaoServico;
	//private int clienteIdCliente;
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public double getPrecoServico() {
		return precoServico;
	}
	public void setPrecoServico(double precoServico) {
		this.precoServico = precoServico;
	}
	public int getDuracaoServico() {
		return duracaoServico;
	}
	public void setDuracaoServico(int duracaoServico) {
		this.duracaoServico = duracaoServico;
	}

}
