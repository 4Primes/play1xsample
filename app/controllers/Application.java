package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.User;

public class Application extends Controller {

  public static void index() {
    //new User().save();
    new User("ali" ,"15" ,"ali@ali.com").save();
    List<User> users = User.findAll();
    for (User user : users ) {
    
    System.out.println(user.name);	
    }
    render(users);
    // String ali="ali";
    // render(ali);
  }

  
    
}