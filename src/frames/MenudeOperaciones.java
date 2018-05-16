package frames;

import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import libreria.*;

public class MenudeOperaciones extends javax.swing.JFrame {

    OperacionDb operacion=new OperacionDb();
    DecimalFormat formato=new DecimalFormat("###,###.##");
    public MenudeOperaciones() {
        initComponents();
        cerrarPanels();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        
    }
    private void cerrarPanels(){
    
        panellibro.setVisible(false);
        panelautores.setVisible(false);
        paneldetalles.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panellibro = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        btnmtodo = new javax.swing.JButton();
        lblopcion = new javax.swing.JLabel();
        panelautores = new javax.swing.JPanel();
        lbltitulo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcodigoau = new javax.swing.JTextField();
        btnbuscaraut = new javax.swing.JButton();
        btnagregaraut = new javax.swing.JButton();
        btncerraraut = new javax.swing.JButton();
        btnmtodoaut = new javax.swing.JButton();
        lblopcion1 = new javax.swing.JLabel();
        paneldetalles = new javax.swing.JPanel();
        lbltitulo2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigodet = new javax.swing.JTextField();
        btnbuscardet = new javax.swing.JButton();
        btnagregardet = new javax.swing.JButton();
        btncerrardet = new javax.swing.JButton();
        btnmtododet = new javax.swing.JButton();
        lblopcion2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        libros = new javax.swing.JMenu();
        menulibro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuautor = new javax.swing.JMenuItem();
        menueditorial = new javax.swing.JMenuItem();
        menucategoria = new javax.swing.JMenuItem();
        menuidioma = new javax.swing.JMenuItem();
        menuestado = new javax.swing.JMenuItem();
        menudist = new javax.swing.JMenu();
        distribuidores = new javax.swing.JMenuItem();
        facturas = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        compra = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panellibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panellibroFocusLost(evt);
            }
        });

        lbltitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltitulo.setText("Operaciones:");

        jLabel2.setText("Código");

        txtcodigo.setText(" ");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btnmtodo.setText("Mostrar todo");
        btnmtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtodoActionPerformed(evt);
            }
        });

        lblopcion.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout panellibroLayout = new javax.swing.GroupLayout(panellibro);
        panellibro.setLayout(panellibroLayout);
        panellibroLayout.setHorizontalGroup(
            panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellibroLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panellibroLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panellibroLayout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnmtodo)
                                .addGap(18, 18, 18)
                                .addComponent(btncerrar))
                            .addGroup(panellibroLayout.createSequentialGroup()
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panellibroLayout.createSequentialGroup()
                        .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panellibroLayout.setVerticalGroup(
            panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellibroLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblopcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscar))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panellibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnmtodo)
                    .addComponent(btncerrar))
                .addGap(94, 94, 94))
        );

        lbltitulo1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltitulo1.setText("Operaciones:");

        jLabel3.setText("Código");

        txtcodigoau.setText(" ");
        txtcodigoau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoauActionPerformed(evt);
            }
        });

        btnbuscaraut.setText("Buscar");
        btnbuscaraut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarautActionPerformed(evt);
            }
        });

        btnagregaraut.setText("Agregar");
        btnagregaraut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarautActionPerformed(evt);
            }
        });

        btncerraraut.setText("Cerrar");
        btncerraraut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarautActionPerformed(evt);
            }
        });

        btnmtodoaut.setText("Mostrar todo");
        btnmtodoaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtodoautActionPerformed(evt);
            }
        });

        lblopcion1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout panelautoresLayout = new javax.swing.GroupLayout(panelautores);
        panelautores.setLayout(panelautoresLayout);
        panelautoresLayout.setHorizontalGroup(
            panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelautoresLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelautoresLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelautoresLayout.createSequentialGroup()
                                .addComponent(btnagregaraut)
                                .addGap(18, 18, 18)
                                .addComponent(btnmtodoaut)
                                .addGap(18, 18, 18)
                                .addComponent(btncerraraut))
                            .addGroup(panelautoresLayout.createSequentialGroup()
                                .addComponent(txtcodigoau, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscaraut))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelautoresLayout.createSequentialGroup()
                        .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblopcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelautoresLayout.setVerticalGroup(
            panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelautoresLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblopcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodigoau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscaraut))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panelautoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregaraut)
                    .addComponent(btnmtodoaut)
                    .addComponent(btncerraraut))
                .addGap(94, 94, 94))
        );

        lbltitulo2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbltitulo2.setText("Operaciones:");

        jLabel4.setText("Código");

        txtcodigodet.setText(" ");
        txtcodigodet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigodetActionPerformed(evt);
            }
        });

        btnbuscardet.setText("Buscar");
        btnbuscardet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscardetActionPerformed(evt);
            }
        });

        btnagregardet.setText("Agregar");
        btnagregardet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregardetActionPerformed(evt);
            }
        });

        btncerrardet.setText("Cerrar");
        btncerrardet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrardetActionPerformed(evt);
            }
        });

        btnmtododet.setText("Mostrar todo");
        btnmtododet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmtododetActionPerformed(evt);
            }
        });

        lblopcion2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout paneldetallesLayout = new javax.swing.GroupLayout(paneldetalles);
        paneldetalles.setLayout(paneldetallesLayout);
        paneldetallesLayout.setHorizontalGroup(
            paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetallesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneldetallesLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneldetallesLayout.createSequentialGroup()
                                .addComponent(btnagregardet)
                                .addGap(18, 18, 18)
                                .addComponent(btnmtododet)
                                .addGap(18, 18, 18)
                                .addComponent(btncerrardet))
                            .addGroup(paneldetallesLayout.createSequentialGroup()
                                .addComponent(txtcodigodet, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscardet))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paneldetallesLayout.createSequentialGroup()
                        .addComponent(lbltitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblopcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        paneldetallesLayout.setVerticalGroup(
            paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldetallesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblopcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcodigodet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscardet))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(paneldetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregardet)
                    .addComponent(btnmtododet)
                    .addComponent(btncerrardet))
                .addGap(94, 94, 94))
        );

        jMenuBar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMenuBar1FocusGained(evt);
            }
        });

        libros.setText("Libros");
        libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosActionPerformed(evt);
            }
        });

        menulibro.setText("Libros");
        menulibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulibroActionPerformed(evt);
            }
        });
        libros.add(menulibro);

        jMenu6.setText("Detalles");

        menuautor.setText("Autor");
        menuautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuautorActionPerformed(evt);
            }
        });
        jMenu6.add(menuautor);

        menueditorial.setText("Editorial");
        menueditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menueditorialActionPerformed(evt);
            }
        });
        jMenu6.add(menueditorial);

        menucategoria.setText("Categoría");
        menucategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucategoriaActionPerformed(evt);
            }
        });
        jMenu6.add(menucategoria);

        menuidioma.setText("Idioma");
        menuidioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuidiomaActionPerformed(evt);
            }
        });
        jMenu6.add(menuidioma);

        menuestado.setText("Estado");
        menuestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuestadoActionPerformed(evt);
            }
        });
        jMenu6.add(menuestado);

        libros.add(jMenu6);

        jMenuBar1.add(libros);

        menudist.setText("Distribuidores");
        menudist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudistActionPerformed(evt);
            }
        });

        distribuidores.setText("Distribuidores");
        distribuidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distribuidoresActionPerformed(evt);
            }
        });
        menudist.add(distribuidores);

        jMenuBar1.add(menudist);

        facturas.setText("Gestión Facturas");

        jMenuItem36.setText("Generar Facturas");
        facturas.add(jMenuItem36);

        jMenuItem37.setText("Buscar Folio");
        facturas.add(jMenuItem37);

        jMenuItem38.setText("Modificar Folio");
        facturas.add(jMenuItem38);

        jMenuItem39.setText("Borrar Folio");
        facturas.add(jMenuItem39);

        jMenuBar1.add(facturas);

        compra.setText("Gestión Compra");

        jMenu12.setText("Metodo de pago");

        jMenuItem40.setText("registrar");
        jMenu12.add(jMenuItem40);

        jMenuItem41.setText("modificar");
        jMenu12.add(jMenuItem41);

        jMenuItem42.setText("borrar");
        jMenu12.add(jMenuItem42);

        compra.add(jMenu12);

        jMenu13.setText("Transacción");

        jMenuItem43.setText("Comprar");
        jMenu13.add(jMenuItem43);

        jMenuItem44.setText("Buscar compra folio");
        jMenu13.add(jMenuItem44);

        jMenuItem45.setText("modificar compra folio");
        jMenu13.add(jMenuItem45);

        jMenuItem46.setText("anular/borrar compra");
        jMenu13.add(jMenuItem46);

        compra.add(jMenu13);

        jMenuBar1.add(compra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panellibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelautores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(paneldetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panellibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelautores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(paneldetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menulibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulibroActionPerformed
//        this.setEnabled(false);
//        Operaciones o=new Operaciones(this,"operaciones");
//        o.lbltitulo.setText("Operaciones Libros");
//        o.setVisible(true);
//        Libros.getText(); codigo para crear nuevo frame, inhabilitando el anterior.
        cerrarPanels();
        panellibro.setVisible(true);
        lblopcion.setText(menulibro.getText());
            
    }//GEN-LAST:event_menulibroActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        
        panellibro.setVisible(false);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void menuautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuautorActionPerformed
        cerrarPanels();
        panelautores.setVisible(true);
        lblopcion1.setText(menuautor.getText());
    }//GEN-LAST:event_menuautorActionPerformed

    private void panellibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panellibroFocusLost
    }//GEN-LAST:event_panellibroFocusLost
    private void jMenuBar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenuBar1FocusGained
    }//GEN-LAST:event_jMenuBar1FocusGained
    private void librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosActionPerformed
    }//GEN-LAST:event_librosActionPerformed

    private void menueditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menueditorialActionPerformed
        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menueditorial.getText());
    }//GEN-LAST:event_menueditorialActionPerformed

    private void menucategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucategoriaActionPerformed
        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menucategoria.getText());
    }//GEN-LAST:event_menucategoriaActionPerformed

    private void menuidiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuidiomaActionPerformed
        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menuidioma.getText());
    }//GEN-LAST:event_menuidiomaActionPerformed

    private void menuestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuestadoActionPerformed
        cerrarPanels();
        paneldetalles.setVisible(true);
        lblopcion2.setText(menuestado.getText());
    }//GEN-LAST:event_menuestadoActionPerformed

    private void menudistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudistActionPerformed
    }//GEN-LAST:event_menudistActionPerformed

    private void distribuidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distribuidoresActionPerformed
        panellibro.setVisible(true);
        lblopcion.setText(menudist.getText());
    }//GEN-LAST:event_distribuidoresActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        Libros libro=null;
        Operar op=new Operar();
        libro=operacion.buscarLibro(txtcodigo.getText());
        if(libro!=null){
            
            op.setTxtisbn(String.valueOf(libro.getCodisbn()));
            op.setTxttitulo(libro.getTitulo());
            op.setTxtnumpag(String.valueOf(libro.getNumpag()));
            op.setTxtprecio(formato.format(libro.getPrecio()));
            op.setTxtaño(libro.getAño());
            op.setTxtautor(libro.getAutor());
            op.setTxtidioma(libro.getIdioma());
            op.setTxtcategoria(libro.getCategoria());
            op.setTxteditorial(libro.getEditorial());
            op.dissIsbn(true);
            op.dissbtnagregar();
            op.setVisible(true);
        }else{
            System.out.println("Libro no existe");
        }
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtodoActionPerformed
       
        llenarTablalibros(operacion.mostrarTodo());
        operacion.setAlist();
    }//GEN-LAST:event_btnmtodoActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        Operar op=new Operar();
        op.setVisible(true);
        op.dissme();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnbuscarautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarautActionPerformed

        
        if(!txtcodigoau.getText().equals(" ")){
        Autores a=operacion.buscarAutor(txtcodigoau.getText());
        if(a!=null){
        OperarDetalles od=new OperarDetalles();
        od.dissTxt();
        od.setVisible(true);
        od.setLocationRelativeTo(null);
        od.dissagregar();
        od.setBuscar(String.valueOf(a.getCodaut()), a.getNombre(), a.getApp(), a.getApm());
        }else{
            System.out.println("No existe");
        }
        }else{
            System.out.println("txt nulo");
        }
    }//GEN-LAST:event_btnbuscarautActionPerformed

    private void btnagregarautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarautActionPerformed

        OperarDetalles od=new OperarDetalles();
        od.setVisible(true);
        od.setLocationRelativeTo(null);
        od.dissme();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarautActionPerformed

    private void btncerrarautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarautActionPerformed
        panelautores.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrarautActionPerformed

    private void btnmtodoautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtodoautActionPerformed

        llenarTablaaut(operacion.mostrarTodoaut());
        operacion.setAulist();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmtodoautActionPerformed

    private void txtcodigoauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoauActionPerformed

    private void txtcodigodetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigodetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigodetActionPerformed

    private void btnbuscardetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscardetActionPerformed
        
        switch(txtcodigodet.getText()){
        
            case "Idioma":  
            case "Editorial":
            case "Categoria":
            case "Estado":
        }
    }//GEN-LAST:event_btnbuscardetActionPerformed

    private void btnagregardetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregardetActionPerformed
        
        switch(txtcodigodet.getText()){
        
            case "Idioma":  
            case "Editorial":
            case "Categoria":
            case "Estado":
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_btnagregardetActionPerformed

    private void btncerrardetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrardetActionPerformed
       paneldetalles.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_btncerrardetActionPerformed

    private void btnmtododetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmtododetActionPerformed
       
        switch(lblopcion2.getText().toUpperCase()){
        
            case "IDIOMA":  llenarTabladet(operacion.mostrarTododet("IDIOMAS"));operacion.setDetlist();break;
            case "EDITORIAL":   llenarTabladet(operacion.mostrarTododet("EDITORIAL"));operacion.setDetlist();break;
            case "CATEGORÍA":   llenarTabladet(operacion.mostrarTododet("CATEGORIAS"));operacion.setDetlist();break;
            case "ESTADO":  llenarTabladet(operacion.mostrarTododet("ESTADO"));operacion.setDetlist();break;
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnmtododetActionPerformed
    
    private void llenarTabladet(ArrayList<Detalle> detlist){
    
        String title[]={"CODIGO","NOMBRE"};
        if(!detlist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTableDet(detlist, title);
            tblibros.setVisible(true);
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    private void llenarTablalibros(ArrayList<Libros> alist){
    
        String title[]={"ISBN","TITULO","PRECIO","AUTOR"};
        if(!alist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTablaL(alist,title);
            tblibros.setVisible(true);
            
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    
    private void llenarTablaaut(ArrayList<Autores> aulist){
    
        String title[]={"CODAUT","NOMBRE00","APE. P.","APE. M."};
        if(!aulist.isEmpty()){
            TablaL tblibros=new TablaL();
            tblibros.crearTablaAu(aulist, title);
            tblibros.setVisible(true);
        }else{JOptionPane.showMessageDialog(null, "No hay registros");}
    }
    public void childClosed(String windowName, WindowEvent e) { 
//        this.setVisible(true);
//        this.setEnabled(true); codigo para crear nuevo frame, inhabilitando el anterior.
    }
    
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
            java.util.logging.Logger.getLogger(MenudeOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenudeOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenudeOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenudeOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenudeOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnagregaraut;
    private javax.swing.JButton btnagregardet;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscaraut;
    private javax.swing.JButton btnbuscardet;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btncerraraut;
    private javax.swing.JButton btncerrardet;
    private javax.swing.JButton btnmtodo;
    private javax.swing.JButton btnmtodoaut;
    private javax.swing.JButton btnmtododet;
    private javax.swing.JMenu compra;
    private javax.swing.JMenuItem distribuidores;
    private javax.swing.JMenu facturas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JLabel lblopcion;
    private javax.swing.JLabel lblopcion1;
    private javax.swing.JLabel lblopcion2;
    public static javax.swing.JLabel lbltitulo;
    public static javax.swing.JLabel lbltitulo1;
    public static javax.swing.JLabel lbltitulo2;
    private javax.swing.JMenu libros;
    private javax.swing.JMenuItem menuautor;
    private javax.swing.JMenuItem menucategoria;
    private javax.swing.JMenu menudist;
    private javax.swing.JMenuItem menueditorial;
    private javax.swing.JMenuItem menuestado;
    private javax.swing.JMenuItem menuidioma;
    private javax.swing.JMenuItem menulibro;
    private javax.swing.JPanel panelautores;
    private javax.swing.JPanel paneldetalles;
    private javax.swing.JPanel panellibro;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigoau;
    private javax.swing.JTextField txtcodigodet;
    // End of variables declaration//GEN-END:variables
}
