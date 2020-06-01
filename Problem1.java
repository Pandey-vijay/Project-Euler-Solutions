public class Problem1 {
    public static void main(String[] args) {
        int range = 1000;
        int out = 4000000;
        for(int i = 0 ;i<range;i++){
            if(i%3==0||i%5==0)
                out+=i;
            }
        System.out.println(out);
    }
}