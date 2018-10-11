public class Tannenbaum {
    public int width = 11;
    public int size;
    private int kugeln = 1;
    int leerstellen;


    public void zeichnen(){

        // Calculate the first Spacers before the first Star
        leerstellen = (width-kugeln)/2;

        // Print out the rows of the xmastree
        for (int i = 0; i < size; i++){

            addLeerstellen();
            addStars();
            addLeerstellen();

           // After each row, remove one spacer, add 2 kugels
            leerstellen = leerstellen - 1;
            kugeln = kugeln + 2;
            System.out.println();
        }

        //Calculate the middle of the last row
        leerstellen = (width)/2;

        // Paint the last row with the tree stump
        addLeerstellen();
        System.out.print("I");
        addLeerstellen();

        // Make Space for the next tree
        System.out.println();
        System.out.println();

        //Reset Kugel Value for first Line
        kugeln = 1;
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
