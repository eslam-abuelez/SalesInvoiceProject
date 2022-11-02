package Controller;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;

public class TableAction implements ListSelectionListener {
    private SIG.view.InvoiceFrame frame;

    public TableAction(SIG.view.InvoiceFrame frame) {
        this.frame = frame;
    }

    /*when select an invoice from the header tabel this method finds out which invoice has been selected
        from the header tabel and gets its item lines and update the second table the item table
        */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int invoiceIndex = frame.getTableInvoiceHeader().getSelectedRow();
        if(invoiceIndex!= -1){
            SIG.model.sigHeader selectedRow = frame.getInvoices().get(invoiceIndex);
            ArrayList<SIG.model.sigItem> items = selectedRow.getItems();
            frame.getLabelCustomerName().setText(selectedRow.getName());
            frame.getLabelInvoiceNum().setText(""+selectedRow.getNum());
            frame.getLabelInvoiceDate().setText(selectedRow.getDate());
            frame.getLabelTostalCost().setText(""+selectedRow.getTotalInvoice());
            SIG.model.ShowLineTabel line = new SIG.model.ShowLineTabel(items);
            frame.getTableInvoiceLines().setModel(line);
            line.fireTableDataChanged();

        }
    }

}
