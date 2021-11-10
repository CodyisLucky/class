public class Printer2 {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer2(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount > 100){
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            System.out.println("Printing double sided.");
            if ((pages & 1) == 0){ //checks the first bit of the number, if 0 it is even, if 1 it is odd.
                pagesToPrint = pages / 2;
            }
            else{
                pagesToPrint = (pages / 2) + 1;
            }
        }

        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
