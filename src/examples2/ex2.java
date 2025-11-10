package examples2;

public class ex2 {
    public static void main(String[] args) {
       // byte apples = 3;
       // short oranges = 5;
       // long bananas = apples + oranges;

        long ear = 10;
        long hearing = 2 * ear;
        System.out.println(hearing);

        boolean canine = true, wolf = true;
        int teeth = 20;
        canine = (teeth != 10) ^ (wolf=false);
        System.out.println(canine + ", "+ teeth + ", " + wolf);

    }
}
