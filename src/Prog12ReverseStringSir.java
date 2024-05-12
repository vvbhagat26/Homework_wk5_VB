public class Prog12ReverseStringSir {
    /** To reverse a string*/
    public static void main(String[] args) {
        String orgStr="Hello";
        String revStr="";
        System.out.println("original string "+orgStr);

        for (int i=0;i<orgStr.length();i++) {
            revStr = orgStr.charAt(i) + revStr;
        }
        System.out.println("reversed string "+revStr);
        }
    }


