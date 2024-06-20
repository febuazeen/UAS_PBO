package konversirupiah;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class konvRupiah extends JFrame implements ActionListener {
    public JLabel label1,label2;
    public JTextField text1,text2;
    public JButton button1,button2,button3,button4;
    
    public konvRupiah(){
        label1 =  new JLabel("Nilai Rupiah ");
        label1.setLocation(20,10);
        label1.setSize(label1.getPreferredSize());
        
        text1 = new JTextField(20);
        text1.setLocation(10,25);
        text1.setSize(text1.getPreferredSize());
        
        label2 =  new JLabel("Hasil Konversi ");
        label2.setLocation(20,60);
        label2.setSize(label1.getPreferredSize());
        
        text2 = new JTextField(20);
        text2.setLocation(10,75);
        text2.setSize(text1.getPreferredSize());
        
        button1 = new JButton("US Dollar");
        button1.setLocation(245,10);
        button1.setSize(button1.getPreferredSize());
        button1.addActionListener(this);
        button1.setMnemonic('1');
        
        button2 = new JButton("Pounsterling");
        button2.setLocation(245,40);
        button2.setSize(button1.getPreferredSize());
        button2.addActionListener(this);
        button2.setMnemonic('2');
        
        button3 = new JButton("Ringgit Malaysia");
        button3.setLocation(245,70);
        button3.setSize(button1.getPreferredSize());
        button3.addActionListener(this);
        button3.setMnemonic('3');
        
        button4 = new JButton("Saudi Riyal");
        button4.setLocation(245,100);
        button4.setSize(button1.getPreferredSize());
        button4.addActionListener(this);
        button4.setMnemonic('4');
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        double rupiah = 0.0, hasilKonv;
        
        try {
            rupiah = Double.parseDouble(text1.getText());
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
        if (ae.getSource() == button1){
            hasilKonv = rupiah / 15949.45; //US Dollar
        } else if (ae.getSource() == button2){
            hasilKonv = rupiah / 20231.76; //pounsterling
        } else if (ae.getSource() == button3){
            hasilKonv = rupiah / 3403.16; //Ringgit Malaysia
        } else {
            hasilKonv = rupiah / 4252.44; //Riyal Saudi
        }
        text2.setText(new String().valueOf(hasilKonv));
    }
    public void tampilan(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Konversi Rupiah ke Mata Uang Asing");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(label1);
        frame.getContentPane().add(text1);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(text2);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        
        frame.setBounds(0, 0, 350, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                konvRupiah app = new konvRupiah();
                app.tampilan();
            }
        });
    }
}