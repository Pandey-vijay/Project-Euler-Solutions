public class Problem4 {
    public static void main(String[] args) {
        Problem4 program5 = new Problem4();
        int lower =1;
        int higher = 99999;
        int out = 0;
        for(int i = lower;i<=higher;i++){
            for(int j = higher ; j>=lower;j--){
                int no = i*j;
                if(program5.isPalindrome(no))
                {
                    if(no > out)
                        out= no;
                }
            }
        }

        System.out.println(out);
    }

    public boolean isPalindrome(int no){
        boolean out = false;
        int rev = 0;
        int temp = no;
        while(no > 0){
            int remainder = no%10;
            rev+=remainder;
            rev*=10;
            no/=10;
            
        }
        
        rev/=10;

        if(temp == rev)
            out = true;
        return  out;
    }
}