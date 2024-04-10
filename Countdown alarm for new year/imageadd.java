import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class imageadd extends  JFrame implements MouseListener{



        JLabel label;
        ImageIcon h1;
    ImageIcon h2;
    ImageIcon wal2023;
    ImageIcon wall2023;


    imageadd(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,500);
            this.setLayout(new FlowLayout());
       // this.setLayout(null);

            label = new JLabel();
        label.addMouseListener(this);
          label.setBounds(500, 500, 1000, 1000);
      //  label.setBackground(Color.red);
       // label.setOpaque(true);
          h1= new ImageIcon("h11.jpg");
           h2 = new ImageIcon("anime-landscape-scenic-fantasy-flying-train-wallpaper-preview1.jpg");
           wal2023=new ImageIcon("Happy-New-Year-2023.jpg");
           wall2023 = new ImageIcon("new-year-2021-wishes-images-free1.jpg");
            //label.setOpaque(true);
         //  label.addMouseListener(this);
       // this.addMouseListener(this); // it will act on the whole frame not only the mouse.
            label.setIcon(h1);
            this.add(label);
          this.pack();
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // Invoked when the mouse button has been clicked (pressed and released) on a component
           // System.out.println("You clicked the mouse");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // Invoked when a mouse button has been pressed on a component
            System.out.println("You pressed the mouse");
           // label.setBackground(Color.yellow);
           label.setIcon(h1);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // Invoked when a mouse button has been released on a component
            System.out.println("You released the mouse");
           // label.setBackground(Color.green);
            label.setIcon(wal2023);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // Invoked when the mouse enters a component
            System.out.println("You entered the component");
            //label.setBackground(Color.blue);
            label.setIcon(wall2023);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // Invoked when the mouse exits a component
            System.out.println("You exited the component");
           // label.setBackground(Color.red);
            label.setIcon(h2);
        }

    }


