public class Hello {
    // psvm tells it where to start
    public static void main(String[] args) {
        
        //PRIMITIVES
        // primitives int, double, char, boolean start lower case
        int myNum = 7;
        double myDecimal = 0.2;
        char myChar = 'a';
        // single quotes for char, double for String, Arrays, Classes, Interface
        boolean myBool = false;

        //OBJECTS
        // objects (non-prims) start upper case String...
        String greeting = "hey friends";
        //semi colons end a statement

        if(myBool) {
            // sout
            System.out.println(greeting);
        } else {
            System.out.println(myNum);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        

    }
}