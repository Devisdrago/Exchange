import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exchange extends  JFrame{


    private JPanel panel1;
    private JButton clearButton;
    private JButton exitButton;
    private JButton exchangeButton;
    private JComboBox valueComboBox;
    private JComboBox valueComboBox1;
    private JTextField textField1;
    private JTextField textField2;
    public JLabel labelText1;
    public JLabel labelText;
    public int valueBox , valueBox1;

    public Exchange() {

        valueBox1 =0;
        valueBox=0;
        labelText.setVisible(false);
        labelText1.setVisible(false);
        textField2.setText("0");

        setLayout(new BorderLayout(10,5));
        setTitle("Exchange");
        setSize(350,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        add(panel1);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            textField1.setText(null);
            textField2.setText(null);
            valueComboBox.setSelectedIndex(0);
            valueComboBox1.setSelectedIndex(0);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        });

        valueComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==valueComboBox){
                    System.out.println(valueComboBox.getSelectedItem());
                    valueBox = valueComboBox.getSelectedIndex();
                }

            }
        });

        valueComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==valueComboBox1){
                    System.out.println(valueComboBox1.getSelectedItem());
                    valueBox1 =valueComboBox1.getSelectedIndex();
                }

            }
        });

        exchangeButton.addActionListener(e -> {
            double currency ;

            currency = Double.parseDouble(textField2.getText());
            if(valueBox==1&& valueBox1 ==1){
                textField1.setText(String.valueOf(currency*4.86));
            }else if(valueBox==1&& valueBox1 ==2){
                textField1.setText(String.valueOf(currency));
            }else if(valueBox==1&& valueBox1 ==3){
                textField1.setText(String.valueOf(currency/1.16));
            }else if(valueBox==2&& valueBox1 ==1){
                textField1.setText(String.valueOf(currency*5.66));
            }else if(valueBox==2&& valueBox1 ==2){
                textField1.setText(String.valueOf(currency*1.16));
            }else if(valueBox==2&& valueBox1 ==3){
                textField1.setText(String.valueOf(currency));
            }else if(valueBox==3&& valueBox1 ==1){
                textField1.setText(String.valueOf(currency));
            }else if(valueBox==3&& valueBox1 ==2){
                textField1.setText(String.valueOf(currency/4.90));
            }else if(valueBox==3&& valueBox1 ==3){
                textField1.setText(String.valueOf(currency*5.66));
            }

            labelText.setVisible(valueBox == 0);
            labelText1.setVisible(valueBox1 == 0);

        });
    }

}
