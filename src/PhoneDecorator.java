public class PhoneDecorator implements Phone {

    public Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String printModel() {
        return phone.printModel();
    }
}
