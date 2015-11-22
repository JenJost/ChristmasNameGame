/* The user enters first name and last name, 
* and the program returns a cute Christmas name.
*
*
*/


package christmasname;

import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner; 

public abstract class ChristmasName extends JFrame implements ActionListener {


    public static void main(String[] args) {
    
        JFrame frame = new JFrame("What is your Christmas Name?");
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        //Really need to improve this area by 
        //placing the labels and button in fixed spots
        //instead of floating around the panel
        JLabel firstName = new JLabel("First name:");
            JTextField first = new JTextField(15);
        JLabel lastName = new JLabel("Last name:");
            JTextField last = new JTextField(15);
        panel.add(firstName);
        panel.add(first);
        panel.add(lastName);
        panel.add(last);
        
        JButton submit = new JButton("Submit");
        panel.add(submit);
        
        
        
        submit.addActionListener(new ActionListener() {

            @Override
            public actionPerformed(ActionEvent e) {
                
                // The arrays should probaly be outside the actionListener, 
                // so improve that on next revision. 
                String[] first_name = {"Apple","Eggnogg","Candy","Jingle","Holly","Goldie","Ho Ho","Frosty","Joyous","Mittens","Tinsel","Turkey","Tiny","Cranberry","Bloated","Angel","Bauble","Bulb","Ginger","Blitzen","Eve","Faith","Fruitcake","Goose","Glitter","Grinch"};
                String[] last_name = {"Tidings","Swan","Jolly","Claus","Mistletoe","Punch","Chimney","Coal","Igloo","Jumper","Myrhh","Pudding","Reindeer","Rejoice","Icicle","Midnight","Shepherd","Surprise","Gift","Magi","Train","Tree","White","Donkey","Wreath","Stuffing"};
               
                String firstLetter = first.getText();
                firstLetter = firstLetter.substring(0,1);
               
                String lastLetter = last.getText();
                lastLetter = lastLetter.substring(0,1);
                
                //This is super clunky. 
                //Think of a way to improve it. 
                if (firstLetter.equals("A")){
                   firstLetter = first_name[0];
                } else if (firstLetter.equals("B")){
                    firstLetter = first_name[1];     
                } else if (firstLetter.equals("C")){
                    firstLetter = first_name[2];
                } else if (firstLetter.equals("D")){
                    firstLetter = first_name[3];
                } else if (firstLetter.equals("E")){
                    firstLetter = first_name[4]; 
                } else if (firstLetter.equals("F")){
                    firstLetter = first_name[5];
                } else if (firstLetter.equals("G")){
                    firstLetter = first_name[6];
                } else if (firstLetter.equals("H")){
                    firstLetter = first_name[7]; 
                } else if (firstLetter.equals("I")){
                    firstLetter = first_name[8]; 
                } else if (firstLetter.equals("J")){
                    firstLetter = first_name[9];
                } else if (firstLetter.equals("K")){
                    firstLetter = first_name[10];   
                } else if (firstLetter.equals("L")){
                    firstLetter = first_name[11];   
                } else if (firstLetter.equals("M")){
                    firstLetter = first_name[12];
                } else if (firstLetter.equals("N")){
                    firstLetter = first_name[13];
                } else if (firstLetter.equals("O")){
                    firstLetter = first_name[14];
                } else if (firstLetter.equals("P")){
                    firstLetter = first_name[15];   
                } else if (firstLetter.equals("Q")){
                    firstLetter = first_name[16];
                } else if (firstLetter.equals("R")){
                    firstLetter = first_name[17];
                } else if (firstLetter.equals("S")){
                    firstLetter = first_name[18];   
                } else if (firstLetter.equals("T")){
                    firstLetter = first_name[19];
                } else if (firstLetter.equals("U")){
                    firstLetter = first_name[20];   
                } else if (firstLetter.equals("V")){
                    firstLetter = first_name[21];
                } else if (firstLetter.equals("W")){
                    firstLetter = first_name[22];
                 } else if (firstLetter.equals("X")){
                    firstLetter = first_name[23];
                 } else if (firstLetter.equals("Y")){
                    firstLetter = first_name[24];
                 } else {
                    firstLetter = first_name[25];} // takes care of the letter z and user entry errors   
              
                if (lastLetter.equals("A")){
                   lastLetter = last_name[0];
                } else if (lastLetter.equals("B")){
                    lastLetter = last_name[1]; 
                } else if (lastLetter.equals("C")){
                    lastLetter = last_name[2];
                } else if (lastLetter.equals("D")){
                    lastLetter = last_name[3]; 
                } else if (lastLetter.equals("E")){
                    lastLetter = last_name[4]; 
                } else if (lastLetter.equals("F")){
                    lastLetter = last_name[5]; 
                } else if (lastLetter.equals("G")){
                    lastLetter = last_name[6]; 
                } else if (lastLetter.equals("H")){
                    lastLetter = last_name[7];
                } else if (lastLetter.equals("I")){
                    lastLetter = last_name[8]; 
                } else if (lastLetter.equals("J")){
                    lastLetter = last_name[9]; 
                } else if (lastLetter.equals("K")){
                    lastLetter = last_name[10]; 
                } else if (lastLetter.equals("L")){
                    lastLetter = last_name[11]; 
                } else if (lastLetter.equals("M")){
                    lastLetter = last_name[12];
                } else if (lastLetter.equals("N")){
                    lastLetter = last_name[13]; 
                } else if (lastLetter.equals("O")){
                    lastLetter = last_name[14]; 
                } else if (lastLetter.equals("P")){
                    lastLetter = last_name[15];     
                } else if (lastLetter.equals("Q")){
                    lastLetter = last_name[16];     
                } else if (lastLetter.equals("R")){
                    lastLetter = last_name[17];
                } else if (lastLetter.equals("S")){
                    lastLetter = last_name[18];
                } else if (lastLetter.equals("T")){
                    lastLetter = last_name[19]; 
                } else if (lastLetter.equals("U")){
                    lastLetter = last_name[20];
                } else if (lastLetter.equals("V")){
                    lastLetter = last_name[21];
                } else if (lastLetter.equals("W")){
                    lastLetter = last_name[22]; 
                } else if (lastLetter.equals("X")){
                    lastLetter = last_name[23]; 
                } else if (lastLetter.equals("Y")){
                    lastLetter = last_name[24]; 
                } else {
                    lastLetter = last_name[25]; }// takes care of the letter Z and user entry errors. 
                  
               JOptionPane.showMessageDialog(null, "Your Christmas name is:" +" " + firstLetter + " " + lastLetter);
               System.exit(0);     
            }
        });    
            
        
    }
    
}
