public abstract  class Person {

    private String firstName;

    private String lastName;

    private int age;

    private Person partner;

    private String previousLastName;

    boolean isRegisterPartnership;


    public Person(String firstName, String lastName, int age, Person partner, String previousLastName, boolean isRegisterPartnership) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
        this.previousLastName = previousLastName;
        this.isRegisterPartnership = isRegisterPartnership;
    }


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public String getPreviousLastName() {
        return previousLastName;
    }

    public boolean isRegisterPartnership() {
        return isRegisterPartnership;
    }

    public void setRegisterPartnership(boolean registerPartnership) {
        isRegisterPartnership = registerPartnership;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }
    public abstract boolean isRetired();
    public abstract void registerPartnership (Person partner);
    public abstract void deregisterPartnership(boolean isRegisterPartnership);

}
