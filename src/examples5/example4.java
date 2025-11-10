package examples5;

public class example4 {
    public final void walk1(int... steps){
        for (int i = 1; i < steps.length + 1; i++ )
            System.out.println(i);
    }

    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3};
        example4 example = new example4();
        example.walk1(data);
        
    }
}


