/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;


public class addInvoiceDialog extends JDialog{
    private JTextField customerName;
    private JTextField invoiceDate;
    private JLabel custNameLabel;
    private JLabel dateLabel;
    private JButton ok;
    private JButton cancel;

    public addInvoiceDialog(InvoiceFrame frame) {
        custNameLabel= new JLabel("Customer Name:");
        customerName = new JTextField(30);
        dateLabel = new JLabel("Date:");
        invoiceDate = new JTextField(30);
        ok= new JButton("OK");
        cancel = new JButton("Cancel");
        ok.setActionCommand("createInvoice");
        cancel.setActionCommand("cancelInvoice");
        ok.addActionListener(frame.getController());
        cancel.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 4));
        add(custNameLabel);
        add(customerName);
        add(dateLabel);
        add(invoiceDate);
        add(ok);
        add(cancel);
        
        
        pack();
        
        
    }

    public JTextField getCustomerName() {
        return customerName;
    }

    public JTextField getInvoiceDate() {
        return invoiceDate;
    }
    
    
}
