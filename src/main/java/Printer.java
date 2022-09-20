public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){

        this.sheets = sheets;
        this.toner = toner;

    }

    public int copySheet( int numOfPages, int numOfCopies){

        if (numOfCopies * numOfPages < sheets){
            return sheets - (numOfCopies * numOfPages);
        } else {
            return sheets;
        }

    }

    public void reduceToner(int pages){
         toner -= pages;
    }

    public int getSheets() {
        return sheets;
    }

    public int getToner() {
        return toner;
    }
}
