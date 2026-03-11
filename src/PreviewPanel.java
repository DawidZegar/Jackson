import javax.swing.*;
import java.awt.*;

public class PreviewPanel extends JPanel {

    JLabel nameLabel;
    JLabel lastNameLabel;
    JLabel emailLabel;

    public PreviewPanel(MainFrame frame) {

        setLayout(new GridLayout(4,1,10,10));

        nameLabel = new JLabel();
        lastNameLabel = new JLabel();
        emailLabel = new JLabel();

        add(nameLabel);
        add(lastNameLabel);
        add(emailLabel);

        JButton backButton = new JButton("Powrót do edycji");

        backButton.addActionListener(e -> {
            frame.showForm();
        });

        add(backButton);
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            UserProfile profile = StorageManager.load();

            if (profile != null) {
                nameLabel.setText("First Name: " + profile.getFirstName());
                lastNameLabel.setText("Last Name: " + profile.getLastName());
                emailLabel.setText("Email: " + profile.getEmail());
            }
        }

        super.setVisible(visible);
    }
}