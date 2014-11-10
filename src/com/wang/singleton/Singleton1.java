package com.wang.singleton;

public class Singleton1 {
	private static Singleton1 instance;
	private Singleton1(){
		
	}
	public static Singleton1 getSingleton(){
		return instance;
	}
}
