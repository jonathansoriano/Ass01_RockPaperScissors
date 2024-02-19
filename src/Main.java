import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        String playerA="";
        String playerB="";
        String trash= "";
        boolean done=false;
        String playResponse="";
        do
        {
            do //bullet proofing valid input
            {
                System.out.print("Player A please enter your move [R,P,S]: ");
                playerA=in.nextLine();
                if (playerA.equalsIgnoreCase("R"))
                {
                    done=true;
                } else if (playerA.equalsIgnoreCase("P"))
                {
                    done=true;
                } else if (playerA.equalsIgnoreCase("S"))
                {
                    done=true;
                } else
                {
                    trash=playerA;
                    System.out.println("Please enter a valid move, not: "+trash);
                }
            }while(!done);
            done=false;

            do //bullet proofing valid input
            {
                System.out.print("Player B please enter your move [R,P,S]: ");
                playerB=in.nextLine();
                if (playerB.equalsIgnoreCase("R"))
                {
                    done=true;
                } else if (playerB.equalsIgnoreCase("P"))
                {
                    done=true;
                } else if (playerB.equalsIgnoreCase("S"))
                {
                    done=true;
                } else
                {
                    trash=playerB;
                    System.out.println("Please enter a valid move, not: "+trash);
                }
            }while(!done);

            if (playerA.equalsIgnoreCase("R")) // Player A Rock
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock. It's a Tie!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Rock vs Paper. Paper covers Rock, Player B wins!");
                } else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock vs Scissors. Rock breaks Scissors, Player A wins!");
                }
            }
            else if(playerA.equalsIgnoreCase("P")) // Player A Paper
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper vs Rock. Paper covers Rock, Player A wins!");
                }
                else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper. It's a Tie!");
                }
                else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Paper vs Scissors. Scissors cuts Paper, Player B wins!");
                }
            }
            else if(playerA.equalsIgnoreCase("S"))// Player A Scissors
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Scissors vs Rock. Rock breaks Scissors, Player B wins!");
                } else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors vs Paper. Scissors cut Paper, Player A wins!");
                } else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors. It's a Tie!");
                }
            }
            done=false;
            do {
                System.out.print("Do you want to play again?[Y/N]:  ");
                playResponse=in.nextLine();

                if (playResponse.equalsIgnoreCase("N"))
                {
                    System.exit(0);
                } else if (playResponse.equalsIgnoreCase("Y"))
                {
                    done=true;
                }
                else
                {
                    trash=playResponse;
                    System.out.println("Enter a valid response, not: "+ trash);
                }
            } while(!done);
            done=false;
        }while(!done);
    }
}