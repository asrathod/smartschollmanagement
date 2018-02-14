package com.smartschool.examples;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class MyClass2 implements Interface3 {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	private static boolean isPrime(int number) {
		IntPredicate isDivisible = index -> number % index == 0;
		
		return number > 1
				&& IntStream.range(2, number).noneMatch(
						isDivisible);
	}
	
	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate){
		return numbers.parallelStream()
				.filter(predicate)
				.mapToInt(i -> i)
				.sum();
		
	}
	
//	sumWithCondition(numbers, n -> true)
	
	public static void main(String args[]){
		MyClass2 obj = new MyClass2();
		obj.print("");
		obj.isNull("abc");
	}
}
