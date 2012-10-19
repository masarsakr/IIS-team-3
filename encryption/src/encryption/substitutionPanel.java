package encryption;


public class substitutionPanel extends javax.swing.JPanel {
    public substitutionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        plainTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cipherTextArea = new javax.swing.JTextArea();
        cpButton = new javax.swing.JRadioButton();
        pcButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        keyComboBox = new javax.swing.JComboBox();
        solveButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        plainTextArea.setColumns(20);
        plainTextArea.setRows(5);
        jScrollPane1.setViewportView(plainTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        add(jScrollPane1, gridBagConstraints);

        cipherTextArea.setColumns(20);
        cipherTextArea.setRows(5);
        cipherTextArea.setEnabled(false);
        jScrollPane2.setViewportView(cipherTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 15, 6, 15);
        add(jScrollPane2, gridBagConstraints);

        buttonGroup1.add(cpButton);
        cpButton.setText("C -> P");
        cpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        add(cpButton, gridBagConstraints);

        buttonGroup1.add(pcButton);
        pcButton.setSelected(true);
        pcButton.setText("P -> C");
        pcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(pcButton, gridBagConstraints);

        jLabel1.setText("Plaintext");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 6, 18);
        add(jLabel1, gridBagConstraints);

        jLabel2.setText("Ciphertext");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 18);
        add(jLabel2, gridBagConstraints);

        keyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(keyComboBox, gridBagConstraints);

        solveButton.setText("Solve");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 1, 0, 1);
        add(solveButton, gridBagConstraints);

        jLabel3.setText("Key:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        add(jLabel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        if(cpButton.isSelected()){
            decrypt();
        }else{
            encrypt();
        }
    }//GEN-LAST:event_solveButtonActionPerformed

    private void cpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpButtonActionPerformed
        plainTextArea.setText("");
        plainTextArea.setEnabled(false);
        cipherTextArea.setEnabled(true);
    }//GEN-LAST:event_cpButtonActionPerformed

    private void pcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcButtonActionPerformed
        plainTextArea.setEnabled(true);
        cipherTextArea.setText("");
        cipherTextArea.setEnabled(false);
    }//GEN-LAST:event_pcButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea cipherTextArea;
    private javax.swing.JRadioButton cpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox keyComboBox;
    private javax.swing.JRadioButton pcButton;
    private javax.swing.JTextArea plainTextArea;
    private javax.swing.JButton solveButton;
    // End of variables declaration//GEN-END:variables


    private void encrypt(){
        if(plainTextArea.getText().length()!= 0){
            //Text area isn't empty so we can perform the encryption
            int key = keyComboBox.getSelectedIndex();
            System.out.println(key);//debug line
            String plainText = plainTextArea.getText().toLowerCase();
            plainText = plainText.replaceAll("[^a-z]",""); //ptxt is english alphabet only
            String cipherText = "";
            for(int i=0; i<plainText.length(); ++i){
                char temp = (char)(plainText.charAt(i) + (key));
                if(temp > 'z'){
                    temp -= 26;
                }
                cipherText += temp;
            }
            cipherTextArea.setText(cipherText);
        }
    }
    
    private void decrypt(){
        if(cipherTextArea.getText().length()!= 0){
            //Text area isn't empty so we can perform the encryption
            int key = keyComboBox.getSelectedIndex();
            String cipherText = cipherTextArea.getText().toLowerCase();
            cipherText = cipherText.replaceAll("[^a-z]",""); //ctxt is english alphabet only
            String plainText = "";
            for(int i=0; i<cipherText.length(); ++i){
                char temp = (char)(cipherText.charAt(i) - key);
                if(temp < 'a'){
                    temp += 26;
                }
                plainText += temp;
            }
            plainTextArea.setText(plainText);
        }        
    }
}
