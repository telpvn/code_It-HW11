public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("89278914444", "Sony", 200);
        phone.receiveCall("Вася");

        Phone phone1 = new Phone("89278915544", "Xiaomi", 230);

        Phone.madeIn = "China";

        System.out.println(phone.madeIn);
        System.out.println(phone1.madeIn);

    }
}
