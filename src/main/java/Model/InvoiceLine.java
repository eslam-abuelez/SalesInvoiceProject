package Model;

public class InvoiceLine {

    String name ;
    int count;
    double total;
    private  double price;
    InvoiceHeader inv;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotal() {
        return price * count;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }
}



