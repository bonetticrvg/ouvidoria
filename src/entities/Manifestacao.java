package entities;

public class Manifestacao {

	private Pessoa pessoa;
	private String mensagem;
	private String tipo;
	
	public Manifestacao(Pessoa pessoa, String mensagem, String tipo) {
		this.pessoa = pessoa;
		this.mensagem = mensagem;
		this.tipo = tipo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return mensagem;
	}
	
}
