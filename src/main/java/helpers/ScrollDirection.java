package helpers;

public enum ScrollDirection {
    UP("down"),
    DOWN("up"),
    RIGHT("left"),
    LEFT("right");

    private final String scrollDirection;

    private ScrollDirection(String scrollDirection) { this.scrollDirection = scrollDirection; }

    public String toString() { return this.scrollDirection; }
}
