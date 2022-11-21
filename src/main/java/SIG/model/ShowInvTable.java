


//model of invoices table 

package SIG.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ShowInvTable extends AbstractTableModel {

    private String[] cols = {"Num", "Date", "Customer", "Total"};
    private ArrayList<sigHeader> invoices;

    public ShowInvTable(ArrayList<sigHeader> invoices) {
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        sigHeader invoice = invoices.get(rowIndex);
        switch(columnIndex){
            case 0:
                return invoice.getNum();
                
            case 1:
                return invoice.getDate();
                
            case 2:
                return invoice.getName();
                
            case 3: 
                return invoice.getTotalInvoice();
            
        }
        
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }

}
