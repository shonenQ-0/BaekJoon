import java.util.Stack;

public class dd {
    public static void main(String[] args) {


    Object[] arr = new Object[5];
    Stack<Integer> st = new Stack<Integer>();
    st.push(2);
    st.push(7);
    arr[1] = st;

    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
        }
    }
}