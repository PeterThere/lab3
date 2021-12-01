import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class MainWindow extends JFrame implements ActionListener {
    HashMap<String,String> users;
    String usersLogin;
    String usersPassword;

    JFrame frame = new JFrame();
    JMenuBar menuBar = new JMenuBar();
    JMenu menuOpcje = new JMenu("Opcje");
    JMenuItem mLogin = new JMenuItem("Zaloguj");
    JMenuItem mReset = new JMenuItem("Resetuj");
    JButton bLogin = new JButton("Zaloguj");
    JButton bReset = new JButton("Resetuj");
    JLabel lLogin = new JLabel("Login: ");
    JLabel lPassword = new JLabel("Hasło: ");
    JTextField fLogin = new JTextField();
    JPasswordField fPassword = new JPasswordField();

    public MainWindow(HashMap<String,String> userbase)
    {
        users = userbase;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(230,230);
        frame.setTitle("Okno logowania");
        frame.setLayout(null);
        frame.setJMenuBar(menuBar);

        menuBar.add(menuOpcje);
        mLogin.addActionListener(this);
        mReset.addActionListener(this);
        menuOpcje.add(mLogin);
        menuOpcje.add(mReset);



        lLogin.setBounds(10,10,50,20);
        frame.add(lLogin);

        lPassword.setBounds(10,50,50,20);
        frame.add(lPassword);

        fLogin.setBounds(60,10,150,20);
        frame.add(fLogin);

        fPassword.setBounds(60,50,150,20);
        frame.add(fPassword);

        bLogin.setBounds(10,90,200,20);
        frame.add(bLogin);
        bLogin.addActionListener(this);

        bReset.setBounds(10,130,200,20);
        frame.add(bReset);
        bReset.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source == bReset || source == mReset)
        {
            fLogin.setText("");
            fPassword.setText("");
            frame.getContentPane().setBackground(UIManager.getColor("Panel.background" ));
        }
        else if(source == bLogin || source == mLogin)
        {
            usersLogin = fLogin.getText();
            usersPassword = String.valueOf(fPassword.getPassword());

            if(users.containsKey(usersLogin) && users.get(usersLogin).equals(usersPassword))
                frame.getContentPane().setBackground(Color.green);
            else frame.getContentPane().setBackground(Color.red);
        }

    }
}
