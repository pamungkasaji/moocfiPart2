package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {
    private JTextField textField;
    private JLabel label;

    public ActionEventListener(JTextField textField, JLabel label) {
        this.textField = textField;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.label.setText(this.textField.getText());
        this.textField.setText("");
    }
}
