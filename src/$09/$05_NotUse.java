package $09;

public class $05_NotUse {
//    public static boolean compareNames(String name) {
//        try {
//            return name.equals("Ronin");   // NullPointer
//        }
//        catch (NullPointerException ex) {
//            System.out.println("name is null!!!");
//            return false;
//        }
//    }

    public static void main(String[] agrs) {
        System.out.println(compareNames(null));
    }

    public static boolean compareNames(String name) {
        if (name == null) {
            return false;
        }

        return name.equals("Ronin");
    }


//    public void printName(String name) {
//        if (name == null) {
//            System.out.println("name is null!!!");
//        }
//        else {
//            System.out.println(name);
//        }
//    }
}
