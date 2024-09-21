// // /* create linked list
// //  * add items to linkedlist
// //  * loop through linkedlist 
// //  * add items from linkedlist to binary search tree
// //  * in order recurse through BST printing list in order
// //  */

// // import java.util.*;
// // public class orderedList {

// //     public static List<String> addToList(List<String> bob, Scanner taco) {
// //         List<String> larry = new ArrayList<>();

// //         String anotherString = "yes";
// //         while (anotherString.equals("yes")) {
// //             System.out.println("Do you want to add another word to the list?");
// //             anotherString = taco.nextLine();   
// //             if(anotherString.equals("yes")) {
// //                 System.out.println("WHat word would you like to add to the list?");
// //                 bob.add(taco.nextLine());                
// //             }
// //         }

// //         System.out.println("List Complete");
// //         for(int i = 0; i < bob.size() ; i++) {
// //             System.out.println(bob.get(i));
// //         }
// //         return larry;
// //     }

// //     public static void binaryST(List<String> bob) {
// //         for(int i = 0; i < bob.size(); i++) { 
// //             Node<String> cheese= new Node<>(bob.get(i));
// //         }

// //     }
// //     // Should this come before or after
// //     class Node {
// //         String data;
// //         Node next;
// //         public Node(String data) {
// //             this.data = data;
// //             this.next = null;
// //         }
// //     }

// //     class BinarySearchTree {
// //         Node root;

// //         public BinarySearchTree() {
// //             root = null;
// //         }


// //     }

// //     // Create binary search tree
// //     // root equals null
// //     // assign value to root
// //     // compare next value to root
// //     // if value is desired less that root move item to the left
// //     // if item is desired more than the root move the item to the right
// //     // if item already exist where item is compared to compare those two items
// //     // if item does not exist in that spot move item to that spot
// //     // move to the next item in the list
// //     public static void main(String[] args) {
// //         List<String> bob = new ArrayList<>();
// //         Scanner taco = new Scanner(System.in);     

// //         addToList(bob, taco);
// //         binaryST(bob);


// //     }
// // }
// import java.util.*;

// public class OrderedList {

//     // Node class for Binary Search Tree
//     class Node {
//         String data;
//         Node left, right;

//         public Node(String data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // Binary Search Tree class
//     class BinarySearchTree {
//         Node root;

//         public BinarySearchTree() {
//             root = null;
//         }

//         // Insert node based on user preference
//         public void insert(Node currentNode, String data, Scanner scanner) {
//             if (root == null) {
//                 root = new Node(data);
//                 return;
//             }

//             System.out.println("Do you prefer \"" + currentNode.data + "\" or \"" + data + "\"? Type 'current' or 'next'.");
//             String preference = scanner.nextLine();

//             if (preference.equals("next")) {
//                 if (currentNode.right == null) {
//                     currentNode.right = new Node(data);
//                 } else {
//                     insert(currentNode.right, data, scanner);
//                 }
//             } else {
//                 if (currentNode.left == null) {
//                     currentNode.left = new Node(data);
//                 } else {
//                     insert(currentNode.left, data, scanner);
//                 }
//             }
//         }

//         // In-order traversal of the tree
//         public void inOrderTraversal(Node node) {
//             if (node != null) {
//                 inOrderTraversal(node.left);
//                 System.out.println(node.data);
//                 inOrderTraversal(node.right);
//             }
//         }
//     }

//     // Method to add items to the list from user input
//     public static List<String> addToList(Scanner scanner) {
//         List<String> list = new ArrayList<>();
//         String addMore = "yes";

//         while (addMore.equals("yes")) {
//             System.out.println("Do you want to add another word to the list? (yes/no)");
//             addMore = scanner.nextLine();

//             if (addMore.equals("yes")) {
//                 System.out.println("What word would you like to add to the list?");
//                 list.add(scanner.nextLine());
//             }
//         }

//         System.out.println("List complete. You added:");
//         for (String item : list) {
//             System.out.println(item);
//         }

//         return list;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         OrderedList orderedList = new OrderedList();
//         BinarySearchTree bst = orderedList.new BinarySearchTree();

//         // Step 1: Add items to the list
//         List<String> items = addToList(scanner);

//         // Step 2: Insert items into the binary search tree based on user preferences
//         for (String item : items) {
//             if (bst.root == null) {
//                 bst.root = orderedList.new Node(item);  // Initialize root
//             } else {
//                 bst.insert(bst.root, item, scanner);   // Insert other nodes
//             }
//         }

//         // Step 3: Perform in-order traversal to print the preferred order
//         System.out.println("In-order traversal of the tree (preferred order):");
//         bst.inOrderTraversal(bst.root);
//     }
// }

import java.util.*;

public class OrderedList {

    // Inner Node class (no need for public modifier)
    class Node {
        String data;
        Node left, right;

        public Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Inner BinarySearchTree class (no need for public modifier)
    class BinarySearchTree {
        Node root;

        public BinarySearchTree() {
            root = null;
        }

        // Insert node based on user preference
        public void insert(Node currentNode, String data, Scanner scanner) {
            if (root == null) {
                root = new Node(data);
                return;
            }

            System.out.println("Do you prefer \"" + currentNode.data + "\" or \"" + data + "\"? Type 'current' or 'next'.");
            String preference = scanner.nextLine();

            if (preference.equals("next")) {
                if (currentNode.right == null) {
                    currentNode.right = new Node(data);
                } else {
                    insert(currentNode.right, data, scanner);
                }
            } else {
                if (currentNode.left == null) {
                    currentNode.left = new Node(data);
                } else {
                    insert(currentNode.left, data, scanner);
                }
            }
        }

        // In-order traversal of the tree
        public void inOrderTraversal(Node node) {
            if (node != null) {
                inOrderTraversal(node.left);
                System.out.println(node.data);
                inOrderTraversal(node.right);
            }
        }
    }

    // Method to add items to the list from user input
    public static List<String> addToList(Scanner scanner) {
        List<String> list = new ArrayList<>();
        String addMore = "yes";

        while (addMore.equals("yes")) {
            System.out.println("Do you want to add another word to the list? (yes/no)");
            addMore = scanner.nextLine();

            if (addMore.equals("yes")) {
                System.out.println("What word would you like to add to the list?");
                list.add(scanner.nextLine());
            }
        }

        System.out.println("List complete. You added:");
        for (String item : list) {
            System.out.println(item);
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderedList orderedList = new OrderedList();
        BinarySearchTree bst = orderedList.new BinarySearchTree();

        // Step 1: Add items to the list
        List<String> items = addToList(scanner);

        // Step 2: Insert items into the binary search tree based on user preferences
        for (String item : items) {
            if (bst.root == null) {
                bst.root = orderedList.new Node(item);  // Initialize root
            } else {
                bst.insert(bst.root, item, scanner);   // Insert other nodes
            }
        }

        // Step 3: Perform in-order traversal to print the preferred order
        System.out.println("In-order traversal of the tree (preferred order):");
        bst.inOrderTraversal(bst.root);
    }
}
