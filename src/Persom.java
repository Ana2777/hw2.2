class Person {
    private String name;
    private int dateOfBirth;
    private String cityOfResedence;
    private String post;

    public Person(String name, int dateOfBirth, String cityOfResedence, String post) {
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setCityOfResedence(cityOfResedence);
        this.setPost(post);
    }
    public Person(int dateOfBirth, String cityOfResedence, String post) {
        this.setDateOfBirth(dateOfBirth);
        this.setCityOfResedence(cityOfResedence);
        this.setPost(post);
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        if (post == null) {
            this.post = "Информация не указана";
        } else { this.post = post;}
    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = "Информация не указана";
        } else { this.name = name;}
    }

    public void setDateOfBirth(int dateOfBirth) {
        if (dateOfBirth < 0) {
            this.dateOfBirth = 0;
        } else {
            this.dateOfBirth = Math.abs(dateOfBirth);
        }
    }
    public String getCityOfResedence() {
        return cityOfResedence;
    }

    public void setCityOfResedence(String cityOfResedence) {
        if (cityOfResedence != null && cityOfResedence.isEmpty()) {
            this.cityOfResedence = cityOfResedence;
        } else {
            this.cityOfResedence = "Информация не указана";
        }
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
