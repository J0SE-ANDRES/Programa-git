
package view;

import controller.ProductoController;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Torres
 */
public class MainView extends javax.swing.JFrame {

    private static final ProductoController producto_controller = new ProductoController();
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("PRODUCTOS SOFTWARE");
        this.setIconImage(new ImageIcon(getClass().getResource("/iconos/productos-icon.png")).getImage());
    }

    public void reiniciarFormulario() {
        txtNombre.setText("");
        cbxTipoProducto.setSelectedIndex(0);
        spnPrecio.setValue(0);
        spnCantidad.setValue(0);
        txtareaDescripcion.setText("");
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipoProducto = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cbxTipoProducto = new javax.swing.JComboBox<>();
        spnPrecio = new javax.swing.JSpinner();
        spnCantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaDescripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btnInsertarFila = new javax.swing.JButton();
        btnEliminarFila = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setText("PRODUCTOS SOFTWARE");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombre.setText("NOMBRE:");

        lblTipoProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTipoProducto.setText("T. DE PRODUCTO:");

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPrecio.setText("PRECIO:");

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCantidad.setText("CANTIDAD:");

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescripcion.setText("DESCRIPCIÓN:");

        cbxTipoProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione una opcion", "verduras", "lacteos", "carnes", "pasabocas" }));

        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100000, 5000));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        txtareaDescripcion.setColumns(20);
        txtareaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtareaDescripcion);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/productos-icon.png"))); // NOI18N

        btnInsertarFila.setText("INSERTAR FILA");
        btnInsertarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFilaActionPerformed(evt);
            }
        });
        btnInsertarFila.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInsertarFilaKeyPressed(evt);
            }
        });

        btnEliminarFila.setText("ELIMINAR FILA");
        btnEliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFilaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "TIPO DE PRODUCTO", "PRECIO", "CANTIDAD", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoProducto)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInsertarFila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarFila))
                    .addComponent(spnCantidad)
                    .addComponent(jScrollPane1)
                    .addComponent(cbxTipoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnPrecio))
                .addGap(172, 172, 172))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoProducto))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecio)
                            .addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCantidad)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFilaActionPerformed
        try {
            String nombre_producto = txtNombre.getText();
            String tipo_producto = String.valueOf(cbxTipoProducto.getSelectedItem());
            String precio_producto = String.valueOf(spnPrecio.getValue());
            String cantidad_producto = String.valueOf(spnCantidad.getValue());
            String descripcion_producto = txtareaDescripcion.getText();
            
            if (nombre_producto.isEmpty() || cbxTipoProducto.getSelectedIndex() == 0 || spnPrecio.getValue().equals(0) || 
                    spnCantidad.getValue().equals(0) || descripcion_producto.isEmpty()) {
                
                JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS SON OBLIGATORIOS", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                
            } else {
                
                producto_controller.registrarproducto(nombre_producto, tipo_producto, Integer.parseInt(precio_producto), 
                        Integer.parseInt(cantidad_producto), descripcion_producto);
                
                System.out.println(producto_controller.mostrarProducto());
                
                String[] datos = {nombre_producto, tipo_producto, precio_producto, cantidad_producto, descripcion_producto};
                
                DefaultTableModel tabla_defecto = (DefaultTableModel) tblDatos.getModel();
                
                tabla_defecto.addRow(datos);              
                reiniciarFormulario();                
                JOptionPane.showMessageDialog(this, "LOS DATOS SE INSERTARON CORRECTAMENTE");
            }
        } catch (HeadlessException | NumberFormatException e) {
            
            System.out.println(e.getMessage());          
        }
    }//GEN-LAST:event_btnInsertarFilaActionPerformed

    private void btnInsertarFilaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInsertarFilaKeyPressed
        // se ejecuta la accion de enviar  al precionar la tecla enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnInsertarFila.doClick();
        }
    }//GEN-LAST:event_btnInsertarFilaKeyPressed

    private void btnEliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFilaActionPerformed
        
        DefaultTableModel tabla_defecto = (DefaultTableModel) tblDatos.getModel();
        int fila = tblDatos.getSelectedRow();
        
        if (fila != -1) {
            
            tabla_defecto.removeRow(fila); // removemos la fila 
            tabla_defecto.fireTableDataChanged(); // redibujamos la tabla
            reiniciarFormulario();
            
        } else {           
            JOptionPane.showMessageDialog(this, "SELECCIONE UNA FILA", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);          
        }  
    }//GEN-LAST:event_btnEliminarFilaActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        try {
            int seleccion = tblDatos.rowAtPoint(evt.getPoint());
            
            txtNombre.setText(String.valueOf(tblDatos.getValueAt(seleccion, 0)));
            cbxTipoProducto.setSelectedItem(String.valueOf(tblDatos.getValueAt(seleccion, 1)));
            spnPrecio.setValue(Integer.valueOf(tblDatos.getValueAt(seleccion, 2).toString()));
            spnCantidad.setValue(Integer.valueOf(tblDatos.getValueAt(seleccion, 3).toString()));
            txtareaDescripcion.setText(String.valueOf(tblDatos.getValueAt(seleccion, 4).toString()));
            
        } catch (NumberFormatException e) {
            
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarFila;
    private javax.swing.JButton btnInsertarFila;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoProducto;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtareaDescripcion;
    // End of variables declaration//GEN-END:variables
}
