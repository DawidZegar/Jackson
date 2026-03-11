import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    JTextField firstNameField;
    JTextField lastNameField;
    JTextField emailField;

    public FormPanel(MainFrame frame) {

        setLayout(new GridLayout(4,2,10,10));

        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        JButton saveButton = new JButton("Zapisz i Dalej");

        saveButton.addActionListener(e -> {

            UserProfile profile = new UserProfile(
                    firstNameField.getText(),
                    lastNameField.getText(),
                    emailField.getText()
            );

            StorageManager.save(profile);

            frame.showPreview();
        });

        add(new JLabel());
        add(saveButton);
    }
}