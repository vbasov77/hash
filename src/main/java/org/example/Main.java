package org.example;

import java.util.Random;

class app {
    public static void main(String[] args) {
        printNode(treeBuild(new Random().nextInt(10)), "");
    }

    static void printNode(Node node, String sp) {
        if (node != null) {
            System.out.println(sp + node.value);
            printNode(node.right, sp + "  ");
            printNode(node.left, sp + "  ");
        }
    }

    static Node treeBuild(int n) {
        Node node = null;
        if (n == 0)
            return node;
        else {
            node = new Node(new Random().nextInt(10));
            node.left = treeBuild(n / 2);
            node.right = treeBuild(n - n / 2 - 1);
        }
        return node;
    }
}

class Node {
    int value;

    public Node(int value) {
        this.value = value;
    }

    Node left;
    Node right;
}