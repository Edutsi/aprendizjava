package petshop;

public class Cliente {
	private static int idCliente =0;
	private String nome;
	private String telefone;
	private String email;
	/*tirei a var troco para teste curso de GIT*/
	private String teste;///exer git
	///private double troco;
	private double quantiaPaga;
	
	//conceito de Composição , todo cliente tem um pet.
			private Pet pet = new Pet();
	
	public Pet getPet() {
				return pet;
			}
			public void setPet(Pet pet) {
				this.pet = pet;
			}
	public double getTroco() {
		return troco;
	}
	public void setTroco(double troco) {
		this.troco = troco;
	}
	public double getQuantiaPaga() {
		return quantiaPaga;
	}
	public void setQuantiaPaga(double quantiaPaga) {
		this.quantiaPaga = quantiaPaga;
	}
	public int getIdCliente() {
		return idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void gerarid() {  ///add um ID para cada cliente
		
        idCliente++;  
    }  
}
