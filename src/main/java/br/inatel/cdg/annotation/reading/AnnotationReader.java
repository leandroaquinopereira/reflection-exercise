package br.inatel.cdg.annotation.reading;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//Nessa classe você deverá implementar a sua solução
//Adicionalmente você também deverá criar
//a anotação NumberToSum como parte da solução

public class AnnotationReader<T> {
	
	private Class<?> clazz;
	private List<Integer> value;
	int sm = 0;

	public AnnotationReader(Class<?> clazz) {
		this.clazz = clazz;
		value  = new ArrayList<Integer>();
	}

	public void readAnnotations() {
		for(Field field: clazz.getDeclaredFields()) {
			if(field.isAnnotationPresent(NumberToSum.class)) {			
				value.add(field.getAnnotation(NumberToSum.class).value());
			}
		}
		for(Method  method : clazz.getDeclaredMethods()){
			if (method.isAnnotationPresent(NumberToSum.class)) {
				value.add(method.getAnnotation(NumberToSum.class).value());
	        }
		}
	}
	
	public int getTotalSum() {
		for (int i = 0; i < value.size(); i++) {
			sm = sm + value.get(i);
		}
		return sm;
	}

}