package Model;

public class Line {
    private String item;
    private double price;
    private int count;
    private Invoice invoice;



    private double total;






    public void line(String item, double price, int count, Invoice invoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }


    public String toCSV() {
        return invoice.getNum() + "," + item + "," + price + "," + count;
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public double getTotal() {
        return getPrice()*getCount();
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Line{" +
                "item="+ item +
                ", price=" + price +
                ", count=" + count +
                ", invoice=" + invoice +
                ", total=" + total +
                '}';
    }
}
