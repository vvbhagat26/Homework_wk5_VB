import java.util.ArrayList;

public class Prog4ArrayList {
    /** Write a Java program to create a new array list, add some colours (string) and
     printout the collection using for each loop.*/

    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("Red");
        color.add("Pink");
        color.add("Blue");
        color.add(("Purple"));

        for(String name:color){
            System.out.println(name);
        }
    }
}



