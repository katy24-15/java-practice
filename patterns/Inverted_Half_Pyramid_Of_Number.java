/**
1111
222
33
4
*/

public class Inverted_Half_Pyramid_Of_Number {
    public static void main(String[] args) {
    int n = 4;
    for(int i = n; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print(n-i+1);
        }
        System.out.println();
    }
  }
}
