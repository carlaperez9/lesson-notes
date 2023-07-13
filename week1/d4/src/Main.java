import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        // ABSTRACT CLASSES AND INTERFACES

        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.1, 3);
        AndroidPlayer androidPlayer = new AndroidPlayer(1, 4);

        /* Abstract classes cannot be instantiated Player player = new Player(0.3, 1) */

        webPlayer.close();
        applePlayer.close();

        applePlayer.play();
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());
        androidPlayer.play();

        // We can instantiate Player objects by "calling" their child classes
        Player androidPlayer2 = new AndroidPlayer(0.9, 4);
        IPlayable androidPlayer3 = new AndroidPlayer(1, 5);

        // BIG DECIMAL

        System.out.println(1.2 - 1.0);

        BigDecimal bd1 = new BigDecimal("1.24009384");
        BigDecimal bd2 = new BigDecimal("5.02345212");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN)); // We need to specify what type of rounding we need
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2)); // this may replace >=, >, <=, < because these operators cannot be used in BigDecimal


        if (bd1.compareTo(bd2) > 0) System.out.println("bd1 es mayor que bd2");
        else if (bd1.compareTo(bd2) < 0) System.out.println("bd1 es menor que bd2");
        else if (bd1.compareTo(bd2) == 0) System.out.println("bd1 es igual a bd2");
    }
}
