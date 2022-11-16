
package view;



import controller.Controller;
import Model.FileOperations;
import Model.ShowInvTabel;
import Model.sigHeader;
import Model.sigItem;
import controller.Controller;
import controller.TableAction;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;




public class InvoiceFrame extends javax.swing.JFrame{

   // Create New Form
    public InvoiceFrame() {
        initComponents();
    }

    private void initComponents() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */


    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InvoiceFrame frame= new InvoiceFrame();
                
                frame.setVisible(true);
                FileOperations fileOperations = new FileOperations(frame);
                ArrayList<sigHeader> inv= fileOperations.readFile();
                frame.setInvoices(inv);
                ShowInvTabel invoiceTable = new ShowInvTabel(inv);
                frame.setHeaderTabel(invoiceTable);
                frame.getTableInvoiceHeader().setModel(invoiceTable);
                frame.getHeaderTabel().fireTableDataChanged();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenu MenuBar;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JButton btnDeleteInvoice;
    private javax.swing.JButton btnDeleteLine;
    private javax.swing.JButton btnNewInvoice;
    private javax.swing.JButton btnNewLine;
    private JLabel customerName;
    private JLabel invoiceDate;
    private JLabel invoiceNum;
    private JLabel invoiceTotalCost;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private JLabel labelCustomerName;
    private JLabel labelInvoiceDate;
    private JLabel labelInvoiceNum;
    private JLabel labelTostalCost;
    private JTable tableInvoiceHeader;
    private JTable tableInvoiceLines;
    // End of variables declaration
private Controller controller = new Controller(this);




    public  SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
private ArrayList<sigHeader> invoices;
private ArrayList<sigItem> lines;


    public JLabel getLabelInvoiceDate() {
        return labelInvoiceDate;
    }

    public Controller getController() {
        return controller;
    }

    public void setLabelInvoiceDate(JLabel labelInvoiceDate) {
        this.labelInvoiceDate = labelInvoiceDate;
    }

    public JLabel getLabelInvoiceNum() {
        return labelInvoiceNum;
    }

    public void setLabelInvoiceNum(JLabel labelInvoiceNum) {
        this.labelInvoiceNum = labelInvoiceNum;
    }

    public void setLines(ArrayList<sigItem> lines) {
        this.lines = lines;
    }
private ShowInvTabel headerTabel;

    public ShowInvTabel getHeaderTabel() {
        return headerTabel;
    }
 public void setHeaderTabel(ShowInvTabel headerTabel){
        this.headerTabel= headerTabel;
    }
public ArrayList<sigHeader> getInvoices(){
    if(invoices==null){
        invoices= new ArrayList<>();
    }
    return invoices;
}

    public void setInvoices(ArrayList<sigHeader> invoices) {
       this.invoices= invoices;
    }

    public JLabel getCustomerName() {
        return customerName;
    }

    public JLabel getInvoiceDate() {
        return invoiceDate;
    }

    public JLabel getInvoiceNum() {
        return invoiceNum;
    }

    public JLabel getInvoiceTotalCost() {
        return invoiceTotalCost;
    }

    public JLabel getLabelCustomerName() {
        return labelCustomerName;
    }

    public JLabel getLabelTostalCost() {
        return labelTostalCost;
    }

    public JTable getTableInvoiceHeader() {
        return tableInvoiceHeader;
    }

    public JTable getTableInvoiceLines() {
        return tableInvoiceLines;
    }

   public Controller getLisener(){
       return controller;
   }
   public void setCustomerLabel(String name){
       labelCustomerName.setText(name);
   }
   
   
   public void setCustomerName(String name){
       tableInvoiceHeader.setName(name);
       
   }
   public int getTotalInvNum(){
       int num=0;
       for(sigHeader invoice: invoices){
           if(invoice.getNum()>num){
               num= invoice.getNum();
           }
       }
       
       return num;
   }
}