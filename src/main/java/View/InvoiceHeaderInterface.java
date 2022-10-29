package View;

import javax.swing.table.TableModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public interface InvoiceHeaderInterface extends TableModel, Serializable {
    ArrayList<InvoiceLine> getLines();

    double getTotal();

    int getNumber();

    void setNumber(int number);

    Date getDate();

    void setDate(Date date);

    String getName();

    void setName(String name);

    @Override
    String toString();

    @Override
    int getRowCount();

    @Override
    int getColumnCount();

    @Override
    Object getValueAt(int rowIndex, int columnIndex);
}
