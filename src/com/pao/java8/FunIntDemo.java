package com.pao.java8;

public class FunIntDemo {

	private static void print(String value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		Sayable sayHello = new Sayable() {
			@Override
			public void say(String msg) {
				print(msg);
			}
		};
		sayHello.say("Hello");

		Sayable sayHi = s -> print(s);
		sayHi.say("Hi");
		print("" + sayHi.hashCode());
		print(sayHi.toString());

		Speakable speakLoud = new Speakable() {

			@Override
			public void say(String msg) {
				print(msg);
			}

			@Override
			public void speak() {
				say("Speak Louder");
			}
		};
		speakLoud.speak();

		//Speakable speakLess = s -> print(s);//Must be Functional Interface

		Flayable birth = new Flayable() {
			@Override
			public void fly(String msg) {
				check(msg);
			}
		};
		birth.fly("Birth");
		birth.fly("Dog");

		Flayable cat = f -> print(f);
		cat.check("Cat");
		cat.fly("Cat");
	}
}
