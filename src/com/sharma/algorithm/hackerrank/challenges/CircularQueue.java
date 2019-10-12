package com.sharma.algorithm.hackerrank.challenges;


public class CircularQueue<T> {

    public static final int MAX_SIZE = 5;
    private int head;
    private int tail;
    private int[] queue;

   public CircularQueue() {
      queue =  new int[MAX_SIZE];
      head = -1;
      tail = -1;
    }

    public void enqueue(int element) throws Exception {
        boolean spotAvailable = checkForAvailableSpot();

        if (!spotAvailable) {
            throw new Exception("Queue is full!");
        }

        queue[++tail] = element;
    }

    private boolean checkForAvailableSpot() {
        if (tail == (MAX_SIZE -1)) {
            if (head == -1) {
                return false;
            } else {
                tail = -1;
            }
        } else {
            if (head > -1 && head == tail) {
                return false;
            }
        }

        return true;
    }

    public int dequeue() throws Exception {
        if ((head == -1 && tail == -1) || (head == tail)) {
            throw new Exception("Empty Queue, can't dequeue!");
        } else if (tail < head && head == (MAX_SIZE - 1)) {
            head = -1;
        }

        return queue[++head];
    }

    public int peek() {
        return queue[++head];
    }

    public boolean offer(int element) throws Exception {
        boolean spotAvailable = checkForAvailableSpot();

        if (!spotAvailable) {
            return false;
        }

        queue[++tail] = element;
        return true;
    }

    public void print() {
        System.out.println("Head == " + head);
        System.out.println("Tail == " + tail);
        for (int index = 0; index < MAX_SIZE; index++) {
            System.out.println("Elemaent["+index + "] == " + queue[index]);
        }
    }

    private int maxelements=4;
    private int numofelements=0;
    int a[]=new int[4];
    private void insertInt(int num){

        if(tail +1 == maxelements){
            tail=-1;
        }
        if(numofelements == maxelements){
            System.out.println("Queue is full");
        } else {
            numofelements++;
            tail++;
            a[tail] = num;
            print("Insert ");
        }

    }

    private void deleteElement(){
        if(head+1 == maxelements){
            head=-1;
        }
        if(numofelements==0){
            System.out.println("Queue is empty");
        } else {
            numofelements--;
            head++;
            print("Delete ");
        }
    }

    private void print(String operation){
        System.out.print("Operation:"+ operation + " head is:" + head
                + "  tail is:" + tail
                + " noofelements:" + numofelements);
        int temphead=head;
        for(int i=0;i < numofelements;i++){
            if(temphead+1 == maxelements){
                temphead=-1;
            }
            if(numofelements > 0){
                temphead++;
                System.out.print("  value is:" +a[temphead]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args)  {
        CircularQueue<Integer> integerCircularQueue = new CircularQueue<>();
        try {

            //integerCircularQueue.dequeue();

            integerCircularQueue.enqueue(10);
            integerCircularQueue.enqueue(11);
            integerCircularQueue.enqueue(12);
            integerCircularQueue.enqueue(13);
            integerCircularQueue.enqueue(14);

            integerCircularQueue.print();

            try {
                System.out.println("dequeue element == " + integerCircularQueue.dequeue());
                System.out.println("dequeue element == " + integerCircularQueue.dequeue());
                System.out.println("dequeue element == " + integerCircularQueue.dequeue());
                System.out.println("dequeue element == " + integerCircularQueue.dequeue());
                System.out.println("dequeue element == " + integerCircularQueue.dequeue());
                System.out.println("dequeue element == " + integerCircularQueue.dequeue());
            } catch (Exception exp) {
                System.out.println(exp.getMessage());
            }

            integerCircularQueue.print();

            integerCircularQueue.enqueue(15);
            integerCircularQueue.enqueue(16);
            boolean offerResult = integerCircularQueue.offer(17);

            System.out.println(offerResult?"Element Added!":"Element Not Added!");

            try {
                System.out.println("dequeue element == " + integerCircularQueue.dequeue());
            } catch (Exception exp) {
                System.out.println(exp.getMessage());
            }

            integerCircularQueue.print();
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            integerCircularQueue.print();
        }
    }

}
