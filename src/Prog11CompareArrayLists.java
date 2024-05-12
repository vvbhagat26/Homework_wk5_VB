import java.util.ArrayList;

public class Prog11CompareArrayLists {
    /**Declare following two arrylist and compare it.*/

    public static void main(String[] args) {
        ArrayList<String> c1=new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        // System.out.println(c1);

        ArrayList<String> c2=new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        //System.out.println(c2);

        if(c1.equals(c2)){
            System.out.println("Both lists are equal");}
        else {
            System.out.println("Both lists are not equal");
        }

    }
}
