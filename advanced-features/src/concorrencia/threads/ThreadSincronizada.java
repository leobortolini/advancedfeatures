package concorrencia.threads;

public class ThreadSincronizada extends Thread {
	private boolean ascendente;
	private String texto;

	public ThreadSincronizada(boolean mult, String texto) {
		this.ascendente = mult;
		this.texto = texto;
	}

	@Override
	public void run() {
		synchronized (texto) {
			if (ascendente) {
				for(int x = 0; x < 10; x++) {
					System.out.println(x + " " + texto);
				}
			} else {
				for(int x = 10; x >= 0; x--) {
					System.out.println(x + " " + texto);
				}
			}
		}
	}
}
