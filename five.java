public class five {
    public static void main(String[] args) {
        String str = "hello";
        String st2 = new String("hello");
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != st2.charAt(i)){
                System.out.println("Not Same");
                return;
            }
        }
        System.out.println("Same");
    }
}
