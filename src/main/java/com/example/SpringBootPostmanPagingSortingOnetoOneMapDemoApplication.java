package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPostmanPagingSortingOnetoOneMapDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostmanPagingSortingOnetoOneMapDemoApplication.class, args);
	}

}

/*
Create User (POST): http://localhost:8080/api/users

Get All Users (GET): http://localhost:8080/api/users

Get User by ID (GET): http://localhost:8080/api/users/{id}

Update User (PUT): http://localhost:8080/api/users/{id}

Delete User (DELETE): http://localhost:8080/api/users/{id}

Pagination (GET): http://localhost:8080/api/users/pagination?page=0&size=3

Sorting (GET): http://localhost:8080/api/users/sort?sortBy=username&order=asc

Combined Pagination and Sorting (GET): http://localhost:8080/api/users/paginated-sorted?page=0&size=3&sortBy=username&order=desc

*/