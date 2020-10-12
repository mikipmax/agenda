package ec.edu.uce.algoritmos.clases;

import static ec.edu.uce.algoritmos.clases.AdministrarElementos.adm;
import ec.edu.uce.algoritmos.pojos.Persona;
import static ec.edu.uce.algoritmos.pojos.Persona.PAIS;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Vector;

/**
 * PROYECTO: Dada una clase Persona y sus atributos realizamos tanto el
 * ingreso,editar,buscar e imprimir los elementos que se almacena en un arreglo
 * para proceder a buscar aplicando busqueda binaria, interpolacion y fibonacci.
 *
 * Clase con interfaz que permite agregar los campos definidos en la clase
 * Persona.
 *
 * FECHA:12-DIC-2016
 *
 * @author: 1725149502 David Morales 1312960444 Michael Ponce Cevallos
 * 1721468021 Estefania Portillla
 * @version 1.0.0
 */
public class InsertarElemento extends javax.swing.JDialog {

    Vector<Persona> lista = new Vector<Persona>(3, 1); // arreglo  de Personas

    Persona a; // variable de tipo persona

    /**
     * Constructor de la nueva forma InsertarElemento
     *
     * @param parent impplementa caracteristicas de un Frame
     * @param modal permite bloquear otras ventanas
     */
    public InsertarElemento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Inserción de Elementos");
        setLocationRelativeTo(null);
        setResizable(false);
        jTextField1.setText(String.valueOf(PAIS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nm1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ed1 = new javax.swing.JTextField();
        errorId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fn = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        sd = new javax.swing.JTextField();
        errorSueldo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        msjDatos = new javax.swing.JLabel();
        errorEdad = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(380, 530));
        setMinimumSize(new java.awt.Dimension(380, 530));
        setPreferredSize(new java.awt.Dimension(380, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id1.setBackground(new java.awt.Color(102, 102, 102));
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setCaretColor(new java.awt.Color(255, 0, 0));
        id1.setOpaque(false);
        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });
        id1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id1KeyTyped(evt);
            }
        });
        getContentPane().add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 39, 84, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 42, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 94, -1, -1));

        nm1.setBackground(new java.awt.Color(102, 102, 102));
        nm1.setForeground(new java.awt.Color(255, 255, 255));
        nm1.setCaretColor(new java.awt.Color(255, 0, 0));
        nm1.setOpaque(false);
        getContentPane().add(nm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 91, 84, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 148, -1, -1));

        ed1.setBackground(new java.awt.Color(102, 102, 102));
        ed1.setForeground(new java.awt.Color(255, 255, 255));
        ed1.setCaretColor(new java.awt.Color(255, 0, 0));
        ed1.setOpaque(false);
        ed1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ed1KeyTyped(evt);
            }
        });
        getContentPane().add(ed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 145, 84, -1));

        errorId.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(errorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 68, 126, 16));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 209, -1, -1));

        fn.setBackground(new java.awt.Color(51, 51, 51));
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 205, 80, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sueldo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 268, -1, -1));

        sd.setBackground(new java.awt.Color(102, 102, 102));
        sd.setForeground(new java.awt.Color(255, 255, 255));
        sd.setCaretColor(new java.awt.Color(255, 0, 0));
        sd.setOpaque(false);
        sd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sdKeyTyped(evt);
            }
        });
        getContentPane().add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 265, 85, -1));

        errorSueldo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(errorSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 292, 169, 19));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 321, -1, -1));

        em.setBackground(new java.awt.Color(102, 102, 102));
        em.setForeground(new java.awt.Color(255, 255, 255));
        em.setCaretColor(new java.awt.Color(255, 0, 0));
        em.setOpaque(false);
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 318, 85, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Paìs");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 383, 60, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setCaretColor(new java.awt.Color(255, 0, 0));
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 383, 85, -1));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 120, -1));

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b1.png"))); // NOI18N
        jButton3.setText("Ingresar Datos");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b3.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        msjDatos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(msjDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 423, 259, 18));

        errorEdad.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(errorEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 174, 136, 18));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 300, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/77506782d130c09bdd5bf91562a7f3d4.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed

    }//GEN-LAST:event_id1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (!id1.getText().equals("") && !nm1.getText().equals("")
                && !ed1.getText().equals("") && !sd.getText().equals("")
                && !em.getText().equals("") && fn.getDate() != null) {
            try {

                adm.nuevo((id1.getText()), nm1.getText(),
                        Byte.parseByte(ed1.getText()), fn.getDate(),
                        Double.parseDouble(sd.getText()), em.getText());
                id1.setText("");
                nm1.setText("");
                fn.setDate(null);
                ed1.setText("");
                sd.setText("");
                em.setText("");
                msjDatos.setText("Datos enviados");
            } catch (NumberFormatException e) {

                msjDatos.setText(e.getMessage());

            }
        } else {
            msjDatos.setText("Faltan datos");
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void id1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 48 && k <= 57) {
            if (id1.getText().length() == 10) {
                errorId.setText("Màximo 10 dìgitos ");
                evt.consume();
                getToolkit().beep();
            }
        } else {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            evt.consume();
            errorId.setText("Ingrese un nùmero vàlido ");
            getToolkit().beep();
        }
    }//GEN-LAST:event_id1KeyTyped

    private void sdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 46 && k <= 57) {
            if (sd.getText().length() == 15) {
                errorSueldo.setText("Màximo 15 dìgitos ");
                evt.consume();
                getToolkit().beep();
            }
            if (k == 46) {
                String dato = sd.getText();
                int tama = dato.length();
                for (int i = 0; i <= tama; i++) {
                    if (dato.contains(".")) {
                        evt.setKeyChar((char) KeyEvent.VK_CLEAR);
                    }
                }
            }
            if (k == 47) {
                getToolkit().beep();
                evt.consume();
                errorSueldo.setText("Ingrese un nùmero vàlido ");
            }
        } else {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            evt.consume();
            errorSueldo.setText("Ingrese un nùmero vàlido ");
            getToolkit().beep();
        }
    }//GEN-LAST:event_sdKeyTyped

    private void ed1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ed1KeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 48 && k <= 57) {
            if (ed1.getText().length() == 3) {
                errorEdad.setText("Màximo 3 dìgitos ");
                evt.consume();
                getToolkit().beep();
            }
        } else {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            evt.consume();
            errorEdad.setText("Ingrese un nùmero vàlido ");
            getToolkit().beep();
        }

    }//GEN-LAST:event_ed1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // declaracion de objeto simple format para la fecha en el formato dado
        fn.setFormats(new SimpleDateFormat("dd-MM-yyyy"));
    }//GEN-LAST:event_fnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ed1;
    private javax.swing.JTextField em;
    private javax.swing.JLabel errorEdad;
    private javax.swing.JLabel errorId;
    private javax.swing.JLabel errorSueldo;
    private org.jdesktop.swingx.JXDatePicker fn;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel msjDatos;
    private javax.swing.JTextField nm1;
    private javax.swing.JTextField sd;
    // End of variables declaration//GEN-END:variables
}
