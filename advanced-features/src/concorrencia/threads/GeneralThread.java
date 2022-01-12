package concorrencia.threads;

public class GeneralThread {

	public GeneralThread() {
	}

	public static void generalThread(int i, String texto) {
		new Thread() {
			@Override
			public void run() {
				for(int x = 0; x < i; x++) {
					System.out.println(texto);
				}
			}
		}.start();
	}
}
