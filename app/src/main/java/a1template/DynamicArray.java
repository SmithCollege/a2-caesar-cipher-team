// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    T[] array;

    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(T[] array){
        this.array = array;
    }

    @SuppressWarnings("unchecked") //Quick fix, but what does it mean, and why is it needed?
    public DynamicArray(int length){
        this.array = (T[]) new Object[length];
    }

    // Now implement the methods from IndexAccess?
    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i){
        return(this.array[i]);
    }

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset){
        return (this.array[i + offset]);
    }

    /** Stores the given value at the given index
     * @param i index of location to store
     * @param val value to store at given index
     */
    public void set(int i, T val){
        this.array[i] = val;
    }
}