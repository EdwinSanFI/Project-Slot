package Slot.Backend;

import java.util.*;
import Slot.Awards.*;
import java.io.*;
import java.lang.Thread;

public class User{
    String userInformation = "";

    /** Object to pull the lever */
    PullLever tp = new PullLever();
    /** Object to modify the account */
    ModifyAccount ma = new ModifyAccount();
    /** Object to use the account */
    Account ac = new Account();

    Scanner sc = new Scanner(System.in);

    String GREEN = "\u001B[32m";
    String RED = "\u001B[31m";
    String BLUE = "\u001B[34m";
    String YELLOW = "\u001B[33m";
    String RESET = "\u001B[0m";

    public void awardList () {
        System.out.println(BLUE+"\n\tAward list for bets of 5 dollars:\n"+RESET);
        ArrayList<String[]> awards = new ArrayList<>();
        String[] header = {"Name      ", " 3 objects ", " 4 objects ", " 5 objects"};
        awards.add(header);

        Awards grape = new Grape();
    	String [] grapeAwards = {"Grape     ","   "+Integer.toString(grape.getThree())+"     ", "   "+Integer.toString(grape.getFour())+"    ", "   "+Integer.toString(grape.getFive())};
        awards.add(grapeAwards);

        Awards cherry = new Cherry();
    	String [] cherryAwards = {"Cherry    ","   "+Integer.toString(cherry.getThree())+"     ", "   "+Integer.toString(cherry.getFour())+"    ", "  "+Integer.toString(cherry.getFive())};
        awards.add(cherryAwards);

        Awards redDice = new RedDice();
    	String [] redDiceAwards = {"Red Dice  ","   "+Integer.toString(redDice.getThree())+"   ", "   "+Integer.toString(redDice.getFour())+"   ", "  "+Integer.toString(redDice.getFive())};
        awards.add(redDiceAwards);

        Awards diamond = new Diamond();
    	String [] diamondAwards = {"Diamond   ","   "+Integer.toString(diamond.getThree())+"    ", "   "+Integer.toString(diamond.getFour())+"   ", "   "+Integer.toString(diamond.getFive())};
        awards.add(diamondAwards);

        Awards watermelon = new Watermelon();
    	String [] watermelonAwards = {"Watermelon","   "+Integer.toString(watermelon.getThree())+"     ", "   "+Integer.toString(watermelon.getFour())+"    ", "   "+Integer.toString(watermelon.getFive())};
        awards.add(watermelonAwards);

        Awards seven = new Seven();
    	String [] sevenAwards = {"Seven     ","   "+Integer.toString(seven.getThree())+"   ", "   "+Integer.toString(seven.getFour())+"  ", "   "+Integer.toString(seven.getFive())};
        awards.add(sevenAwards);

        Awards clover = new Clover();
    	String [] cloverAwards = {"Clover    ","   "+Integer.toString(clover.getThree())+"     ", "   "+Integer.toString(clover.getFour())+"   ", "   "+Integer.toString(clover.getFive())};
        awards.add(cloverAwards);

        for (String[] award : awards) {
    		System.out.println("\t"+award[0]+": "+award[1]+" "+award[2]+" "+award[3]);
    	}
    }

    public String[] searchUser(String userName) {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("./Slot/Backend/accounts.csv"));
            String line = csvReader.readLine();
            String[] info = line.split(",");
            while (line != null) {
                if (info[0].equals(userName)) {
                    csvReader.close();
                    return info;
                }
                info = line.split(",");
                line = csvReader.readLine();
            }
            csvReader.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
        return null;
    }

    public boolean automaticsPull(String[] user) {
        /** Print the user information */
        printUserInformation(user);

        Scanner sc = new Scanner(System.in);

        int newCredits = 0;
        // Mientras que los creditos del user no sean 0
        if (Integer.parseInt(user[2]) > 0) {
            try {
                System.out.println("\n\tPress "+BLUE+"P"+RESET+ " to pull or "+BLUE+"E"+RESET+" to exit");
                System.out.print("\t");
                String pull = sc.next();
                if (pull.equals("P") || pull.equals("p")) {
                    System.out.println("\n\tPlease enter a bet of 5, 7, 10, 15, 20, 30, 50 or 100 dollars");
                    System.out.print("\t");
                    int bet = sc.nextInt();
                    if(bet == 5 || bet == 7 || bet == 10 || bet == 15 || bet == 20 || bet == 30 || bet == 50 || bet == 100) {
                        /** Tira de la palanca y retorna los creditos ganados */
                        newCredits = tp.play();
                        /** Si gana creditos */
                        if (newCredits > 0) {
                            /** Actualiza los creditos ganados */
                            ma.modifyCredits(newCredits, user, bet);
                        } else {
                            System.out.println("\nYou didn't win, good luck next time");
                            System.out.println(RED+"\t\t"+"-"+bet+RESET);
                            ma.modifyMoney(bet, user);
                        }
                        return true;
                    } else {
                        System.out.println(RED+"\n\tInvalid Bet\n"+RESET);
                        return true;
                        // return true;
                    }
                } else if(pull.equals("E") || pull.equals("e")) {
                    System.out.println("Going back...");
                    try {
                        Thread.sleep(800);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                } else {
                    System.out.println("Invalid option");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n\tPlease enter a valid bet");
                return true;
            }
        } else { /** If the user doesnt have money */
            System.out.println("\tYou don't have enough money");
            System.out.println("\n\tDo you want to add money?\n\t( Y/N )");
            System.out.print("\t");
            String option = sc.next();
            if (option.equals("Y") || option.equals("y")) {
                System.out.println("\n\tHow much money do you want to add?");
                System.out.println(YELLOW+"\tYou must enter a minimum of 20 or a maximum of 1,000,000 dollars"+RESET);
                System.out.print("\t");
                int money = sc.nextInt();
                ma.modifyMoney(money, user);
                System.out.println(GREEN+"\n\tMoney added"+RESET);
            } else if (option.equals("N") || option.equals("n")) {
                System.out.println("\n\tGetting out...");
                try {
                    Thread.sleep(800);
                } catch (Exception e) {
                    e.getMessage();
                }
                return false;
            } else {
                System.out.println("Invalid option");
            }
        }
        return false;
    }

    // ! DONE
    public void printUserInformation(String[] user) {
        System.out.println(YELLOW+"\t\t\t\t\t\t\tDollars: "+RESET+GREEN+user[2]+RESET);
        System.out.println(YELLOW+"\t\t\t\t\t\t\tCredits: "+RESET+GREEN+user[3]+RESET);
    }

    public String[] logged(String user[]){
        int opInitial = 0;
        String menuInitial = "\n1. Create account \n2. Log In";
        try {
            System.out.println("\nChoose an option: "+menuInitial);
            opInitial = sc.nextInt();
            switch (opInitial) {
                case 1:
                    ac.createAccount();
                    break;
                case 2:
                    user = ac.logIn();
                    break;
                default:
                    System.out.println(RED+"\nInvalid number option"+RESET);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println(RED+"\n\tPlease enter a number option"+RESET);
            sc.nextLine();
        } catch (NullPointerException e) {
            System.out.println(RED+"\n\tPlease enter a valid user name"+RESET);
            sc.nextLine();
        }
        finally {
            return user;
        }
    }

    // ! DONE
    // Metodo main
    public void main() {
        int opc = 0;
        int opc2 = 0;
        String user[] = null;
        String menu = "\n1. Play \n2. Modify account \n3. See award list \n4. Log out";

        String menuModify = "\n\t1. Deposit dollars" +
                                "\n\t2. Dollars to credits" +
                                "\n\t3. Credits to dollars" +
                                "\n\t4. Withdraw dollars" +
                                "\n\t5. Save and exit";

        while(user == null) {
            user = logged(user);
        }

        /** 2 */
        // Metodo de bienvenida al user
        ac.welcome(user);

        while (opc != 5) {
            System.out.println("\nChoose an option: " + menu);
            try {
                opc = sc.nextInt();
                sc.nextLine();
                user = searchUser(user[0]);
                switch (opc) {
                    case 1:
                        boolean automaticsPull = true;
                        while(automaticsPull){
                            user = searchUser(user[0]);
                            automaticsPull = automaticsPull(user);
                        }
                        break;
                    case 2:
                        System.out.println(BLUE+"\tMODIFY ACCOUNT\n"+RESET);
                        System.out.println("\tChoose an option: " + menuModify);
                        System.out.print("\t");
                        opc2 = sc.nextInt();
                        do {
                            user = searchUser(user[0]);
                            switch (opc2) {
                                case 1:
                                    System.out.println(BLUE+"\n\t\tDEPOSIT DOLLARS"+RESET);
                                    System.out.println(YELLOW+"\n\t\tYou must enter a minimum of 20 or a maximum of 1,000,000 dollars"+RESET);
                                    System.out.println("\t\tAmount of dollars to enter: ");
                                    System.out.print("\t\t");
                                    int enterDollars = sc.nextInt();
                                    if (enterDollars > 19 && enterDollars < 1000001) {
                                        ma.enterDollars(enterDollars, user);
                                    } else {
                                        System.out.println(RED+"\n\t\tInvalid Quantity"+RESET);
                                    }
                                    break;
                                case 2:
                                    System.out.println(BLUE+"\t\tDOLLARS TO CREDITS"+RESET);
                                    System.out.println("\n\t\tDollars available: " + GREEN+ user[2]+RESET);
                                    System.out.println("\t\tAmount of dollars you want to convert to credits: ");
                                    System.out.print("\t\t");
                                    int dollarsCredits = sc.nextInt();
                                    ma.dollarsToCredits(dollarsCredits, user);
                                    break;
                                case 3:
                                    System.out.println(BLUE+"\t\tCREDITS TO DOLLARS"+RESET);
                                    System.out.println("\n\t\tAvailable credits: " + GREEN +user[3]+RESET);
                                    System.out.println("\n\t\tEnter the amount of credits you want to convert to dollars without decimal: ");
                                    System.out.print("\t\t");
                                    int creditsDollars = sc.nextInt();
                                    ma.creditsToDollars(creditsDollars, user);
                                    break;
                                case 4:
                                    System.out.println(BLUE+"\t\t\tWITHDRAW DOLLARS"+RESET);
                                    System.out.println("\n\t\tDollars available: " + GREEN+user[2]+RESET);
                                    System.out.println("\t\tHow much do you want to withdraw? ");
                                    System.out.print("\t\t");
                                    int dollars = sc.nextInt();
                                    ma.withdrawDollars(dollars, user);
                                    break;
                                case 5:
                                    System.out.println("\n Going back...");
                                    try{
                                        Thread.sleep(800);
                                    } catch (Exception e){
                                        e.getMessage();
                                    }
                                    opc2 = 6;
                                    continue;
                                default:
                                    System.out.println(RED+"\n\tChoose a correct option"+RESET);
                                    break;
                            }
                            System.out.println(menuModify);
                            System.out.print("\t");
                            opc2 = sc.nextInt();
                            sc.nextLine();
                        } while (opc2 != 6);
                        break;
                    case 3:
                        awardList();
                        break;
                    case 4:
                        System.out.println(YELLOW+"\nThank you for playing, come back soon!! \n"+RESET);
                        opc = 5;
                        try{
                            Thread.sleep(500);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        break;
                    default:
                        System.out.println(RED+"\n\tTry again"+RESET);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(RED+"\n\tPlease enter a number option"+RESET);
                sc.nextLine();
            } catch (Exception e) {
                sc.nextLine();
            }
        }
    }
}