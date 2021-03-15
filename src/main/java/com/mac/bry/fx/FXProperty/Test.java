package com.mac.bry.fx.FXProperty;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		
		person.nameProperty().set("Maciej");
		person.ageProperty().set(37);
		
		String name = person.getName();
		int age = person.getAge();
		
		print(name, age);
		
		name = person.nameProperty().get();
		age = person.ageProperty().get();
		
		print(name, age);
		
		
	}

	protected static void print(String name, int age) {
		System.out.println(name + " " + age);
	}

}
