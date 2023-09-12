public class Main {
    public static void main(String[] args) {
        int resultOne = add(1,2);
        System.out.println(resultOne);

        String resultTwo = greeting("king");
        System.out.println(resultTwo);

        int resultThree = add(1,1,1,1);
        System.out.println(resultThree);

        printMe("amboise");


    }

    public static int add(int numOne, int numTwo){
        return(numOne+ numTwo);
    }

    public static String greeting(String name){
        return("Bonjour " + name + "!");
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int number = add(numOne, numTwo);
        number = add(number,numThree);
        number = add(number,numFour);
        return (number);

    }

    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);

    }

}
