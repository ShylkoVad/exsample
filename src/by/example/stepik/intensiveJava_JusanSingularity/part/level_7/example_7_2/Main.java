package by.example.stepik.intensiveJava_JusanSingularity.part.level_7.example_7_2;

public class Main {
    public static void main(String[] args) {

        Node node = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(2);

        node.next = node2;
//        node2.next = node3;


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
        System.out.println(Node.addFirst((node), 1));

        /**
         * Реализуйте метод size, который возвращает количество элементов в связанном списке.
         */
        System.out.println(Node.size(new Node(2)));

        /**
         * Реализуйте метод getLast, который возвращает последний элемент в связанном списке.
         * Если node передается как null, то вернуть -1.
         */
//        System.out.println(getLast(new Node(3)));

    }
}
