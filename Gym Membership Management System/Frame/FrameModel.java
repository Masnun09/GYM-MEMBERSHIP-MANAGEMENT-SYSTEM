package Frame;
import Entity.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FrameModel extends JFrame implements ActionListener
{
    private Color c1;
    private Font f1, f2, f3;
    private JPanel panel0, panel1, panel2, panel3;
    private JLabel label1, label2, nameLabel, phnLabel, genderLabel, emailLabel, passLabel, dobLabel, weightLabel, hightLabel, bgLabel, emContectLabel, addressLabel, label14;
    private JTextField tF1, tF2, tF3, tF4, tF5, tF6, tF7, tF8;
    private JButton submitButton;
    private JButton exitButton;
    private JButton showButton;
    private JButton hideButton;
    private JRadioButton rb1, rb2;
    private ButtonGroup bg1;
    private JComboBox<String> cb;
    private JPasswordField pf1;
    private ImageIcon img1;
    private JTextArea ta1;


    public FrameModel()
    {
        super("GYM MEMBERSHIP MANAGEMENT SYSTEM");
        super.setBounds(500, 50, 1000, 1000);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel0 = new JPanel();
        c1 = new Color(255, 69, 58);
        panel0.setBackground(c1);
        panel0.setBounds(0, 0, 1000, 50);
        panel0.setLayout(null);
        
        f1 = new Font("Baskerville Old Face", Font.BOLD, 20);
        f2 = new Font("Quicksand", Font.BOLD, 20);
        f3 = new Font("Georgia", Font.BOLD, 20);

        label1 = new JLabel("Iron Nation Fitness Club");
        label1.setFont(f2);
        label1.setForeground(Color.black);
		label1.setBounds(380, 15, 400, 20);
		panel0.add(label1);

        super.add(panel0);

        panel1 = new JPanel();
        c1 = new Color(255, 253, 250);
        panel1.setBackground(c1);
        panel1.setBounds(0, 50, 500, 850);
        panel1.setLayout(null);

        label2 = new JLabel("Member Information Form");
        
        label2.setFont(f3);
        label2.setBounds(30, 30, 300, 20);
        panel1.add(label2);

		nameLabel = new JLabel("Name :");
        nameLabel.setFont(f1);
        nameLabel.setForeground(Color.DARK_GRAY);
        nameLabel.setBounds(30, 70, 250, 20);
        panel1.add(nameLabel);

        tF1 = new JTextField();
        tF1.setBounds(250, 70, 150, 25);
        panel1.add(tF1);

        phnLabel = new JLabel("Phone Number :");
        phnLabel.setFont(f1);
        phnLabel.setForeground(Color.DARK_GRAY);
        phnLabel.setBounds(30, 110, 150, 20);
        panel1.add(phnLabel);

        tF2 = new JTextField();
        tF2.setBounds(250, 110, 150, 25);
        panel1.add(tF2);

		genderLabel = new JLabel("Gender :");
        genderLabel.setFont(f1);
        genderLabel.setForeground(Color.DARK_GRAY);
		genderLabel.setBounds(30, 150, 150, 20);
		panel1.add(genderLabel);    
		rb1 = new JRadioButton("Male");
		rb1.setBounds(250, 150, 80, 20);
        rb1.setOpaque(false);
		panel1.add(rb1);

		rb2 = new JRadioButton("Female");
		rb2.setBounds(330, 150, 80, 20);
        rb2.setOpaque(false);
		panel1.add(rb2);

        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);


        emailLabel = new JLabel("Email :");
        emailLabel.setFont(f1);
        emailLabel.setForeground(Color.DARK_GRAY);
		emailLabel.setBounds(30, 190, 150, 20);
		panel1.add(emailLabel);

        tF3 = new JTextField();
        tF3.setBounds(250, 190, 150, 25);
        panel1.add(tF3);

        passLabel = new JLabel("Password :");
        passLabel.setFont(f1);
        passLabel.setForeground(Color.DARK_GRAY);
        passLabel.setBounds(30, 230, 150, 20);
        panel1.add(passLabel);
		pf1 = new JPasswordField();
        pf1.setBounds(250, 230, 150, 20);
		pf1.setEchoChar('$');
        panel1.add(pf1);

        showButton = new JButton("Show");
		showButton.setBounds(410, 230, 80, 20);
		showButton.setBackground(new Color(255, 69, 58));
		showButton.addActionListener(this);
		panel1.add(showButton);
        hideButton = new JButton("Hide");
		hideButton.setBounds(410, 230, 80, 20);
		hideButton.setBackground(new Color(255, 69, 58));
		hideButton.addActionListener(this);
		hideButton.setVisible(false);
		panel1.add(hideButton);

        dobLabel = new JLabel("Date of Birth :");
        dobLabel.setFont(f1);
        dobLabel.setForeground(Color.DARK_GRAY);
        dobLabel.setBounds(30, 270, 250, 20);
        panel1.add(dobLabel);

        tF4 = new JTextField();
        tF4.setBounds(250, 270, 150, 25);
        panel1.add(tF4);

        weightLabel = new JLabel("Weight (kg) :");
        f1 = new Font("Baskerville Old Face", Font.BOLD, 20);
        weightLabel.setFont(f1);
        weightLabel.setForeground(Color.DARK_GRAY);
        weightLabel.setBounds(30, 310, 150, 20);
        panel1.add(weightLabel);

        tF5 = new JTextField();
        tF5.setBounds(250, 310, 150, 25);
        panel1.add(tF5);

        hightLabel = new JLabel("Height (ft) :");
        f1 = new Font("Baskerville Old Face", Font.BOLD, 20);   
        hightLabel.setFont(f1);
        hightLabel.setForeground(Color.DARK_GRAY);
        hightLabel.setBounds(30, 350, 150, 20);
        panel1.add(hightLabel);

        tF6 = new JTextField();
        tF6.setBounds(250, 350, 150, 25);
        panel1.add(tF6);

        bgLabel = new JLabel("Blood Group :");   
        bgLabel.setFont(f1);
        bgLabel.setForeground(Color.DARK_GRAY);
        bgLabel.setBounds(30, 390, 150, 20);
        panel1.add(bgLabel);
        String[] items = new String[]
		{"None", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
		cb = new JComboBox<String>(items);
		cb.setBounds(250, 390, 150, 25);
		cb.setForeground(Color.DARK_GRAY);
		cb.setFont(f1);
		panel1.add(cb);

        emContectLabel = new JLabel("Emergency Contact :");
        emContectLabel.setFont(f1);
        emContectLabel.setForeground(Color.DARK_GRAY);
        emContectLabel.setBounds(30, 430, 200, 20);
        panel1.add(emContectLabel);

        tF7 = new JTextField();
        tF7.setBounds(250, 430, 150, 25);
        panel1.add(tF7);

        addressLabel = new JLabel("Address :");
        addressLabel.setFont(f1);
        addressLabel.setForeground(Color.DARK_GRAY);
        addressLabel.setBounds(30, 470, 150, 20);
        panel1.add(addressLabel);

        tF8 = new JTextField();
        tF8.setBounds(250, 470, 150, 25);
        panel1.add(tF8);
        

        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(15, 810, 80, 20);
        submitButton.setForeground(Color.WHITE);
        submitButton.setBackground(new Color(255, 69, 58));
        submitButton.addActionListener(this);
        panel1.add(submitButton);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(115, 810, 80, 20);
        exitButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(255, 69, 58));
        exitButton.addActionListener(this);
        panel1.add(exitButton);

        super.add(panel1);

        
        panel2 = new JPanel();
        c1 = new Color(255, 243, 230);
        panel2.setBackground(c1);
        panel2.setBounds(500, 50, 500, 850);
        panel2.setLayout(null);

        img1 = new ImageIcon("Picture/Iron Nation Fitness Club.png");
        label14 = new JLabel(img1);
        label14.setBounds(50, 50, 400, 400);
        panel2.add(label14);

        ta1 = new JTextArea();
        ta1.setBounds(50, 470, 400, 400);
        JScrollPane scrollPane = new JScrollPane(ta1);
        scrollPane.setBounds(50, 470, 400, 350);
        ta1.setFont(f2);
        panel2.add(scrollPane);

        super.add(panel2);

        panel3 = new JPanel();
        c1 = new Color(255, 127, 127);
        panel3.setBackground(c1);
        panel3.setBounds(0, 0, 1000, 200);
        panel3.setLayout(null);
        
        super.add(panel3);
	}

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == exitButton)
		{
			System.exit(0);
		}
		if(ae.getSource() == showButton)
		{
			pf1.setEchoChar((char)0);
			showButton.setVisible(false);
			hideButton.setVisible(true);
		}
		if(ae.getSource() == hideButton)
		{
			pf1.setEchoChar('$');
			hideButton.setVisible(false);
			showButton.setVisible(true);
		}
        if(ae.getSource() == submitButton)
        {
            String s1, s3, s4, s5, s9, s11;
            int i2, i10;
            double d7, d8;

            s1 = tF1.getText();
            String s2 = tF2.getText();
            s3 = "";
            if(rb1.isSelected())
            {
                s3 = rb1.getText();
            }
            else if(rb2.isSelected())
            {
                s3 = rb2.getText();
            }
            else
            {
                s3 = "";
            } 
            
            s4 = tF3.getText();
            
            s5 = new String(pf1.getPassword());
            String s6 = tF4.getText();
            String s7 = tF5.getText();
            String s8 = tF6.getText();
            s9 = (String)cb.getSelectedItem();

            String s10 = tF7.getText();
            s11 = tF8.getText();

            if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s7.isEmpty() || s8.isEmpty() || s9.isEmpty() || s10.isEmpty() || s11.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Please fill up all information!");
            }
            else if(!isInteger(s2) || !isInteger(s10))
            {
                JOptionPane.showMessageDialog(this,"Please enter valid number for phone number and emergency contact!");
            }
            else if(!isDouble(s7) || !isDouble(s8))
            {
                JOptionPane.showMessageDialog(this,"Please enter valid number for weight and height!");
            }
            else
            {
                i2 = Integer.parseInt(s2);
                d7 = Double.parseDouble(s7);
                d8 = Double.parseDouble(s8);
                i10 = Integer.parseInt(s10);
                Member obj1 = new Member(s1,i2,s3,s4,s5,s6,d7,d8,s9,i10,s11);
                obj1.insertInfo();
                JOptionPane.showMessageDialog(this,"Information saved!");
                check();
            }
        }
    }

    private boolean isInteger(String str) {
        try
        {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e)
        {
            return false;
        }
    }

    private boolean isDouble(String str) {
        try
        {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e)
        {
            return false;
        }
    }

    private void check() {
        try {
            File file = new File("./Data/userdata.txt");
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                readFileContent(fr);
            }
        }
        catch(IOException ioe) 
        {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error!");
        }
    }

    private void readFileContent(FileReader fr) {
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                ta1.append(line + "\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error!");
        }
    }
}
