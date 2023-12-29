package Collections.ArrayListExample;


import java.util.ArrayList;
import java.util.Collections;

public class ToDoListApp {
    public static void main(String[] args) {

        ArrayList<String> urgentTasks = new ArrayList<>();
        ArrayList<String> allTasks = new ArrayList<>();

        urgentTasks.add("paying the bills");
        urgentTasks.add("drink enough water");
        urgentTasks.add("learn new things");

        allTasks.add("go for a run");
        allTasks.add("take a bath");

//        urgentTasks.clear();

        System.out.println("Urgent Tasks:\n");
        for (String tasks : urgentTasks){
            System.out.println(tasks);
        }

//        System.out.println("\nOther Tasks:\n");

//        Two different ways of adding another ArrayList into an ArrayList

//        allTasks.addAll(urgentTasks);
//        System.out.println("\nAll Tasks:\n");
//        for (String tasks : allTasks){
//            System.out.println(tasks);
//        }
        allTasks.addAll(0,urgentTasks);

        System.out.println("\nAll Tasks:\n");
        for (String tasks : allTasks){
            System.out.println(tasks);
        }
        System.out.println();

        Collections.sort(allTasks);
//        Collections.sort(allTasks,Collections.reverseOrder());
        for (String tasks:allTasks){
            System.out.println(tasks);
        }

        if (allTasks.contains("go for a run")){
            System.out.println("You are healthy");
        }

        System.out.println("-------------------------------------");

        Collections.shuffle(allTasks);
        int n = 1;
        for (String tasks : allTasks.subList(0,3)){
            System.out.println("Tasks:"+n+" "+tasks);
            n++;
        }



    }
}
