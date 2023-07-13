public interface IPlayable {
    public abstract void play();
    public abstract void pause();
    public abstract void mute();
    public abstract void increaseVolume();

    final double MAX_VOLUME = 1;
}
