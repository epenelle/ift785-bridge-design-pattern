public abstract class VSCode {

    Theme theme;

    public abstract void getInstallerFileName();

    public void setTheme(String newTheme){
        if (newTheme == "dark") {
            if (theme instanceof ThemeDark) {
                System.out.println("Theme is already dark");
            }
            else {
                theme = new ThemeDark();
                System.out.println("Theme changed to dark");
            }
        } else {
            // For simplicity
            if (theme instanceof ThemeLight) {
                System.out.println("Theme is already light");
            }
            else {
                theme = new ThemeLight();
                System.out.println("Theme changed to light");
            }
        }

        // ON DELEGUE L'ACTION A L'OBJET
        theme.initializeThemeInfo();
    }

    void increaseBrightness(){
        // ON DELEGUE L'ACTION A L'OBJET
        theme.increaseBrightness();
    }

    void dereaseBrightness(){
        // ON DELEGUE L'ACTION A L'OBJET
        theme.decreaseBrightness();
    }

    void initializeTheme(){
        // ON DELEGUE L'ACTION A L'OBJET
        theme.initializeThemeInfo();
    }

    void getThemeInformation() {
        // ON DELEGUE L'ACTION A L'OBJET
        theme.getInformation();
    }




}
