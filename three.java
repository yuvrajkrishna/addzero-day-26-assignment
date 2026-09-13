public class three {
    public static void main(String[] args) {
        String str = "nun";
        int start = 0 ;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("Not Palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}
