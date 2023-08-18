import java.util.HashMap;
import java.util.Scanner;

public class MarsExpedition {
    Scanner input = new Scanner(System.in);

    public MarsExpedition() throws InterruptedException {
        booting();
        String name = welcoming();
        int teamAmount = team();
        String snack = snacks();
        String chosenVehicle = vehicleChoice();
        System.out.println("So. you are "+name+". Your team size is "+teamAmount+". You got "+snack+" and you're driving "+chosenVehicle);
    }
    public void booting() throws InterruptedException {
        String bootingMessage = "Booting";
        System.out.print(bootingMessage);
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);
//            bootingMessage += ".";
        }
        System.out.println();
    }
        public String welcoming() {
            System.out.println("Hello! Insert your name");
            String name = input.nextLine();
            System.out.println("Hi, "+name+"! Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("y")) {
                System.out.println("I knew you would say that. You are team leader for a reason.");
            }
            if (response.equalsIgnoreCase("n")) {
                System.out.println("Too bad you are team leader. You have to go.");
            }
            return name;
        }
        public int team() {
            System.out.println("How many people you want in your team?");
            int teamAmount = input.nextInt();
            if (teamAmount > 2) {
                System.out.println("That’s way to many people. We can only send 2 more members.");

            } else if (teamAmount < 2) {
                System.out.println("That's not enough people. We need you and 2 more members.");
            } else if (teamAmount == 2) {
                System.out.println("THat's a perfect sized team.");
            }
            teamAmount = 2;
            return teamAmount;
        }
        public String snacks() {
            input.nextLine();
            System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
            String snack = input.nextLine();
            System.out.println("Nice choice, you will be bringing a "+snack+" with you.");
            return snack;
        }
        public String vehicleChoice() {
            System.out.println("Choose your vehicle. Input the number");
            HashMap<Integer, String> vehicleList = new HashMap<Integer, String>();
            vehicleList.put(1, "Mazda");
            vehicleList.put(2, "Volkswagen");
            vehicleList.put(3, "Renault");
            vehicleList.put(4, "Skoda");
            System.out.println(vehicleList);
            int chosenNum = input.nextInt();
            return vehicleList.get(chosenNum);
        }
}
