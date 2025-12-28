import ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        try {
            ConsoleUI.start();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
