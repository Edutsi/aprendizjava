package petshop;

import java.util.ArrayList;

public class Usuario {
	int idUsuario;/// para fins didaticos vai substituir o cpf
	String nomeUsuario;
	String senha;
	private boolean logado = false;

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String CadastraUsuario() {
		ArrayList<String> usuarios = new ArrayList<String>();
		System.out.println("Informe o NOME do Usuário: "+ usuarios.add(nomeUsuario));
		System.out.println("Informe uma SENHA para o Usuário: "+ usuarios.add(senha));
		System.out.println(nomeUsuario.toString());
		System.out.println(senha.toString());
		idUsuario++;

		return nomeUsuario;

	}

}
