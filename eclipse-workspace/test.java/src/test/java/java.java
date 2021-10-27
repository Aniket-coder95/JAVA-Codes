package test.java;

public class java {
    public static void main(String[] args){
    	animal[] ob1 = new animal[2];
    	dog d = new dog();
    	cat c = new cat();
    	
    	 ob1 [0] = d;
    	 ob1 [1]=c;
    	 
    	 for (animal x : ob1) {
    		 x.noise();
    	 }
    	 
    		 }
    	
    	
    	}