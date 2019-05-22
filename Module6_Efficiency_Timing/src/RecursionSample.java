public class RecursionSample {
    public static void main(String[] args) {
        int a = 12, b = 5;
        int sum = recursion1(a,b);
        System.out.println("Multiplication of " + a + " and " + b +" is : "+sum);
    }
    public static int recursion1(int a,int b)
    {
        if(b==0 || a==0)
            return 0;
        else
            return a + recursion1 (a,b-1);
    }

}


