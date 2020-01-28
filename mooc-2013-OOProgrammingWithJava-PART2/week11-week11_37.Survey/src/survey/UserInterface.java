package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox meaty = new JCheckBox("Yes!");
        JCheckBox fishy = new JCheckBox("No!");

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(meaty);
        buttonGroup1.add(fishy);
        
        container.add(meaty);
        container.add(fishy);
        
        container.add(new JLabel("Why?"));

        JRadioButton meat = new JRadioButton("No reason.");
        JRadioButton fish = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(meat);
        buttonGroup.add(fish);

        container.add(meat);
        container.add(fish);
        
        JButton done = new JButton("Done!");
        
        container.add(done);
    }

    public JFrame getFrame() {
        return frame;
    }

}
