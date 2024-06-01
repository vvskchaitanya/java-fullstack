package com.vvsk.fullstack.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BoxOffice {

	public static void main(String[] args) {
		
		
		List<Movie> movies = new ArrayList<Movie>();
		
		movies.add(new Movie("Kalki", 9, 1000, MovieCategory.SCIFI));
		movies.add(new Movie("Salaar", 8, 3000, MovieCategory.THRILLER));
		movies.add(new Movie("Pushpa", 7, 5000, MovieCategory.COMEDY));
		movies.add(new Movie("Devara", 6, 2000, MovieCategory.THRILLER));
		movies.add(new Movie("Legend", 5, 500, MovieCategory.HORROR));
		movies.add(new Movie("Indian 2", 8, 3000, MovieCategory.SCIFI));
		
		
		Map<MovieCategory, List<Movie>> groupByCategory = movies.stream()
				.collect(Collectors.groupingBy(Movie::getCategory));
		
		
		System.out.println(groupByCategory);
		
		// using forEach
		
		for(MovieCategory category: groupByCategory.keySet()) {
			System.out.println("Category ==== "+category);
			
			for(Movie movie: groupByCategory.get(category)) {
				System.out.println("=====> Movie  == "+movie.getName() );
			}
			
		}
				
		

	}

}
