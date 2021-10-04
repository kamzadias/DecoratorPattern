public class AndroidPhoneDecorator extends PhoneDecorator {

    public AndroidPhoneDecorator(Phone phone) {
        super(phone);
    }

    String AndroidFeatures(){
        return "I have unique Features of Android(downloading .apk's etc.). ";
    }

    @Override
    public String printModel() {
        return super.printModel() + AndroidFeatures();
    }
}
