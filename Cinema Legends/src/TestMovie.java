public class TestMovie {
    public static void main(String[] args) {
        Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDoB(dob);
        director.setNumberOfMovies(23);

        System.out.println(director); // Director's toString()

        // Test Movie's constructor and toString()
        Movie movie = new Movie("Avatar", "Fantasy", director);
        System.out.println(movie); // Movie's toString()

        // Test Setters and Getters
        movie.setNumAwards(3);
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Category: " + movie.getCategory());
        System.out.println("Director's Name: " + movie.getDirector().getName());
        System.out.println("Director's Surname: " + movie.getDirector().getSurname());
        System.out.println("Number of Awards: " + movie.getNumAwards());
    }
}

