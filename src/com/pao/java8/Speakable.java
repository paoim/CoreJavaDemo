package com.pao.java8;

//@FunctionalInterface - compile time error because it has two methods: say and speak, cannot be Functional Interface
public interface Speakable extends Sayable {

	void speak();
}
