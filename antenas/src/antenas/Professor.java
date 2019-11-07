package antenas;

public class Professor {
	private String email;
	private String senha;
	
	public Professor(DadosLogin login) {
		this.email = login.getEmail();
		this.senha = login.getSenha();
	}

	public String getEmail() {
		return this.email;
	}

	public String setEmail(String value) {
		return this.email = value;
	}

	public String getSenha() {
		return this.senha;
	}

	public String setSenha(String value) {
		return this.senha = value;
	}
}
