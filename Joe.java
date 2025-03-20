// Websites like this are written in HTML. While HTML is a coding language it relies on design more that the efficient code
// that I found my passion in. I am not a product like the website promotes, I do this because I found my joy in coding and 
// helping others. While the website portrays my experiences and the conflicting chronologies that got me to this point in my
// education journey it is not me. This is me, this is my bio my north stars and the foundations that they are built upon.

// This is a require section of code so that I never have to operate off a set number of North Stars I can expand the list 
// whenever
import java.util.ArrayList;

// In certain coding languages in order for code to run they need to be contained in objects called classes, which is a fitting
// word for and object representing me and my future.
public class Joe {
    // This is my internalized list of north stars. The word final here says that once this list has been created and north stars
    // added to it it cannot be changed they are permanent fixtures of the list.
    final public ArrayList<NorthStar> NorthStars;

    // This is a constructor it defines what is created whenever the code is run
    public Joe(){
        // This is the creation of the list, before it did not exist just a name reserved for later
        NorthStars = new ArrayList<NorthStar>();
        
        // Each one of these is their own north star. Built off my chronologies they are points of reflection that can not be removed
        // once added.
        NorthStars.add(new NorthStar("Love", "The love you needed while you were struggling to learn the world, to prevent your students from feeling the pain you felt."));
        NorthStars.add(new NorthStar("Genius", "Your growth in the field is due to your passion and effort. You were lucky to find your genius here, give your students to find their own and the joy that comes with it"));
        NorthStars.add(new NorthStar("Validation", "Everyone deserves to find their joy. It was a long and difficult journey to find yours, help make theirs easier"));
        NorthStars.add(new NorthStar("Abolition", "The world of computer science is worse due to the continued alienation of anyone who doesn't look like you. Those that are being excluded are how we have create a responsible future for technology."));
        NorthStars.add(new NorthStar("Abolition", "Other humans have no less right to the privileges you hold, use that privilege to empower your students past what the hegemony dictates"));
        NorthStars.add(new NorthStar("Access", "These stars are always with you. This code can be run again and again. More North Stars can be added. The world continues to change and so will you. Run this code when you are losing sight or overwhelmed. You've reached this point in seeking your joy, now all that is left is stay oriented north"));
    }

    // A set of instructions for if I ever start to fall into a burnout like Van Manen describes, a reminder of why.
    public void dontForget()
    {
        // Displays a reminder for each north star
        for (int i = 0; i < NorthStars.size(); i++)
        {
            NorthStars.get(i).recall();
        }
    }

    // This a class that allows for every north star to be unique, allowing me to create more whenever I need to.
    // This class is marked private only able to by accessed by the Joe class. This is because while north stars are not
    // exclusive to myself how they exist in my heart are uniquely mine to be shared.
    private class NorthStar{
        // A name and a basis for each of my stars
        private String name;
        private String foundation;
        
        // A constructor for each that stores the names and foundations for when I need them
        public NorthStar(String name, String foundation){
            this.name = name; 
            this.foundation = foundation;
        }

        // Each north star has the ability to be recalled in case they are forgotten or fading
        public void recall()
        {
            System.out.println("You are here because of: " + name);
            System.out.println("Why you are doing it is: " + foundation);
        }
    }
}
