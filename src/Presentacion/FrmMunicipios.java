package Presentacion;

import Aplicacion.FMunicipio;
import Datos.Departamento;
import Datos.Municipio;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronald Bautista
 */
public class FrmMunicipios extends javax.swing.JInternalFrame {

    FMunicipio objMunc = new FMunicipio();
    DefaultTableModel modeloTablaMunicipio = new DefaultTableModel();
    DefaultComboBoxModel modelocboProvincia = new DefaultComboBoxModel();

    /**
     * Creates new form Departamentos
     */
    public FrmMunicipios() {
        initComponents();
        generarTabla("");
        inhabilitarComponentes();
    }

    public final void generarTabla(String nombre) {
        modeloTablaMunicipio = objMunc.mostrar(nombre);
        lblRegistros.setText(String.valueOf(objMunc.totalRegistros) + " municipios en total");
        tblMunicipios.setModel(modeloTablaMunicipio);
        tblMunicipios.setRowHeight(20);
        tblMunicipios.getColumnModel().getColumn(0).setMaxWidth(60);
        tblMunicipios.getColumnModel().getColumn(5).setMaxWidth(60);
        tblMunicipios.getColumnModel().getColumn(2).setMaxWidth(120);
        ocultarComponentes();
    }

    public void ocultarComponentes() {
        //Oculta la columna idDepartamento de la tabla
        tblMunicipios.getColumnModel().getColumn(5).setMaxWidth(0);
        tblMunicipios.getColumnModel().getColumn(5).setMinWidth(0);
        tblMunicipios.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tblMunicipios.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        cboProvincia.setVisible(false);
    }

    public void limpiaCampos() {
        txtBuscar.setText("");
        txtId.setText("");
        txtNombreMunicipio.setText("");
        txtPoblacion.setText("");
        txtProvincia.setText("");
        txtIdProv.setText("");
    }

    public final void inhabilitarComponentes() {
        //Botones
        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);

        //Panel datos de la Provincia
        txtId.setEnabled(false);
        txtNombreMunicipio.setEnabled(false);
        txtProvincia.setEnabled(false);
        txtIdProv.setEnabled(false);
        txtPoblacion.setEnabled(false);
        cboProvincia.setEnabled(false);
    }

    public final void cargarProvincias() {
        modelocboProvincia = objMunc.cargarProvincia();
        cboProvincia.setModel(modelocboProvincia);
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
        tblMunicipios = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
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
        txtProvincia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboProvincia = new javax.swing.JComboBox<>();
        txtNombreMunicipio = new javax.swing.JTextField();
        txtIdProv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPoblacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMunicipios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMunicipios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMunicipiosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMunicipios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 370));

        btnNuevo.setBackground(new java.awt.Color(0, 51, 153));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo Municipio");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 280, 40));

        btnEditar.setBackground(new java.awt.Color(51, 153, 0));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Municipio");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 280, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Buscar municipio:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 320, 40));

        lblRegistros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegistros.setText("Total de registros");
        jPanel1.add(lblRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 170, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Datos del municipio");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Id Munc:");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre Municipio:");

        txtProvincia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Provincia:");

        cboProvincia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProvinciaItemStateChanged(evt);
            }
        });
        cboProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProvinciaActionPerformed(evt);
            }
        });

        txtNombreMunicipio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMunicipioActionPerformed(evt);
            }
        });

        txtIdProv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Id Prov:");

        txtPoblacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoblacionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Poblacion:");

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Borrar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                    .addComponent(cboProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdProv, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(142, 142, 142))
                                .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 280, 430));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitulo.setText("Municipios");

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        jDialogNuevoMunicipio NuevoMunicipio = new jDialogNuevoMunicipio(null, true);
        NuevoMunicipio.setVisible(true);
        NuevoMunicipio.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        NuevoMunicipio.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if ("Guardar Cambios".equals(btnEditar.getText())) {
            Municipio dts = new Municipio();

            dts.setNombre(txtNombreMunicipio.getText());
            dts.setPoblacion(Integer.parseInt(txtPoblacion.getText()));
            dts.setIdProvincia(Integer.parseInt(txtIdProv.getText()));
            dts.setIdMunicipio(Integer.parseInt(txtId.getText()));

            if (objMunc.editarMunicipio(dts)) {
                JOptionPane.showMessageDialog(null, "Se ha editado el registro exitosamente");
                btnEditar.setText("Editar Provincia");
                limpiaCampos();
                generarTabla("");
            } else {
                JOptionPane.showMessageDialog(null, "Ups, no se ha podido editar");
            }
        } else {
            //Habilita componentes
            txtNombreMunicipio.setEnabled(true);
            cboProvincia.setVisible(true);
            txtNombreMunicipio.requestFocus();
            cboProvincia.setEnabled(true);
            txtPoblacion.setEnabled(true);
            cargarProvincias();
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

    private void cboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProvinciaItemStateChanged
        Departamento objDepto = (Departamento) cboProvincia.getSelectedItem();
        int idDepartamento = objDepto.getIdDepartamento();
        String nombreDpto = objDepto.getNombre();
        txtIdProv.setText(String.valueOf(idDepartamento));
        txtProvincia.setText(nombreDpto);
    }//GEN-LAST:event_cboProvinciaItemStateChanged

    private void txtNombreMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMunicipioActionPerformed

    private void tblMunicipiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMunicipiosMouseClicked
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        int filaSeleccionada = tblMunicipios.rowAtPoint(evt.getPoint());
        txtId.setText((String) tblMunicipios.getValueAt(filaSeleccionada, 0));
        txtNombreMunicipio.setText((String) tblMunicipios.getValueAt(filaSeleccionada, 1));
        txtPoblacion.setText((String) tblMunicipios.getValueAt(filaSeleccionada, 2));
        txtIdProv.setText((String) tblMunicipios.getValueAt(filaSeleccionada, 3));
        txtProvincia.setText((String) tblMunicipios.getValueAt(filaSeleccionada, 4));
    }//GEN-LAST:event_tblMunicipiosMouseClicked

    private void cboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProvinciaActionPerformed

    private void txtPoblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoblacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoblacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboProvincia;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable tblMunicipios;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdProv;
    private javax.swing.JTextField txtNombreMunicipio;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtProvincia;
    // End of variables declaration//GEN-END:variables
}
