/**
Print all even numbers till n.
*/

public class EvenNumTill_n{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last number");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
