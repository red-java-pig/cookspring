package psn.redpig.springcore;

public class SimpleMovieLister {
	// the SimpleMovieLister has a dependency on the MovieFinder
	private MovieFinder movieFinder;
	
	public SimpleMovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
		System.out.println("SimpleMovieLister Constructed!");
	}

	// a setter method so that the Spring container can inject a MovieFinder
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	// business logic that actually uses the injected MovieFinder is omitted...
}