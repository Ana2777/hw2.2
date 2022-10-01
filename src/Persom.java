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
    void hi(){
        System.out.print("Привет! Меня зовут " + name + ".");
        System.out.print (" Мне " + dateOfBirth + " лет.");
        System.out.print(" Я родился в городе " + cityOfResedence + ".");
        System.out.print(" Я работаю на должности " + post + ".");
        System.out.print(" Будем знакомы!");
        System.out.println("    ");
    }
}
