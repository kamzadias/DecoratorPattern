public class IOSPhoneDecorator extends PhoneDecorator {

    public IOSPhoneDecorator(Phone phone) {
        super(phone);
    }

    String IOSFeatures(){
        return "I have unique Features of IOS. IOS 15 design and so on. ";
    }

    @Override
    public String printModel() {
        return super.printModel() + IOSFeatures();
    }
}