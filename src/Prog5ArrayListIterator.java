import java.util.ArrayList;
import java.util.Iterator;

public class Prog5ArrayListIterator {

    /**Write a Java program to iterate through all elements in an array list using
     * iterator
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(9);

        Iterator<Integer>list=arrayList.iterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }
}
