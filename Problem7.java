public class Problem7 {
    public static void main(String[] args) {
        int count = 0;
        int primeCount = 10001;
        int i =2;
        while(count!=primeCount)
        {
            boolean isPrime = true;
            for(int j = 2;j<i;j++)
            {
              if(i%j == 0)
                {
                    isPrime = false;
                    break;
                }  
            }
            if(isPrime)
               { count++;
                System.out.println(i);
            }
            
            i++;

        }
        int out = i-1;
        System.out.println(out);
    }
}