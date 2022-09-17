public class ListInterface {
    public static void main(String[] args) {
        // -----------------List Interface
        List<String> names = new ArrayList<String>();
        names.add("amit");
        names.add("pradeep");
        names.add("sumit");

        // names.add("amit");

        System.out.println(names);
        for (String e : names) {
            System.out.println(e);
        }
    }
}
