import java.util.ArrayList;

public class Prog6RetrieveAnElement {
    /**Write a Java program to retrieve an element (at a specified index) from a given
     array list*/

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        int retriever = 2; //Index is 2

        if (retriever >= 0 && retriever < arrayList.size()) {
            int retrieveelement = arrayList.get(retriever);
            System.out.println("Element at index  " + retriever + " is :" + retrieveelement);
        }
    }
}
