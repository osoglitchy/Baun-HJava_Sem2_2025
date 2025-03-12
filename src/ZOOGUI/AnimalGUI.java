package ZOOGUI;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AnimalGUI{


    public static void main(String[] args)
    {
        //creates window (JFrame)
        JFrame window = new JFrame();
        window.setSize(500 ,500);
        window.setTitle("Philadelphia Zoo");
        //window.setIconImage("");
        window.getContentPane().setBackground(new Color(244, 244, 233));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel header = new JPanel();
        header.setSize(500, 50);
        header.setBackground(new Color(255,255,244));
        window.add(header);

        JLabel header_icon = new JLabel(" ");
        ImageIcon header_logo = new ImageIcon("src/ZOOGUI/images/zoo_blacklogo.png");
        header_icon.setIcon(header_logo);
        header_icon.setHorizontalAlignment(SwingConstants.CENTER);
        header_icon.setVerticalAlignment(SwingConstants.CENTER);
        header.add(header_icon);
        int NumberFact = new Random().nextInt(0,10);
        String[] foxFacts = {
                "Foxes use the Earth's magnetic field to hunt.",
                "Foxes can leap up to 3 meters (10 feet) high and are excellent climbers.",
                "A fox's bushy tail helps with balance, warmth, and communication.",
                "Foxes can adapt to almost any environment, from the Arctic tundra to urban areas.",
                "Some foxes can produce a high-pitched 'laughing' sound when they play.",
                "Foxes are monogamous and form lifelong bonds with their partners.",
                "Fox kits are born blind and rely on their parents for weeks.",
                "Foxes have exceptional hearing and can hear a mouse squeaking from 100 feet away.",
                "Foxes communicate with a wide variety of vocalizations, from barks to screams.",
                "Each fox has a unique scent, similar to fingerprints in humans."
        };
        String funfact = foxFacts[NumberFact];
        JLabel label = new JLabel("<html>Did you know?:<br> " + funfact + "</html>");
        ImageIcon logo = new ImageIcon("src/ZOOGUI/images/window-background.png");
        label.setIcon(logo);
        label.setFont(new Font("Montserrat", Font.BOLD, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.CENTER);
        window.add(label);



        //set the window to visible
        window.setVisible(true);

    }
}