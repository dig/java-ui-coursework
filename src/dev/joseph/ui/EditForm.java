/**
 * @author Joseph.
 */

package dev.joseph.ui;

import dev.joseph.Crust;
import dev.joseph.Pizza;
import dev.joseph.Sauce;
import dev.joseph.Size;
import dev.joseph.Topping;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class EditForm extends javax.swing.JFrame {
    
    private int id;
    private Pizza pizza;
    private OrderForm orderForm;
    private boolean initialized = false;

    public EditForm(int id, OrderForm orderForm) {
        initComponents();
        
        this.id = id;
        this.pizza = orderForm.getOrder().getAllPizzas().get(id);
        this.orderForm = orderForm;
        
        //--- Fill pizza size combo box values.
        String[] sizeArray = new String[Size.values().length];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = Size.values()[i].getName();
        }
        sizeComboBox.setModel(new DefaultComboBoxModel(sizeArray));
        sizeComboBox.setSelectedIndex(this.pizza.getSize().ordinal());
        
        //--- Fill pizza crust combo box values.
        String[] crustArray = new String[Crust.values().length];
        for (int i = 0; i < crustArray.length; i++) {
            crustArray[i] = Crust.values()[i].getName();
        }
        crustComboBox.setModel(new DefaultComboBoxModel(crustArray));
        crustComboBox.setSelectedIndex(this.pizza.getCrust().ordinal());
        
        //--- Fill pizza topping combo box values.
        String[] toppingArray = new String[Topping.values().length];
        for (int i = 0; i < toppingArray.length; i++) {
            toppingArray[i] = Topping.values()[i].getName();
        }
        toppingComboBox.setModel(new DefaultComboBoxModel(toppingArray));
        toppingComboBox2.setModel(new DefaultComboBoxModel(toppingArray));
        
        //--- Set topping combo boxes to correct index.
        ArrayList<Topping> toppings = this.pizza.getToppings();
        if (toppings.size() > 0) {
            toppingComboBox.setSelectedIndex(toppings.get(0).ordinal());
        }
        if (toppings.size() > 1) {
            toppingComboBox2.setSelectedIndex(toppings.get(1).ordinal());
        }
        
        //--- Fill pizza sauce combo box values.
        String[] sauceArray = new String[Sauce.values().length];
        for (int i = 0; i < sauceArray.length; i++) {
            sauceArray[i] = Sauce.values()[i].getName();
        }
        sauceComboBox.setModel(new DefaultComboBoxModel(sauceArray));
        sauceComboBox.setSelectedIndex(this.pizza.getSauce().ordinal());
        
        //--- Update output text area.
        this.updateOutput();
        
        //--- Finish form.
        this.initialized = true;
    }
    
    public void updateOutput() {
        this.outputArea.setText(this.pizza.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sizeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        crustComboBox = new javax.swing.JComboBox<>();
        toppingComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        toppingComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        sauceComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(262, 337));
        setResizable(false);

        jLabel1.setText("Size");

        sizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Crust");

        crustComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crustComboBoxActionPerformed(evt);
            }
        });

        toppingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toppingComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Topping 1");

        toppingComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toppingComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Topping 2");

        sauceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauceComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Sauce");

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sizeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crustComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toppingComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toppingComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sauceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(crustComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(toppingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(toppingComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sauceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //--- Update main order form.
        this.orderForm.getOrder().updatePizza(id, pizza);
        this.orderForm.updateOutput();
        
        //--- Destroy this form.
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //--- Destroy this form.
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeComboBoxActionPerformed
        //--- Update pizza class and output.
        this.pizza.setSize(Size.values()[this.sizeComboBox.getSelectedIndex()]);
        
        this.updateOutput();
    }//GEN-LAST:event_sizeComboBoxActionPerformed

    private void crustComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crustComboBoxActionPerformed
        //--- Update pizza class and output.
        this.pizza.setCrust(Crust.values()[this.crustComboBox.getSelectedIndex()]);
        
        this.updateOutput();
    }//GEN-LAST:event_crustComboBoxActionPerformed

    private void toppingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toppingComboBoxActionPerformed
        if (initialized) {
            //--- Clear old toppings and add new ones.
            this.pizza.getToppings().clear();
            this.pizza.addTopping(Topping.values()[this.toppingComboBox.getSelectedIndex()]);
            this.pizza.addTopping(Topping.values()[this.toppingComboBox2.getSelectedIndex()]);

            this.updateOutput();
        }
    }//GEN-LAST:event_toppingComboBoxActionPerformed

    private void toppingComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toppingComboBox2ActionPerformed
        if (initialized) {
            //--- Clear old toppings and add new ones.
            this.pizza.getToppings().clear();
            this.pizza.addTopping(Topping.values()[this.toppingComboBox.getSelectedIndex()]);
            this.pizza.addTopping(Topping.values()[this.toppingComboBox2.getSelectedIndex()]);

            this.updateOutput();
        }
    }//GEN-LAST:event_toppingComboBox2ActionPerformed

    private void sauceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauceComboBoxActionPerformed
        //--- Update pizza class and output.
        this.pizza.setSauce(Sauce.values()[this.sauceComboBox.getSelectedIndex()]);
        
        this.updateOutput();
    }//GEN-LAST:event_sauceComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> crustComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JComboBox<String> sauceComboBox;
    private javax.swing.JComboBox<String> sizeComboBox;
    private javax.swing.JComboBox<String> toppingComboBox;
    private javax.swing.JComboBox<String> toppingComboBox2;
    // End of variables declaration//GEN-END:variables
}
