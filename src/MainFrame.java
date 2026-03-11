import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    CardLayout cardLayout;
    JPanel container;

    public MainFrame() {

        setTitle("User Profile System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        FormPanel formPanel = new FormPanel(this);
        PreviewPanel previewPanel = new PreviewPanel(this);

        container.add(formPanel, "FORM");
        container.add(previewPanel, "PREVIEW");

        add(container);

        cardLayout.show(container, "FORM");
    }

    public void showForm() {
        cardLayout.show(container, "FORM");
    }

    public void showPreview() {
        cardLayout.show(container, "PREVIEW");
    }
}