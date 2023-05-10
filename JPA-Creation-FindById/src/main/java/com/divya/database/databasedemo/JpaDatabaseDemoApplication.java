package com.divya.database.databasedemo;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.divya.database.databasedemo.entity.Person;
import com.divya.database.databasedemo.jdbc.PersonJdbcDao;
import com.divya.database.databasedemo.jpa.PersonJPARepository;


//Implement Command Line Runner
@SpringBootApplication
public class JpaDatabaseDemoApplication implements CommandLineRunner{

	@Autowired
	PersonJPARepository repos;
	
	
	
	//for Insert Query
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(JpaDatabaseDemoApplication.class, args);
		//Implement Command Line Runner
		
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User ID 10001 ->{}",repos.findById(10001));
		//logger.info("User ID : ->{}",dao.findById(10001));
		//logger.info("Deleting 10001 : ->{}",dao.deleteById(10001));
		//logger.info("Delete By Location - Bangalore : ->{}",dao.deleteByLocation("Bangalore"));
		//logger.info("Inserting 10007 : ",dao.insertData(new Person(10007,"Mirutyunjay","Hyderabad",new Date())));
		//logger.info("Updating 10007 : ",dao.updateData(new Person("Germany",new Date(),10007)));
	
	}

}
