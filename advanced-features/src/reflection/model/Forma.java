package reflection.model;

import java.awt.Color;

public class Forma {
	protected String nome;
	protected Color cor;
	
	protected Forma(String nome, Color cor) {
		this.nome = nome;
		this.cor = cor;
	}

	protected Forma() {
		
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected Color getCor() {
		return cor;
	}

	protected void setCor(Color cor) {
		this.cor = cor;
	}
	
	public void metodoPublicoGenerico() {
		
	}
}
