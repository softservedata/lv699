package org.example;
import javax.print.Doc;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

import org.bson.Document;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class UI extends JFrame {

    static private Vector<Vector<String>> data;
    private Vector<String> header;
    private JTable table;
    private Box contents;
    private MongoDB mongo;

    public UI(MongoDB db) {
        super("Viktoria's project");

        this.defineMenu();
        this.defineTable();
        this.mongo = db;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contents);
        setSize(500, 600);
        setVisible(true);
    }

    private void defineTable() {
        this.data = new Vector<Vector<String>>();
        this.header = new Vector<String>();
        this.contents = new Box(BoxLayout.Y_AXIS);

        this.header.add("FirstName");
        this.header.add("LastName");
        this.header.add("Grade");
        this.header.add("Year");

        this.table = new JTable(data, header);
        this.contents.add(new JScrollPane(table));
    };

    private void defineMenu() {
        this.setLayout(null);

        MenuBar mb = new MenuBar();
        Menu mFile = new Menu("File");
        Menu mEdit = new Menu("Edit");

        MenuItem miRevalidate = new MenuItem("remove data", new MenuShortcut(KeyEvent.VK_A));
        miRevalidate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("remove table");
                removeTableData();
            }
        });
        MenuItem miRequst = new MenuItem("update table", new MenuShortcut(KeyEvent.VK_S));
        miRequst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("New Request");
                // updateTable();
                // revalidate();
                updateTableData();
            }
        });
        MenuItem miExit = new MenuItem("Exit", new MenuShortcut(KeyEvent.VK_D));
        miExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit");
                System.exit(0);
            }
        });

        MenuItem miAdd = new MenuItem("Add", new MenuShortcut(KeyEvent.VK_PLUS));
        miAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Add");
                TextField str11 = new TextField("");
                TextField str21 = new TextField("");
                TextField str31 = new TextField("");
                TextField str41 = new TextField("");


                GridBagLayout g = new GridBagLayout();
                GridBagConstraints gbc = new GridBagConstraints();

                JFrame frame2 = new JFrame();
                frame2.setVisible(true);
                frame2.setSize(300, 300);
                frame2.setPreferredSize(getSize());
                frame2.setDefaultCloseOperation(HIDE_ON_CLOSE);
                frame2.setLayout(g);
                // frame2.setLayout(g);

                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.gridx = 1;
                gbc.gridy = 0;
                // frame2.add(new Label("date:"), gbc);
                gbc.gridx = 2;
                gbc.gridy = 0;
                // frame2.add(dateStr, gbc);
                gbc.gridx = 1;
                gbc.gridy = 1;
                frame2.add(new Label("FirstName"), gbc);
                gbc.gridx = 2;
                gbc.gridy = 1;
                frame2.add(new Label("LastName"), gbc);
                gbc.gridx = 3;
                gbc.gridy = 1;
                frame2.add(new Label("Grade"), gbc);
                gbc.gridx = 4;
                gbc.gridy = 1;
                frame2.add(new Label("Year"), gbc);

                gbc.gridx = 1;
                gbc.gridy = 2;
                frame2.add(str11, gbc);

                gbc.gridx = 2;
                gbc.gridy = 2;
                frame2.add(str21, gbc);

                gbc.gridx = 3;
                gbc.gridy = 2;
                frame2.add(str31, gbc);

                gbc.gridx = 4;
                gbc.gridy = 2;
                frame2.add(str41, gbc);


                Button b = new Button("create");
                b.setActionCommand("next");
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
//                        System.out.println(str11.getText());
                        Document temp = new Document();
                        temp.append("FirstName",str11.getText());
                        temp.append("SecondName",str21.getText());
                        temp.append("Grade",str31.getText());
                        temp.append("Year",str41.getText());
                        mongo.addOne(temp);

                        updateTableData();
                    }
                });
                gbc.gridx = 2;
                gbc.gridy = 6;
                frame2.add(b, gbc);

                // add(gbc);
            }
        });
        MenuItem miRemove = new MenuItem("Remove", new MenuShortcut(KeyEvent.VK_MINUS));
        miRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Remove");

                GridBagLayout g = new GridBagLayout();
                GridBagConstraints gbc = new GridBagConstraints();

                JFrame frame2 = new JFrame();
                frame2.setVisible(true);
                frame2.setSize(300, 300);
                frame2.setPreferredSize(getSize());
                frame2.setDefaultCloseOperation(HIDE_ON_CLOSE);
                frame2.setLayout(g);

                TextField idStr = new TextField("");

                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.gridx = 1;
                gbc.gridy = 0;
                frame2.add(new Label("id:"), gbc);
                gbc.gridx = 2;
                gbc.gridy = 0;
                frame2.add(idStr, gbc);
                Button b1 = new Button("remove");
                b1.setActionCommand("remove");
                b1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        mongo.removeOne(idStr.getText());
                        updateTableData();
                    }
                });
                gbc.gridx = 2;
                gbc.gridy = 1;
                frame2.add(b1, gbc);

            }
        });

        mFile.add(miRevalidate);
        mFile.add(miRequst);
        mFile.addSeparator();
        mFile.add(miExit);

        mEdit.add(miAdd);
        mEdit.add(miRemove);

        mb.add(mFile);
        mb.add(mEdit);

        this.setMenuBar(mb);
    }

    public void addRow(String FName, String LName, String Grade, String Year) {
        Vector<String> tempRow = new Vector<String>();
        tempRow.add(FName);
        tempRow.add(LName);
        tempRow.add(Grade);
        tempRow.add(Year);
        this.data.add(tempRow);
    }

    public void revalidateTable() {
        this.table.repaint();
        this.contents.repaint();
        this.table.revalidate();
        this.contents.revalidate();

    }

    public void updateTable() {
        this.mongo.getAll().forEach((el) -> {
            System.out.println(el);
            System.out.println();
            if (el != null) {

                Object obj = null;
                try {
                    obj = new JSONParser().parse((String) el);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                if (obj!=null){
                    System.out.println(((JSONObject)obj).get("FirstName"));
                    System.out.println(((JSONObject)obj).get("SecondName"));
                    System.out.println(((JSONObject)obj).get("Grade"));
                    this.addRow(((String)((JSONObject)obj).get("FirstName")),
                            ((String)((JSONObject)obj).get("SecondName")),
                            ((String)((JSONObject)obj).get("Grade")),
                            ((String)((JSONObject)obj).get("Year")));
                }

            }
        });
    }

    public void removeTableData() {

        // DefaultTableModel dtm = (DefaultTableModel) this.table.getModel();
        // dtm.setRowCount(0);

        DefaultTableModel model = (DefaultTableModel) this.table.getModel();
        int rows = model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    public void updateTableData() {
        this.removeTableData();
        this.updateTable();
        this.revalidateTable();
    }


}
