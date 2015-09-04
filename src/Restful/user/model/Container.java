package Restful.user.model;

import java.util.HashMap;
import java.util.Map;

import  Restful.user.model.User;

// Mock the users property
public class Container {
	 private Map<String, User> allUsers = new HashMap<>();
	  
	  public Container() {
	    
		User user1 = new User("1", "Yiqing liang");
		allUsers.put("1", user1);
		User user2 = new User("2", "James Hunter");
		allUsers.put("2", user2);
	    
	  }
	  public Map<String, User> getAllUsers(){
	    return allUsers;
	  }
	  
}
