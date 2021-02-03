package com.SingletonDesignPatern;

public final class Immutable {
private String Pan;

public  String getPan(String pan) {
	return pan;
	
}
public Immutable(String pan) {
	this.Pan=pan;
}
public static void main(String[] args) {
	Immutable immutable=new Immutable("4545454");
	System.out.println(immutable.Pan);
}

    
}
