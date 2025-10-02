package HW8;

public enum Color {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    BLACK("black");
    private final String title;

    Color (String title){
        this.title=title;

    }
    public  String getTitle(){
        return title;
    }
}
