import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Welcome back!");
//        ArrayList<String> s = new ArrayList<>();
//        s.add("Rock");
//        s.add("Weird Rock");
//        s.add("Smooth Rock");
//        s.add("Not Rock");
//
//        Iterator<String> iterator = s.iterator();
//        System.out.println(s);
//        boolean isRockInTheList = false;
//        while (iterator.hasNext()) {
//            String el = iterator.next();
//            if (el.equalsIgnoreCase("not rock")) {
//                System.out.print("There's a non-rock in the list. Deleting it.");
//                Thread.sleep(1000);
//                System.out.print(".");
//                Thread.sleep(1000);
//                System.out.print(".");
//                Thread.sleep(1000);
//                iterator.remove();
//                System.out.println();
//                System.out.println("Perfect");
//                isRockInTheList = true;
//            }
//        }
//        if (!isRockInTheList) {
//            System.out.println("There is no not rock elements in the list");
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


//        HashMap<String, String> fossils = new HashMap<String, String>();
//        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
//        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
//        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
//
//        System.out.println("Fossil data downloaded");
//        System.out.println("Which of the fossils would you like to learn more about? Bird, fish, or tooth?");
//        Scanner input = new Scanner(System.in);
//        String chosenFossil = input.nextLine();
//        boolean isElFound = true;
//        for (String key : fossils.keySet()) {
//            if (key.toLowerCase().contains(chosenFossil.toLowerCase())) {
//                System.out.println(fossils.get(key));
//                isElFound =false;
//            }
//        }
//        if (isElFound) {
//            System.out.println("Such fossil wasn't found");
//        }

        Thread.sleep(2000);

        HashSet<String> supplies = new HashSet<>();
        supplies.add("knife");
        supplies.add("map");
        supplies.add("food");
        Iterator itr = supplies.iterator();
        System.out.println("Supplies Before Expedition");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        supplies.remove("food");
        System.out.println("Supplies After Expedition");
        itr = supplies.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
