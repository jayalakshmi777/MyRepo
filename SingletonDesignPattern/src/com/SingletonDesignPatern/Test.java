package com.SingletonDesignPatern;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Emp>e=new ArrayList<Emp>();
	     e.add(new Emp(9,"zee"));
	     e.add(new Emp(2,"kumar"));
	     e.add(new Emp(3,"ravi"));
	     e.add(new Emp(9,"zee"));
	     e.add(new Emp(2,"kumar"));
	     e.add(new Emp(3,"ravi"));
	     Collections.sort(e, new TestCase());
	     for(Emp ee:e) {
	    	 System.out.println(ee.getEname());
	    	
	     }
	}
}
