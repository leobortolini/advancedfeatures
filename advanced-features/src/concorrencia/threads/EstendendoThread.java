package concorrencia.threads;

public class EstendendoThread extends Thread {
	
	public EstendendoThread() {
	}

	@Override
	public void run() {
		System.out.println("Thread que estende a classe thread");
	}
}
