package Slot.Backend;

import java.io.*;
import java.util.*;

public class Account {
    String GREEN = "\u001B[32m";
    String RED = "\u001B[31m";
    String BLUE = "\u001B[34m";
    String YELLOW = "\u001B[33m";
    String RESET = "\u001B[0m";

    public void writeData(String data) {
        // Writing in the file the data of the user when he/she creates an account
        try {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("./Slot/Backend/accounts.csv",true));
                bw.write(data);
                bw.close();
            } catch (FileNotFoundException e) {
                e.getMessage();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean createAccount() {
        String userInformation = "";
        // Variables for the passwords
        char [] contr1;
        char [] contr2;
        Console c = System.console();
        String user;

        // Creating the account of the user
        System.out.println(BLUE+"\n\tCREATE ACCOUNT\n"+RESET);

        // Obtaining the name of the user
        System.out.println("\tEnter user name: ");
        System.out.print("\t");
        user = c.readLine();

        String[] busquedauser = searchUser(user);

        if(busquedauser == null) {
             // Obtaining the password of the user

            System.out.println("\tEnter the password: ");
            System.out.print("\t");
            contr1 = c.readPassword();
            System.out.println("\tEnter the password again: ");
            System.out.print("\t");
            contr2 = c.readPassword();

            if(!Arrays.equals(contr1, contr2)) {
                while(!Arrays.equals(contr1, contr2)) {
                    System.out.println(RED+"\n\tThe passwords don't match, try again\n"+RESET);
                    System.out.println("\tEnter the password: ");
                    System.out.print("\t");
                    contr1 = c.readPassword();
                    System.out.println("\tEnter the password again: ");
                    System.out.print("\t");
                    contr2 = c.readPassword();
                }
            }

            System.out.println(GREEN+"\n\tAccount created"+RESET);

            // Concatenating the user's name, user's password, user's money and user's credtis to the end of the user's data.
            userInformation += user + ",";
            userInformation += new String(contr1) + ",";
            userInformation += "0,";
            userInformation += "0\n";

            // Writing the user's data in the file
            writeData(userInformation);

            // Clean the string.
            userInformation = "";

            return true;
        } else {
            System.out.println("\n\tThe user already exists, try with another user\n");
        }
        return false;
    }

    public String[] logIn() {
        Console cis = System.console();
        System.out.println(BLUE+"\n\t\tLOG IN\n"+RESET);

        // Asking the user to input a username.
        System.out.println("\tUser: ");
        System.out.print("\t");
        String us_is = cis.readLine();

        // Reading the password from the console.
        System.out.println("\tPassword: ");
        System.out.print("\t");
        char [] con_is = cis.readPassword();
        String con_string = String.valueOf(con_is);

        // Reading a csv file and checking if the username and password are correct.
        try {
            int success = 0;
            BufferedReader csvReader = new BufferedReader(new FileReader("./Slot/Backend/accounts.csv"));
                String line = csvReader.readLine();
                while (line != null && success != 1) {
                    String[] info = line.split(",");
                    if (us_is.equals(info[0]) && con_string.equals(info[1])) {
                        System.out.println(GREEN+"\tCorrect Log In"+RESET);
                        success = 1;
                        return info;
                    }
                    line = csvReader.readLine();
                }
                csvReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println(RED+"\tInvalid Log In"+RESET);
        return null;
    }

    /**
     * This method is used to search for a user in the csv file and give him the welcome message.
     * @param user
     */
    public void welcome(String[] user){
        /** Nombre del user */
        System.out.println(YELLOW+"\nWelcome, "+user[0]);
        /** Saldo del user */
        System.out.println("Money available: "+user[2]);
        /** Creditos del user */
        System.out.println("Credits available: "+user[3]+RESET);
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
}
