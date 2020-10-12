
package ec.edu.uce.algoritmos.clases;

import static ec.edu.uce.algoritmos.clases.AdministrarElementos.adm;
import ec.edu.uce.algoritmos.pojos.Persona;
import static ec.edu.uce.algoritmos.pojos.Persona.PAIS;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * PROYECTO: Dada una clase Persona y sus atributos realizamos tanto el ingreso,editar,buscar e imprimir
 * los elementos que se almacena en un arreglo para proceder a buscar aplicando  busqueda binaria, 
 * interpolacion y fibonacci.
 * 
 * clase con interfaz que permite imprimir los elementos que se encuentran en el
 * vector
 * FECHA:12-DIC-2016
 * 
 * @author: 
 * 1725149502 David Morales
 * 1312960444 Michael Ponce Cevallos
 * 1721468021 Estefania Portilla
 * @version 1.0.0
 */
public class VerDatos extends javax.swing.JDialog {

    private DefaultTableModel tablaModel = null;
    DateFormat fen= new SimpleDateFormat("dd-MM-yyyy"); // declaracion de objeto simple format para la fecha en el formato dado
    /**
     * Constructor de la nueva forma VerDatos
     *
     * @param parent impplementa caracteristicas de un Frame
     * @param modal permite bloquear otras ventanas
     */
    public VerDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        setTitle("Visualizar Datos");
        setLocationRelativeTo(null);
        setResizable(false);
        this.setLocationRelativeTo(null);

        llenarTabla();
    }

    private void llenarTabla() {

        int i = 0;

        String col[] = {"Id", "Nombre", "Edad", "Fecha de nacimiento", "Sueldo", "Email", "Paìs"};
        String data[][] = {{"", "", ""}};
        tablaModel = new DefaultTableModel(data, col);
        tablaModel.setRowCount(0);
        tablaPersona.setModel(tablaModel);
        tablaPersona.setRowSorter(new TableRowSorter<>(tablaModel));

        for (Persona per : adm.pers) {
            tablaModel.insertRow(i++, new Object[]{per.getId(),
                per.getNombre(), per.getEdad(),
                fen.format(per.getFechaNacimiento()), per.getSueldo(),
                per.getEmail(), PAIS});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 310));
        setMinimumSize(new java.awt.Dimension(450, 310));
        setPreferredSize(new java.awt.Dimension(450, 310));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPersona = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        tablaPersona.setBackground(new java.awt.Color(102, 102, 102));
        tablaPersona.setForeground(new java.awt.Color(255, 255, 255));
        tablaPersona.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPersona.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tablaPersona);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 38, 391, 163));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 85, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/77506782d130c09bdd5bf91562a7f3d4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersona;
    // End of variables declaration//GEN-END:variables
}
