package com.gp.manyTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Application {
		@Id
		private int id;
		private String name;
		private String category;
		@ManyToMany(mappedBy = "apps")
		private List<User> user;
		
		
		
		
		
}
