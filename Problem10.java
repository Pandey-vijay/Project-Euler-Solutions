public class Problem10 {
    long startTime = System.currentTimeMillis();
    long sum;
    int count = 0;
    public static void main(String[] args) {
        Problem10 problem10 = new Problem10();
        Prime prime = new Prime(2,200000,1,problem10);
        Prime prime1 = new Prime(200001,400000,2,problem10);
        Prime prime2 = new Prime(400001,800000,3,problem10);
        Prime prime3 = new Prime(800001,1000000,4,problem10);
        Prime prime4 = new Prime(1000001,1200000,5,problem10);
        Prime prime5 = new Prime(1200001,1400000,6,problem10);
        Prime prime6 = new Prime(1400001,1600000,7,problem10);
        Prime prime7 = new Prime(1600001,1800000,8,problem10);
        Prime prime8 = new Prime(1800001,2000000,9,problem10);
        prime.start();
        prime1.start();
        prime2.start();
        prime3.start();
        prime4.start();
        prime5.start();
        prime6.start();
        prime7.start();
        prime8.start();
    }

    synchronized public void calSum(long no){
        sum+=no;
    }

    public void display(){
        count++;
        if(count == 9){
            System.out.println(sum);
            System.out.println((System.currentTimeMillis()-startTime)/60000);
         }   
    }
}


class Prime extends Thread
{
    long sum =0;
    int intial ;
    int fin,no;
    Problem10 problem10;
    Prime(int intial,int fin,int no,Problem10 problem10)
    {
        this.intial = intial;
        this.fin = fin;
        this.no = no;
        this.problem10 = problem10;
    }

    @Override
    public void run() {
        for(int i = intial;i<=fin;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
             {  sum += i;}
        }
        problem10.calSum(sum);
        problem10.display();
    }
    
}