package examples;

public class ex12 {
    static int gills = 0;
    static double weight = 2;
    {int fins = gills;}
    private static void print(int length){
        System.out.println(gills);
        System.out.println(weight);
        System.out.println();
        System.out.println(length);
    }

    public static void main(String[] args) {
        print(3);
    }

}
