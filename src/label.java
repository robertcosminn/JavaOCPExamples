public class label {
    public String label(String title, String author) {
        return """
           Book:
           """ + title + " by " + author;
    }
    public void prepare() {
        String labelled = label("""
      Java Study Guide
      For Java 21
      2024 Edition""", "Jeanne & Scott");
        System.out.println(labelled);
    }
}
