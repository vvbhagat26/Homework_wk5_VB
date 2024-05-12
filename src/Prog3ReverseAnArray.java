public class Prog3ReverseAnArray {
/**Write a Java program to reverse an array of integer values.
 * */
public static void main(String[] args) {
    int a[] = {10, 20, 30, 40, 50, 60};
    int i=a.length-1;
    reverseArray(a);

}
    public static void reverseArray(int a[]){
    for(int i=a.length-1;i>=0;i--){
        System.out.println("The reverse array sequence is:" + a[i]);
}
}}
