


  public static Node transBackFromLeftClonedTree(Node node){
    if(node == null){
      return null;
    }
     Node ln  = transBackFromLeftClonedTree(node.left.left);
     Node rn = transBackFromLeftClonedTree(node.right);
  
     node.left = ln;
     node.right = rn;
  
     return node;
  
  
    }