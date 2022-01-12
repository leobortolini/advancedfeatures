package concorrencia.threads;

public class ThreadNaoSincronizada extends Thread {
	private boolean ascendente;
	private String texto;

	public ThreadNaoSincronizada(boolean mult, String texto) {
		this.ascendente = mult;
		this.texto = texto;
	}

	@Override
	public void run() {
		if (ascendente) {
			for (int x = 0; x < 10; x++) {
				System.out.println(x + " " + texto);
			}
		} else {
			for (int x = 10; x >= 0; x--) {
				System.out.println(x + " " + texto);
			}
		}
	}
}
