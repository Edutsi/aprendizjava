package petshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePetshop {
	List<Usuario> usuarios = new ArrayList<Usuario>();
	List<Produto> produtos = new ArrayList<Produto>();
	List<Cliente> clientes = new ArrayList<Cliente>();
	Caixa caixa = new Caixa();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TestePetshop petshop = new TestePetshop();
		// Usuario usuarios = new Usuario();
		// Produto produtos = new Produto();
		int op = petshop.constroiMenu();
		Produto produto1 = new Produto();
		produto1.setIdProduto(1);
		produto1.setNomeProduto("Shampo CATSHOW");
		produto1.setTipoProduto("Shampo de gato");
		produto1.setMarcaProduto("doguinho");
		produto1.setCaracProduto("500ml");
		produto1.setPrecoProduto(15);
		petshop.addProduto(produto1);
		///
		Produto produto2 = new Produto();
		produto2.setIdProduto(2);
		produto2.setNomeProduto("Shampo DOGÃO");
		produto2.setTipoProduto("Shampo de cachorro");
		produto2.setMarcaProduto("doguinho");
		produto2.setCaracProduto("1000ml");
		produto2.setPrecoProduto(25);
		petshop.addProduto(produto2);
		Produto produto3 = new Produto();
		produto3.setIdProduto(3);
		produto3.setNomeProduto("Sabonete Gato blue");
		produto3.setTipoProduto("Sabonete liquido");
		produto3.setMarcaProduto("doguinho");
		produto3.setCaracProduto("100ml");
		produto3.setPrecoProduto(8);
		petshop.addProduto(produto3);
		Produto produto4 = new Produto();
		produto4.setIdProduto(4);
		produto4.setNomeProduto("Sabonete doguinho caramelo");
		produto4.setTipoProduto("Sabonete em barra");
		produto4.setMarcaProduto("doguinho");
		produto4.setCaracProduto("90g");
		produto4.setPrecoProduto(3);
		petshop.addProduto(produto4);

		while (op != 0) {
			if (op == 1) {
				System.out.println("Cadastro de Gerente:\n ");
				System.out.println("Nome do Gerente:");
				String nome = scan.next();
				System.out.println("Senha do Gerente:");
				String senha = scan.next();
				Gerente gerente = new Gerente();
				gerente.setNomeUsuario(nome);
				gerente.setSenha(senha);
				petshop.addFuncionario(gerente);
				petshop.constroiMenu();
			} else if (op == 2) {
				System.out.println("Informe o NOME do atendente: ");
				String nomeUsuario = scan.next();
				System.out.println("Informe a SENHA do atendente: ");
				String senha = scan.next();
				Atendente atendente = new Atendente(nomeUsuario, petshop.caixa);
				atendente.setNomeUsuario(nomeUsuario);

				atendente.setSenha(senha);
				petshop.addFuncionario(atendente);
				petshop.constroiMenu();

			} else if (op == 3) {
				// cadastro de cliente
				System.out.println("Nome do cliente:");
				String nomeCliente = scan.next();
				System.out.println("Telefone do cliente:");
				String telefone = scan.next();
				System.out.println("E-mail do cliente:");
				String email = scan.next();
				Cliente cliente = new Cliente();
				cliente.gerarid();// tentando incrementar ID
				cliente.setNome(nomeCliente);
				cliente.setTelefone(telefone);
				cliente.setEmail(email);
				petshop.addCliente(cliente);
				petshop.listarClientes();
				petshop.constroiMenu();
				System.out.println("\n");
			} else if (op == 4) {
				petshop.listarFuncionarios();

			} else if (op == 5) {
				System.out.println("Informe o nome do usuário a ser removido: ");
				String nomeUsuario = scan.next();
				petshop.removeFuncionario(nomeUsuario);
				;

			} else if (op == 6) {
				petshop.listarProdutos();

				/// implantar a compra do produto

				int idProduto;
				double valorDaCompra;/// variavel para receber o valor total da compra
				double valorParcial1 = 0;// somente pra teste, mudar depois
				double valorParcial2 = 0;// somente pra teste, mudar depois
				double valorParcial3 = 0;// somente pra teste, mudar depois
				System.out.println("Compra do cliente Digite 0 para finalizar a compra\n");
				System.out.println("Informar o codigo  do produto: ");// parei aqui 20/08 ligar o id ao nome do
				// produto
				idProduto = scan.nextInt();
				System.out.println("Informar a quantidade de ");
				int qtdProduto = scan.nextInt();
				while (idProduto != 0) {
					// System.out.println("Informe o nome do cliente: ");
					// String nome = scan.next();
					// Produto produto = new Produto();
					// produto.getIdProduto();
					if (idProduto == 1) {// depois usar o iterator para melhorar o codigo
						System.out.println("\nPreço da unidade: " + produto1.getPrecoProduto());
						valorParcial1 = produto1.getPrecoProduto() * qtdProduto;
						System.out.println("valor parcial: " + valorParcial1);
						petshop.constroiMenu();

					} else if (idProduto == 2) {
						System.out.println("\nPreço da unidade: " + produto2.getPrecoProduto());
						valorParcial2 = produto2.getPrecoProduto() * qtdProduto;
						System.out.println("valor parcial: " + valorParcial2);
						petshop.constroiMenu();

					} else if (idProduto == 3) {
						System.out.println("\nPreço da unidade: " + produto3.getPrecoProduto());
						valorParcial3 = produto2.getPrecoProduto() * qtdProduto;
						System.out.println("valor parcial: " + valorParcial3);
						petshop.constroiMenu();

					}else if (op == 7) {
						//OP 7- Agendar Serviços.
						//0 -verificar horarios disponíveis
						//1 -escolher o horario
						
						//1 - pegar usuário pelo ID e alocar no horario
						//2 - informar se é tosa e/ou banho e somar ao total
						//3- 
						Cliente cliente = new Cliente();
						System.out.println("Informe o ID do usuario: ");
						int idCliente = scan.nextInt();
						//if(){}
						
						
						
						
						
					} // fim do else if
						// valorDaCompra = valorParcial1+valorParcial2+valorParcial3;
						// System.out.println("valor total: "+valorDaCompra);

				}//while da op 7
				op = petshop.constroiMenu();
			} // while do menu maior

		} // else do opcao 6

	}// fim do main

	public void listarProdutos() {
		System.out.println("LISTA DE PRODUTOS");
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println("------------------------------");
			System.out.println(produtos.get(i).getIdProduto() + " -" + produtos.get(i).getNomeProduto());
			System.out.println("TIPO: " + produtos.get(i).getTipoProduto());
			System.out.println("MARCA: " + produtos.get(i).getMarcaProduto());
			System.out.println("CARACTERISTICA: " + produtos.get(i).getCaracProduto());
			System.out.println("PREÇO: R$" + produtos.get(i).getPrecoProduto());
			System.out.println("------------------------------");
		}

	}

	public void listarFuncionarios() {
		System.out.println("LISTA DE FUNCIONARIOS");
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println("------------------------------");
			System.out.println(usuarios.get(i).getNomeUsuario());
			System.out.println("------------------------------");
		}
	}

	public void listarClientes() {
		System.out.println("LISTA DE CLIENTES");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println("------------------------------");
			System.out.println("Identificador:" + clientes.get(i).getIdCliente());
			System.out.println("Nome: " + clientes.get(i).getNome());
			System.out.println("Telefone: " + clientes.get(i).getTelefone());
			System.out.println("E-mail: " + clientes.get(i).getEmail());
			System.out.println("------------------------------");
		}
	}

	public void addProduto(Produto produto) {
		produtos.add(produto);
	}

	public void addFuncionario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void removeFuncionario(String nomeUsuario) {

		// Removendo P:
		for (int i = 0; i < usuarios.size(); i++) {
			Usuario p = usuarios.get(i);

			if (p.getNomeUsuario().equals(nomeUsuario)) {
				// Encontrou uma pessoa cadastrada com nome "Pedro".

				// Remove.
				usuarios.remove(p);

				// Sai do loop.
				break;
			}
		}

		System.out.print("Pessoas cadastradas após remoção:\n");
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.print(usuarios.get(i).getNomeUsuario() + "\n");
		}

		usuarios.remove(nomeUsuario);
	}

	public double realizarCompra() {
		return 0;// metodo consultarCLiente alterado
		// instancia de interator para percorrer toda a lista

	}

	private int constroiMenu() {
		System.out.println("1- Cadastrar Gerente.");
		System.out.println("2- Cadastrar Atendente.");
		System.out.println("3- Cadastrar Cliente.");
		System.out.println("4- Listar funcionarios.");
		System.out.println("5- Remover usuario.");
		System.out.println("6- Comprar produtos.");
		System.out.println("7- Agendar Serviços.");
		System.out.println("0- Sair.");
		return new Scanner(System.in).nextInt();
	}

}
