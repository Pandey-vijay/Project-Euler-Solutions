public class Problem5 {
    
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Problem5 problem1 = new Problem5();
        int range =20;
        long out = 1;
        for(int i =2;i<=range;i++){
            if(problem1.isPrime(i)){
                out *= problem1.maxPower(i, range);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(out);
        System.out.println(endTime-startTime);
    }

    public boolean isPrime(int no)
    {
        boolean prime = true;

        for(int i=2; i<no;i++)
        {
            if(no%i==0)
            {  prime = false; 
                break;
            }
        }

        return prime;
    }

    public int maxPower(int no,int range){
        int out = no;
        while(out<range)
        {
            out*=no;
          //  System.out.println(out);
        }

        System.out.println(out/no+"\n");
        return out/no;
    }

}