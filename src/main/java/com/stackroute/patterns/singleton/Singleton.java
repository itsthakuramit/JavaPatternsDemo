package com.stackroute.patterns.singleton;


public class Singleton {
	
	
	private static Singleton s = new Singleton(47);
	
	private int i;
	
	public static Singleton getReference() {
		return s;
	}
	
	private Singleton(int x) {
		i = x;
	}
	
	public void setValue(int x) {
		i = x;
	}
	
	public int getValue() {
		return i;
	}
	
    public static void main( String[] args ){
    
    	Singleton s1 = Singleton.getReference();
    	System.out.println(" S1 - "+s1.getValue());
    	
    	
    	Singleton s2 = Singleton.getReference();
    	s2.setValue(81);
    	System.out.println(" S2 - "+s1.getValue());
    	
    	System.out.println(s1.hashCode());
    	System.out.println(s2.hashCode());
    	
    	
    	
    }
    
    
}
