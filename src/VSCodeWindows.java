public class VSCodeWindows extends VSCode {

    public VSCodeWindows() {
        this.theme = new ThemeDark();
    }

    public VSCodeWindows(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void getInstallerFileName() {
        System.out.println("VSCodeUserSetup-x64-1.65.1.exe");
    }
}
