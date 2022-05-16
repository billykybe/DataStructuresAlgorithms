package arraylist;

public class MyList {
  int size;
  int capacity = 10;
  Object[] array;

  public MyList() {
    this.array = new Object[capacity];
  }

  public MyList(int capacity) {
    this.capacity = capacity;
    this.array = new Object[this.capacity];
  }

  public void add(Object item) {
    if (size >= capacity) {
      grow();
    }
    array[size] = item;
    size++;
  }

  public void insert(int index, Object item) {
    if (size >= capacity) {
      grow();
    }
    for (int i = size; i > index; i--) {
      array[i] = array[i - 1];
    }
    array[index] = item;
    size++;
  }

  public void delete(Object item) {
    for (int i = 0; i < size; i++) {
      if (array[i] == item) {
        //
        for (int j = 0; j < (size - i - 1); j++) {
          array[i + j] = array[i + j + 1];
        }
        array[size - 1] = null;
        size--;

        if (size <=(int) (capacity/3)){
          shrink();
        }
        //
      }
    }
  }

  public int search(Object item) {
    for (int i = 0;i < size; i++) {
      if (array[i]==item){
        return i;
      }
      //
    }
    return -1;
  }

  public void grow() {
    int newCapacity = (int) (capacity * 2);
    Object [] newArray = new Object[newCapacity];

    for (int i = 0 ; i < size;i++){
      newArray[i] = array[i];

    }
    capacity = newCapacity;
    array = newArray;

  }

  public void shrink() {
    int newCapacity = (int)(capacity/2);
    Object [] newArray = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];

    }
    capacity = newCapacity;
    array = newArray;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public String toString() {
    String string = "";

    for (int i = 0; i < size; i++) {
      string += array[i] + ", ";
    }
    if (string != "") {
      string = "[" + string.substring(0, string.length() - 2) + "]";

    } else {
      string = "[]";
    }
    return string;
  }
}
