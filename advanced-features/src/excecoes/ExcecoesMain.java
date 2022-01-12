package excecoes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import reflection.utils.ReflectionUtils;

public class ExcecoesMain {

	public static void main(String[] args) {
		String[] textos = { "a", "b" };
		try {
			System.out.println(textos[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("Exceção index fora das bordas");
		}

		try {
			float x = 1 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exceção aritmetica");
		}
		
		checkedNunchecked();
		callReflection();
	}

	public static void callReflection() {
		try {
			ReflectionUtils.invokeMethod(null, null);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public static void checkedNunchecked() {
		BufferedWriter bw = null; 
		
		try {
			bw.write("Tentando escrever enquando meu writer é nulo");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Erro de nullpointer");
		}
	}
}
