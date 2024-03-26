package learningCheck;

import java.util.Arrays;

public class ValidPairSum {
  
  public static void main(String[] args) {
    
    int n = 6, a[] = {3, -2, 1, -5, -4, 6};
    System.out.println(ValidPair(a, n));
    // System.out.println(validPair2(a, n));
  }
  
  static long ValidPair(int a[], int n)
  { 
    // Your code goes here

    // this is correct but naive solution as it will take O(n^2) it can be O(nlogn)
    int count = 0;
      for(int i=0;i<n-1;i++){
          
          for(int j=i+1;j<n;j++){
            if (a[i] + a[j] > 0) {
                  count++;
              }
          }
      }
      return count;
    }

    // This will not cover all scenarios

//	static int validPair2(int a[], int n) {
//		Arrays.sort(a);
//		int count = 0;
//
//		int base = 0;
//		int end = n - 1;
//		while (base < end) {
//			if (a[base] + a[end] > 0)
//				count++;
//			base++;
//		}
//		return count;
//	} 


    static int lowerBound(int a[], int x) {
      int l = -1, r = a.length;
      while (l + 1 < r) {
        int m = (l + r) >>> 1;

        if (a[m] >= x)
          r = m;
        else
          l = m;
      }
      return r;
    }

    static long ValidPair2(int a[], int n) {
      Arrays.sort(a);
      long ans = 0;
      for (int i = 0; i < n; ++i) {
        if (a[i] <= 0)
          continue;
        // search for first element >= (-a[i] + 1)
        int j = lowerBound(a, -a[i] + 1);
        ans += (i - j);
      }
      return ans;
    }
}
