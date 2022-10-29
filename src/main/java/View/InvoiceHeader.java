package View;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;

public  class InvoiceHeader extends AbstractTableModel     {

  private   int number;
    private Date date;
    private String name;


    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader() {

    }

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }


    public InvoiceHeader(int number, Date date, String name) {
        this.number = number;
        this.date = date;
        this.name = name;
    }

    public double getTotal(){
        double total = 0.0;
        for (InvoiceLine line : lines){
        total += line.getTotal();
        }
    return total;
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

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
