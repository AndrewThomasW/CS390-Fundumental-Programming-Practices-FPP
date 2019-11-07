import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuFrame extends JMenuBar implements ActionListener{

    String[] fileItems = new String[] { "Quit" };
    String[] editItems = new String[] { "Erase" };
    String[] colorItems = new String[] { "Red", "Green", "Blue", "Pink","Black" };

    JFrame frame ;

    public MyMenuFrame() {

        frame = new JFrame(" my Menu ");


        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu colorMenu = new JMenu("Color");

        //File menus
        for (int i=0; i < fileItems.length; i++) {
            JMenuItem item = new JMenuItem(fileItems[i]);
            item.addActionListener(this);
            fileMenu.add(item);
        }
        //    Edit menus
        for (int i=0; i < editItems.length; i++) {
            JMenuItem item = new JMenuItem(editItems[i]);

            item.addActionListener(this);
            editMenu.add(item);
        }

        //color menus

        for (int i=0; i < colorItems.length; i++) {
            JMenuItem item = new JMenuItem(colorItems[i]);

            item.addActionListener(this);
            colorMenu.add(item);
        }

        //  editMenu.insertSeparator(1);

        JMenuBar bar = new JMenuBar();
        bar.add(fileMenu);
        bar.add(editMenu);
        bar.add(colorMenu);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setJMenuBar(bar);



    }



    public void actionPerformed(ActionEvent event) {


        if(event.getActionCommand().equals("Quit")){
            System.exit(0);
        }

        if(event.getActionCommand().equals("Erase")){
            frame.getContentPane().setBackground(Color.WHITE);
        }

        if(event.getActionCommand().equals("Red")){
            frame.getContentPane().setBackground(Color.RED);
        }
        if(event.getActionCommand().equals("Green")){
            frame.getContentPane().setBackground(Color.green);
        }
        if(event.getActionCommand().equals("Blue")){
            frame.getContentPane().setBackground(Color.blue);
        }
        if(event.getActionCommand().equals("Pink")){
            frame.getContentPane().setBackground(Color.PINK);
        }
        if(event.getActionCommand().equals("Black")){
            frame.getContentPane().setBackground(Color.BLACK);
        }

    }


    public static void main(String[] args) {

        new MyMenuFrame();

    }
}