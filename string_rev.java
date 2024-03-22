public class string_rev {
    public static void main(String[] args) {
        String name = "Shanu Kumar";
        String revName = "";
        System.out.println(name);

        for (int i = name.length() - 1; i >= 0; i--) {
            revName += name.charAt(i);
        }
        System.out.println(revName);

    }

}
