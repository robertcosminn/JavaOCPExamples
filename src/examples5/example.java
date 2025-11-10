package examples5;

public class example {
    private static int _s_(int n){
        int num = 5;
        if (n <= 5)
            System.out.println("N is less than num = " + num);
        else
            System.out.println("N is greater than num = " + num);

        return n;

    }

    public static void main(String[] args) {
        //example example = new example();
        //example._s_(6);
        _s_(5);
    }
}
