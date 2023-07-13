public class AndroidPlayer extends Player implements IPlayable, IShareable {
    public AndroidPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing ApplePlayer");
    }

    @Override
    public void play() {
        System.out.println("Playing AndroidPlay");
    }

    @Override
    public void pause() {
        System.out.println("Pausing ApplePlayer");
    }

    @Override
    public void mute() {
        setVolume(0);

    }

    @Override
    public void increaseVolume() {
        setVolume(getVolume() + 0.1);
    }

    @Override
    public String share() {
        return "Sharing";
    }
}
