import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import java.applet.*;
/*
<applet code="bmi.java" height = 800 width=1000>
</applet> */

public class bmi extends Applet implements ActionListener {

    Button calculate = new Button(" Calculate BMI ");
    Label weight = new Label("Enter your weight  ( in kg ) : ");
    Label height = new Label(" Enter your height ( in cm ) : ");
    Label BMI = new Label("Your BMI is : ");
    TextField w = new TextField();
    TextField b = new TextField();
    TextField h = new TextField();
    TextField result = new TextField();
    Font f = new Font("Times New Roman", Font.BOLD, 15);

    public void init() {
        setLayout(null);
        setFont(f);
        setBackground(Color.gray);
		setForeground(Color.black);

        weight.setLocation(20, 50);
        weight.setSize(200, 40);

        w.setLocation(250, 50);
        w.setSize(120, 40);

        height.setLocation(20, 100);
        height.setSize(200, 40);

        h.setLocation(250, 100);
        h.setSize(120, 40);

        calculate.setLocation(50, 200);
        calculate.setSize(120, 60);

        BMI.setLocation(20, 350);
        BMI.setSize(120, 40);

        b.setLocation(250, 350);
        b.setSize(120, 40);

        result.setLocation(250,500);
        result.setSize(400, 40);


        add(weight);
        add(height);
        add(BMI);
        add(w);
        add(h);
        add(b);
        add(calculate);
        add(result);

        calculate.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        float wt = Float.parseFloat(w.getText());
        float hiet = Float.parseFloat(h.getText());

        if (e.getSource() == calculate) {
            float ans = wt * 10000 / (hiet * hiet);
            b.setText(String.valueOf(ans));
            result.setText("You are absolutely fit");
        }
    }
}
