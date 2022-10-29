package Model;

import javax.sound.sampled.Line;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public  class LineTableModel extends AbstractTableModel {
private String [] cols={"Item, Price Per Item", "Count","Total"};



    private List<Line>lines;
    public LineTableModel(List<Line>lines){this.lines = lines;}

    public List<Line> getLines() {return lines;}
    @Override
   public String getColumnName(int column) {return cols[column]; }


    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
