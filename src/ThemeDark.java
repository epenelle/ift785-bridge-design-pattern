public class ThemeDark implements Theme {

    String backgroundColor;
    int brightness;
    int contrast;

    @Override
    public void initializeThemeInfo() {
        System.out.println("Reducing brightness");
        this.brightness = 20;
        System.out.println("Increasing contrast");
        this.contrast = 90;
        System.out.println("Sets background color to black");
        this.backgroundColor = "Black";
    }

    @Override
    public boolean isDisplayed() {
        return backgroundColor == "Black";
    }

    @Override
    public void getInformation() {
        String info = "background color : " + this.backgroundColor + "\n"
                    + "brightness : " + this.brightness + "\n"
                    + "contrast : " + this.contrast + "\n";
        System.out.println(info);
    }

    @Override
    public void increaseBrightness() {
        this.brightness += 10;
    }

    @Override
    public void decreaseBrightness() {
        this.brightness -= 10;
    }


}
