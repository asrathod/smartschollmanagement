package com.smartschool.examples;

public interface Interface3 {
	
	default void print(String str){
		if(!isNull(str)){
			System.out.println("MyData Print::" + str);
		}
	}

	
	//static boolean isNull(String str)
	 default boolean isNull(String str){
		 System.out.println("Interface Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}
}
