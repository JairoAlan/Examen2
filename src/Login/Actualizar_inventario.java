/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author jairo
 */
public class Actualizar_inventario extends javax.swing.JFrame {

    /**
     * Creates new form Actualizar_inventario
     */
    FondoPanel fondo = new FondoPanel();
    Menu ventana = new Menu();
    Login obj = new Login();

    public Actualizar_inventario() {
        this.setLocationRelativeTo(null);
        this.setContentPane(fondo);
        initComponents();
        llenarJtable();
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
        jLabel2 = new javax.swing.JLabel();
        txtId_Prod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad_Prod = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btmBusProd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblPresen = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCantEx = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduct = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Ingresa el id del producto para actualizar la cantidad en inventario");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Id Producto:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Cantidad para agregar al inventario:");

        btnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Nombre:");

        btmBusProd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btmBusProd.setText("Buscar Producto");
        btmBusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBusProdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Marca:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Presentacion:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Precio:");

        lblNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 204, 204));
        lblNombre.setText("\"\"");

        lblMarca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(204, 204, 204));
        lblMarca.setText("\"\"");

        lblPresen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPresen.setForeground(new java.awt.Color(204, 204, 204));
        lblPresen.setText("\"\"");

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(204, 204, 204));
        lblPrecio.setText("\"\"");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Cantidad en existencia:");

        lblCantEx.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCantEx.setForeground(new java.awt.Color(204, 204, 204));
        lblCantEx.setText("\"\"");

        jtProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProduct);

        btnRegresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtId_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(btmBusProd))
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPresen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCantEx, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnActualizar)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegresar))
                            .addGap(18, 18, 18)
                            .addComponent(txtCantidad_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtId_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btmBusProd)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblMarca))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblPresen))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblCantEx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addComponent(btnActualizar)
                        .addGap(34, 34, 34)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        HttpClient cliente = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                // Este método se llama cuando la solicitud HTTP se completa
                if (status.isSuccess()) {
                    JOptionPane.showMessageDialog(null, "Éxito, se guardó correctamente en la Base de datos.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar en la Base de datos. ");
                }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        String idProd = txtId_Prod.getText().toString();
        String cantidad = txtCantidad_Prod.getText().toString();

        cliente.excecute("http://localhost/examAPI/actualizar.php?Id_Prod=" + idProd + "&Cantidad=" + cantidad + "");

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btmBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBusProdActionPerformed
        // Busca el producto en la vase de datos y llena los labels
        HttpClient cliente = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {

                // Este método se llama cuando la solicitud HTTP se completa
                try {
                    JSONObject producto = new JSONObject(status.getResult());
                    String nombreBase = producto.getJSONObject("0").get("Nombre").toString();
                    String marcaBase = producto.getJSONObject("0").get("Marca").toString();
                    String presenBase = producto.getJSONObject("0").get("Presentacion").toString();
                    String precioBase = producto.getJSONObject("0").get("Precio").toString();
                    String cantidadBase = producto.getJSONObject("0").get("Cantidad").toString();

                    if (nombreBase != null && marcaBase != null && presenBase != null && precioBase != null) {
                        lblNombre.setText(nombreBase);
                        lblMarca.setText(marcaBase);
                        lblPresen.setText(presenBase);
                        lblPrecio.setText(precioBase);
                        lblCantEx.setText(cantidadBase);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay en existencia el producto en la base de datos. ");
                    }

                } catch (Exception e) {

                }
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        String id_prod = txtId_Prod.getText().toString();
        cliente.excecute("http://localhost/examAPI/buscar.php?Id_Prod=" + id_prod + "");
    }//GEN-LAST:event_btmBusProdActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Regresa al menu

        
        


    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Actualizar_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_inventario().setVisible(true);
            }
        });
    }

    public void llenarJtable() {
        try {
            // Crear instancia de cliente HTTP
            HttpClient cliente = new HttpClient(new OnHttpRequestComplete() {
                @Override
                public void onComplete(Response status) {
                    // Si el estado de la conexion tiene exito
                    if (status.isSuccess()) {
                        try {
                            // Se crea un objeto JSON llamado productos, y obtiene todos los resultados de la consulta
                            JSONObject productos = new JSONObject(status.getResult());
                            // Se crea un "modelo" de la tabla
                            DefaultTableModel modelo = new DefaultTableModel();
                            // Se le agregan los nombres que tendran las columnas
                            modelo.addColumn("Id Producto");
                            modelo.addColumn("Nombre");
                            modelo.addColumn("Marca");
                            modelo.addColumn("Presentacion");
                            modelo.addColumn("Precio");
                            modelo.addColumn("Cantidad");

                            // a la tabla que se le creo, se le agrega las "propiedades" de modelo
                            jtProduct.setModel(modelo);

                            // Este for no para hasta que tenga un error o no tenga nada la tabla
                            for (int i = 0;; i++) {
                                // Se crea un objeto "Arreglo", que recibira toda la informacion de la consulta y la asigna.
                                Object[] obj = new Object[6];
                                obj[0] = productos.getJSONObject("" + i + "").get("Id_Prod").toString();
                                obj[1] = productos.getJSONObject("" + i + "").get("Nombre").toString();
                                obj[2] = productos.getJSONObject("" + i + "").get("Marca").toString();
                                obj[3] = productos.getJSONObject("" + i + "").get("Presentacion").toString();
                                obj[4] = productos.getJSONObject("" + i + "").get("Precio").toString();
                                obj[5] = productos.getJSONObject("" + i + "").get("Cantidad").toString();
                                modelo.addRow(obj);
                            }

                        } catch (JSONException e) {

                        }

                    }
                }
            });

            // Y se ejecutan en la API
            cliente.excecute("http://localhost/examAPI/buscar_prod_id_all.php");
        } catch (Exception e) {

        }
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Iconos/azul.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmBusProd;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProduct;
    private javax.swing.JLabel lblCantEx;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPresen;
    private javax.swing.JTextField txtCantidad_Prod;
    private javax.swing.JTextField txtId_Prod;
    // End of variables declaration//GEN-END:variables
}
