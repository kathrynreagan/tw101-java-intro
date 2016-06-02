package com.thoughtworks.tw101.exercises.exercise9;

import java.util.LinkedList;
import java.util.List;

public class Node {

    /* private inner class to represent nodes that contain strings
     * in order to implement a binary tree of strings     */
    private class StringNode {
        String name;
        StringNode left;
        StringNode right;

        StringNode(String name){
            this.name = name;
        }
    }

    private StringNode root;

    public Node(String name) {
        this.root = new StringNode(name);
    }

    public void add(String nameOfNewNode) {
        root = recursiveAdd(root, nameOfNewNode);
    }

    private StringNode recursiveAdd(StringNode node, String nameOfNewNode) {
        if(node == null){
            node = new StringNode(nameOfNewNode);
        }
        else {
            int comparison = nameOfNewNode.compareTo(node.name);
            if(comparison <= 0){
               node.left = recursiveAdd(node.left, nameOfNewNode);
            }
            else {
                node.right = recursiveAdd(node.right, nameOfNewNode);
            }
        }
        return node;
    }


    public List<String> names() {
        List<String> names = new LinkedList<String>();

        recursiveNames(names, root);

        return names;
    }

    private void recursiveNames(List<String> names, StringNode node) {
        if(node == null){
            // do nothing
        }
        else {
            recursiveNames(names, node.left);
            names.add(node.name);
            recursiveNames(names, node.right);
        }
    }
}
