import java.util.Scanner;

public class BridgeDesignPatternTest {

    public static void main(String[] args) {

        // Scanner only to make it interactive
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        // Initialize 2 instances of VS Code
        VSCodeWindows vsCodeWindows = new VSCodeWindows(new ThemeDark());
        VSCodeMac vsCodeMac = new VSCodeMac(new ThemeDark());

        System.out.println("What is the installer file name for each instance ?");
        System.out.print("vsCodeWindows : ");
        vsCodeWindows.getInstallerFileName();
        System.out.print("vsCodeMac : ");
        vsCodeMac.getInstallerFileName();
        System.out.println("--------------------\n\n");

        myObj.nextLine();  // Wait for user input
        System.out.println("Initialize themes");
        System.out.println("vsCodeWindows : ");
        vsCodeWindows.initializeTheme();
        System.out.println();
        System.out.println("vsCodeMac : ");
        vsCodeMac.initializeTheme();
        System.out.println("--------------------\n\n");

        myObj.nextLine();  // Wait for user input
        System.out.println("Get Themes information");
        System.out.println("vsCodeWindows : ");
        vsCodeWindows.getThemeInformation();
        System.out.println();
        System.out.println("vsCodeMac : ");
        vsCodeMac.getThemeInformation();
        System.out.println("--------------------\n\n");

        myObj.nextLine();  // Wait for user input
        System.out.println("Let's switch theme for windows");
        vsCodeWindows.setTheme("light");
        System.out.println("Let's decrease brightness for mac");
        vsCodeMac.dereaseBrightness();
        System.out.println("vsCodeWindows : ");
        vsCodeWindows.getThemeInformation();
        System.out.println();
        System.out.println("vsCodeMac : ");
        vsCodeMac.getThemeInformation();
        System.out.println("--------------------\n\n");

    }
}
