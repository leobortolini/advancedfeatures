package concorrencia;

import concorrencia.threads.EstendendoThread;
import concorrencia.threads.GeneralThread;
import concorrencia.threads.InterfaceThread;
import concorrencia.threads.ThreadNaoSincronizada;
import concorrencia.threads.ThreadSincronizada;

public class ConcorrenciaMain {
	public static void main(String[] args) {
		example1();
		example2();
		example3();
		example4();
	}
	
	public static void example3() {
		String x = "texto";
		
		ThreadSincronizada t1 = new ThreadSincronizada(true, x);
		ThreadSincronizada t2 = new ThreadSincronizada(false, x);
		
		t1.start();
		t2.start();
	}
	
	public static void example4() {
		String x = "texto";
		
		ThreadNaoSincronizada t1 = new ThreadNaoSincronizada(true, x);
		ThreadNaoSincronizada t2 = new ThreadNaoSincronizada(false, x);
		
		t1.start();
		t2.start();
	}
	
	public static void example1() {
		Thread t1 = new Thread(new InterfaceThread());
		EstendendoThread t2 = new EstendendoThread();
		
		t1.start();
		t2.start();
	}
	
	public static void example2() {
		GeneralThread.generalThread(5, "Primeiro");
		GeneralThread.generalThread(5, "Segundo");
		GeneralThread.generalThread(5, "Terceiro");
		GeneralThread.generalThread(5, "Quarto");
	}
}
