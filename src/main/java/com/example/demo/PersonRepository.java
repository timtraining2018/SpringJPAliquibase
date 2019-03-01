package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface PersonRepository extends JpaRepository<Person, Long>{
	
	@Query("select p from Person p where name like concat('%',:person_id,'%')")
	List<Person> getPerson(@Param("person_id") Long person_id);
	
	@Query("select p from Person p where ((string_to_array('123',',') && (string_to_array('3647982123',','))")
	List<Person> getPerson();
	
}
