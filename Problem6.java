public class Problem6 {
    public static void main(String[] args) {
        int range = 100;
        int sumSquare = 0;
        int squareSum = 0;
        for(int i =1;i<=range;i++){
            sumSquare += i;
            squareSum += i*i;
        }
        sumSquare*=sumSquare;
        System.out.println(sumSquare-squareSum);
    }
}