package com.pack.main.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pack.main.domain.User;


public  interface  UserRepository extends CrudRepository <User, Long>{

	
  //List<User>  findByDescription(String description);
 // List<User>  findByDate(String date);
 // List<User>  findByTime(String time);
  
}
