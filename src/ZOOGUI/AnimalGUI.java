package ZOOGUI;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AnimalGUI{
    public static String[] animalFacts = {
            "Elephants are the largest land animals on Earth.",
            "Cheetahs can run up to 60-70 mph.",
            "The blue whale is the largest animal ever known to have existed.",
            "Dolphins are known for their high intelligence and playful behavior.",
            "Octopuses have three hearts.",
            "A group of flamingos is called a 'flamboyance'.",
            "Koalas sleep for about 18-22 hours each day.",
            "Hummingbirds can fly backwards.",
            "Penguins 'propose' to their mates with a pebble.",
            "Giraffes have the same number of neck vertebrae as humans.",
            "Butterflies can taste with their feet.",
            "Tigers have striped skin, not just striped fur.",
            "Owls can rotate their heads up to 270 degrees.",
            "A group of crows is called a 'murder'.",
            "Ants never sleep.",
            "Polar bears have black skin under their white fur.",
            "Sharks have been around for over 400 million years.",
            "Ostriches can run faster than horses.",
            "A group of jellyfish is called a 'smack'.",
            "Cats have five toes on their front paws, but only four on their back paws.",
            "Honeybees can recognize human faces.",
            "A newborn kangaroo is the size of a lima bean.",
            "Cows have best friends and can become stressed when separated.",
            "The heart of a shrimp is located in its head.",
            "An eagle's eye is up to eight times sharper than a human's.",
            "Elephants are known to mourn their dead.",
            "Sloths can hold their breath longer than dolphins can.",
            "A group of frogs is called an 'army'.",
            "Giraffes have blue tongues.",
            "A snail can sleep for up to three years.",
            "Foxes belong to the Canidae family, which also includes dogs, wolves, and jackals.",
            "There are 37 species of foxes, but the red fox is the most common.",
            "Foxes can make over 40 different sounds.",
            "A group of foxes is called a 'skulk' or a 'leash'.",
            "Foxes have whiskers on their legs as well as their faces.",
            "Foxes can run up to 30 mph.",
            "Foxes have excellent hearing, and can hear a mouse squeak from 100 feet away.",
            "The fennec fox, native to the Sahara Desert, has large ears that help dissipate heat.",
            "Foxes are mostly nocturnal and are active during the night.",
            "Foxes use their tails, known as 'brushes', for balance and to keep warm.",
            "Foxes are omnivorous and eat both plants and animals.",
            "Foxes can use magnetic fields to hunt their prey.",
            "Some foxes can climb trees.",
            "Foxes have a playful nature and often play with each other and even with other animals.",
            "Foxes are solitary animals and prefer to live alone.",
            "Foxes' dens are called 'earths'.",
            "Foxes have been known to adopt orphaned cubs.",
            "Foxes are very adaptable and can live in a variety of habitats, including cities.",
            "Foxes communicate with each other using body language, facial expressions, and vocalizations.",
            "Arctic foxes have white fur in winter and brown fur in summer to blend in with their surroundings."

            //"<b>Octopuses Have Three Hearts</b><br>Two pump blood to the gills, while the third pumps it to the rest of the body.",
            //"<b>Elephants Can't Jump</b><br>They are the only mammals that can't jump due to their immense weight and structure.",
            //"<b>Kangaroos Can't Walk Backwards</b><br>Their tails and legs make it impossible to move backward.",
            //"<b>Ostriches Can Run Faster Than Horses</b><br>They can reach speeds up to 60 miles per hour (97 kilometers per hour).",
            //"<b>Dolphins Have Names for Each Other</b><br>They use unique whistles to identify and call out to each other.",
            //"<b>Butterflies Taste with Their Feet</b><br>They have taste receptors on their feet to help them find suitable plants to lay eggs on.",
            //{"7", "Honey Never Spoils", "Archaeologists have found pots of honey in ancient Egyptian tombs that are over 3,000 years old and still edible."},
            //{"8", "Sea Otters Hold Hands While Sleeping", "This helps them stay together and not drift apart in the water."},
            //{"9", "Cows Have Best Friends", "They get stressed when they are separated from them."},
            //{"10", "Starfish Can Regrow Lost Arms", "Some species can even regenerate a whole new starfish from a single arm."},
            //{"11", "Foxes Are Solitary Animals", "Unlike wolves, foxes are generally solitary, preferring to hunt and live alone."},
            //{"12", "They Have Excellent Night Vision", "Foxes have vertically slit pupils that give them excellent night vision and allow them to see in very dim light."},
            //{"13", "Foxes Use Earth’s Magnetic Field to Hunt", "Studies suggest that foxes use the Earth’s magnetic field as a targeting system to find prey hidden under the snow."},
            //{"14", "Their Whiskers Help Them Navigate", "Foxes have whiskers on their legs and face, which help them to navigate in the dark."},
            //{"15", "Foxes Can Make Over 40 Different Sounds", "They communicate with a variety of sounds, including barks, screams, and howls."},
            //{"16", "A Group of Foxes Is Called a Skulk", "While they’re often solitary, foxes will occasionally form loose family groups."},
            //{"17", "Foxes Have Diverse Diets", "They are omnivores, eating fruits, berries, small mammals, birds, insects, and even fish."},
            //{"18", "Arctic Foxes Change Color", "They have white fur in the winter and brown or gray fur in the summer to better blend in with their environment."},
            //{"19", "Foxes Can Run Up to 30 Miles Per Hour", "They are fast runners, which helps them catch prey and escape from predators."},
            //{"20", "Fennec Foxes Have the Largest Ears Relative to Body Size", "Their large ears help them dissipate heat and listen for prey underground.",
    };

    public static void main(String[] args)
    {
        ImageIcon zoo_Logo = new ImageIcon("src/ZOOGUI/images/zoo_blacklogo.png");


        ImageIcon background_Image = new ImageIcon("src/ZOOGUI/images/window-background.png");
        Image newImage = background_Image.getImage();
        Image resizedIcon = newImage.getScaledInstance(600, 600, Image.SCALE_SMOOTH);
        background_Image = new ImageIcon(resizedIcon);

        //creates window (JFrame)
        JFrame window = new JFrame();
        window.setSize(500 ,510);
        window.setLayout(new FlowLayout());
        window.setTitle("Philadelphia Zoo");
        //window.setIconImage("");
        window.getContentPane().setBackground(new Color(244, 244, 222));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel header = new JPanel();
        header.setSize(new Dimension(Integer.MAX_VALUE, 50));
        header.setBackground(new Color(255,255,244));
        window.add(header);

        JPanel body = new JPanel();
        body.setSize(new Dimension(Integer.MAX_VALUE, 400));
        window.add(body);

        JPanel Footer = new JPanel();
        Footer.setSize(new Dimension(Integer.MAX_VALUE, 20));
        Footer.setBackground(new Color(233,233,222));
        window.add(Footer);

        JLabel header_icon = new JLabel(" ");
        header_icon.setIcon(zoo_Logo);
        header_icon.setSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        header_icon.setHorizontalAlignment(SwingConstants.CENTER);
        header_icon.setVerticalAlignment(SwingConstants.CENTER);
        Icon resizedImage = header_icon.getIcon();
        header.add(header_icon);
        int NumberFact = new Random().nextInt(0,animalFacts.length+1);
        String funfact = animalFacts[NumberFact];


        JLabel label = new JLabel("<html><p style=\"text-align: center;\"><font size=20><b>Did you know?</b></font><br><font size=12; color:red>" + funfact + "</font></p></html>");
        label.setIcon(background_Image);
        label.setFont(new Font("Great Vibes", Font.PLAIN, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.CENTER);
        body.add(label);

        JLabel animalLabel = new JLabel("Animal Image");
        String animalPath = null;
        if (funfact.contains("Fennec Fox")) {
           System.out.println("Fennec fact");
             animalPath = "src/ZOOGUI/images/animals/fennecfox.png";
        } else if (funfact.contains("Fox") || funfact.contains("fox")) {
            animalPath = "scr/ZOOGUI/images/animals/fox.jpg";
            System.out.println("FOX FACT");
        } else if (funfact.contains("Whale") || funfact.contains("whale")) {
            System.out.println("whale fact");
            animalPath = "scr/ZOOGUI/images/animals/whale.png";
        } else if (funfact.contains("Owl")) {
            System.out.println("OWL fact");
            animalPath = "scr/ZOOGUI/images/animals/owl.png";
        } else {
            animalPath = "src/ZOOGUI/images/animals/fennecfox.png";
        }
        ImageIcon animalIcon = new ImageIcon(animalPath);
        animalLabel.setIcon(animalIcon);
        window.add(animalLabel);

        JLabel AddressLabel = new JLabel("Philadelphia Zoo - 3400 W Girard Ave, Philadelphia, PA 19104");
        AddressLabel.setFont(new Font("Montserrat", Font.PLAIN, 15));
        AddressLabel.setHorizontalAlignment(SwingConstants.LEFT);
        AddressLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        AddressLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        AddressLabel.setVerticalTextPosition(SwingConstants.BOTTOM);

        Footer.add(AddressLabel);

        window.setVisible(true);
        //<html><p style=\"text-align: left;\"><font size=10><b>
        //</b>
        //</font>

    }
}