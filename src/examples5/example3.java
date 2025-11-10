package examples5;

public class example3 {

    int hunger = 4;

    public int feedZooAnimals() {
        int snack = 10;
        if(snack > 4){
            long DinnerTime = snack ++;
            hunger--;
        }
        return snack;
    }

    public static void main(String[] args) {
        example3 example = new example3();
        int i = example.feedZooAnimals();
        System.out.println(i);
    }
}


