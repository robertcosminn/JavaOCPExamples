package examples;

public class ex21 {
    int count;
    {
        System.out.println(count+"-");
    }
    {count++;}
    public ex21(){
        count = 4;
        System.out.println(2+"-");
    }

    public static void main(String[] args) {
        System.out.println(7+"-");
        var s = new ex21();
        System.out.println(s.count+"-");
    }
}
