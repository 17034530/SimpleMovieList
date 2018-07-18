package sg.edu.rp.c346.simplemovielist;

public class MovieItem {
    private String movieName;
    private String releaseDate;
    private String movieRating;

    public MovieItem(String movieName, String releaseDate, String movieRating) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", movieRating='" + movieRating + '\'' +
                '}';
    }
}
