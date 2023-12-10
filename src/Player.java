public class Player {
    private static String name;
    private static Object die;

    public static String getName() {
        return name;
    }

    public static void setName(String nameInput) {
        name = nameInput;
    }

    public static Object getDie() {
        return die;
    }

    public void setDie(int dieThing) {
        die = dieThing;
    }
}
