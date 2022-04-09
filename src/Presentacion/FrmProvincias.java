package Presentacion;

import Aplicacion.FProvincia;
import Datos.Departamento;
import Datos.Provincia;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ronald Bautista
 */
public class FrmProvincias extends javax.swing.JInternalFrame {

    FProvincia objProv = new FProvincia();
    DefaultTableModel modeloTablaProvincia = new DefaultTableModel();
    DefaultComboBoxModel modelocboDepartamento = new DefaultComboBoxModel();

    /**
     * Creates new form Departamentos
     */
    public FrmProvincias() {
        initComponents();
        generarTabla("");
        inhabilitarComponentes();

    }

    public final void generarTabla(String nombre) {
        modeloTablaProvincia = objProv.mostrar(nombre);
        lblRegistros.setText(String.valueOf(objProv.totalRegistros) + " provincias en total");
        tblProvincias.setModel(modeloTablaProvincia);
        tblProvincias.setRowHeight(20);
        tblProvincias.getColumnModel().getColumn(0).setMaxWidth(60);
        ocultarComponentes();

    }

    public void ocultarComponentes() {
        //Oculta la columna idDepartamento de la tabla
        tblProvincias.getColumnModel().getColumn(2).setMaxWidth(0);
        tblProvincias.getColumnModel().getColumn(2).setMinWidth(0);
        tblProvincias.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tblProvincias.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        //Oculta el CboDepartamento
        cboDepartamento.setVisible(false);
        btnCambiarProv.setVisible(false);
    }

    public void limpiaCampos() {
        txtBuscar.setText("");
        txtId.setText("");
        txtNombreProvincia.setText("");
        txtDepartamento.setText("");
        txtIdDepto.setText("");
    }

    public final void inhabilitarComponentes() {
        //Botones
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCambiarProv.setEnabled(false);

        //Panel datos de la Provincia
        txtId.setEnabled(false);
        txtNombreProvincia.setEnabled(false);
        txtDepartamento.setEnabled(false);
        txtIdDepto.setEnabled(false);
        cboDepartamento.setEnabled(false);

    }

    public final void cargarDepartamentos() {
        modelocboDepartamento = objProv.cargarDepartamento();
        cboDepartamento.setModel(modelocboDepartamento);
        //modeloEmpleado.setSelectedItem(empleado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProvincias = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblRegistros = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboDepartamento = new javax.swing.JComboBox<>();
        txtNombreProvincia = new javax.swing.JTextField();
        txtIdDepto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCambiarProv = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProvincias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProvincias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProvinciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProvincias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 680, 370));

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Borrar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 280, 40));

        btnEditar.setBackground(new java.awt.Color(51, 153, 0));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Provincia");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 280, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Buscar provincias:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 270, 40));

        lblRegistros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegistros.setText("Total de registros");
        jPanel1.add(lblRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 210, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Datos de la provincia");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Id Prov:");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre Provincia:");

        txtDepartamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Departamento:");

        cboDepartamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDepartamentoItemStateChanged(evt);
            }
        });

        txtNombreProvincia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProvinciaActionPerformed(evt);
            }
        });

        txtIdDepto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Id Dpto");

        btnCambiarProv.setBackground(new java.awt.Color(51, 102, 255));
        btnCambiarProv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCambiarProv.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarProv.setText("Cambiar Departamento");
        btnCambiarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarProvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId))
                    .addComponent(cboDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(txtNombreProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtIdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCambiarProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(txtNombreProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCambiarProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 280, 320));

        btnNuevo.setBackground(new java.awt.Color(0, 51, 153));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Agregar Provincia");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 280, 40));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitulo.setText("Provincias");

        btnCerrar.setBackground(new java.awt.Color(153, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        jDialogNuevaProvincia NuevaProvincia = new jDialogNuevaProvincia(null, true);
        NuevaProvincia.setVisible(true);
        NuevaProvincia.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        NuevaProvincia.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtId.getText().isEmpty()) {
            int conf = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar este registro?");
            if (conf == 0) {
                Provincia dts = new Provincia();
                dts.setIdProvincia(Integer.parseInt(txtId.getText()));
                if (objProv.eliminarProvincia(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "Se ha eliminado el Provincia");
                    btnEliminar.setEnabled(false);
                    limpiaCampos();
                    //Resetea algunos parametros
                    btnEditar.setEnabled(false);
                    generarTabla("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar", "Error", ERROR);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if ("Guardar Cambios".equals(btnEditar.getText())) {
            Provincia dts = new Provincia();
            dts.setNombre(txtNombreProvincia.getText());
            dts.setIdDepartamento(Integer.parseInt(txtIdDepto.getText()));
            dts.setIdProvincia(Integer.parseInt(txtId.getText()));
            if (objProv.editarProvincia(dts)) {
                JOptionPane.showMessageDialog(null, "Se ha editado el registro exitosamente");
                btnEditar.setText("Editar Provincia");
                limpiaCampos();
                generarTabla("");
            } else {
                JOptionPane.showMessageDialog(null, "Ups, no se ha podido editar");
            }
        } else {
            //Habilita componentes
            txtNombreProvincia.setEnabled(true);
            txtNombreProvincia.requestFocus();
            btnCambiarProv.setEnabled(true);
            btnCambiarProv.setVisible(true);
            cargarDepartamentos();
            //Deshabilita componentes
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnNuevo.setEnabled(false);
            //Edita el texto del boton Editar
            btnEditar.setText("Guardar Cambios");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);
        generarTabla("");
        limpiaCampos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String cadenaBusqueda = txtBuscar.getText();
        generarTabla(cadenaBusqueda);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblProvinciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProvinciasMouseClicked
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        int filaSeleccionada = tblProvincias.rowAtPoint(evt.getPoint());
        txtId.setText((String) tblProvincias.getValueAt(filaSeleccionada, 0));
        txtNombreProvincia.setText((String) tblProvincias.getValueAt(filaSeleccionada, 1));
        txtIdDepto.setText((String) tblProvincias.getValueAt(filaSeleccionada, 2));
        txtDepartamento.setText((String) tblProvincias.getValueAt(filaSeleccionada, 3));
    }//GEN-LAST:event_tblProvinciasMouseClicked

    private void txtNombreProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProvinciaActionPerformed

    private void cboDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDepartamentoItemStateChanged
        Departamento objDepto = (Departamento) cboDepartamento.getSelectedItem();
        int idDepartamento = objDepto.getIdDepartamento();
        String nombreDpto = objDepto.getNombre();
        txtIdDepto.setText(String.valueOf(idDepartamento));
        txtDepartamento.setText(nombreDpto);
    }//GEN-LAST:event_cboDepartamentoItemStateChanged

    private void btnCambiarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarProvActionPerformed
        cboDepartamento.setVisible(true);
        cboDepartamento.setEnabled(true);
    }//GEN-LAST:event_btnCambiarProvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCambiarProv;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboDepartamento;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblProvincias;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdDepto;
    private javax.swing.JTextField txtNombreProvincia;
    // End of variables declaration//GEN-END:variables
}
