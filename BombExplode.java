import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public  class BombExplode implements ActionListener{
    JFrame lostWindow = new JFrame("LOST");
    JButton restartButton = new JButton("RESTART!");
    JPanel buttonPanel = new JPanel();
    JPanel messagePanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JLabel messageLabel = new JLabel("BOMB EXPLODED! TRY AGAIN");

    public BombExplode(){
        mainPanel.setLayout(new GridLayout(2,1));

        messagePanel.add(messageLabel);
        buttonPanel.add(restartButton);
        mainPanel.add(messagePanel);
        mainPanel.add(restartButton);


        //lostWindow.getContentPane().add(messageLabel, restartButton,BorderLayout.CENTER);
        //lostWindow.setIconImage("images/bomb.png");
        lostWindow.add(mainPanel);
        lostWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lostWindow.setVisible(true);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == restartButton){
            //new GameSquare();
            lostWindow.setVisible(false);
        }
    }

}