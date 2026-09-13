public class four {
    public static void main(String[] args) {
        String str = "Hello   How   are ";

        String arr[] = str.trim().split("\\s+");

        System.out.println(arr.length);     
    }
}

