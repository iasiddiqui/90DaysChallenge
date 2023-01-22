//Given a Binary Tree, find the In-Order Traversal of it.


class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
    ArrayList<Integer>list=new ArrayList<Integer>();
        // Code
        if(root!=null){
            list.addAll(inOrder(root.left));
            list.add(root.data);
            list.addAll(inOrder(root.right));
        }
        return list;
    }
}
