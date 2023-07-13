public class WebPlayer extends Player{
    public WebPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);

    }

    @Override // this means we are overloading the method
    public void close() {
        System.out.println("Closing web player");
    }
}
