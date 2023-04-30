package HelpClass;

public class SomeMethods {
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public boolean isDate(String name) {
        return name.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static void main(String[] args) {
        SomeMethods someMethods=new SomeMethods();
        System.out.println(someMethods.isDate("09-09=1000"));
    }

}
