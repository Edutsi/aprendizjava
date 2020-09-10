package petshop;

public class Caixa {
	public static final double VALOR_DO_SERVICO = 20.00;
	private double valorEmCaixa;
	private boolean caixaFechado;
	
	public void fecharCaixa() {
		System.out.println("O dono do lava jato recebeu : " + valorEmCaixa);
		caixaFechado = true;
	}

	public double getValorEmCaixa() {
		return valorEmCaixa;
	}

	public void setValorEmCaixa(double valorEmCaixa) {
		this.valorEmCaixa = valorEmCaixa;
	}

	public boolean isCaixaFechado() {
		return caixaFechado;
	}

	public void setCaixaFechado(boolean caixaFechado) {
		this.caixaFechado = caixaFechado;
	}
}
