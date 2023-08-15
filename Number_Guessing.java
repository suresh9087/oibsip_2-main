import java.util.*;
public class Number_Guessing 
{
    
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int check, counter=0, check_quit, check_play, play, num, n, round, enter_round;
        double score=0.0;
        while (true)
        {
            System.out.println("***********************************");
            System.out.println("Welcome to the NUMBER GUESSING GAME");
            System.out.println("___________________________________");
            System.out.println("Play this Game - Press '1'");
            System.out.println("QUIT - Press '0'");
            System.out.println("***********************************");
            System.out.println("Enter your Choice : ");
            check=sc.nextInt();
            switch(check)
            {
                case 0:
                System.out.println("*****************************");
                System.out.println("Do you want to Quit this Game");
                System.out.println("_____________________________");
                System.out.println("Press '1' to Confirm");
                System.out.println("Press '0' to Cancel");
                System.out.println("*****************************");
                System.out.println("Enter your Choice : ");
                check_quit=sc.nextInt();
                if(check_quit==0)
                {
                    break;
                }
                else if(check_quit==1)
                {
                    System.out.println("You have Successfully exited from the Game\nSee you again next time!!!");
                    System.out.println("Thanks for Playing!!!");
                    return;
                }
                else
                {
                    System.out.println("Invalid Input\nPlease Try again!!!...");
                    break;
                }
                case 1:
                System.out.println("**************************************");
                System.out.println("You have Successfully entered the Game");
                System.out.println("______________________________________");
                System.out.println("Enter the Number of Rounds, you want to play this Game = ");
                enter_round=sc.nextInt();
                for(round=1;round<=enter_round;round++)
                {
                    counter++;
                    System.out.println("Enter a Number of your choice between '1' to '100' = ");
                    num=sc.nextInt();
                    System.out.println("Number successfully entered");
                    System.out.println("___________________________");
                    n = ((int) (100*Math.random())) + 1;
                    System.out.println("Your Inputted Number = "+num+"\nGenerated Random Number = "+n);
                    System.out.println("*************************");
                    if(num==n)
                    {
                        score++;
                        System.out.println("Hurray!!!\nYou have Successfully Guessed the Correct Number = " + n);
                        System.out.println("You have got 1 Point\nScore = "+score);
                    }
                    else if(num>n)
                    {
                        score=score-counter;
                        System.out.println("Sorry!!!\nInputted Number = " +num+" is Greater than Random Number Generated = "+n);
                        System.out.println("Score has been Deducted by Number of Attempts / Round No. = '"+counter+"' for Guessing Wrong Number\nScore = "+score);
                    }
                    else
                    {
                        score=score-(2*counter);
                        System.out.println("Sorry!!!\nInputted Number = " +num+" is Smaller than Random Number Generated = "+n);
                        System.out.println("Score has been Deducted by Twice the Number of Attempts / Round No. = '"+counter+"' for Guessing Wrong Number\nScore = "+score);
                    }
                    System.out.println("Number of Attempts till now = "+counter);
                    if(round<enter_round)
                    {
                        System.out.println("Do you want to play this Again = ");
                        System.out.println("_________________________________");
                        System.out.println("Press '1' to Confirm");
                        System.out.println("Press '0' to Cancel");
                        System.out.println("*********************************");
                        System.out.println("Enter your Choice : ");
                        check_play=sc.nextInt();
                        if(check_play==1)
                        {
                            continue;
                        }
                        else if(check_play==0)
                        {
                            System.out.println("**********");
                            System.out.println("SCOREBOARD");
                            System.out.println("__________");
                            System.out.println("TOTAL ROUNDS / ATTEMPTS = "+round);
                            System.out.println("FINAL SCORE = "+score);
                            System.out.println("******************************************");
                            System.out.println("You have been Successfully exited from the Game\nSee you again next time!!!");
                            System.out.println("Thanks for Playing!!!");
                            return;
                        }
                        else
                        {
                            System.out.println("Invalid Input\nPlease Try again!!!...");
                            while(true)
                            {
                                System.out.println("Enter your Choice Again : (Press '1' to Confirm) or (Press '0' to Cancel) = ");
                                play=sc.nextInt();
                                if(play==1)
                                {
                                    break;
                                }
                                else if(play==0)
                                {
                                    System.out.println("**********");
                                    System.out.println("SCOREBOARD");
                                    System.out.println("__________");
                                    System.out.println("TOTAL ROUNDS / ATTEMPTS = "+round);
                                    System.out.println("FINAL SCORE = "+score);
                                    System.out.println("******************************************");
                                    System.out.println("You have been Successfully exited from the Game\nSee you again next time!!!");
                                    System.out.println("Thanks for Playing!!!");
                                    return;
                                }
                                else
                                {
                                    System.out.println("Invalid Input\nPlease Try again!!!...");
                                    continue;
                                }
                            }
                        }
                    }
                    else
                    {
                        System.out.println("GAMEPLAY ENDS");
                        System.out.println("You have Successfully Completed all the "+round+" Rounds");
                        System.out.println("**********");
                        System.out.println("SCOREBOARD");
                        System.out.println("__________");
                        System.out.println("TOTAL ROUNDS / ATTEMPTS = "+round);
                        System.out.println("FINAL SCORE = "+score);
                        System.out.println("Thanks for Playing!!!");
                        System.out.println("See you again next time!!!");
                        return;
                    }
                }
                sc.close();
                default:
                System.out.println("Invalid Choice Inputted\nPlease Try again!!!");
                break;
            }
        }
    }
}