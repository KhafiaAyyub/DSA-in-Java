import java.util.*;

public class PreOrderBTInAnArrayForm {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node,int state){ //constructor
            this.node = node;
            this.state = state;
        }
    }

   public static void main(String[]args) throws Exception {
    Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

    Node root = new Node(arr[0],null,null); //array in preorder,1st value root's data.
    Pair rootpair = new Pair(root,1);            //new pair defined, root is stored as node and 1 as state.

    Stack<Pair> st = new Stack<>();                     //a stack of type Pair
    st.push(rootpair);
    
    int idx = 0;
    while(st.size() > 0){                               //run while loop until stack get empties
        Pair top = st.peek();                           //first value
        if(top.state == 1){  //left nodes
            idx++;
            if(arr[idx] != null){                       //check whether arr(idx) equals null or not.
                top.node.left = new Node(arr[idx],null,null);  //define a new Node lp (left child pair) and pass arr(idx) as data value.
                Pair lp = new Pair(top.node.left,1);//we set the Node lp as left of Node & lp as it's Node and 1 as state
                st.push(lp);                              //push this pair into the stack
            }else{
                top.node.left = null;
            }
            top.state++;
        }else if(top.state == 2){  //right nodes
            idx++;
            if(arr[idx] != null){
                top.node.right = new Node(arr[idx],null,null);
                Pair rp = new Pair(top.node.left,1);
                st.push(rp);
            }else{
                top.node.left = null;
            }
            top.state++;

        }else{
            st.pop();
        }
    }


   }
}