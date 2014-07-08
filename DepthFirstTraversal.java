public class DepthFirstTraversal extends MyBinaryTree {

	public void inOrderDisplay(TreeNode node) {
		if (null != node) {
			inOrderDisplay(node.leftChild);
			System.out.print(node.value + " ");
			inOrderDisplay(node.rightChild);
		}
	}

	public void preOrderDisplay(TreeNode node) {
		if (null != node) {
			System.out.print(node.value + " ");
			inOrderDisplay(node.leftChild);
			inOrderDisplay(node.rightChild);
		}
	}

	public void postOrderDisplay(TreeNode node) {
		if (null != node) {
			inOrderDisplay(node.leftChild);
			inOrderDisplay(node.rightChild);
			System.out.print(node.value + " ");
		}
	}
	
	public static void main(String[] args) {
		DepthFirstTraversal dft = new DepthFirstTraversal();
		dft.addTreeNode(10);
		dft.addTreeNode(7);
		dft.addTreeNode(12);
		dft.addTreeNode(5);
		System.out.println("\nIn Order Traversal");
		dft.inOrderDisplay(dft.rootNode);
		System.out.println("\nPre Order Traversal");
		dft.preOrderDisplay(dft.rootNode);
		System.out.println("\nPost Order Traversal");
		dft.postOrderDisplay(dft.rootNode);
	}
}
