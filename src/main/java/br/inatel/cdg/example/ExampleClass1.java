package br.inatel.cdg.example;

import br.inatel.cdg.annotation.reading.NumberToSum;

//Você deverá criar a @NumberToSum como parte da solução
public class ExampleClass1 {

	@NumberToSum(1)
	private int field1;
	
	@NumberToSum(2)
	private int field2;
	
	@NumberToSum(3)
	private int field3;
	
	public void method1() {
		System.out.println("Example Class 1");
	}
	
}