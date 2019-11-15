/** Copyright ESPE-DECC
*/

package ec.edu.espe.moviesexam1.view;

/**
 *
 * @author Edison Lascano
 */
public class Movie {
    private String title;
    private String synopsis;
    private int year;
    private String genre;
    private String country;
    private Director director;

    public Movie(String title, String synopsis, int year, String genre, String country, Director director) {
        this.title = title;
        this.synopsis = synopsis;
        this.year = year;
        this.genre = genre;
        this.country = country;
        this.director = director;
    }
    
    
    @Override
    public String toString(){
        return this.getClass() + " --> "+ getTitle() + ", " + getSynopsis() + ", " + getYear() + ", " + getGenre() + ", " + getCountry() + ", " + getDirector().getFirstName() + ", " + getDirector().getLastName() + ", " + getDirector().getCountry() +"\n";  
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the synopsis
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * @param synopsis the synopsis to set
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the director
     */
    public Director getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(Director director) {
        this.director = director;
    }
    
    

}
