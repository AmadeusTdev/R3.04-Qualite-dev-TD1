package TD1_2;

public class Test {
    public static void main(String args[]) {
        // Home test
        Home myHome = new Home("Moi", "5 avenue des corbeaux", 456);
        System.out.println(myHome);
        System.out.println("Mes taxes: " + myHome.tax());

        // PersonalHome test
        PersonalHome myPersonalHome = new PersonalHome("Moi", "3 rue patate", 145, 5, true);
        System.err.println(myPersonalHome);
        System.out.println("Mes taxes: " + myPersonalHome.tax());

        // ProHome test
        ProHome myProHome = new ProHome("google", "google avenue jsp", 1250, 489);
        System.out.println(myProHome);
        System.out.println("Ses taxes: " + myProHome.tax());
    }
}
