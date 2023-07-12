public class Movie {
    private String title;
    private int duration;

    public final boolean IS_GOOD = true;

    //Constructor - this allows us to create an object

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    //Overloading the constructor


    public Movie(String title) {
        this.title = title;
        this.duration = 90;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public void play(){
        System.out.println("Playing " + this.title);
    }

    public static void displayAlert(){
        System.out.println("It's illegal to pirate movies");
    }
}
