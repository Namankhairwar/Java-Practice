package OOPs;

public interface Mobile {
     static void main(String[] args) {
        Phone phone = new Phone();
        phone.Show();
//        phone.Connect();
//        phone.Click();
//        phone.calculate();
//        phone.googleSearch();
    }
     void Show();
}

interface Bluetooth {
    void Connect();
}

interface Camera{
    void Click();
}
interface Operations{
    void calculate();
    void googleSearch();
}