import java.math.BigDecimal;

public class Program3 {
    public static void main(String[] args) {
        
        Program3 program4 = new Program3();
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal input = new BigDecimal("600851475143");
        int i = 2;
        while(input.compareTo(new BigDecimal(1))!=0){
            if(program4.isPrime(i))
                {
                   BigDecimal op[]  =  input.divideAndRemainder(new BigDecimal(i));
                   if(op[1] == BigDecimal.ZERO)
                   {
                       input = op[0];
                       result = new BigDecimal(i);
                       System.out.println(result);
                       System.out.println(input);
                       i = 1;
                   }
                }
            i++;
        }
        System.out.println(result);
    }

    public boolean isPrime(int no)
    {
        boolean out = true;
        for(int i = 2;i<no;i++)
        {
            if(no%i ==0)
            {    
                out = false;
                break;
            }
        }

        return out;
    }
}