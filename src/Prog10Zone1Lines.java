import java.util.HashMap;
import java.util.Scanner;

public class Prog10Zone1Lines {
    public static void main(String[] args) {
        HashMap<String,String[]> stationLinelist=new HashMap<>();
        stationLinelist.put("Bond street",new String[]{"central","Jubilee"});
        stationLinelist.put("Charing Cross",new String[]{"Bakerloo","Northen"});
        stationLinelist.put("Euston",new String[]{"Northen","Victoria"});
        stationLinelist.put("Victoria",new String[]{"Circle","District","Victoria"});

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter station name");
        String stationName= obj.next();

        if (stationLinelist.containsKey(stationName)) {
            System.out.println("\nFollowing lines are available to " + stationName + " station : ");
            String[] lines = stationLinelist.get(stationName);
            for (String line : lines) {
                System.out.println("- " + line);
            }
        } else {
            System.out.println("\nIncorrect station name");}
       }

        }


