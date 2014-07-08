class TreeNode implements Comparable<TreeNode> {
	TreeNode leftChild;
	TreeNode rightChild;
	int value;
	boolean visited = false;
	
	public TreeNode(int value, TreeNode leftChild, TreeNode rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	@Override
	public int compareTo(TreeNode node) {
		return this.value - node.value;
	}
}

public class MyBinaryTree {

	TreeNode rootNode;
	
	public void addTreeNode(int value) {
		if (null != rootNode) {
			TreeNode currentNode = rootNode;
			TreeNode tempNode = rootNode;
			while (currentNode != null) {
				if (currentNode.value < value) {		// Add as right child
					if (currentNode.rightChild != null) { 
						currentNode = currentNode.rightChild;
					} else {
						TreeNode newTreeNode = new TreeNode(value, null, null);
						currentNode.rightChild = newTreeNode;
						break;
					}
				} 
				if (currentNode.value > value) {		// Add as left child
					if (currentNode.leftChild != null) {
						currentNode = currentNode.leftChild;
					} else {
						TreeNode newTreeNode = new TreeNode(value, null, null);
						currentNode.leftChild = newTreeNode;
						break;						
					}					
				}
			}
		} else {
			rootNode = new TreeNode(value, null, null);
		}
	}
	
}
