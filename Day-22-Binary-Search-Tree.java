public static int getHeight(Node root){
    //Write your code here
      if(root ==null)
          return -1;
      int left=getHeight(root.left);
      int right=getHeight(root.right);
      return Math.max(left, right) + 1;
  }
