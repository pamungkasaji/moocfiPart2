
package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    private Calculator calculator;
    private JLabel label;

    public ClickListener(Calculator calculator, JLabel JLabel){
        this.calculator = calculator;
        this.label = JLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calculator.increase();
        this.label.setText("" + this.calculator.giveValue());
    }
}
