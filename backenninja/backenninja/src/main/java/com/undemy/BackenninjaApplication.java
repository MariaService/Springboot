package com.undemy;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BackenninjaApplication implements CommandLineRunner {
	@Autowired
    private BookRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BackenninjaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  repository.save(new Book("Dart"));
	        repository.save(new Book("Angular"));
	        repository.save(new Book("Linux"));

	        System.out.println("\nfindAll()");
	        repository.findAll().forEach(x -> System.out.println(x));

	        System.out.println("\nfindById(1L)");
	        repository.findById(1l).ifPresent(x -> System.out.println(x));

	        System.out.println("\nfindByName('Linux')");
	        repository.findByName("Linux").forEach(x -> System.out.println(x));
	}
	
	
}
