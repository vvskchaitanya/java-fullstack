package com.vvsk.fullstack.streams;

public class Movie {
	
	private String name;
	
	private int rating;
	
	private int reviews;

	
	private MovieCategory category;

	public Movie(String name, int rating, int reviews, MovieCategory category) {
		super();
		this.name = name;
		this.rating = rating;
		this.reviews = reviews;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getReviews() {
		return reviews;
	}

	public void setReviews(int reviews) {
		this.reviews = reviews;
	}

	public MovieCategory getCategory() {
		return category;
	}

	public void setCategory(MovieCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", reviews=" + reviews + ", category=" + category + "]";
	}

}
