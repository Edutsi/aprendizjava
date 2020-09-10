package petshop;

import java.util.Scanner;

public class Atendente extends Usuario{
private Caixa caixa;
	
	
	public Atendente(String nome, Caixa caixa){
		setNomeUsuario(nome);
		this.caixa = caixa;
	}
	
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	//Método para receber pagamento
	public void receberPagamentoDoCliente(Cliente cliente){
		System.out.println("Informe o valor recebido:");
		//Criando uma variavel para receber o valor recebido.
		double valor = new Scanner(System.in).nextDouble();

		while (valor<Caixa.VALOR_DO_SERVICO){
			System.out.println("Valor recebido menor que o valor do serviço!");
			System.out.println("Informe o valor recebido maior que o valor do serviço!");
			valor = new Scanner(System.in).nextDouble();
		}
		if(valor>Caixa.VALOR_DO_SERVICO){
			cliente.setTroco(valor-Caixa.VALOR_DO_SERVICO);
		}else{
			
		}
		System.out.println("O troco é de R$"+cliente.getTroco());
	}

	public Caixa getCaixa() {
		return caixa;
	}

}
