

//model of item lines table 

package SIG.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


public class ShowLineTabel extends AbstractTableModel {

    private String[] cols = {"Num", "Item", "Unit Price", "Quantity", "Total"};
    private ArrayList<sigItem> items;

    public ShowLineTabel(ArrayList<sigItem> items) {
        this.items = items;
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        sigItem item = items.get(rowIndex);
        switch(columnIndex){
            case 0:
                return item.getInvoice().getNum();
                
            case 1:
                return item.getItemName();
                
            case 2:
                return item.getUnitPrice();
                
            case 3: 
                return item.getQuantity();
            
            case 4: 
                return item.getTotalLine();
            
        }
        
        return null;

    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
}