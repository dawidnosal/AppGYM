package appgym;

public class AppGYM {

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        SplashScreenForm splash = new SplashScreenForm();
        splash.setVisible(true);
        Thread.sleep(3000);
        splash.dispose();
    }
}