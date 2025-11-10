public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight){
        //this.weight = weight;
        //color = "brown";
        this(weight, "Brown");
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        var hamster = new Hamster(20);
        System.out.println(hamster.getColor());
        var hamster1 = new Hamster(21,"Pink");
        System.out.println(hamster1.getColor());
        
    }

}
