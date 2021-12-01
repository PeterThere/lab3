import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            try {
                Database database = new Database();
                MainWindow window = new MainWindow(database.users);

            } catch (Exception e) {
                 e.printStackTrace(System.err);
            }
        });
    }
}
