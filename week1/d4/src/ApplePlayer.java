public class ApplePlayer extends Player implements IPlayable {
    public ApplePlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing ApplePlayer");
    }

    @Override
    public void play() {
        System.out.println("Playing ApplePlayer");
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
        if (getVolume() > MAX_VOLUME) setVolume(MAX_VOLUME);

    }
}
