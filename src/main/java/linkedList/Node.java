/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 * A linked list node.
 * @author jesse
 */
public class Node<T> {
    // public Properties:
    public Node<T> getPrevious()       {return prev;}
    void setPrevious(Node<T> previous) {this.prev = previous;}
    
    public Node<T> getNext()   {return next;}
    void setNext(Node<T> next) {this.next = next;}
    
    public T getItem()          {return item;}
    public void setItem(T item) {this.item = item;}
    //
    
    // internal Constructors:
    Node(Node<T> prev, T item, Node<T> next){
        this.prev = prev;
        this.item = item;
        this.next = next;
    }
    //
    
    // public Constructors:
    public Node(T item){
        this(null, item, null);
    }
    
    public Node(){
        this(null, null, null);
    }
    //
    
    // internal Methods:
        // insert:
    void insertNext(Node<T> node){
        if (node == null) {return;}
        
        node.next = next;                         //node->this.next
        if (next != null) {next.prev = node;}     //node<-this.next
        
        node.prev = this;     //this<-node
        next = node;          //this->node
        
        // set parent
        node.parent = parent;
    }
    void insertNext(T item){
        insertNext(new Node<T>(item));
    }
    
    void insertPrev(Node<T> node){
        if (node == null) {return;}
        
        node.prev = prev;                         //this.prev<-node
        if (prev != null) {prev.next = node;}     //this.prev->node
        
        node.next = this;     //node->this
        prev = node;          //node<-this
        
        // set parent
        node.parent = parent;
    }
    void insertPrev(T item){
        insertPrev(new Node<T>(item));
    }
        //
    
    void isolate(){
        if (prev != null) {prev.next = next;}
        if (next != null) {next.prev = prev;}
        
        next = null;
        prev = null;
        parent = null;
    }
    //
    
    // public Methods:
    @Override
    public String toString(){
        return item == null ? "" : item.toString();
    }
    //
        
    // internal Fields:
    Node<T> prev;
    Node<T> next;
    T item;
    LinkedList parent;
    //
    
}
