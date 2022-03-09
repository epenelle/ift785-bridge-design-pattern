public class VSCodeMac  extends VSCode {

    public VSCodeMac() {
        this.theme = new ThemeLight();
    }

    public VSCodeMac(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void getInstallerFileName() {
        System.out.println("VSCode-darwin-universal.zip");
    }
}
