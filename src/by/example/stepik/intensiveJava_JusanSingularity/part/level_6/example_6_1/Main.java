package by.example.stepik.intensiveJava_JusanSingularity.part.level_6.example_6_1;

public class Main {

    public static void main(String[] args) {

        /**
         *Представьте, что вас наняли на проект по разработке платформы для больниц.
         * Вам нужно разработать самый главный класс - это класс пациента.
         * Начнем с простого. Реализуйте поля (переменные) в классе:
         * строковый (String) firstName - для имени
         * строковый lastName - для фамилии
         * строковый iin - для ИИН
         * число age - для возраста
         * число weight - для веса в кг
         * число height - для высоты в см
         * Все поля должны быть приватными!
         */


    }

    class Patient {
        private String firstName;
        private String lastName;
        private String iin;
        private int age;
        private int weight;
        private int height;

        public Patient(String firstName, String lastName, String iin, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.iin = iin;
            this.age = age;
        }

        public Patient(String firstName, String lastName, String iin, int age, int weight, int height) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.iin = iin;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }



        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // геттеры и сеттеры на иин getIIN, setIIN - написанный с camelCase будет выдавать ошибку.
        public String getIin() {
            return iin;
        }

        // геттеры и сеттеры на иин getIIN, setIIN - написанный с camelCase будет выдавать ошибку.
        public void setIin(String iin) {
            this.iin = iin;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Пациент(" +  iin + ", " + firstName + " " + lastName + ", " + age + ")";
        }
    }
}
