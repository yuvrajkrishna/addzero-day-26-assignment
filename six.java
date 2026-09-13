public class six {
    public static void main(String[] args) {
        String str = "Hello";
        char[] ch = str.toCharArray();
        char change = 'l';
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == change){
                ch[i] = 'm';
                break;
            }
        }
        System.out.println(ch);
    }
}
