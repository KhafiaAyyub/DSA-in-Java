

public static int max(Node node) {
    if(node == null){
      return 0;
    }
   int  lmax = max(node.left);
    int rmax = max(node.right);
   int  tmax = Math.max(Math.max(lmax,rmax),node.data);
   return tmax;
  }
