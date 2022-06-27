import java.io.*;

import java.util.*;

public class mainClass {
    
  public static class Node {
    int data;
    Node left;
    Node right;
  }

  Node(int data, Node left, Node right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}
