import java.util.ArrayList;
import java.util.List;

public class BreadthFirstTraversal extends MyBinaryTree {
	
	List<TreeNode> list = new ArrayList<TreeNode>();

	public void depthFirstTraversal(TreeNode currentNode) {
		
		if (currentNode != null)  {
			if (!currentNode.visited) {
				list.add(currentNode);
				currentNode.visited = true;
			} else {
				System.out.println(currentNode.value);
			}

			if (currentNode.leftChild != null && !currentNode.leftChild.visited) {
				list.add(currentNode.leftChild);
				currentNode.leftChild.visited =true;
			}
			if (currentNode.rightChild != null && !currentNode.rightChild.visited) {
				list.add(currentNode.rightChild);
				currentNode.rightChild.visited =true;
			}
			
			try {
				TreeNode node = list.remove(0);
				depthFirstTraversal(node);
			} catch (NullPointerException | IndexOutOfBoundsException e) {
				System.out.println("End of Tree!");
			}
		}
			
	}
		

	public static void main(String[] args) {
		BreadthFirstTraversal bft = new BreadthFirstTraversal();
		bft.addTreeNode(11);
		bft.addTreeNode(9);
		bft.addTreeNode(15);
		bft.addTreeNode(7);
		bft.addTreeNode(12);
		bft.addTreeNode(10);
		bft.addTreeNode(8);
		bft.addTreeNode(16);
		bft.addTreeNode(5);
		
		bft.depthFirstTraversal(bft.rootNode);

	}

}
