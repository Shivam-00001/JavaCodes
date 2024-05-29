import java.util.ArrayList;
import java.util.Collections;

public class arraylist{
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(12);
        marks.add(58);
        marks.add(15);
        marks.add(59);
        // System.out.println(marks);

        // set methode
        marks.set(2,100);
        System.out.println(marks);

        // get mehtode
        int element = marks.get(3);
        System.out.println(element);

        // add el in between 
        marks.add(1,1);
        System.out.println(marks);
        // delete element 
        marks.remove(3);
        System.out.println(marks);
        // size 
        int size = marks.size();
        System.out.println(size);
        // loop
         for(int i=0; i<marks.size(); i++){
            System.out.println(marks.get(i));
         }
         System.out.println();
         //shorting
         Collections.sort(marks);
        System.out.println(marks);

         
    }
}
