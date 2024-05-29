import java.util.Scanner;
public class array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();
        
        System.out.println("Size of array is " + size);
        int marks[] = new int [size];

        for(int i=0; i<size; i++){
            marks[i]= sc.nextInt();
        }
        System.out.println("kuch bhi");
        // System.out.println("value"+ marks[4]);

        for(int i =0; i<size; i++){
            System.out.println("array "+ marks[i]);
        }
    }
}
