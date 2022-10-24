package Menu;

import Model.InvoiceHeader;
import Model.InvoiceLine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Menu extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenuItem  fileMenu;
    private JMenuItem  loadFile;
    private JMenuItem saveFile;
    private AbstractButton ta;


    public Menu(){

        super("Menu Details");
        menuBar = new JMenuBar();
        loadFile = new JMenuItem("upload File");
        saveFile = new JMenuItem("Save File");
        fileMenu = new JMenu("File");

        loadFile.addActionListener(this);
        loadFile.setActionCommand("upload File");
        saveFile.addActionListener(this);
        saveFile.setActionCommand("save file");
        fileMenu.add(loadFile);

        fileMenu.add(saveFile);
        menuBar.add(fileMenu);



        setJMenuBar(menuBar);
        setSize(400, 300);
        setLocation(200,200);

    }
    InvoiceHeader invoiceHeader = new InvoiceHeader();
    ArrayList<InvoiceLine> arrayList = new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case  "upload file" :

                break;

            case "save file":

                break;
        }
    }



    void loadFile(){
        JFileChooser fc = new JFileChooser();
        int result=  fc.showOpenDialog(this);
        if (result== JFileChooser.APPROVE_OPTION) {
            String path = fc.getSelectedFile().getPath();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(path);
                int size = fis.available();
                byte[] b = new byte[size];
                fis.read(b);
                ta.setText(new String(b));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e){

                e.printStackTrace();
            }finally {
                try{ fis.close();}catch (IOException e){
                }


            }
        }
        //void saveFile(){

        //}


        //public static void main(String[] args) {
        //new MenuTest().setVisible(true);
        // }
    }}

