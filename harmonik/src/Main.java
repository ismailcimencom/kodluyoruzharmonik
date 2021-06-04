public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] lis={15,6,7,12,7,9,3};
        double sum=0;
        for (double i=0;i<lis.length;i++){
            sum+=1/(i+1);
        }
        System.out.println(sum);
    }
}
