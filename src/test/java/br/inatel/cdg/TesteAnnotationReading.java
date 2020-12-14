package br.inatel.cdg;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import br.inatel.cdg.annotation.reading.AnnotationReader;
import br.inatel.cdg.example.ExampleClass1;
import br.inatel.cdg.example.ExampleClass2;

//Utilize essa classe de testes para guiar sua solução!
public class TesteAnnotationReading {

	@Test
	public void testeExemploClass1() {
		
		AnnotationReader aReader = 
				new AnnotationReader(ExampleClass1.class);
		
		aReader.readAnnotations();
		
		int totalSum = aReader.getTotalSum();
		
		assertEquals(6, totalSum);
	}
	
	@Test
	public void testeExemploClass2() {
		AnnotationReader aReader = 
				new AnnotationReader(ExampleClass2.class);
		
		aReader.readAnnotations();
		
		int totalSum = aReader.getTotalSum();
		
		assertEquals(15, totalSum);
	}
}