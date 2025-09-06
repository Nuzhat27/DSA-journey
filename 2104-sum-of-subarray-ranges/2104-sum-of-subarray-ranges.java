class Solution {
    public long subArrayRanges(int[] arr) {
    int n = arr.length;
    long gval , sval , ans = 0;
    gval = getsumSubarrayMax(arr);
    sval = getsumSubarrayMin(arr);
    ans = gval - sval;
    return ans;
  }

  private long getsumSubarrayMin(int[] arr) {
    int n = arr.length;
    long ans = 0, sfreq;
    int[] nextSmallerElement = findNSE(arr);
    int[] prevSmallerElement = findPSE(arr);
    for (int i = 0; i < n; i++) {
      int sleft = i - prevSmallerElement[i];
      int sright = nextSmallerElement[i] - i;
      sfreq = (long) sleft * sright;
      ans += (sfreq * arr[i]);
    }
    return ans;
  }

  private long getsumSubarrayMax(int[] arr) {
    int n = arr.length;
    long ans = 0, gfreq;
    int[] nextGreaterElement = findNGE(arr);
    int[] prevGreaterElement = findPGE(arr);
    for (int i = 0; i < n; i++) {
      int gleft = i - prevGreaterElement[i];
      int gright = nextGreaterElement[i] - i;
      gfreq = (long) gleft * gright;
      ans += (gfreq * arr[i]);
    }
    return ans;
  }

  // Find next greater element
  private int[] findNGE(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
        st.pop();
      }
      ans[i] = !st.isEmpty() ? st.peek() : n;
      st.push(i);
    }
    return ans;
  }

  // Find previous greater element
  private int[] findPGE(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
        st.pop();
      }
      ans[i] = !st.isEmpty() ? st.peek() : -1;
      st.push(i);
    }
    return ans;
  }

  // Find next smaller element
  private int[] findNSE(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
        st.pop();
      }
      ans[i] = !st.isEmpty() ? st.peek() : n;
      st.push(i);
    }
    return ans;
  }

  // Find previous smaller element
  private int[] findPSE(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
        st.pop();
      }
      ans[i] = !st.isEmpty() ? st.peek() : -1;
      st.push(i);
    }
    return ans;
  }
}