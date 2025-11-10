package examples4;

public class ex1 {
    public static void main(String[] args) {
        var name = "James";
        var score = 90.25;
        var total = 100;
        System.out.println("%s:%n   Score: %.2f out of %d"
                .formatted(name, score, total));
    }
}


