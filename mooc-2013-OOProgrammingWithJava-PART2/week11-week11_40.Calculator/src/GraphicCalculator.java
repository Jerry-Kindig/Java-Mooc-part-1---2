
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField sum = new JTextField("0");
        sum.setEnabled(false);
        JTextField input = new JTextField("");
        container.add(sum);
        container.add(input);
        container.add(this.createPanel(sum, input));
        
    }
    
    private JPanel createPanel(JTextField sum, JTextField input){
        JPanel buttons = new JPanel(new GridLayout(1, 3));
        JButton z = new JButton("Z");
        CalcZ ZListener = new CalcZ(input, sum, z);
        z.addActionListener(ZListener);
        z.setEnabled(false);
        JButton plus = new JButton("+");
        CalcPlus plusListener = new CalcPlus(input, sum, z);
        plus.addActionListener(plusListener);
        JButton minus = new JButton("-");
        CalcMinus minusListener = new CalcMinus(input, sum, z);
        minus.addActionListener(minusListener);
        buttons.add(plus);
        buttons.add(minus);
        buttons.add(z);
        return buttons;
    }
    
//        JButton click = new JButton("Click!");
//        ClickListener listener = new ClickListener(this.calc, jLab);
//        click.addActionListener(listener);

    public JFrame getFrame() {
        return frame;
    }
}
