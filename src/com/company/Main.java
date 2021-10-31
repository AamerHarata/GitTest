package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Create the main frame
        JFrame frame = new JFrame();

        //Create an instance of the class GUI
        Gui gui = new Gui();

        //Set main dimensions to the main frame
        frame.setBounds(150, 0, 1380, 900);
        //Set the main background
        frame.setBackground(Color.WHITE);
        //Prevent user from resizing the game window
        frame.setResizable(false);
        //Add the GUI instance (JPanel) to the main frame
        frame.add(gui);
        //Make the game window visible
        frame.setVisible(true);



    }
}
