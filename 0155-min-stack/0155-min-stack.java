import java.util.Stack;

class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        } else if (val < min) {
            st.push(2L * val - min);
            min = val;
        } else {
            st.push((long) val);
        }
    }

    public void pop() {
        if (st.isEmpty()) return;
        long x = st.pop();
        if (x < min) {
            min = 2 * min - x;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;
        long t = st.peek();
        if (t < min) {
            return (int) min;
        } else {
            return (int) t;
        }
    }

    public int getMin() {
        return (int) min;
    }
}