/*
Not my code. This was done by a "Lewin" that participated in the 2016 code jam.
Gonna borrow their code to learn new techniques.
*/

package GoogleCodeJam;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class CoinJamByLewinCorrent {
  private static InputReader in; // instantiates input reader
  private static PrintWriter out; // instantiates output writer 
  public static boolean SUBMIT = true; // setting some constant to true
  public static final String NAME = "C-small-practice.in.txt"; // name of file
  
  private static void main2() throws IOException {
    int n = in.nextInt(), j = in.nextInt(); // setting the input values
    char[] s1 = new char[n];  // create a char array with the size of the number of binary values in the coin jam
    Arrays.fill(s1, '0'); // fill the code jam with 0's
    s1[n-1] = '1'; // fill the last element in the array with a one
    s1[n/2-1] = '1'; // fill approximately the middle value of the array with a 1 - ? thought the beginning needed to be a one?
    BigInteger[] mult = new BigInteger[11]; // create an array of BigIntegers with size 11 ...also confusing
    for (int i = 2; i <= 10; i++) {     // from base 2 to base 10
      mult[i] = new BigInteger(new String(s1), i);  // fill mult with the value of a given base from the string s1
    }
    char[] s2 = new char[n];    // create a new char arrray with size N
    Arrays.fill(s2, '0');       // fill this array with zeros
    s2[n/2] = '1';      // fill the middle value with a 1
    BigInteger a1 = mult[2];        // set a variable al with the base 2 representation of the string s1
    int count = 0;      // set count to 0
    for (int i = 1; count < j; i += 2) {    // set i to 1 and repeat as many times there are j (this will create the number of rows)
      BigInteger add = new BigInteger(new String(s2), 2);   // variable add is set to whatever this string is at base 2
      add = add.add(new BigInteger(""+i));  // set add to the the sum of add and BigInteger representation of i
      BigInteger result = add.multiply(a1); // sets result to the value of add multiplied with the base 2 value from first array s1
      out.print(result.toString(2));
      for (int k = 2; k <= 10; k++) out.print(" "+mult[k]);
      count++;
      out.println();
    }
  }

  public static void main(String[] args) throws IOException {
    if (SUBMIT) {
      in = new InputReader(new FileInputStream(new File(NAME)));
      out = new PrintWriter(new BufferedWriter(new FileWriter(NAME + ".out")));
    } else {
      in = new InputReader(System.in);
      out = new PrintWriter(System.out, true);
    }

    int numCases = in.nextInt();
    for (int test = 1; test <= numCases; test++) {
      out.println("Case #" + test + ":");
      main2();
    }

    out.close();
    System.exit(0);
  }

  // create an InputReader class
  static class InputReader {
    public BufferedReader reader;  // instantiate the BufferedReader
    public StringTokenizer tokenizer;   //instantiate a StringTokenizer

    public InputReader(InputStream stream) {    // create constructor for inputReader
      reader = new BufferedReader(new InputStreamReader(stream), 32768); //initiailize buffered reader
      tokenizer = null; //initialize tokenizer
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }
}
