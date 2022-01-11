package reflection.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class ReflectionUtils {

	// retorna as exceções que o método pode lançar
	public static Class<?>[] getMethodExceptions(Method metodo) {
		List.of(metodo.getExceptionTypes()).stream().forEach(ex -> System.out.println(ex));

		return metodo.getExceptionTypes();
	}

	// retorna os parametros do metodo
	public static Class<?>[] getMethodParams(Method metodo) {
		List.of(metodo.getParameterTypes()).stream().forEach(param -> System.out.println());

		return metodo.getParameterTypes();
	}

	// retorna os métodos da classe
	public static List<Method> getClassMethods(String completeName) throws ClassNotFoundException {
		List<Method> metodos = List.of(Class.forName(completeName).getMethods());

		metodos.stream().forEach(metodo -> System.out.println(metodo));

		return metodos;
	}

	// retorna os métodos declarados da classe
	public static List<Method> getClassDeclaredMethods(String completeName) throws ClassNotFoundException {
		List<Method> metodos = List.of(Class.forName(completeName).getDeclaredMethods());

		metodos.stream().forEach(metodo -> System.out.println(metodo));

		return metodos;
	}

	// retorna os campos da classe
	public static List<Field> getClassFields(String completeName) throws ClassNotFoundException {
		List<Field> fields = List.of(Class.forName(completeName).getFields());

		fields.stream().forEach(campo -> System.out.println(campo));

		return fields;
	}

	// retorna os campos declarados da classe
	public static List<Field> getClassDeclaredFields(String completeName) throws ClassNotFoundException {
		List<Field> fields = List.of(Class.forName(completeName).getDeclaredFields());

		fields.stream().forEach(campo -> System.out.println(campo));

		return fields;
	}

	public static Object invokeMethod(Object objeto, String nomeMetodo)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, 
			ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> classe = objeto.getClass();
		
		Method metodo = classe.getMethod(nomeMetodo);
		Object resultado = metodo.invoke(objeto);

		System.out.println(resultado);
		
		return resultado;
	}

}
