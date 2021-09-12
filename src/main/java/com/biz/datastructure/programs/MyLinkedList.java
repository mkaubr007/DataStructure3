package com.biz.datastructure.programs;

public class MyLinkedList<T>{

    MyNode<T> head;	//starting node
    MyNode<T> current;	//last node
    int position;	//position of last node


      //initializes linked list and sets head and current to null
      //sets position to -1 to shoe an empty list
    public MyLinkedList(){
        head = null;
        current = null;
        position = -1;
    }


     //adds element to the list at end of the list
    public void add(T data){
        MyNode<T> node = new MyNode<T>(data);
        if(head == null){
            head = node;
            current = head;
        }
        else{
            current.next = node;
            current = current.next;
        }
        position++;
    }


     //removes given element from the list
    public void remove(T data){
        MyNode<T> tempCurrent = head;
        MyNode<T> tempPrev = null;
        while(!tempCurrent.data.equals(data)){
            tempPrev = tempCurrent;
            tempCurrent = tempCurrent.next;
        }
        if(tempCurrent == head){
            head = head.next;
        }
        else{
            tempPrev.next = tempCurrent.next;
        }
        if(tempCurrent == current){
            current = tempPrev;
        }
        position--;
    }



     //returns size(number of elements) of the list
    public int size(){
        return position + 1;
    }



     //returns position of the element in the list if it is in the list
    public int index(T data){
        if(position == -1){
            return -1;
        }
        MyNode<T> tempCurrent = head;
        int tempPosition = 0;

        while(!tempCurrent.data.equals(data)){
            if(tempCurrent == current) {
                return -1;
            }
            tempCurrent = tempCurrent.next;
            tempPosition++;
        }
        return tempPosition;
    }


    //data- inserts element 'data' at 'pos' position


     //pops elements at given location
    public T pop(int location){
        MyNode<T> tempCurrent = head;
        MyNode<T> tempPrev = null;
        int tempPosition = 0;
        position--;
        while(tempPosition != location){
            tempPrev = tempCurrent;
            tempCurrent = tempCurrent.next;
            tempPosition++;
        }
        if(tempCurrent == head){
            head = head.next;
            return tempCurrent.data;
        }
        else if(tempCurrent == current){
            current = tempPrev;
            tempPrev.next = tempCurrent.next;
            return tempCurrent.data;
        }
        else{
            tempPrev.next = tempCurrent.next;
            return tempCurrent.data;
        }
    }


     //prints all the elements in the list
    public void list(){
        MyNode<T> tempCurrent = head;
        while(tempCurrent != null){
            System.out.println(tempCurrent.data);
            tempCurrent = tempCurrent.next;
        }
    }
}
