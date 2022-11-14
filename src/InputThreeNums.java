import java.util.Scanner;

public class InputThreeNums {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = sc.nextInt();
        System.out.print("Input y: ");
        int y = sc.nextInt();
        System.out.print("Input z: ");
        int z = sc.nextInt();

        int max = 0, min = 0;


//       checking x
        if (x > y && x > z){
            max = x;
        } else if (x < y && x < z) {
            min = x;
        }


//      checking y
        if (y > x && y > z){
            max = y;
        } else if (y < x && y < z) {
            min = y;
        }

//      checking z
        if (z > y && z > x){
            max = z;
        } else if (z < y && z < x) {
            min = z;
        }

//        checking if some are equal
        if (x == y && z > x){
            min = x;
            max = z;
        } else if (x == z && y > x) {
            min = x;
            max = y;
        } else if (y == z && x > y) {
            min = z;
            max = x;
        } else {
            System.out.println("All numbers are equal: " + x);
        }

        System.out.println("Min: " + min + "\n" + "Max: " + max);

    }
}
