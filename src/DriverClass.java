public class DriverClass {
    private static Application configureApplication() {

        Application app;
        ClothingFactory factory;

        String printName = "Check the clothing request file for party jeans";

        //A if else statement dictating how the program should react to a set of commands.

        if (printName.contains("party jeans")) {
            factory = new partyFactory();
            app = new Application(factory);
        } else {
            factory = new businessFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        //checking the contents of the app by calling our application
        app.revealContent();
    }
}
