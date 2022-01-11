package reflection;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;

import reflection.model.Triangulo;
import reflection.utils.ReflectionUtils;

public class ReflectionMain {

	public static void main(String[] args) {
		
		
		try {
			String classe = "reflection.model.Triangulo";
			
			System.out.println("getClassMethods");
			ReflectionUtils.getClassMethods(classe);
			
			System.out.println("\ngetClassDeclaredMethods");
			ReflectionUtils.getClassDeclaredMethods(classe);
			
			System.out.println("\ngetClassFields");
			ReflectionUtils.getClassFields(classe);
			
			System.out.println("\ngetClassDeclaredFields");
			ReflectionUtils.getClassDeclaredFields(classe);
			
			Triangulo t1 = new Triangulo("Primeiro triangulo", Color.BLACK, 3.0, 4.0, 5.0);
			System.out.println("\ncallingMethod");
			ReflectionUtils.invokeMethod(t1, "getLado3");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
