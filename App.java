
import java.util.*;
class Team 
{
    private String name;
    private int goalsScored;

    public Team(String name) 
    {
        this.name = name;
        this.goalsScored = 0;
    }

    public String getName() 
    {
        return name;
    }

    public int getGoalsScored() 
    {
        return goalsScored;
    }

    public void scoreGoal() 
    {
        goalsScored++;
    }
}

public class App {
    public static void main(String[] args)
    {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        
        Random r=new Random();
        Scanner sc  = new Scanner(System.in);  
        int choice;
        do
        {
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(ANSI_WHITE_BACKGROUND+ANSI_GREEN+"                      "+"1. TO SIMULATE A QUICK MATCH"+"                           "+ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND+ANSI_GREEN+"                      "+"2. TO SIMULATE CHAMPIONS LEAGUE"+"                        "+ANSI_RESET);
            System.out.println(ANSI_WHITE_BACKGROUND+ANSI_GREEN+"                      "+"3. EXIT"+"                                                "+ANSI_RESET);
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println();
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println(ANSI_BLUE+"---------------------------------"+ANSI_RESET);
                    System.out.println(ANSI_WHITE_BACKGROUND+"      "+"ENTER THE FIRST TEAM"+"       "+ANSI_RESET);
                    System.out.println(ANSI_BLUE+"---------------------------------"+ANSI_RESET);
                    

                    String team1 = sc.next();

                    System.out.println();
                    System.out.println(ANSI_RED+"---------------------------------"+ANSI_RESET);
                    System.out.println(ANSI_WHITE_BACKGROUND+"      "+"ENTER THE SEC.D TEAM"+"       "+ANSI_RESET);
                    System.out.println(ANSI_RED+"---------------------------------"+ANSI_RESET);
                    System.out.println();

                    String team2 = sc.next();
       
                    Team teamA = new Team(team1);
                    Team teamB = new Team(team2);
       
                     // Simulate the match
                    simulateMatch(teamA, teamB);
       
                     // Display the final result
                    System.out.println();
                    System.out.println(ANSI_BLUE+"-------------------------------------FINAL SCORE-----------------------------------------"+ANSI_RESET);
                    System.out.println("     "+ANSI_WHITE_BACKGROUND+ANSI_GREEN+"                               "+teamA.getName() + " " + teamA.getGoalsScored() + " - " + teamB.getGoalsScored() + " " + teamB.getName()+"                                 "+ANSI_RESET);
                    System.out.println(ANSI_RED+"-----------------------------------------------------------------------------------------"+ANSI_RESET);
                    System.out.println();
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                     break;
                }
                case 2:
                {
                    ArrayDeque ro16 = new ArrayDeque();
                    ArrayDeque ro8 = new ArrayDeque();
                    ArrayDeque sfnl = new ArrayDeque();
                    ArrayDeque fnl = new ArrayDeque();
                    System.out.println();
                    System.out.println(ANSI_GREEN+"-----ENTER 16 TEAMS-----"+ANSI_RESET);
                    System.out.println(ANSI_WHITE_BACKGROUND+"------------------------"+ANSI_RESET);
                    for(int i=1; i<=16;i++)
                    {
                        
                        ro16.add(sc.next());
                    }

                    System.out.println(); 
                    System.out.println("-----------------------------------------ROUND OF 16--------------------------------------------------");
                    System.out.println();

                    for(int i=1; i<=8; i++)//round of 16
                    {
                        int c=r.nextInt(5);
                        int v=r.nextInt(5);
                        while(c==v)
                        {
                            c=r.nextInt(5);
                            v=r.nextInt(5);
                        }
                        String s1=(String) ro16.remove();
                        String s2=(String) ro16.remove();
                        System.out.println("            "+ANSI_WHITE_BACKGROUND+ANSI_GREEN+"                        "+s1+" = "+c+"     vs     "+s2+" = "+v+"                              "+ANSI_RESET);
                        if(c>v)
                        {
                            ro8.add(s1);
                        }
                        else
                        {
                            ro8.add(s2);
                        }
                    }

                    System.out.println();    
                    System.out.println("---------------------------------------QUARTER FINALS--------------------------------------------");
                    System.out.println();
                    
                        for(int j=1; j<=4; j++)//round of 8(quarter finals)
                        {
                            int p=r.nextInt(5);
                            int l=r.nextInt(5);
                            while(p==l)
                            {
                               p=r.nextInt(5);
                               l=r.nextInt(5);
                            }
                        String s3=(String) ro8.remove();
                        String s4=(String) ro8.remove();
                        System.out.println("            "+ANSI_WHITE_BACKGROUND+ANSI_GREEN+"                        "+s3+" = "+p+"     vs     "+s4+" = "+l+"                              "+ANSI_RESET);
                        if(p>l)
                        {
                            sfnl.add(s3);
                        }
                        else
                        {
                            sfnl.add(s4);
                        }
                        }

                        System.out.println();
                        System.out.println("-----------------------------------------SEMI FINALS--------------------------------------------------");
                        System.out.println();

                        for(int k=1; k<=2; k++)//round of 4(semi finals)
                        {
                            int q=r.nextInt(5);
                            int z=r.nextInt(5);
                            while(q==z)
                            {
                                q=r.nextInt(5);
                                z=r.nextInt(5);
                            }
                        String s5=(String) sfnl.remove();
                        String s6=(String) sfnl.remove();
                        System.out.println("            "+ANSI_WHITE_BACKGROUND+ANSI_GREEN+"                        "+s5+" = "+q+"     vs     "+s6+" = "+z+"                              "+ANSI_RESET);
                        if(q>z)
                        {
                            fnl.add(s5);
                        }
                        else
                        {
                            fnl.add(s6);
                        }
                        }
                        System.out.println();
                        System.out.println("---------------------------------------------FINALS---------------------------------------------------");
                        System.out.println();

                        int f=r.nextInt(5);
                        int m=r.nextInt(5);
                        while(f==m)
                        {
                            f=r.nextInt(5);
                            m=r.nextInt(5);
                        }
                        String s7=(String) fnl.remove();
                        String s8=(String) fnl.remove();
                        System.out.println("            "+ANSI_WHITE_BACKGROUND+ANSI_GREEN+"                        "+s7+" = "+f+"     vs     "+s8+" = "+m+"                              "+ANSI_RESET);
                        if(f>m)
                        {
                            System.out.println(" ");
                            System.out.println("----------------------------------UEFA CHAMPIONS LEAGUE WINNER----------------------------------------");
                            System.out.println("                                          "+ANSI_WHITE_BACKGROUND+ANSI_RED+"     "+s7+"     "+ANSI_RESET);
                            System.out.println("------------------------------------------------------------------------------------------------------");
                            System.out.println(" ");
                        }
                        else
                        {
                            System.out.println(" ");
                            System.out.println("----------------------------------UEFA CHAMPIONS LEAGUE WINNER----------------------------------------");
                            System.out.println("                                          "+ANSI_WHITE_BACKGROUND+ANSI_RED+"     "+s8+"     "+ANSI_RESET);
                            System.out.println("------------------------------------------------------------------------------------------------------");
                            System.out.println(" ");
                        }
                        break;
                }
                case 3:
                break;

                default:
                System.out.println("enter valid choice");
                break;
            } 
        }while(choice!=3);
    
    }
    static void simulateMatch(Team teamA, Team teamB) 
    {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        Random random = new Random();
        int matchDuration = 90; 

        for (int minute = 1; minute <= matchDuration; minute++) 
        {
            
            if (random.nextDouble() < 0.05) 
            {
                if (random.nextBoolean()) 
                {
                    teamA.scoreGoal();
                    System.out.println();
                    System.out.println();
                    System.out.println(ANSI_WHITE_BACKGROUND+"----------------------------------------------------------------------------------------"+ANSI_RESET);
                    System.out.println("        "+ANSI_BLUE_BACKGROUND+"                    "+"GOAL FOR " + teamA.getName() + " IN THE " + minute + "TH MINUTE!"+"                      "+ANSI_RESET);
                    System.out.println(ANSI_WHITE_BACKGROUND+"----------------------------------------------------------------------------------------"+ANSI_RESET);
                } 
                else 
                {
                    teamB.scoreGoal();
                    System.out.println();
                    System.out.println(ANSI_WHITE_BACKGROUND+"----------------------------------------------------------------------------------------"+ANSI_RESET);
                    System.out.println("        "+ANSI_RED_BACKGROUND+"                    "+"GOAL FOR " + teamB.getName() + " IN THE " + minute + "TH MINUTE!"+"                      "+ANSI_RESET);
                    System.out.println(ANSI_WHITE_BACKGROUND+"----------------------------------------------------------------------------------------"+ANSI_RESET);
                }
            }
        }
    }
}