package by.example.stepik.intensiveJava_JusanSingularity.part.level_7.example_7_2;

public class Node {


    public int data;  // данные
    public Node next;  // указатель на следующий узел
    public Node head; // голова списка

    public Node(int data) { //конструктор, чтобы сразу инициализировать узел с заданным значением.
        this.data = data;
        this.next = null; // когда мы создаем узел, ссылка на следующий элемент будет null, так как он еще пуст
    }



    public Node() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public static Node addFirst(Node node, int newData) {
        Node temp = new Node(newData); // создаем новый узел
        temp.next = node;
        node = temp;
        return node;

    }

    public static int size(Node node) {
        int count = 0;
        Node current = node.next;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    public static int getLast(Node node) {


        Node temp = node;
        if (temp.next != null) {
            while (temp.next != null) {
                temp = temp.next;

            }
        } else {
            return -1;
        }
        return node.next.data;

    }

}
