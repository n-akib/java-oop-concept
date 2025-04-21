public enum Level {
    LOW("Low level"),
    MEDIUM("Medium level"),
    HIGH("High level");

    private String description;

    Level(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }
}

