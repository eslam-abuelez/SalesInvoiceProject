package View;

public interface InvoiceLineInterface {
    String getName();

    void setName(String name);

    int getCount();

    void setCount(int count);

    double getTotal();

    void setTotal(double total);

    InvoiceHeader getInv();

    void setInv(InvoiceHeader inv);



            }
