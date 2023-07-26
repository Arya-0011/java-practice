import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ExceptionHanding {
   public static void main(String[] args) {
      // Enter a string in the input console
      try {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String inData;
        inData = stdin.readLine();
 
        System.out.println("You wrote: " + inData);
 
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println("You wrote: Hello");
      }
      
   }
}
