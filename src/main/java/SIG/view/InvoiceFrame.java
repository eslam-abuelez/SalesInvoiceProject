package SIG.view;

import SIG.controller.Controller;
import SIG.controller.TableAction;
import SIG.model.FileOperations;
import SIG.model.ShowInvTable;
import SIG.model.sigHeader;
import SIG.model.sigItem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvoiceFrame extends JFrame {
    private javax.swing.JMenuBar JMenuBar;
    private JMenu MenuBar;
    private JMenuItem OpenMenuItem;
    private JMenuItem SaveMenuItem;
    private JButton btnDeleteInvoice;
    private JButton btnDeleteLine;
    private JButton btnNewInvoice;
    private JButton btnNewLine;
    private JLabel customerName;
    private JLabel invoiceDate;
    private JLabel invoiceNum;
    private JLabel invoiceTotalCost;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JLabel labelCustomerName;
    private JLabel labelInvoiceDate;
    private JLabel labelInvoiceNum;
    private JLabel labelTostalCost;
    private JTable tableInvoiceHeader;
    private JTable tableInvoiceLines;
    private Controller controller = new Controller(this);
    private TableAction tableAction = new TableAction(this);
    public SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    private ArrayList<sigHeader> invoices;
    private ArrayList<sigItem> lines;
    private ShowInvTable headerTabel;

    public InvoiceFrame() {
        this.initComponents();
    }

    private void initComponents() {
        this.jScrollPane1 = new JScrollPane();
        this.tableInvoiceHeader = new JTable();
        this.tableInvoiceHeader.getSelectionModel().addListSelectionListener(this.tableAction);
        this.jScrollPane2 = new JScrollPane();
        this.tableInvoiceLines = new JTable();
        this.invoiceNum = new JLabel();
        this.invoiceDate = new JLabel();
        this.customerName = new JLabel();
        this.invoiceTotalCost = new JLabel();
        this.labelCustomerName = new JLabel();
        this.labelTostalCost = new JLabel();
        this.labelInvoiceDate = new JLabel();
        this.labelInvoiceNum = new JLabel();
        this.btnNewInvoice = new JButton();
        this.btnNewInvoice.addActionListener(this.controller);
        this.btnDeleteInvoice = new JButton();
        this.btnDeleteInvoice.addActionListener(this.controller);
        this.btnNewLine = new JButton();
        this.btnNewLine.addActionListener(this.controller);
        this.btnDeleteLine = new JButton();
        this.btnDeleteLine.addActionListener(this.controller);
        this.JMenuBar = new JMenuBar();
        this.MenuBar = new JMenu();
        this.OpenMenuItem = new JMenuItem();
        this.OpenMenuItem.addActionListener(this.controller);
        this.SaveMenuItem = new JMenuItem();
        this.SaveMenuItem.addActionListener(this.controller);
        this.setDefaultCloseOperation(3);
        this.tableInvoiceHeader.setModel(new DefaultTableModel(new Object[0][], new String[0]));
        this.tableInvoiceHeader.setShowGrid(true);
        this.jScrollPane1.setViewportView(this.tableInvoiceHeader);
        this.tableInvoiceLines.setModel(new DefaultTableModel(new Object[0][], new String[0]));
        this.tableInvoiceLines.setShowGrid(true);
        this.jScrollPane2.setViewportView(this.tableInvoiceLines);
        this.tableInvoiceLines.getAccessibleContext().setAccessibleName("");
        this.invoiceNum.setText("Invoice Num:");
        this.invoiceDate.setText("Invoice Date:");
        this.customerName.setText("Customer Name:");
        this.invoiceTotalCost.setText("Invoice Total Cost:");
        this.labelCustomerName.setText("-");
        this.labelTostalCost.setText("-");
        this.labelInvoiceDate.setText("-");
        this.labelInvoiceNum.setText("-");
        this.btnNewInvoice.setText("Create New Invoice");
        this.btnDeleteInvoice.setText("Delete Invoice");
        this.btnNewLine.setText("Save");
        this.btnDeleteLine.setText("Cancel");
        this.MenuBar.setText("File");
        this.OpenMenuItem.setText("Open File");
        this.OpenMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SIG.view.InvoiceFrame.this.OpenMenuItemActionPerformed(evt);
            }
        });
        this.MenuBar.add(this.OpenMenuItem);
        this.SaveMenuItem.setText("Save File");
        this.MenuBar.add(this.SaveMenuItem);
        this.JMenuBar.add(this.MenuBar);
        this.setJMenuBar(this.JMenuBar);
        this.JMenuBar.getAccessibleContext().setAccessibleName("");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 290, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(17, 17, 17).addComponent(this.invoiceNum)).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane2, -2, 342, -2).addGroup(layout.createSequentialGroup().addComponent(this.invoiceTotalCost).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.labelTostalCost)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.customerName).addComponent(this.invoiceDate)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.labelInvoiceDate).addComponent(this.labelCustomerName).addComponent(this.labelInvoiceNum))))))).addGroup(layout.createSequentialGroup().addGap(33, 33, 33).addComponent(this.btnNewInvoice).addGap(37, 37, 37).addComponent(this.btnDeleteInvoice).addGap(68, 68, 68).addComponent(this.btnNewLine).addGap(118, 118, 118).addComponent(this.btnDeleteLine))).addContainerGap(21, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.invoiceNum).addComponent(this.labelInvoiceNum)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.invoiceDate).addComponent(this.labelInvoiceDate)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.customerName).addComponent(this.labelCustomerName)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.invoiceTotalCost).addComponent(this.labelTostalCost)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane2, -2, 0, 32767)).addComponent(this.jScrollPane1, -2, 346, -2)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.btnNewInvoice).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.btnDeleteInvoice).addComponent(this.btnNewLine).addComponent(this.btnDeleteLine))).addContainerGap(20, 32767)));
        this.invoiceDate.getAccessibleContext().setAccessibleName("jLabel2");
        this.pack();
    }

    private void OpenMenuItemActionPerformed(ActionEvent evt) {
    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(SIG.view.InvoiceFrame.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(SIG.view.InvoiceFrame.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(SIG.view.InvoiceFrame.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(SIG.view.InvoiceFrame.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SIG.view.InvoiceFrame frame = new SIG.view.InvoiceFrame();
                frame.setVisible(true);
                FileOperations fileOperations = new FileOperations(frame);
                ArrayList<sigHeader> inv = fileOperations.readFile();
                frame.setInvoices(inv);
                ShowInvTable invoiceTable = new ShowInvTable(inv);
                frame.setHeaderTabel(invoiceTable);
                frame.getTableInvoiceHeader().setModel(invoiceTable);
                frame.getHeaderTabel().fireTableDataChanged();
            }
        });
    }

    public JLabel getLabelInvoiceDate() {
        return this.labelInvoiceDate;
    }

    public Controller getController() {
        return this.controller;
    }

    public void setLabelInvoiceDate(JLabel labelInvoiceDate) {
        this.labelInvoiceDate = labelInvoiceDate;
    }

    public JLabel getLabelInvoiceNum() {
        return this.labelInvoiceNum;
    }

    public void setLabelInvoiceNum(JLabel labelInvoiceNum) {
        this.labelInvoiceNum = labelInvoiceNum;
    }

    public void setLines(ArrayList<sigItem> lines) {
        this.lines = lines;
    }

    public ShowInvTable getHeaderTabel() {
        return this.headerTabel;
    }

    public void setHeaderTabel(ShowInvTable headerTabel) {
        this.headerTabel = headerTabel;
    }

    public ArrayList<sigHeader> getInvoices() {
        if (this.invoices == null) {
            this.invoices = new ArrayList();
        }

        return this.invoices;
    }

    public void setInvoices(ArrayList<sigHeader> invoices) {
        this.invoices = invoices;
    }

    public JLabel getCustomerName() {
        return this.customerName;
    }

    public JLabel getInvoiceDate() {
        return this.invoiceDate;
    }

    public JLabel getInvoiceNum() {
        return this.invoiceNum;
    }

    public JLabel getInvoiceTotalCost() {
        return this.invoiceTotalCost;
    }

    public JLabel getLabelCustomerName() {
        return this.labelCustomerName;
    }

    public JLabel getLabelTostalCost() {
        return this.labelTostalCost;
    }

    public JTable getTableInvoiceHeader() {
        return this.tableInvoiceHeader;
    }

    public JTable getTableInvoiceLines() {
        return this.tableInvoiceLines;
    }

    public Controller getLisener() {
        return this.controller;
    }

    public void setCustomerLabel(String name) {
        this.labelCustomerName.setText(name);
    }

    public void setCustomerName(String name) {
        this.tableInvoiceHeader.setName(name);
    }

    public int getTotalInvNum() {
        int num = 0;
        Iterator var2 = this.invoices.iterator();

        while(var2.hasNext()) {
            sigHeader invoice = (sigHeader)var2.next();
            if (invoice.getNum() > num) {
                num = invoice.getNum();
            }
        }

        return num;
    }
}

