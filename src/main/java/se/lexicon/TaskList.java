package se.lexicon;

public class TaskList {

    static String[] simontasks = {"Clean Room", "Make Breakfast", "Play Some Games"};
    static String[] eriktasks = {};



    public static void main(String[] args) {
        System.out.println(arrayToString(simontasks)); // [Clean Room, Make Breakfast, Play Some Games, ]

//        System.out.println(tasks); // [Ljava.lang.String;@1b84c92


        simontasks = addToArray(simontasks, "Have a Workout");


        System.out.println(arrayToString(simontasks));

//        --------------------


        eriktasks = addToArray(eriktasks,"Make Dinner");


        System.out.println(arrayToString(eriktasks));



        simontasks = addToArray(simontasks, "Go to sleep early");
        simontasks = addToArray(simontasks, "Clean Car");



        System.out.println(arrayToString(simontasks));


        String find = findTask(simontasks, "Go");

            System.out.println("task was found: " + find);



    }

    public static String arrayToString(String[] taskList){

        String tasks = "[";

        for (String task : taskList) {
            tasks = tasks.concat(task + ", ");
        }

        return tasks + "]";
    }

    public static String[] addToArray(String[] source, String taskToAdd){
        //Create a new Array with a OG size +1
        String[] newArray = new String[source.length +1];

        //Adding all previous elements
        for (int i = 0; i < source.length; i++){
            newArray[i] = source[i];
        }

        // adding new element at the end (newArray.length -1)
        newArray[newArray.length -1] = taskToAdd;

        //RETURN new array with added task.
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

        throw new TaskNotFoundException("Task Was Not found");
    }



}
