package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.NumberToSum;

//Você deverá criar a @NumberToSum como parte da solução
public class ExampleClass2 {

	@NumberToSum(4)
	private int field4;
	
	@NumberToSum(5)
	private int field5;
	
	@NumberToSum(6)
	public void method2() {
		System.out.println("Example Method With Annotation");
	}
	
	public void method3() {
		System.out.println("Example Method Without Annotation");
	}
	
}