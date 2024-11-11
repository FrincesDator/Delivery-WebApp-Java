import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.Hashtable;
import java.util.Dictionary;

public class DELIVERY extends JDialog {
    private JPanel contentPane;
    private JButton btnSeeTable;
    private JButton btnCancel;
    private JTabbedPane DELIVERY;
    private JTable table1;
    private JButton btnCalculate;
    private JButton btnClear;
    private JButton btnInfo;
    private JRadioButton rb_b5_2;
    private JRadioButton rb_b6_2;
    private JRadioButton rb_b7_2;
    private JRadioButton rb_b8_2;
    private JRadioButton rb_b3_2;
    private JRadioButton rb_b4_2;
    private JRadioButton rb_b1_2;
    private JRadioButton rb_b2_2;
    private JRadioButton rb_b9_2;
    private JRadioButton rb_b10_2;
    private JRadioButton rb_b11_2;
    private JRadioButton rb_bocohan_2;
    private JRadioButton rb_cotta_2;
    private JRadioButton rb_gulang_2;
    private JRadioButton rb_dalahican_2;
    private JRadioButton rb_domoit_2;
    private JRadioButton rb_ibadupay_2;
    private JRadioButton rb_parada_2;
    private JRadioButton rb_crossing_2;
    private JRadioButton rb_market_2;
    private JRadioButton rb_ilatalim_2;
    private JRadioButton rb_iladupay_2;
    private JRadioButton rb_ibaiyam_2;
    private JRadioButton rb_ibatalim_2;
    private JRadioButton rb_ilaiyam_2;
    private JRadioButton rb_isabang_2;
    private JRadioButton rb_kanluran_2;
    private JRadioButton rb_silangan_2;
    private JTextField txtName;
    private JTable table2;
    private JComboBox cmbMOP;
    private JTextField txtTime;
    private JTextField txtDate;
    private JCheckBox cbYes;
    private JCheckBox cbNo;
    private JButton btnSeeTable2;
    private JButton btnSubmitInfo;
    private JTextField txtFee;
    private JRadioButton rb_sm;
    private JRadioButton rb_bayan;
    private JRadioButton rb_diversion;
    private JComboBox cmbName;
    private JTextField txtNewTotal;
    private JButton btnEstimate;
    private JComboBox cmbName2;
    private JTextArea txtFeedBack;
    private JButton btnFeedback;
    private JTextField txtWOF;
    private JComboBox cmbName3;
    private JTextField txtPay;
    private JComboBox cmbMOP2;
    private JButton btnPay;
    private JTextField txtCash;
    private JTextField txtChange;
    private JTable table3;
    private JButton btnSeeTable3;
    private JButton btnAddTable;
    private JLabel ImageLogo;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;

    private final ButtonGroup buttonGroup1;

    private final ButtonGroup buttonGroup2;

    public DELIVERY() {

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rb_bayan); buttonGroup1.add(rb_diversion); buttonGroup1.add(rb_sm);

        buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(rb_b1_2); buttonGroup2.add(rb_b2_2); buttonGroup2.add(rb_b3_2); buttonGroup2.add(rb_b4_2); buttonGroup2.add(rb_b5_2);
        buttonGroup2.add(rb_b6_2); buttonGroup2.add(rb_b7_2); buttonGroup2.add(rb_b8_2); buttonGroup2.add(rb_b9_2); buttonGroup2.add(rb_b10_2);
        buttonGroup2.add(rb_b11_2); buttonGroup2.add(rb_bocohan_2); buttonGroup2.add(rb_cotta_2); buttonGroup2.add(rb_gulang_2);
        buttonGroup2.add(rb_dalahican_2); buttonGroup2.add(rb_domoit_2); buttonGroup2.add(rb_ibadupay_2); buttonGroup2.add(rb_ibaiyam_2); buttonGroup2.add(rb_ibatalim_2);
        buttonGroup2.add(rb_iladupay_2); buttonGroup2.add(rb_ilaiyam_2); buttonGroup2.add(rb_ilatalim_2); buttonGroup2.add(rb_isabang_2); buttonGroup2.add(rb_market_2);
        buttonGroup2.add(rb_crossing_2); buttonGroup2.add(rb_kanluran_2); buttonGroup2.add(rb_parada_2); buttonGroup2.add(rb_silangan_2);

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnSeeTable);

        rb_bayan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onBayan();
            }
        });
        rb_sm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSm();
            }
        });
        rb_diversion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onDiversion();
            }
        });
        rb_b1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB1();
            }
        });
        rb_b2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB2();
            }
        });
        rb_b3_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB3();
            }
        });
        rb_b4_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB4();
            }
        });
        rb_b5_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB5();
            }
        });
        rb_b6_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB6();
            }
        });
        rb_b7_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB7();
            }
        });
        rb_b8_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB8();
            }
        });
        rb_b9_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB9();
            }
        });
        rb_b10_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB10();
            }
        });
        rb_b11_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onB11();
            }
        });
        rb_cotta_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCotta();
            }
        });
        rb_bocohan_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onBocohan();
            }
        });
        rb_gulang_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onGulang();
            }
        });
        rb_dalahican_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onDalahican();
            }
        });
        rb_domoit_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onDomoit();
            }
        });
        rb_ibadupay_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onDupay1();
            }
        });
        rb_ibaiyam_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onIyam1();
            }
        });
        rb_ibatalim_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onTalim1();
            }
        });
        rb_ilaiyam_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onIyam2();
            }
        });
        rb_iladupay_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onDupay2();
            }
        });
        rb_ilatalim_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onTalim2();
            }
        });
        rb_isabang_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onIsabang();
            }
        });
        rb_market_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onMarket();
            }
        });
        rb_crossing_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCrossing();
            }
        });
        rb_kanluran_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onKanluran();
            }
        });
        rb_parada_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onParada();
            }
        });
        rb_silangan_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSilangan();
            }
        });
        btnSeeTable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seeTable();
            }
        });
        btnSeeTable3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seeTable3();
            }
        });
        btnInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seeInfo();
            }
        });
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCalculate();
            }
        });
        btnEstimate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onEstimate();
            }
        });
        btnFeedback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onFeedback();
            }
        });
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onClear();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });
        btnSeeTable2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seeTable2();
            }
        });
        btnPay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onPay();
            }
        });
        btnSubmitInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSubmitInfo();
            }
        });
        cbYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onYes();
            }
        });
        cbNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onNo();
            }
        });
        cmbName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onName();
            }
        });
        cmbName3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onAmount();
            }
        });
        btnAddTable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onAddTable3();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });
        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    double count = 0, fee = 0, km = 1, discount = 0, deliveryFee = 0, rush1 = 0, pay = 0, cash = 0, change = 0;
    int xrow = 0;
    String name = "", location = "", destination = "", rate = "", issues = "", comments = "", infoHistory = "", rush = "";

    String Name = "", MOP = "";
    double Amount = 0, Cash = 0;
    FeeCalculate calculate = new FeeCalculate(Name, Amount, MOP, Cash, change);
    Dictionary dictionary = new Hashtable();
    Dictionary dictionary2 = new Hashtable();
    Dictionary dictionary3 = new Hashtable();
    Dictionary dictionary4 = new Hashtable();
    Dictionary dictionary5 = new Hashtable();


    public void seeTable() {
        // add your code here
        table1.setModel(new DefaultTableModel(
                null,
                new String[] {"#", "Customer Name", "MCDO Location", "Destination", "Estimated Delivery Fee"}
        ));
    }
    public void seeTable3() {
        // add your code here
        table3.setModel(new DefaultTableModel(
                null,
                new String[] {"Name", "Location", "Destination", "Total Fee", "Available Cash", "Change"}
        ));
    }
    public void seeInfo() {
        // add your code
        JOptionPane.showMessageDialog(null, "THIS PROGRAM IS USEFUL TO BUSINESSES THAT OFFERS DELIVERY TO THEIR CUSTOMERS\n\n\nDELIVER FEE IS BASED ON:\n" +
                "-- How far 2 locations are far from each other\n1KM = 15 pesos \nEstimates on how far the locations are from each other are based on Google\n-- Discounts are given to " +
                "seniors, PWDs and students\n-- Price may increase or decrease depending on some factors", "PROGRAM INFORMATION", JOptionPane.INFORMATION_MESSAGE);
    }
    private void onBayan() {
        // add your code
        location = "MCDO BAYAN";
    }
    private void onSm() {
        location = "MCDO SM";
    }
    private void onB1() {
        destination = "BARANGAY 1";
    }
    private void onB2() {
        destination = "BARANGAY 2";
    }
    private void onB3() {
        destination = "BARANGAY 3";
    }
    private void onB4() {
        destination = "BARANGAY 4";
    }
    private void onB5() {
        destination = "BARANGAY 5";
    }
    private void onB6() {
        destination = "BARANGAY 6";
    }
    private void onB7() {
        destination = "BARANGAY 7";
    }
    private void onB8() {
        destination = "BARANGAY 8";
    }
    private void onB9() {
        destination = "BARANGAY 9";
    }
    private void onB10() {
        destination = "BARANGAY 10";
    }
    private void onB11() {
        destination = "BARANGAY 11";
    }
    private void onBocohan() {
        destination = "BOCOHAN";
    }
    private void onCotta() {
        destination = "COTTA";
    }
    private void onGulang() {
        destination = "GULANG-GULANG";
    }
    private void onDalahican() {
        destination = "DALAHICAN";
    }
    private void onDomoit() {
        destination = "DOMOIT";
    }
    private void onDupay1() {
        destination = "IBABANG DUPAY";
    }
    private void onIyam1() {
        destination = "IBABANG IYAM";
    }
    private void onTalim1() {
        destination = "IBABANG TALIM";
    }
    private void onDupay2() {
        destination = "ILAYANG DUPAY";
    }
    private void onIyam2() {
        destination = "ILAYANG IYAM";
    }
    private void onTalim2() {
        destination = "IBABANG TALIM";
    }
    private void onIsabang() {
        destination = "ISABANG";
    }
    private void onMarket() {
        destination = "MARKET VIEW";
    }
    private void onCrossing() {
        destination = "MAYAO CROSSING";
    }
    private void onKanluran() {
        destination = "MAYAO KANLURAN";
    }
    private void onParada() {
        destination = "MAYAO PARADA";
    }
    private void onSilangan() {
        destination = "MAYAO SILANGAN";
    }
    private void onDiversion() {
        location = "MCDO DIVERSION";
    }
    public void onCalculate() {
        DefaultTableModel locationList = (DefaultTableModel) table1.getModel();

        name = txtName.getText();
        count++;
        String name = txtName.getText();
        String new_location = location;
        String new_destination = destination;

        // conditional statement
        if (location.equals("") || destination.equals("") || location.equals("") && destination.equals("")) {
            fee = calculate.getSalary(km);
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        } else if(location.equals("MCDO BAYAN") && destination.equals("BARANGAY 1") || location == "MCDO BAYAN" && destination == "BARANGAY 2" || location == "MCDO BAYAN" && destination == "BARANGAY 3"
                || location == "MCDO BAYAN" && destination == "BARANGAY 4" || location == "MCDO BAYAN" && destination == "BARANGAY 5" || location == "MCDO BAYAN" && destination == "BARANGAY 6"
                || location == "MCDO BAYAN" && destination == "BARANGAY 7" || location == "MCDO BAYAN" && destination == "BARANGAY 8" || location == "MCDO BAYAN" && destination == "BARANGAY 9"
                || location == "MCDO BAYAN" && destination == "BARANGAY 10" || location == "MCDO SM" && destination == "MARKET VIEW") {
            calculate.setSalary(km);
            fee = calculate.getSalary();
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        } else if(location == "MCDO BAYAN" && destination == "COTTA" || location == "MCDO BAYAN" && destination == "BARANGAY 11" || location == "MCDO BAYAN" && destination == "ILAYANG IYAM"
                || location == "MCDO DIVERSION" && destination == "ILAYANG DUPAY" || location == "MCDO DIVERSION" && destination == "MAYAO KANLURAN"
                || location == "MCDO SM" && destination == "BARANGAY 1" || location == "MCDO SM" && destination == "BARANGAY 2" || location == "MCDO SM" && destination == "BARANGAY 3"
                || location == "MCDO SM" && destination == "BARANGAY 4" || location == "MCDO SM" && destination == "BARANGAY 5" || location == "MCDO SM" && destination == "BARANGAY 6"
                || location == "MCDO SM" && destination == "BARANGAY 7" || location == "MCDO SM" && destination == "BARANGAY 9" || location == "MCDO SM" && destination == "BARANGAY 11"
                || location == "MCDO SM" && destination == "IBABANG DUPAY" || location == "MCDO SM" && destination == "MAYAO CROSSING" || location == "MCDO SM" && destination == "MAYAO KANLURAN") {
            calculate.setSalary(km+1);
            fee = calculate.getSalary();
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        } else if(location == "MCDO BAYAN" && destination == "IBABANG IYAM" || location == "MCDO BAYAN" && destination == "MAYAO CROSSING" || location == "MCDO DIVERSION" && destination == "IBABANG DUPAY"
                || location == "MCDO DIVERSION" && destination == "MAYAO SILANGAN" || location == "MCDO SM" && destination == "BARANGAY 8" || location == "MCDO SM" && destination == "BARANGAY 10"
                || location == "MCDO SM" && destination == "COTTA" || location == "MCDO SM" && destination == "ILAYANG DUPAY" || location == "MCDO SM" && destination == "ILAYANG IYAM") {
            calculate.setSalary(km+2);
            fee = calculate.getSalary();
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        } else if(location == "MCDO BAYAN" && destination == "BOCOHAN" || location == "MCDO BAYAN" && destination == "GULANG-GULANG" || location == "MCDO BAYAN" && destination == "DALAHICAN"
                || location == "MCDO BAYAN" && destination == "DOMOIT" || location == "MCDO BAYAN" && destination == "IBABANG DUPAY" || location == "MCDO BAYAN" && destination == "ILAYANG DUPAY"
                || location == "MCDO BAYAN" && destination == "MAYAO KANLURAN" || location == "MCDO DIVERSION" && destination == "GULANG-GULANG"
                || location == "MCDO DIVERSION" && destination == "DOMOIT" || location == "MCDO SM" && destination == "GULANG-GULANG" || location == "MCDO SM" && destination == "DALAHICAN"
                || location == "MCDO SM" && destination == "MAYAO SILANGAN") {
            calculate.setSalary(km + 3);
            fee = calculate.getSalary();
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        } else if(location == "MCDO DIVERSION" && destination == "BARANGAY 2" || location == "MCDO DIVERSION" && destination == "BARANGAY 11" || location == "MCDO SM" && destination == "DOMOIT"
                || location == "MCDO SM" && destination == "IBABANG IYAM") {
            calculate.setSalary(km + 4);
            fee = calculate.getSalary();
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        } else if(location == "MCDO BAYAN" && destination == "MAYAO SILANGAN" || location == "MCDO DIVERSION" && destination == "BARANGAY 1" || location == "MCDO DIVERSION" && destination == "BARANGAY 3"
                || location == "MCDO DIVERSION" && destination == "BARANGAY 4" || location == "MCDO DIVERSION" && destination == "BARANGAY 5" || location == "MCDO DIVERSION" && destination == "BARANGAY 6"
                || location == "MCDO DIVERSION" && destination == "BARANGAY 7" || location == "MCDO DIVERSION" && destination == "BOCOHAN" || location == "MCDO SM" && destination == "BOCOHAN") {
            calculate.setSalary(km + 5);
            fee = calculate.getSalary();
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        } else if(location == "MCDO BAYAN" && destination == "IBABANG TALIM" || location == "MCDO BAYAN" && destination == "ILAYANG TALIM" || location == "MCDO DIVERSION" && destination == "BARANGAY 8"
                || location == "MCDO DIVERSION" && destination == "BARANGAY 9" || location == "MCDO DIVERSION" && destination == "BARANGAY 10" || location == "MCDO DIVERSION" && destination == "ISABANG"
                || location == "MCDO DIVERSION" && destination == "MARKET VIEW" || location == "MCDO DIVERSION" && destination == "MAYAO CROSSING" || location == "MCDO DIVERSION" && destination == "MAYAO PARADA") {
            calculate.setSalary(km + 6);
            fee = calculate.getSalary();
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        } else if(location == "MCDO DIVERSION" && destination == "COTTA" || location == "MCDO SM" && destination == "ILAYANG TALIM" || location == "MCDO SM" && destination == "MAYAO PARADA") {
            calculate.setSalary(km + 7);
            fee = calculate.getSalary();
        } else if(location == "MCDO DIVERSION" && destination == "ILAYANG IYAM" || location == "MCDO DIVERSION" && destination == "ILAYANG TALIM" || location == "MCDO SM" && destination == "ISABANG") {
            calculate.setSalary(km + 8);
            fee = calculate.getSalary();
        } else if(location == "MCDO DIVERSION" && destination == "DALAHICAN" || location == "MCDO DIVERSION" && destination == "IBABANG IYAM"
                || location == "MCDO DIVERSION" && destination == "IBABANG TALIM" || location == "MCDO SM" && destination == "IBABANG TALIM") {
            calculate.setSalary(km + 9);
            fee = calculate.getSalary();
            dictionary.put(name, fee);
            dictionary3.put(name, location);
            dictionary4.put(name, destination);
        }

        location = "";
        destination = "";
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        txtName.setText("");

        // confirm dialog
        int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to display information?",
                "STUDENT INFORMATION DISPLAY", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmation == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null, "CUSTOMER #: " +count+ "\nCUSTOMER NAME: " +name+ "\nMCDO LOCATION: " +new_location+
                    "\nDESTINATION: " +new_destination+ "\nDELIVERY FEE: " +fee, "DELIVERY DETAILS", JOptionPane.INFORMATION_MESSAGE);

        if (confirmation == JOptionPane.NO_OPTION)
            JOptionPane.showMessageDialog(null, "Ok, Thank You!");

        Object[] row = {count, name, new_location, new_destination, fee};
        locationList.addRow(row);

        cmbName.insertItemAt(locationList.getValueAt(xrow, 1).toString(), xrow);
        cmbName2.insertItemAt(locationList.getValueAt(xrow, 1).toString(), xrow);
        cmbName3.insertItemAt(locationList.getValueAt(xrow, 1).toString(), xrow);
        xrow++;
    }
    public void onEstimate() {
        String new_location = location;
        String new_destination = destination;

        if (location.equals("") || destination.equals("") || location.equals("") && destination.equals("")) {
            fee = calculate.getSalary(km);
        } else if(location.equals("MCDO BAYAN") && destination.equals("BARANGAY 1") || location == "MCDO BAYAN" && destination == "BARANGAY 2" || location == "MCDO BAYAN" && destination == "BARANGAY 3"
                || location == "MCDO BAYAN" && destination == "BARANGAY 4" || location == "MCDO BAYAN" && destination == "BARANGAY 5" || location == "MCDO BAYAN" && destination == "BARANGAY 6"
                || location == "MCDO BAYAN" && destination == "BARANGAY 7" || location == "MCDO BAYAN" && destination == "BARANGAY 8" || location == "MCDO BAYAN" && destination == "BARANGAY 9"
                || location == "MCDO BAYAN" && destination == "BARANGAY 10" || location == "MCDO SM" && destination == "MARKET VIEW") {
            calculate.setSalary(km);
            fee = calculate.getSalary();
        } else if(location == "MCDO BAYAN" && destination == "COTTA" || location == "MCDO BAYAN" && destination == "BARANGAY 11" || location == "MCDO BAYAN" && destination == "ILAYANG IYAM"
                || location == "MCDO DIVERSION" && destination == "ILAYANG DUPAY" || location == "MCDO DIVERSION" && destination == "MAYAO KANLURAN"
                || location == "MCDO SM" && destination == "BARANGAY 1" || location == "MCDO SM" && destination == "BARANGAY 2" || location == "MCDO SM" && destination == "BARANGAY 3"
                || location == "MCDO SM" && destination == "BARANGAY 4" || location == "MCDO SM" && destination == "BARANGAY 5" || location == "MCDO SM" && destination == "BARANGAY 6"
                || location == "MCDO SM" && destination == "BARANGAY 7" || location == "MCDO SM" && destination == "BARANGAY 9" || location == "MCDO SM" && destination == "BARANGAY 11"
                || location == "MCDO SM" && destination == "IBABANG DUPAY" || location == "MCDO SM" && destination == "MAYAO CROSSING" || location == "MCDO SM" && destination == "MAYAO KANLURAN") {
            calculate.setSalary(km+1);
            fee = calculate.getSalary();
        } else if(location == "MCDO BAYAN" && destination == "IBABANG IYAM" || location == "MCDO BAYAN" && destination == "MAYAO CROSSING" || location == "MCDO DIVERSION" && destination == "IBABANG DUPAY"
                || location == "MCDO DIVERSION" && destination == "MAYAO SILANGAN" || location == "MCDO SM" && destination == "BARANGAY 8" || location == "MCDO SM" && destination == "BARANGAY 10"
                || location == "MCDO SM" && destination == "COTTA" || location == "MCDO SM" && destination == "ILAYANG DUPAY" || location == "MCDO SM" && destination == "ILAYANG IYAM") {
            calculate.setSalary(km+2);
            fee = calculate.getSalary();
        } else if(location == "MCDO BAYAN" && destination == "BOCOHAN" || location == "MCDO BAYAN" && destination == "GULANG-GULANG" || location == "MCDO BAYAN" && destination == "DALAHICAN"
                || location == "MCDO BAYAN" && destination == "DOMOIT" || location == "MCDO BAYAN" && destination == "IBABANG DUPAY" || location == "MCDO BAYAN" && destination == "ILAYANG DUPAY"
                || location == "MCDO BAYAN" && destination == "MAYAO KANLURAN" || location == "MCDO DIVERSION" && destination == "GULANG-GULANG"
                || location == "MCDO DIVERSION" && destination == "DOMOIT" || location == "MCDO SM" && destination == "GULANG-GULANG" || location == "MCDO SM" && destination == "DALAHICAN"
                || location == "MCDO SM" && destination == "MAYAO SILANGAN") {
            calculate.setSalary(km + 3);
            fee = calculate.getSalary();
        } else if(location == "MCDO DIVERSION" && destination == "BARANGAY 2" || location == "MCDO DIVERSION" && destination == "BARANGAY 11" || location == "MCDO SM" && destination == "DOMOIT"
                || location == "MCDO SM" && destination == "IBABANG IYAM") {
            calculate.setSalary(km + 4);
            fee = calculate.getSalary();
        } else if(location == "MCDO BAYAN" && destination == "MAYAO SILANGAN" || location == "MCDO DIVERSION" && destination == "BARANGAY 1" || location == "MCDO DIVERSION" && destination == "BARANGAY 3"
                || location == "MCDO DIVERSION" && destination == "BARANGAY 4" || location == "MCDO DIVERSION" && destination == "BARANGAY 5" || location == "MCDO DIVERSION" && destination == "BARANGAY 6"
                || location == "MCDO DIVERSION" && destination == "BARANGAY 7" || location == "MCDO DIVERSION" && destination == "BOCOHAN" || location == "MCDO SM" && destination == "BOCOHAN") {
            calculate.setSalary(km + 5);
            fee = calculate.getSalary();
        } else if(location == "MCDO BAYAN" && destination == "IBABANG TALIM" || location == "MCDO BAYAN" && destination == "ILAYANG TALIM" || location == "MCDO DIVERSION" && destination == "BARANGAY 8"
                || location == "MCDO DIVERSION" && destination == "BARANGAY 9" || location == "MCDO DIVERSION" && destination == "BARANGAY 10" || location == "MCDO DIVERSION" && destination == "ISABANG"
                || location == "MCDO DIVERSION" && destination == "MARKET VIEW" || location == "MCDO DIVERSION" && destination == "MAYAO CROSSING" || location == "MCDO DIVERSION" && destination == "MAYAO PARADA") {
            calculate.setSalary(km + 6);
            fee = calculate.getSalary();
        } else if(location == "MCDO DIVERSION" && destination == "COTTA" || location == "MCDO SM" && destination == "ILAYANG TALIM" || location == "MCDO SM" && destination == "MAYAO PARADA") {
            calculate.setSalary(km + 7);
            fee = calculate.getSalary();
        } else if(location == "MCDO DIVERSION" && destination == "ILAYANG IYAM" || location == "MCDO DIVERSION" && destination == "ILAYANG TALIM" || location == "MCDO SM" && destination == "ISABANG") {
            calculate.setSalary(km + 8);
            fee = calculate.getSalary();
        } else if(location == "MCDO DIVERSION" && destination == "DALAHICAN" || location == "MCDO DIVERSION" && destination == "IBABANG IYAM"
                || location == "MCDO DIVERSION" && destination == "IBABANG TALIM" || location == "MCDO SM" && destination == "IBABANG TALIM") {
            calculate.setSalary(km + 9);
            fee = calculate.getSalary();
        }

        JOptionPane.showMessageDialog(null, "Estimated Delivery Fee is: " + fee, "ESTIMATED FEE", JOptionPane.INFORMATION_MESSAGE);
    }
    private void onFeedback() {
        Object[] options = {"5 STARS", "4 STARS", "3 STARS", "2 STARS", "1 STAR"};
        int choices;
        choices = JOptionPane.showOptionDialog(null, "Customer Rating: ", "FEEDBACK",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

        //option dialog
        if (choices == 0)
            rate = "5 STARS";
        else if (choices == 1)
            rate = "4 STARS";
        else if (choices == 2)
            rate = "3 STARS";
        else if (choices == 3)
            rate = "2 STARS";
        else
            rate = "1 STAR";

        // selection dialog
        String[] selection1 = {"RUDE RIDER", "SLOW DELIVERY", "INCOMPLETE ORDER", "DID NOT GIVE CHANGE", "NONE"};
        Object select1 = "";
        select1 = JOptionPane.showInputDialog(null, "issues/ problems encountered: ", "FEEDBACK",
                JOptionPane.QUESTION_MESSAGE, null, selection1, selection1[0]);
        issues = select1.toString();

        comments = JOptionPane.showInputDialog("Do you have any (more) comments or suggestions for us? ");

        infoHistory = infoHistory + "\nCUSTOMER RATE: " + rate + "\t\tCUSTOMER ISSUES: " + issues + "\nCUSTOMER COMMENT/FEEDBACK: " + comments;
        txtFeedBack.setText(infoHistory);

    }
    private void onClear() {
        DefaultTableModel locationList = (DefaultTableModel) table1.getModel();
        locationList.setRowCount(0);

        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        count = 0;
        txtName.setText("");
        xrow = 0;
        cmbName.removeAllItems();
    }
    private void onCancel() {
        // add your code
        dispose();
    }
    public void seeTable2() {
        // add your code here
        table2.setModel(new DefaultTableModel(
                null,
                new String[] {"Customer Name", "Worth of Food", "Citizen Type", "Discount", "Rush Order", "Date and Time", "Total Delivery Fee"}
        ));
    }
    private void onSubmitInfo() {
        DefaultTableModel InfoList = (DefaultTableModel) table2.getModel();
        double WorthOfFood = Double.parseDouble(txtWOF.getText());
        name = cmbName.getSelectedItem().toString();
        deliveryFee = (double) dictionary.get(cmbName.getSelectedItem());

        if (rush == "yes") {
            calculate.setRush(deliveryFee);
            rush1 = calculate.getRush();
        } else {
            rush1 = 0;
        }

        String Citizenship = cmbMOP.getSelectedItem().toString();
        if (Citizenship == "STUDENT (10% OFF ON DELIVERY FEE)") {
            calculate.setDiscount(deliveryFee);
            discount = calculate.getDiscount();
        }
        if (Citizenship == "SENIOR CITIZEN (20% OFF ON DELIVERY FEE)" || Citizenship == "PWD (20% OFF ON DELIVERY FEE)") {
            calculate.setDiscount1(deliveryFee);
            discount = calculate.getDiscount1();
        }
        if (Citizenship == "NONE/OTHERS") {
            discount = 0;
        }

        calculate.setNewTotal(WorthOfFood, deliveryFee, discount, rush1);
        double NewTotal = calculate.getNewTotal();
        txtNewTotal.setText(Double.toString(NewTotal));

        String date = txtDate.getText();

        Object[] row = {name, WorthOfFood, Citizenship, discount, rush1, date, NewTotal};
        InfoList.addRow(row);

        dictionary2.put(name, NewTotal);

    }
    private void onPay() {
        txtPay.setText(dictionary2.get(cmbName3.getSelectedItem()).toString());
        pay = Double.parseDouble(txtPay.getText());
        cash = Double.parseDouble(txtCash.getText());
        if (cash >= pay) {
            calculate.setChange(pay, cash);
            change = calculate.getChange();
            JOptionPane.showMessageDialog(null, "You can now add this to the table \n Thank You!", "PAYMENT SUCCESS",JOptionPane.INFORMATION_MESSAGE );
        } else {
            while (cash < pay) {
                cash = Double.parseDouble(JOptionPane.showInputDialog(null, "Insufficient Cash!!! \n Please enter another amount: ", "PAYMENT FAILED", JOptionPane.WARNING_MESSAGE));
            }
            calculate.setChange(pay, cash);
            change = calculate.getChange();
            JOptionPane.showMessageDialog(null, "You can now add this to the table \n Thank You!", "PAYMENT SUCCESS",JOptionPane.INFORMATION_MESSAGE );
        }
        dictionary5.put(cmbName3.getSelectedItem(), cash);
        txtChange.setText(String.valueOf(change));
    }
    private void onYes () {
        rush = "yes";
        cbNo.setSelected(false);
    }
    private void onNo () {
        rush = "no";
        cbYes.setSelected(false);
    }
    private void onName(){
        txtTime.setText(dictionary.get(cmbName.getSelectedItem()).toString());
    }
    private void onAmount(){
        txtPay.setText(dictionary2.get(cmbName3.getSelectedItem()).toString());
    }
    private void onAddTable3(){
        DefaultTableModel InfoList = (DefaultTableModel) table3.getModel();

        String inputName = cmbName3.getSelectedItem().toString();
        calculate.setName(inputName);
        Name = calculate.getName();
        double inputAmount = Double.parseDouble(txtPay.getText());
        calculate.setAmount(inputAmount);
        Amount = calculate.getAmount();
        String mop = cmbMOP2.getSelectedItem().toString();
        calculate.setMOP(mop);
        MOP = calculate.getMOP();
        double inputCash = Double.parseDouble(dictionary5.get(Name).toString());
        calculate.setCash(inputCash);
        Cash = calculate.getCash();
        double inputChange = Double.parseDouble(txtChange.getText());
        calculate.setchange(inputChange);
        change = calculate.getchange();

        location = String.valueOf(dictionary3.get(cmbName3.getSelectedItem()));
        destination = String.valueOf(dictionary4.get(cmbName3.getSelectedItem()));

        calculate.displaySummary();

        Object[] row = {Name, location, destination, Amount, Cash, change};
        InfoList.addRow(row);
    }

    public static void main(String[] args) {
        DELIVERY dialog = new DELIVERY();
        dialog.pack();
        dialog.setSize(1500, 850);
        dialog.setTitle("FINALS PROJECT");
        dialog.setVisible(true);
        System.exit(0);
    }

   private void createUIComponents() {
        label2 = new JLabel(new ImageIcon("MCDO.png"));
        label1 = new JLabel(new ImageIcon("LOGO.png"));
        label3 = new JLabel(new ImageIcon("NUGGETS.png"));
        label4 = new JLabel(new ImageIcon("NUGGETS.png"));
        label6 = new JLabel(new ImageIcon("NUGGETS.png"));
        label7 = new JLabel(new ImageIcon("BG.png"));
    };
}
