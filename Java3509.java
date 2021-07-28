import java.util.Random;
public class Java3509
{
   public static void main(String args[])
   {
      System.out.println("\nJAVA3509.JAVA\n");
      TreeNode root = createBST();
      traverseInOrder(root);
      System.out.println();
   }
   
   public static void traverseInOrder(TreeNode p)
   {
      if(p != null)
      {
         traverseInOrder(p.getLeft());
         System.out.print(p.getValue() + " ");
         traverseInOrder(p.getRight());
      }
   }
   
   public static TreeNode createBST()
   {
      Random rndObj = new Random(12345);
      int rndInt = rndObj.nextInt(9000) + 1000;
      TreeNode t1 = null, t2 = null, t3 = null;
      TreeNode root = new TreeNode(rndInt, null, null);
      System.out.print(root.getValue() + " ");
      t2 = t3 = root;
      for(int k = 2; k <= 40; k++)
      {
         rndInt = rndObj.nextInt(9000) + 1000;
         t1 = new TreeNode(rndInt,null,null);
         System.out.println(t1.getValue() + " ");
         while(t2 != null)
         {
            t3 = t2;
            if(t1.getValue() > t2.getValue())
            {
               t2 = t2.getRight();
            }
            else
            {
               t2 = t2.getLeft();
            }
         }
         
         if(t1.getValue() > t3.getValue())
         {
            t3.setRight(t1);
         }
         else
         {
            t3.setLeft(t1);
         }
         
         t2 = root;
      }
      
      return root;
   }
}

class TreeNode
{
   private int value;
   private TreeNode left;
   private TreeNode right;
   
   public int getValue()
   {
      return value;
   }
   
   public TreeNode getLeft()
   {
      return left;
   }
   
   public TreeNode getRight()
   {
      return right;
   }
   
   public void setValue(int theNewValue)
   {
      value = theNewValue;
   }
   public void setLeft(TreeNode theNewLeft)
   {
      left = theNewLeft;
   }
   public void setRight(TreeNode theNewRight)
   {
      right = theNewRight;
   }
   
   public TreeNode(int initValue, TreeNode initLeft, TreeNode initRight)
   {
      value = initValue;
      left = initLeft;
      right = initRight;
   }
}