public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 17;
        int c = 15;
        int d = 9;

        int result1 = a + b;
        int result2 = c + d;

        boolean comparison1 = result1 > result2;

        System.out.println("The result of the first comparison is " + comparison1);

        --result1;
        result2 += 2;

        boolean comparison2 = result1 > result2;

        System.out.println("The result of the second comparison is " + comparison2);

        boolean comparison3 = (result1 % 2 == 0) || (result2 % 2 == 0);

        System.out.println("The result of the third comparison is " + comparison3);



    }
}