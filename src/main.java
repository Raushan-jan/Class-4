public class main {
    public static void main(String[] args) {
        Monstr monstr1=new Monstr();
        Monstr monstr2=new Monstr(1,2,5);
        Monstr monstr3=new Monstr(2,5);
        monstr1.voice();
        monstr2.voice(3);
        monstr3.voice(5, "Я монстр");

    }
}
