/* create linked list
 * add items to linkedlist
 * loop through linkedlist 
 * add items from linkedlist to binary search tree
 * in order recurse through BST printing list in order
 */

import java.util.*;
public class orderedList {

    public static List<String> addToList(List<String> bob, Scanner taco) {
        List<String> larry = new ArrayList<>();

        String anotherString = "yes";
        while (anotherString.equals("yes")) {
            System.out.println("Do you want to add another word to the list?");
            anotherString = taco.nextLine();   
            if(anotherString.equals("yes")) {
                System.out.println("WHat word would you like to add to the list?");
                bob.add(taco.nextLine());                
            }
        }

        System.out.println("List Complete");
        for(int i = 0; i < bob.size() ; i++) {
            System.out.println(bob.get(i));
        }
        return larry;
    }

    public static void binaryST(List<String> bob) {

    }
    // Should this come before or after


    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class BinarySearchTree {
        Node root;

        public BinarySearchTree() {
            root = null;
        }
    }
    public static void main(String[] args) {
        List<String> bob = new ArrayList<>();
        Scanner taco = new Scanner(System.in);     

        addToList(bob, taco);
        binaryST(bob);


    }
}
