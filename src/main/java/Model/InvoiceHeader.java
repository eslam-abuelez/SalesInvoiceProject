package Model;

import java.util.Date;

public class InvoiceHeader {

    int number;
    Date date;
    String name;

    public InvoiceHeader(int number, Date date, String name) {
        this.number = number;
        this.date = date;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" +
                "number=" + number +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
