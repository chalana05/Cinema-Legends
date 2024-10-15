public class Director {
    private String name;
    private String surname;
    private Date dob;
    private int numberOfMovies;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDoB() {
        return dob;
    }

    public void setDoB(Date dob) {
        this.dob = dob;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    @Override
    public String toString() {
        return "Director [name=" + name + ", surname=" + surname + ", dob=" + dob + ", movies directed=" + numberOfMovies + "]";
    }
}

