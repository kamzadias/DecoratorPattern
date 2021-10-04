public class Main {

    public static void main(String[] args) {
        Phone phone = new BasicPhone();
        System.out.println(phone.printModel());
        System.out.println("-------------------");

        Phone phone1 = new AndroidPhoneDecorator(new BasicPhone());
        System.out.println(phone1.printModel());
        System.out.println("-------------------");

        Phone phone2 = new IOSPhoneDecorator(phone1);
        System.out.println(phone2.printModel());

        Phone phone3 = new AndroidPhoneDecorator(new IOSPhoneDecorator(new BasicPhone()));
        System.out.println(phone3.printModel());
    }
}
