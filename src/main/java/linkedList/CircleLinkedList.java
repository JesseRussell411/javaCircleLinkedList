/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

import utils.Ref;
/**
 *
 * @author jesse
 */
public class CircleLinkedList<T> implements LinkedList{
    // public Properties:
    public Node<T> getFirst() {return first;}
    
    public Node<T> getLast() {return first == null ? null : first.prev;}
    //
    
    // Methods
    public void clear(){
        first = null;
    }
    
    public boolean add(Node<T> node){
        if (node == null || node.parent != null) {return false;}
        if (first == null){
            first = node;
            first.next = first;
            first.prev = first;
        }
        else{
            getLast().insertNext(node);
        }
        node.parent = this;
        return true;
    }
    
    public void add(T item){
        add(new Node<T>(item));
    }
    
    public Node<T> remove(Node<T> node){
        if (node == null || node.parent != this) {return null;}
        if (node == first){
            if (first == first.next){
                clear();
            }
            else{
                first = first.next;
            }
        }
        
        // Isolate the node.
        node.isolate();
        
        return node;
    }
    
    public Node<T> remove(long index){
        return remove(get(index));
    }
    
    /**
     * Returns the item at the hypothetical index. This function loops back to the start if the index given is greater than the index of the last item.
     * @param index
     * @return 
     */
    public Node<T> get(long index){
        Node<T> current = first;
        if (current == null) {return null;}
        
        if (index >= 0){
            for(long i = 0; i < index; ++i){
                current = current.next;
            }
        }
        else{
            for(long i = 0; i > index; --i){
                current = current.prev;
            }
        }
        return current;
    }
    
    @Override
    public String toString(){
        Node<T> current = this.first;
        if (current == null) {return "";}
        
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        boolean firstIt = true;
        do{
            if (!firstIt) {sb.append(", ");}
            
            sb.append(current.toString());
            
            current = current.next;
            
            firstIt = false;
        } while(current != this.first && current != null);
        
        sb.append('}');
        
        return sb.toString();
    }
    //
    
    // private Fields:
    private Node<T> first = null;
    //
}
