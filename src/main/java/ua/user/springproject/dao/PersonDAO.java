package ua.user.springproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ua.user.springproject.models.Person;

@Component
public class PersonDAO {
	private static int PEOPLE_COUNT;
	private List<Person> people;
	
	{
		people = new ArrayList<>();
		
		people.add(new Person(++PEOPLE_COUNT, "Bob"));
		people.add(new Person(++PEOPLE_COUNT, "Tom"));
		people.add(new Person(++PEOPLE_COUNT, "Jack"));
		people.add(new Person(++PEOPLE_COUNT, "Adam"));
	}
	
	
	public List<Person> index() {
		return people;
	}
	
	public Person show(int id) {
		for (Person p:people) {
			if (p.getId()==id) {return p;}
		}
		return null;
	}
}
