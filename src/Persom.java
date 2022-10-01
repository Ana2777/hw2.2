class Person {
    String name;
    int dateOfBirth;
    String cityOfResedence;
    String post;

    public Person(String name, int dateOfBirth, String cityOfResedence, String post) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.cityOfResedence = cityOfResedence;
        this.post = post;
    }
    public Person(int dateOfBirth) {
        this.name = "Информация не указана";
        if (dateOfBirth >=0) {
            this.dateOfBirth = dateOfBirth;
        } else {
            this.dateOfBirth = Math.abs(dateOfBirth);
        }
        this.cityOfResedence = "Информация не указана";
        this.post = "Информация не указана";
    }
    void hi(){
        System.out.print("Привет! Меня зовут " + name + ".");
        System.out.print (" Мне " + dateOfBirth + " лет.");
        System.out.print(" Я родился в городе " + cityOfResedence + ".");
        System.out.print(" Я работаю на должности " + post + ".");
        System.out.print(" Будем знакомы!");
        System.out.println("    ");
    }
}
