package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calc;

    public UserInterface(Calculator calc){
        this.calc = calc;
    }
    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        JLabel jLab = new JLabel("0");
        JButton click = new JButton("Click!");
        ClickListener listener = new ClickListener(this.calc, jLab);
        click.addActionListener(listener);
        container.add(jLab, layout.NORTH);
        container.add(click, layout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
