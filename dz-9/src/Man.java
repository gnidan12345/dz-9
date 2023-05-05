public class Man extends  Person {

    public Man(String firstName, String lastName, int age, Person partner, String previousLastName, boolean isRegisterPartnership) {
        super(firstName, lastName, age, partner, previousLastName, isRegisterPartnership);
    }


    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {

        return (Man.super.getAge() > 65 );
    }

    @Override
    public void registerPartnership(Person partner) {

        if (partner instanceof Woman) {
            setPartner(partner);
            setRegisterPartnership(true);
            partner.setPartner(this);

        }
    }

    @Override
    public void deregisterPartnership (boolean isRegisterPartnership){
        if (isRegisterPartnership) {
            setPartner(null);
            setRegisterPartnership(false);

        }


    }


}
