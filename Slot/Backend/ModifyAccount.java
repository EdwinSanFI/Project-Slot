package Slot.Backend;
import java.io.*;

public class ModifyAccount {
    String GREEN = "\u001B[32m";
    String RED = "\u001B[31m";
    String BLUE = "\u001B[34m";
    String YELLOW = "\u001B[33m";
    String RESET = "\u001B[0m";

    public void enterDollars(int ingresapesos, String[] usuario) {
        int dineroUsuario = Integer.parseInt(usuario[2]);
        dineroUsuario += ingresapesos;
        System.out.println(GREEN+"\n\t\tThe new balance is: " + dineroUsuario+RESET);

        try {
            String guardarInformacion = "";
            BufferedReader csvReader = new BufferedReader(new FileReader("./Slot/Backend/accounts.csv"));
            String line = csvReader.readLine();
            String[] info = line.split(",");
            // Cuando se obtenga la linea del usuario a modificar
            while (!info[0].equals(usuario[0]) ) {
                guardarInformacion += line + "\n";
                line = csvReader.readLine();
                info = line.split(",");
            }
            /** Actualiza el dinero */
            info[2]= Integer.toString(dineroUsuario);

            /** Guarda la informacion del usuario */
            guardarInformacion += info[0]+","+info[1]+","+info[2]+","+info[3]+"\n";

            /** Lee las otras lineas restantes del archivo */
            while ((line = csvReader.readLine()) != null) {
                guardarInformacion += line + "\n";
            }

            /** Update the csvReader file  */
            FileWriter fileWriter = new FileWriter("./Slot/Backend/accounts.csv");
            fileWriter.append(guardarInformacion);
            fileWriter.close();
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dollarsToCredits(int pesacred, String[] usuario) {
        int creditosUsuario = Integer.parseInt(usuario[3]);
        int dineroUsuario = Integer.parseInt(usuario[2]);
        if (dineroUsuario != 0 && dineroUsuario >= pesacred) {
            creditosUsuario += pesacred*10;
            System.out.println("\n\t\tThe new credit amount is: " + GREEN+ creditosUsuario+RESET);
            dineroUsuario -= pesacred;
            System.out.println("\t\tRemaining dollars: "+GREEN + dineroUsuario+RESET);

            try {
                String guardarInformacion = "";
                BufferedReader csvReader = new BufferedReader(new FileReader("./Slot/Backend/accounts.csv"));
                String line = csvReader.readLine();
                String[] info = line.split(",");
                // Cuando se obtenga la linea del usuario a modificar
                while (!info[0].equals(usuario[0]) ) {
                    guardarInformacion += line + "\n";
                    line = csvReader.readLine();
                    info = line.split(",");
                }
                /** Actualiza el dinero */
                info[2]= String.valueOf(dineroUsuario);

                /** Actualiza los creditos */
                info[3]= String.valueOf(creditosUsuario);

                /** Guarda la informacion del usuario */
                guardarInformacion += info[0]+","+info[1]+","+info[2]+","+info[3]+"\n";

                /** Lee las otras lineas restantes del archivo */
                while ((line = csvReader.readLine()) != null) {
                    guardarInformacion += line + "\n";
                }

                /** Update the csvReader file  */
                FileWriter fileWriter = new FileWriter("./Slot/Backend/accounts.csv");
                fileWriter.append(guardarInformacion);
                fileWriter.close();
                csvReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(YELLOW+"\n\t\tThere is not enough dollars to convert to credits"+RESET);
        }
    }

    public void creditsToDollars(int credapes, String[] usuario) {
        int creditosUsuario = Integer.parseInt(usuario[3]);
        int dineroUsuario = Integer.parseInt(usuario[2]);
        if (creditosUsuario != 0 && creditosUsuario >= credapes) {
            dineroUsuario += credapes*0.1;
            System.out.println("\t\tThe new dollar amount is: " + GREEN +dineroUsuario+RESET);
            creditosUsuario -= credapes;
            System.out.println("\t\tRemaining credits: " +GREEN+ creditosUsuario+RESET);

            try {
                String guardarInformacion = "";
                BufferedReader csvReader = new BufferedReader(new FileReader("./Slot/Backend/accounts.csv"));
                String line = csvReader.readLine();
                String[] info = line.split(",");
                // Cuando se obtenga la linea del usuario a modificar
                while (!info[0].equals(usuario[0]) ) {
                    guardarInformacion += line + "\n";
                    line = csvReader.readLine();
                    info = line.split(",");
                }
                /** Actualiza el dinero */
                info[2]= String.valueOf(dineroUsuario);

                /** Actualiza los creditos */
                info[3]= String.valueOf(creditosUsuario);

                /** Guarda la informacion del usuario */
                guardarInformacion += info[0]+","+info[1]+","+info[2]+","+info[3]+"\n";

                /** Lee las otras lineas restantes del archivo */
                while ((line = csvReader.readLine()) != null) {
                    guardarInformacion += line + "\n";
                }

                /** Update the csvReader file  */
                FileWriter fileWriter = new FileWriter("./Slot/Backend/accounts.csv");
                fileWriter.append(guardarInformacion);
                fileWriter.close();
                csvReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println(YELLOW+"\n\t\tThere is not enough credits to convert to dollars"+RESET);
        }
    }

    public void withdrawDollars(int retpes, String[]usuario) {
        int dineroUsuario = Integer.parseInt(usuario[2]);
        if (dineroUsuario != 0 && dineroUsuario >= retpes) {
    		dineroUsuario -= retpes;
	    	System.out.println("\n\t\t"+RED+retpes+RESET+" withdrawn dollars. \n\t\t"+ GREEN+dineroUsuario+RESET+" remaining dollars.");
            try {
                String guardarInformacion = "";
                BufferedReader csvReader = new BufferedReader(new FileReader("./Slot/Backend/accounts.csv"));
                String line = csvReader.readLine();
                String[] info = line.split(",");
                // Cuando se obtenga la linea del usuario a modificar
                while (!info[0].equals(usuario[0]) ) {
                    guardarInformacion += line + "\n";
                    line = csvReader.readLine();
                    info = line.split(",");
                }
                /** Actualiza el dinero */
                info[2]= String.valueOf(dineroUsuario);

                /** Guarda la informacion del usuario */
                guardarInformacion += info[0]+","+info[1]+","+info[2]+","+info[3]+"\n";

                /** Lee las otras lineas restantes del archivo */
                while ((line = csvReader.readLine()) != null) {
                    guardarInformacion += line + "\n";
                }

                /** Update the csvReader file  */
                FileWriter fileWriter = new FileWriter("./Slot/Backend/accounts.csv");
                fileWriter.append(guardarInformacion);
                fileWriter.close();
                csvReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
	    } else {
	        System.out.println("\n\t\t"+RED+"There is not enough dollars to withdraw"+RESET);
	    }
    }

    public void modifyCredits(int creditos, String[] usuario, int apuestas) {
        try {
            String guardarInformacion = "";
            BufferedReader csvReader = new BufferedReader(new FileReader("./Slot/Backend/accounts.csv"));
            String line = csvReader.readLine();
            // Como es una linea de STRING con ",", se separa para que se obtenga en [] y acceder mas facil
            String[] info = line.split(",");
            // Cuando se obtenga la linea del usuario a modificar
            while (!info[0].equals(usuario[0]) ) {
                guardarInformacion += line + "\n";
                line = csvReader.readLine();
                info = line.split(",");
            }
            /** Regla de 3 */
            int creditosActuales = (creditos*apuestas)/5;

            System.out.println("\n\t\t\033[35m"+"You won "+creditosActuales+" credits"+"\033[0m");

            /** Actualiza los creditos */
            info[3]= String.valueOf(Integer.parseInt(info[3])+creditosActuales);

            /** Guarda la informacion del usuario */
            guardarInformacion += info[0]+","+info[1]+","+info[2]+","+info[3]+"\n";

            /** Lee las otras lineas restantes del archivo */
            while ((line = csvReader.readLine()) != null) {
                guardarInformacion += line + "\n";
            }

            /** Update the csvReader file  */
            FileWriter fileWriter = new FileWriter("./Slot/Backend/accounts.csv");
            fileWriter.append(guardarInformacion);
            fileWriter.close();
            csvReader.close();

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void modifyMoney(int dinero, String[] usuario){
        try {
            String guardarInformacion = "";
            BufferedReader csvReader = new BufferedReader(new FileReader("./Slot/Backend/accounts.csv"));
            String line = csvReader.readLine();
            String[] info = line.split(",");
            while (!info[0].equals(usuario[0]) ) {
                guardarInformacion += line + "\n";
                line = csvReader.readLine();
                info = line.split(",");
            }
            info[2]= String.valueOf(Integer.parseInt(info[2])-dinero);
            guardarInformacion += info[0]+","+info[1]+","+info[2]+","+info[3]+"\n";

            while ((line = csvReader.readLine()) != null) {
                guardarInformacion += line + "\n";
            }

            /** Update the csvReader file  */
            FileWriter fileWriter = new FileWriter("./Slot/Backend/accounts.csv");
            fileWriter.append(guardarInformacion);
            fileWriter.close();
            csvReader.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}