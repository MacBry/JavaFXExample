package com.mac.bry.fx.FXProperty;

import java.io.Serializable;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5610173722518131881L;
	
	private final StringProperty name = new SimpleStringProperty(this, "name", "NN");
	
	private final IntegerProperty age = new SimpleIntegerProperty(this, "age");
	
	public final StringProperty nameProperty () {
		return name;
	}
	
	public final IntegerProperty ageProperty () {
		return age;
	}

	public String getName() {
		return name.get();
	}

	public int getAge() {
		return age.get();
	}
	
	
	
}
	
