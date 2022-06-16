package com.hoja.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame implements ActionListener  {

    private JPanel panel;
    private JButton reset;
    private JLabel userl;
    private JTextField user;
    private JLabel passl;
    private JPasswordField pass;
    private JLabel labell;
    private JButton logIn;

    public LogIn() {
        //construct components
        panel = new JPanel();
        reset = new JButton("حذف");
        logIn = new JButton("ورود");
        userl = new JLabel("نام کاربری : ");
        user = new JTextField(1);
        passl = new JLabel("رمز عبور : ");
        pass = new JPasswordField(1);
        labell = new JLabel("مامور گرامی , با وارد کردن نام کاربری و رمز عبور خود وارد پنل کاربری شوید");

        //adjust size and set layout
        panel.setPreferredSize(new Dimension(473, 351));
        panel.setLayout(null);

        //add components
        panel.add(userl);
        panel.add(user);
        panel.add(passl);
        panel.add(pass);
        panel.add(labell);
        panel.add(logIn);
        panel.add(reset);

        //set component bounds (only needed by Absolute Positioning)
        userl.setBounds(260, 70, 100, 25);
        user.setBounds(160, 70, 100, 25);
        passl.setBounds(260, 100, 100, 25);
        pass.setBounds(160, 100, 100, 25);
        labell.setBounds(50, 15, 335, 30);
        logIn.setBounds (215, 155, 100, 25);
        reset.setBounds (100, 155, 100, 25);

        reset.addActionListener(this);

      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      getContentPane().add (panel);
      pack();

}

        public void addLogInListener(ActionListener listener){
            logIn.addActionListener(listener);
        }
        public String username(){
            return user.getText();
        }
        public char[] pass(){
            return pass.getPassword();
        }
        public void errorMassage (String errorMassage ){
             JOptionPane.showMessageDialog(this,errorMassage);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        user.setText("");
        pass.setText("");
    }
}
