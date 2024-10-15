public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAwards;

    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }

    public void setNumAwards(int numAwards) {
        this.numAwards = numAwards;
    }

    public int getNumAwards() {
        return numAwards;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", category=" + category + ", director name=" + director.getName() + ", director surname=" + director.getSurname() + ", number of awards=" + numAwards + "]";
    }
}
