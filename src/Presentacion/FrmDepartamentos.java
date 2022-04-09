/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Aplicacion.FDepartamento;
import Datos.Departamento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP RYZEN 5
 */
public class FrmDepartamentos extends javax.swing.JInternalFrame {

    FDepartamento objDpto = new FDepartamento();

    /**
     * Creates new form Departamentos
     */
    public FrmDepartamentos() {
        initComponents();
        generarTabla("");
        inhabilitarComponentes();
    }

    public final void generarTabla(String nombre) {
        DefaultTableModel modelo = objDpto.mostrar(nombre);
        ImagenTitulo.setText(String.valueOf(objDpto.totalRegistros) + " departamentos en total");
        tblDepartamentos.setModel(modelo);
        tblDepartamentos.getColumnModel().getColumn(0).setMaxWidth(60);
        tblDepartamentos.setRowHeight(35);
        ocultarCampos();
    }

    public void ocultarCampos() {
        //Oculta el campo "Imagen"
        tblDepartamentos.getColumnModel().getColumn(3).setMaxWidth(0);
        tblDepartamentos.getColumnModel().getColumn(3).setMinWidth(0);
        tblDepartamentos.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tblDepartamentos.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
    }

    public void limpiaCampos() {
        txtNombreDepartamento.setText("");
        txtId.setText("");
        txtSuperficie.setText("");
        txtURLImagen.setText("");
    }

    public final void inhabilitarComponentes() {
        btnBorrar.setEnabled(false);
        btnEditar.setEnabled(false);
        txtId.setEnabled(false);
        txtNombreDepartamento.setEnabled(false);
        txtSuperficie.setEnabled(false);
        txtURLImagen.setEnabled(false);
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
        tblDepartamentos = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblImagenDpto = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        ImagenTitulo = new javax.swing.JLabel();
        lblRegistros1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSuperficie = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreDepartamento = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtURLImagen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepartamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDepartamentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 360, 410));

        btnBorrar.setBackground(new java.awt.Color(153, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar Departamento");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 250, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Buscar departamento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 360, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblImagenDpto.setBackground(new java.awt.Color(102, 102, 102));
        lblImagenDpto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/Bolivia.png"))); // NOI18N
        lblImagenDpto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        lblImagenDpto.setMaximumSize(new java.awt.Dimension(256, 256));
        lblImagenDpto.setPreferredSize(new java.awt.Dimension(256, 256));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagenDpto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagenDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 250, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 250, 40));

        ImagenTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ImagenTitulo.setText("Total Registros");
        jPanel1.add(ImagenTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        lblRegistros1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegistros1.setText("Imagen");
        jPanel1.add(lblRegistros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, -1, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 153));
        jLabel11.setText("Datos del departamento");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Id Depto:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 67, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nombre Departamento:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        txtSuperficie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtSuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 290, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Superficie:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtNombreDepartamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDepartamentoActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombreDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 290, 30));

        btnEditar.setBackground(new java.awt.Color(51, 153, 0));
        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Seleccionado");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 290, 40));

        btnInsertar.setBackground(new java.awt.Color(102, 102, 102));
        btnInsertar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("Insertar Imagen");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel3.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Imagen:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        txtURLImagen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtURLImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 290, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, 470));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Departamentos");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(!txtId.getText().isEmpty()){
            int conf = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar este registro?");
            if (conf == 0) {
                Departamento dts = new Departamento();
                dts.setIdDepartamento(Integer.parseInt(txtId.getText()));
                if (objDpto.eliminarDepartamento(dts)) {
                    JOptionPane.showMessageDialog(rootPane, "Se ha eliminado el Departamento");
                    btnBorrar.setEnabled(false);
                    limpiaCampos();
                    //Resetea algunos parametros
                    btnEditar.setEnabled(false);
                    generarTabla("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar", "Error", ERROR);
                }
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if ("Guardar Cambios".equals(btnEditar.getText())) {
            Departamento dts = new Departamento();

            dts.setNombre(txtNombreDepartamento.getText());
            dts.setSuperficie(Float.parseFloat(txtSuperficie.getText()));
            dts.setImagen(txtURLImagen.getText());
            dts.setIdDepartamento(Integer.parseInt(txtId.getText()));
            if (objDpto.editarDepartamento(dts)) {
                JOptionPane.showMessageDialog(null, "Se ha editado el registro exitosamente");
                btnEditar.setText("Editar Seleccionado");
                limpiaCampos();
                generarTabla("");
            } else {
                JOptionPane.showMessageDialog(null, "Ups, no se ha podido editar");
            }
        } else {
            //Habilita componentes
            txtNombreDepartamento.requestFocus();
            txtNombreDepartamento.setEnabled(true);
            txtSuperficie.setEnabled(true);
            //Deshabilita componentes
            btnActualizar.setEnabled(false);
            btnBorrar.setEnabled(false);
            //Edita el texto del boton Editar
            btnEditar.setText("Guardar Cambios");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        inhabilitarComponentes();
        generarTabla("");
        limpiaCampos();
        lblImagenDpto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/Bolivia.png")));
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        String cadenaBusqueda = jTextField4.getText();
        generarTabla(cadenaBusqueda);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void tblDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartamentosMouseClicked
        btnBorrar.setEnabled(true);
        btnEditar.setEnabled(true);
        int filaSeleccionada = tblDepartamentos.rowAtPoint(evt.getPoint());
        txtId.setText((String) tblDepartamentos.getValueAt(filaSeleccionada, 0));
        txtNombreDepartamento.setText((String) tblDepartamentos.getValueAt(filaSeleccionada, 1));
        txtSuperficie.setText((String) tblDepartamentos.getValueAt(filaSeleccionada, 2));
        txtURLImagen.setText((String) tblDepartamentos.getValueAt(filaSeleccionada, 3));
        if (txtURLImagen.getText() != null) {
            lblImagenDpto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/" + txtURLImagen.getText())));
        } else {
            lblImagenDpto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/imageNull.png")));
        }

    }//GEN-LAST:event_tblDepartamentosMouseClicked

    private void txtNombreDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDepartamentoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenTitulo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblImagenDpto;
    private javax.swing.JLabel lblRegistros1;
    private javax.swing.JTable tblDepartamentos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreDepartamento;
    private javax.swing.JTextField txtSuperficie;
    private javax.swing.JTextField txtURLImagen;
    // End of variables declaration//GEN-END:variables
}
