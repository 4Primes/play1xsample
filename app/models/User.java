package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="sampleuser")
public class User extends Model {
	@Column(name = "name", nullable = false, unique = false, length = 128)
	public String name;

	@Column(name = "age", nullable = false, unique = false, length = 128)
	public String age;

	@Column(name = "email", nullable = false, unique = false, length = 128)
	public String email;

	public User(){}
	
	public User(final String name,final  String age,final String email) {
		super();
		this.name=name;
		this.age=age;
		this.email=email;
		}

}
