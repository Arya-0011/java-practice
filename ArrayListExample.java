import java.util.ArrayList;

class Source {
    public static void main(String[] args) {
        ArrayList<Integer> random = new ArrayList<>(); // Declare and create an object of ArrayList class
        // Add the first four elements to this 'random' ArrayList
        random.add(2);
        random.add(4);
        random.add(5);
        random.add(10);

        random.add(99); // Command for adding a new element
        printArray(random);
    }

    public static void printArray(ArrayList<Integer> arr) { // Change the type of the parameter to ArrayList<Integer>
        for (Integer a : arr) { // Change the data type of 'a' from 'int' to 'Integer'
            System.out.println(a);
        }
    }
}
