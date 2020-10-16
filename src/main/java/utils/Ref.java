/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 * A way of emulating c#'s ref keyword so you can use function parameters as output.
 * @author jesse
 *
 * @param <T>
 */
public class Ref<T> {
    public T item;
    public Ref(T item) {this.item = item;}
    
    @Override
    public String toString() {
        return item == null ? "" : item.toString();
    }
}
