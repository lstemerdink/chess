package model.moves;

public enum Castle {

    WHITE_SHORT(true),
    WHITE_LONG(true),
    BLACK_SHORT(true),
    BLACK_LONG(true);

    private boolean allowed;

    Castle(boolean allowed) {
        this.allowed = allowed;
    }

    public boolean getAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }
}
