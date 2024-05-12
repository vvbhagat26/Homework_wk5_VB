import java.util.HashMap;

public class Prog9HashMap {
    /**Create a HashMap object called people that will store String keys and Integer
     values: And use for each loop to iterate the value from Map.*/

    public static void main(String[] args) {
        HashMap<String,Integer> people= new HashMap<>();
        people.put("Raj",11);
        people.put("Rekha",22);
        people.put("Kamal",34);
        people.put("Rakhi",48);

        //For each loop to iterate people object-collection of multiple people and their age

        for (int age:people.values()){
            System.out.println("Age is :" + age);
        }






    }
}
