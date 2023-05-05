public class Woman extends Person{

    public Woman(String firstName, String lastName, int age, Person partner, String previousLastName, boolean isRegisterPartnership) {
        super(firstName, lastName, age, partner, previousLastName, isRegisterPartnership);
    }

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }


    @Override
    public boolean isRetired() {

        return (Woman.super.getAge() > 60 );
    }


    @Override
    public void registerPartnership(Person partner) {

        if(partner instanceof Man){
            setPartner(partner);
            setPreviousLastName(getLastName());
            setLastName(partner.getLastName());
            setRegisterPartnership(true);
            partner.setRegisterPartnership(true);
            partner.setPartner(this);

        }

    }

    @Override
    public void deregisterPartnership(boolean isRegisterPartnership) {
        {
            if (isRegisterPartnership) {

                setLastName(getPreviousLastName());
                setPartner(null);



            }
        }


    }




}
