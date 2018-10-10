public class Tannenbaum {
    public int width;
    public int size;
    private int kugeln = 1;
    int leerstellen;


    public void zeichnen(){
        leerstellen = (width-kugeln)/2;

        for (int i = 0; i < size; i++){

            addLeerstellen();
            addStars();
            addLeerstellen();
            leerstellen = leerstellen - 1;
            kugeln = kugeln + 2;
            System.out.println();
        }
        leerstellen = (1 + size*2)/2;
        addLeerstellen();
        System.out.print("I");
        addLeerstellen();
    }

    void addLeerstellen (){
        for (int i = 0; i <  leerstellen; i++){
            System.out.print(" ");

        }
    }
    void addStars (){
        for (int i = 0; i < kugeln; i++){
            System.out.print("X");
        }
    }

}
