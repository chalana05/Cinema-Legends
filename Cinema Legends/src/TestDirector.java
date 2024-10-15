public class TestDirector {
    public static void main(String[] args) {
        Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDoB(dob);
        director.setNumberOfMovies(23);

        System.out.println(director); // Director's toString()
        System.out.println("Name: " + director.getName());
        System.out.println("Surname: " + director.getSurname());
        System.out.println("DOB: " + director.getDoB());
        System.out.println("Number of Movies: " + director.getNumberOfMovies());
    }
}
