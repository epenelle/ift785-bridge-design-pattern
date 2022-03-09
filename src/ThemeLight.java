public class ThemeLight implements Theme {

    String backgroundColor;
    int brightness;

    @Override
    public void initializeThemeInfo() {
        System.out.println("Increasing brightness");
        this.brightness = 100;
        System.out.println("Sets background colour to white");
        this.backgroundColor = "White";
    }

    @Override
    public boolean isDisplayed() {
        return backgroundColor == "White";
    }

    @Override
    public void getInformation() {
        String info = "background color : " + this.backgroundColor + "\n"
                + "brightness : " + this.brightness + "\n";
        System.out.println(info);
    }

    @Override
    public void increaseBrightness() {
        this.brightness += 5;
    }

    @Override
    public void decreaseBrightness() {
        this.brightness -= 5;
    }
}
