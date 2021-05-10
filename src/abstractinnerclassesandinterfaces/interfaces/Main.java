package abstractinnerclassesandinterfaces.interfaces;

public class Main {

    public static void main(String[] args) {

        ITelephone csabasPhone;
        csabasPhone = new DeskPhone(98462);
        csabasPhone.powerOn();
        csabasPhone.callPhone(3424);
        csabasPhone.answer();

        csabasPhone = new MobilePhone(2352);
        csabasPhone.powerOn();
        csabasPhone.callPhone(2352);
        csabasPhone.answer();
    }
}
