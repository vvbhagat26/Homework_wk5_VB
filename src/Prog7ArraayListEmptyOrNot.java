import java.util.ArrayList;

public class Prog7ArraayListEmptyOrNot {

    /**Write a Java program to test if an array list is empty or not.
     */
    public static void main(String[] args) {
        ArrayList<String> flower=new ArrayList<>();
        flower.add("Rose");
        flower.add("Lily");
        flower.add("Tulip");
        flower.add("Daisy");

        if(flower.isEmpty()){
            System.out.println("The arraylist is empty");}
        else{
            System.out.println("list is not empty");
        }



    }
}
