package com.cap;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.bean.Movies;
import com.cap.service.MovieServiceI;

@SpringBootTest
class MoviesApplicationTests {

	@Autowired
	private MovieServiceI service;
	
	@Test
	void checkMovies() {
		List<Movies> list = service.movieNames("IMAX");
		Assertions.assertEquals(2, list.size());
	}
}
