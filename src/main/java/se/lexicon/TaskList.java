package se.lexicon;

import java.lang.reflect.Array;
import java.util.Arrays;


public class TaskList {

    static String[] simontasks = {"Clean Room", "Make Breakfast", "Play Some Games"};
    static String[] eriktasks = {"Clean Room"};



    public static void main(String[] args) {
        System.out.println(Arrays.toString(simontasks)); // [Clean Room, Make Breakfast, Play Some Games, ]

//        System.out.println(tasks); // [Ljava.lang.String;@1b84c92


        simontasks = addToArray(simontasks, "Have a Workout");


        System.out.println(Arrays.toString(simontasks));

//        --------------------


        eriktasks = addToArray(eriktasks,"Make Dinner");


        System.out.println(Arrays.toString(eriktasks));



        simontasks = addToArray(simontasks, "Go to sleep early");
        simontasks = addToArray(simontasks, "Clean Car");



        System.out.println(Arrays.toString(simontasks));


        String find = findTask(simontasks, "Go");

            System.out.println("task was found: " + find);


        String[] moreTasks = {"Drive Home", "Eat Lunch", "Study OCA", "Study OCP"};

        simontasks = addToArray(simontasks, moreTasks);

        System.out.println(Arrays.toString(simontasks));


        String[] newArray = Arrays.copyOfRange(simontasks,3, 7);
        System.out.println(Arrays.toString(newArray));

    }



    public static String[] addToArray(String[] source, String taskToAdd){
        //Create a new Array with a OG size +1
        String[] newArray = Arrays.copyOf(source, source.length + 1);

        // adding new element at the end (newArray.length -1)
        newArray[newArray.length -1] = taskToAdd;

        //RETURN new array with added task.
        return newArray;
    }

    public static String[] addToArray(String[] source, String... tasksToAdd){

        // 1. Make a new Array with size for all elements.
        String[] newArray = Arrays.copyOf(source, source.length + tasksToAdd.length);

        // 2. Make Sure to add all new Elements to the new Array.
        for (int i = source.length, j = 0; j < tasksToAdd.length; i++, j++){
            newArray[i] = tasksToAdd[j];
        }

        // 3. Return The New Array with all elements
        return newArray;
    }



    public static String findTask(String[] source, String taskToFind){
        //1. Look at all elements
        for (String task : source) {
            //2. See if any is matching
            if (task.equalsIgnoreCase(taskToFind)){
                //3. If so return the matching name.
                return task;
            }
        }
       return null;
    }



}
