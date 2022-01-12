package concorrencia.threads;

public class InterfaceThread implements Runnable {
	
	public InterfaceThread() {
	}
	
	@Override
	public void run() {
		System.out.println("Thread que implementa a interface runnable");
	}

}
