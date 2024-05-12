import java.util.HashSet;

public class Prog8HashSet {/**
 Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers between 1 and 10 are in the set.*/

    public static void main(String[] args) {
        HashSet<Integer> hm=new HashSet<>();
        hm.add(4);
        hm.add(7);
        hm.add(8);

        for(int i=0;i<=10;i++){
            if(hm.contains(i)){
                System.out.println(i + " is in the set");
            }else{
                System.out.println(i + " is not in the set");
            }
        }
    }
}
