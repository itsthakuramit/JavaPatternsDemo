package com.stackroute.patterns.builder;


public class UserBuilderImpl {
	
	public static void main(String[] args) {
		
		User u1 = new User.UserBuilder("Chris", "Evert")
						  .age(21)
						  .mobile("9887877771")
						  .address("mg road")
						  .build();
		System.out.println(u1);
		
		User u2 = new User.UserBuilder("Martina", "Hingis")
				  .address("mg road")
				  .build();
		System.out.println(u2);

		
		User u3 = new User.UserBuilder("Ivan", "Lendl")
				  .build();
		System.out.println(u3);
		
	}
	    
}
