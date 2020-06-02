public class Problem9 {
    public static void main(String[] args) {
        int a ,b ,c;
        for(a =0;a<=1000;a++){
            for(b=0;b<=1000;b++){
                for(c=0;c<=1000;c++){
                    if(a+b+c == 1000){
                       if((a*a)+(b*b)==(c*c))
                        {
                            int result = a*b*c;
                            if(result != 0)
                                {
                                    System.out.println(result);
                                    break;
                                }
                        }            
                    }
                }
            }
        }
    }
}