package es.ulpgc.diu.diu_p9_maven;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class DataBaseInfoDisplay extends javax.swing.JFrame {
    private final DataBaseInfoLoader database;
    private DefaultListModel tableListModel = new DefaultListModel();
    private DefaultListModel fieldListModel = new DefaultListModel();
    public DataBaseInfoDisplay() {
        database = new DataBaseInfoLoader();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        selectedGroup = new javax.swing.ButtonGroup();
        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tablesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JList<>();
        FieldsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldList = new javax.swing.JList<>();
        autenticationPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        connectButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        namePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        sigle_button = new javax.swing.JToggleButton();
        single_interval_button = new javax.swing.JToggleButton();
        multiple_interval_button = new javax.swing.JToggleButton();
        deselectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePanel.setBackground(new java.awt.Color(196, 249, 231));
        titlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        titlePanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Database Information Display");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        titlePanel.add(jLabel1, gridBagConstraints);

        tablesPanel.setBackground(new java.awt.Color(204, 255, 204));
        tablesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tables"));
        tablesPanel.setPreferredSize(new java.awt.Dimension(250, 340));

        tableList.setToolTipText("Select the tables and click to the search button");
        tableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableList);

        javax.swing.GroupLayout tablesPanelLayout = new javax.swing.GroupLayout(tablesPanel);
        tablesPanel.setLayout(tablesPanelLayout);
        tablesPanelLayout.setHorizontalGroup(
            tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tablesPanelLayout.setVerticalGroup(
            tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );

        FieldsPanel.setBackground(new java.awt.Color(204, 255, 204));
        FieldsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Fields"));

        jScrollPane2.setViewportView(fieldList);

        javax.swing.GroupLayout FieldsPanelLayout = new javax.swing.GroupLayout(FieldsPanel);
        FieldsPanel.setLayout(FieldsPanelLayout);
        FieldsPanelLayout.setHorizontalGroup(
            FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        FieldsPanelLayout.setVerticalGroup(
            FieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        autenticationPanel.setBackground(new java.awt.Color(196, 249, 231));
        autenticationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Database access"));
        autenticationPanel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        autenticationPanel.add(jLabel2, gridBagConstraints);

        userField.setToolTipText("Set the User database");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 10);
        autenticationPanel.add(userField, gridBagConstraints);

        jLabel3.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        autenticationPanel.add(jLabel3, gridBagConstraints);

        connectButton.setText("Connect");
        connectButton.setToolTipText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        autenticationPanel.add(connectButton, gridBagConstraints);

        passwordField.setToolTipText("Set the password of database");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        autenticationPanel.add(passwordField, gridBagConstraints);

        namePanel.setBackground(new java.awt.Color(196, 249, 231));
        namePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        namePanel.setLayout(new java.awt.GridBagLayout());

        jLabel6.setText("Abiam Remache Gonzalez");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        namePanel.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Alejandro de Lezcano Mújica Montesdeoca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        namePanel.add(jLabel7, gridBagConstraints);

        buttonsPanel.setBackground(new java.awt.Color(204, 255, 204));
        buttonsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selection Options"));
        buttonsPanel.setLayout(new java.awt.GridBagLayout());

        sigle_button.setBackground(new java.awt.Color(177, 252, 218));
        selectedGroup.add(sigle_button);
        sigle_button.setSelected(true);
        sigle_button.setText("Single Selection");
        sigle_button.setToolTipText("select one item");
        sigle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigle_buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        buttonsPanel.add(sigle_button, gridBagConstraints);

        single_interval_button.setBackground(new java.awt.Color(177, 252, 218));
        selectedGroup.add(single_interval_button);
        single_interval_button.setText("Single Interval");
        single_interval_button.setToolTipText("select multiple items");
        single_interval_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                single_interval_buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        buttonsPanel.add(single_interval_button, gridBagConstraints);

        multiple_interval_button.setBackground(new java.awt.Color(177, 252, 218));
        selectedGroup.add(multiple_interval_button);
        multiple_interval_button.setMnemonic('s');
        multiple_interval_button.setText("Multiple Interval");
        multiple_interval_button.setToolTipText("select multiple intervals of items");
        multiple_interval_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiple_interval_buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        buttonsPanel.add(multiple_interval_button, gridBagConstraints);

        deselectButton.setText("Deselect All");
        deselectButton.setToolTipText("deselect all items selected");
        deselectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselectButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        buttonsPanel.add(deselectButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(autenticationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autenticationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(FieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sigle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigle_buttonActionPerformed
        // TODO add your handling code here:
        resetFieldList();
        tableList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_sigle_buttonActionPerformed

    private void deselectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselectButtonActionPerformed
        // TODO add your handling code here:
        resetFieldList();
        tableList.clearSelection();
    }//GEN-LAST:event_deselectButtonActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        // TODO add your handling code here:
        resetTableList();
        resetFieldList();
        database.initialize(userField.getText(), String.valueOf(passwordField.getPassword()));
        if(database.connect()){
            setTableListItems(database.getTables());
        }else{
            JOptionPane.showMessageDialog(rootPane, "Credentials are not correct!", "Connection Refused", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_connectButtonActionPerformed

    private void single_interval_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_single_interval_buttonActionPerformed
        // TODO add your handling code here:
        resetFieldList();
        tableList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_single_interval_buttonActionPerformed

    private void multiple_interval_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiple_interval_buttonActionPerformed
        // TODO add your handling code here:
        resetFieldList();
        tableList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_multiple_interval_buttonActionPerformed

    private void tableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseClicked
        // TODO add your handling code here:
        resetFieldList();
        if(evt.getClickCount()==1){
            int[] indices = tableList.getSelectedIndices();
            System.out.println("Selected"+Arrays.toString(indices));
            for (int indice : indices) {
                String table = (String) tableListModel.get(indice);
                System.out.println("tabla "+table);
                ArrayList<String> fields = database.getFieldsTable(table);
                for (String field : fields) {
                    if(!fieldListModel.contains(field)){
                        fieldListModel.addElement(field);
                    }
                }
            }
            
        }
    }//GEN-LAST:event_tableListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FieldsPanel;
    private javax.swing.JPanel autenticationPanel;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton connectButton;
    private javax.swing.JButton deselectButton;
    private javax.swing.JList<String> fieldList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton multiple_interval_button;
    private javax.swing.JPanel namePanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.ButtonGroup selectedGroup;
    private javax.swing.JToggleButton sigle_button;
    private javax.swing.JToggleButton single_interval_button;
    private javax.swing.JList<String> tableList;
    private javax.swing.JPanel tablesPanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables

    private void setTableListItems(ArrayList<String> tables) {
        for (String table : tables) {
            tableListModel.addElement(table);
        }
    }

    private void resetFieldList() {
        fieldListModel = new DefaultListModel();
        fieldList.setModel(fieldListModel);
    }

    private void resetTableList() {
        tableListModel = new DefaultListModel();
        tableList.setModel(tableListModel);
    }

}
