// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // In the earliest part of the class, we covered file handling and the Scanner class.

        // CLASSES

        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie interstellar = new Movie("Interstellar", 300);
        Movie madMax = new Movie("Mad Max"); // This is the overloaded constructor

        System.out.println(harryPotter.getTitle() + " - " + harryPotter.getDuration());
        System.out.println(interstellar.getTitle() + " - " + interstellar.getDuration());
        System.out.println(harryPotter);
        System.out.println(madMax.getTitle() + " - " + madMax.getDuration());
        harryPotter.play();
        System.out.println(harryPotter.IS_GOOD);
        Movie.displayAlert(); // since it's static, we need to call it FROM THE CLASS, NOT THE OBJECT

        HorrorMovie scream = new HorrorMovie("Scream", 120, false);
        System.out.println(scream.getTitle() + " - " + scream.getDuration() + " - " + scream.isReallyScary());
        scream.play();
        }
    }
