package nico_solution;

import java.util.Arrays;

public class Store {
  private Movie[] movies;

  public Store() {
    this.movies = new Movie[10];
  }

  public Movie getMovie(int index) {
    Movie copy = new Movie(this.movies[index]);
    return copy;
  }

  public void setMovie(int index, Movie movie) {
    Movie copy = new Movie(movie);
    this.movies[index] = copy;
  }

  @Override
  public String toString() {
    String temp = "";
    for (Movie movie : movies) {
      temp += movie.toString() + "\n";
    }
    return temp;
  }
}
