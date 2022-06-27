
public static int sum(Node node) {
    if(node == null){
      return 0 ;
    }
    int ls = sum(node.left);
    int rs = sum(node.right);
    int sum = ls + rs + node.data;
    return sum;
  }

