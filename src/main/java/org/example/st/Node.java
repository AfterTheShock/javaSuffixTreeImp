package org.example.st;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String text;
    private List<Node> children;
    private int position;

    public Node(String text, int position){
        this.text = text;
        this.position = position;
        children = new ArrayList<>();
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
