public class Monstr {
    int eye;
    int feet;
    int hands;

    public Monstr(int eye, int feet, int hands) {
        this.eye = eye;
        this.feet = feet;
        this.hands = hands;
    }

    public Monstr(int eye, int feet) {
        this.eye = eye;
        this.feet = feet;
        this.hands = 2;
    }

    public Monstr(int eye) {
        this.eye = eye;
        this.feet = 2;
        this.hands = 2;
    }

    public Monstr() {
        this.eye = 2;
        this.feet = 2;
        this.hands = 2;
    }

    void voice() {
        System.out.println("Голс");
    }

    void voice(int i) {
        for (int n = 0; n < i; n++) {
            System.out.println("Голс");
        }
    }
        void voice(int i, String word){
        for (int n =0; n<i; n++){
            System.out.println(word);
        }
    }
}
