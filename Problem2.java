public class Problem2 {
    public static void main(String[] args) {
      Problem2 program3 = new Problem2();
      program3.fibo();  
    }

    public void fibo(){
        int a = 1;
        int b = 2;
        int c;
        int out = 2;
        while(b<4000000){
            c = a+b;
            a = b;
            b = c;
            if(b%2==0)
                out+=b;
            }
        System.out.println(out);
    }
}