

public static int size(Node node) {
    if(node == null){
      return 0;
    }
    int ls = size(node.left);
    int rs = size(node.right);

    int ts = ls + rs + 1;
    return ts;
  }

