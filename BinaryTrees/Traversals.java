public static void traversalPreorder(Node node)
  {
    if (node == null)
    {
      return;
    }
    System.out.print(node.data + " ");
    traversalPreorder(node.left);
    traversalPreorder(node.right);
  }

  public static void traversalPostorder(Node node)
  {
    if (node == null)
    {
      return;
    }
    traversalPreorder(node.left);
    traversalPreorder(node.right);
    System.out.print(node.data + " ");
  }

  public static void traversalInorder(Node node)
  {
    if (node == null)
    {
      return;
    }
    traversalPreorder(node.left);
    System.out.print(node.data + " ");
    traversalPreorder(node.right);

  }
