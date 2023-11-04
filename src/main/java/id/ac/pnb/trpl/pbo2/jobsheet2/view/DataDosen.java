package id.ac.pnb.trpl.pbo2.jobsheet2.view;

import id.ac.pnb.trpl.pbo2.jobsheet2.entity.Dosen;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.Font;

public class DataDosen {
  private JPanel panelMain;
  private JLabel labelTopTitle;
  private JTextField tfNama;
  private JTextField tfTelpon;
  private JTextField tfNidn;
  private JRadioButton lakiLakiRadioButton;
  private JRadioButton perempuanRadioButton;
  private JButton simpanButton;
  private JButton ubahButton;
  private JButton keluarButton;
  private JButton hapusButton;
  private JTable tableDosen;
  private ButtonGroup buttonGroupJenisKelamin;

  public DataDosen() {
    createUIComponents();

    simpanButton.addActionListener(e -> {
      Dosen dosen = new Dosen(
          tfNidn.getText(),
          tfNama.getText(),
          checkJenisKelamin(),
          tfTelpon.getText()
      );

      addDataTable(dosen);
    });
  }

  public JPanel getPanelMain() {
    return panelMain;
  }

  private void createTable() {
    String[] columns = {"NIDN", "Nama", "Jenis Kelamin", "No Telpon"};
    TableModel model = new DefaultTableModel(columns, 0);

    tableDosen.setModel(model);
    tableDosen.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
  }

  private void addDataTable(Dosen dosen) {
    DefaultTableModel model = (DefaultTableModel) tableDosen.getModel();
    model.addRow(dosen.getAllFields());
  }

  private void createUIComponents() {
    createTable();

    labelTopTitle.setFont(new Font("Fira Code", Font.BOLD, 28));

    hapusButton.setFocusable(false);
    keluarButton.setFocusable(false);
    simpanButton.setFocusable(false);
    ubahButton.setFocusable(false);

    lakiLakiRadioButton.setFocusable(false);
    lakiLakiRadioButton.setActionCommand("Pria");
    perempuanRadioButton.setFocusable(false);
    perempuanRadioButton.setActionCommand("Wanita");
  }

  private Dosen.JenisKelamin checkJenisKelamin() {
    String value = buttonGroupJenisKelamin.getSelection().getActionCommand();

    return Dosen.JenisKelamin.valueOf(value);
  }
}
