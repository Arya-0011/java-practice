package Interview;

import java.util.ArrayList;

public class ArrayListInJava {

    public static void main(String[] args) {

        ArrayList<Float> random = new ArrayList<>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        printArray(random);
    }

   public static void printArray(ArrayList<Float> elements) {
    
       //Complete the method declaration here
       for(Float element: elements){
        System.out.println(element);
       }
   }
}
