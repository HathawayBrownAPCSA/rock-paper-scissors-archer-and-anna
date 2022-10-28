
/**
 * Write a description of class RPSMatch2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RPSMatch2
{
    // instance variables - replace the example below with your own
    private int humanWins;
    private int computerWins;
    private int ties;
    private int cplay;
    private int hplay;

    /**
     * Constructor for objects of class RPSMatch2
     */
    public RPSMatch2()
    {
        // initialise instance variables
        humanWins = 0;
        computerWins = 0;
        ties = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setHumanPlay(String hp)
    {
        // put your code here
        if (hp == "rock")
        {
            hplay = 1;
        }
        else if (hp == "paper")
        {
            hplay = 2;
        }
        else
        {
            hplay = 3;
        }
    }
    
    public String getComputerPlay()
    {
        cplay = (int)(Math.random() * 3 + 1);
        if (hplay == 3)
        {
            cplay = 1;
            return "Rock";
        }
        else if (hplay == 1)
        {
            cplay = 2;
            return "Paper";
        }
        else
        {
            cplay = 3;
            return "Scissors";
        }
    }
    
    public String getResult()
    {
        if ((cplay == 1 && hplay == 3))
        {
            computerWins ++;
            return "Computer wins! L";
        }
        else if ((hplay == 1 && cplay == 3))
        {
            humanWins ++;
            return "Human wins!";
        }
        else if (cplay > hplay)
        {
            computerWins++;
            return "Computer wins! L";
        }
        else if (hplay > cplay)
        {
            humanWins++;
            return "Human wins!";
        }
        else
        {
            ties ++;
            return "Tie. L";
        }
    }
    
    public int getHumanWins()
    {
        return humanWins;
    }
    
    public int getComputerWins()
    {
        return computerWins;
    }
    
    public int getTies()
    {
        return ties;
    }
}
