package by.example.stepik.intensiveJava_JusanSingularity.part.level_6.example_6_2;

public class Patient {

    public static void main(String[] args) {
        System.out.println(getBMI());
    }

    /**
     * На платформе больницы нужно высчитывать индекс массы тела каждого пациента.
     * Индекс массы тела (ИМТ) — это показатель, который позволяет установить, насколько масса тела соответствует росту.
     * Недостаточный вес: ИМТ менее 18,5.
     * Нормальный вес: ИМТ от 18,5 до 24,9.
     * Избыточный вес: ИМТ от 25 до 29,9.
     * Ожирение: ИМТ от 30 и выше.
     * Формула подсчета: ИМТ = (вес в кг) / (рост в метрах) ^ 2
     * Создайте публичный метод double getBMI(), который возвращает значение индекса массы тела.
     * Допускается погрешность до 0.001.
     */

    /**
     * Начальство решило, что нужно отслеживать какие из пациентов являются инфицированными, а какие нет.
     * Добавьте
     * новое приватное поле boolean isInfected
     * геттер getIsInfected
     * сеттер setIsInfected
     * Дополните toString
     * Если пациент инфицирован:Пациент(970827356789, Ахметов Серик, 24, инфицирован)
     * Если пациент здоров: Пациент(970827356789, Ахметов Серик, 24, здоров)
     */
    private String firstName;
    private String lastName;
    private String iin;
    private int age;
    private int weight;
    private int height;
    private boolean isInfected;

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

    public Patient(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Patient() {
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

    public boolean getIsInfected() {
        return isInfected;
    }

    public void setIsInfected(boolean infected) {
        isInfected = infected;
    }

      @Override
    public String toString() {
        return "Пациент(" +  iin + ", " + firstName + " " + lastName + ", " + age + ", " + (isInfected ? ", инфицирован" : ", здоров")  + ")";
    }

    public static double getBMI() {
        Patient patient = new Patient(76, 187);
        return (double) patient.getWeight() / (((double) patient.getHeight() / 100) * ((double) patient.getHeight() / 100));
    }
}
