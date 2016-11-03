/**
 * Created by Lazarus on 3.11.2016.
 *
 * Exercise 5.3 Draw a stack diagram that shows the state of the program in
 Section 5.8 after main invokes nLines with the parameter n == 4, just before
 the last invocation of nLines returns.

 Anwser:

 nlines | n | 1 |

 */
public class Harjutus5_3 {
    public  static void main(String[]args){
       System.out.println("something");
        nLines(4);
        System.out.print("something");
    }
    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }

}
