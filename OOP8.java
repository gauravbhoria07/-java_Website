// TrafficLight.java
 class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public boolean isRed() {
        return "Red".equals(color);
    }

    public boolean isGreen() {
        return "Green".equals(color);
    }
}
