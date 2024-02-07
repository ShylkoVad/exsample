package by.example.stepik.intensiveJava_JusanSingularity.part.level_7.example_7_2;

public class Node {
    public static void main(String[] args) {
        Node node = new Node();
        
        /**
         * В этом задании разработаем базовый класс Node, который образовывает Linked List.
         * Создайте класс Node со следующими полями:
         * публичный числовой data
         * публичный next типа Node
         * Добавьте конструктор, который принимает data и присваивает его к соответсвующему полю.
         */

        /**
         * Реализуйте метод addFirst, который добавляет новый элемент в начало связанного
         * списка и возвращает получившийся результат в виде связанного списка с новым элементом.
         * Если node передается как null, то вернуть Node состоящий из newData.
         */
        System.out.println(addFirst(new Node(2) , 1));

        /**
         * Реализуйте метод size, который возвращает количество элементов в связанном списке.
         */
        System.out.println(size(new Node(2)));

        /**
         * Реализуйте метод getLast, который возвращает последний элемент в связанном списке.
         * Если node передается как null, то вернуть -1.
         */
//        System.out.println(getLast(new Node(3)));

    }

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node() {
    }

    public static Node addFirst(Node node, int newData) {
        Node temp = new Node(newData);
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
