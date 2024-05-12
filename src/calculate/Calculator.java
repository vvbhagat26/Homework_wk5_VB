package calculate;

public class Calculator {

    /** Calculator program from user input
     * Add,subtract,multiply,divide
     * Write a “main” method into the main class. It has a scanner that takes
     * user input. Also write the logic that it ask user to “Enter first Number:”,
     * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
     * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
     * other symbols.
     * With the result it’s also print one more message “Would you like to do
     * more calculation Please enter “Y” or “N” :”
     */


    public void addition(int a, int b) {
    int result=a+b;
        System.out.println(result);
    }

    public void subtraction(int a,int b){
        int result=a-b;
        System.out.println(result);
    }

    public void multiplicataion(int a,int b){
        int result=a*b;
        System.out.println(result);
    }
    public void division(int a,int b){
        int result=a/b;
        System.out.println(result);
    }

    //calculateResult

    public void calculateResult(int a,int b,char c){
        int result=0;
        if( c=='+'){
            addition(a,b);
            System.out.println(" addition of " + a + " and " + b +" is: " + result);
        }else if(c=='-'){
            subtraction(a,b);
            System.out.println(" subtraction of " + a +" and "+ b +" is: " + result);
        }else if(c=='*'){
            multiplicataion(a,b);
            System.out.println(" multiplcation of " + a + " and "+ b +" is:"+result);
        }else if(c=='/'){
            division(a,b);
            System.out.println(" division of " +a+"and"+b +"is:"+result);
        }
    }

}