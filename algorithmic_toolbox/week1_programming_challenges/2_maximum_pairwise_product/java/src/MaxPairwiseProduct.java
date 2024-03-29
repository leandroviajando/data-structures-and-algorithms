
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxPairwiseProduct {
  public static void main(String[] args) {
    FastScanner scanner = new FastScanner(System.in);
    int n = scanner.nextInt();
    long[] numbers = new long[n];
    for (int i = 0; i < n; i++)
      numbers[i] = scanner.nextInt();

    System.out.println(getMaxPairwiseProduct(numbers));
  }

  static long getMaxPairwiseProduct(long[] numbers) {
    int n = numbers.length;

    int index1 = 0;
    for (int i = 1; i < n; i++)
      if (numbers[i] > numbers[index1])
        index1 = i;

    int index2 = index1 != 0 ? 0 : 1;
    for (int i = 1; i < n; i++)
      if (i != index1 && numbers[i] > numbers[index2])
        index2 = i;

    return numbers[index1] * numbers[index2];
  }

  static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
      try {
        br = new BufferedReader(new InputStreamReader(stream));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    String next() {
      while (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }
}
