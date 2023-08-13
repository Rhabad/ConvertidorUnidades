/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author NICOLAS
 */
public class ConvertidorUnidades extends javax.swing.JFrame {

    /**
     * Creates new form ConvertidorUnidades
     */
    //para el combobox de longitud
    private String[] opcionesLongitudCombo1 = {"Kilometro", "Metro", "Centimetro"};

    //para el de masa
    private String[] opcionesMasaCombo1 = {"Tonelada", "Kilogramo", "Gramo"};

    //para velocidad
    private String[] opcionesVelocidadCombo1 = {"Milla Por Hora", "Pie Por Segundo", "Metro Por Segundo", "Kilometro Por Hora"};

    public ConvertidorUnidades() {
        initComponents();
        this.setTitle("Convertidor De Unidades");

        //Inhabilitado al iniciar
        combo1.setEnabled(false);
        combo2.setEnabled(false);
        txtUnidad1.setEnabled(false);
        txtUnidad2.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        comboUnidades = new javax.swing.JComboBox<>();
        txtUnidad2 = new javax.swing.JTextField();
        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        txtUnidad1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Longitud", "Masa", "Velocidad" }));
        comboUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUnidadesActionPerformed(evt);
            }
        });

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija Unidad" }));

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija Unidad" }));

        jLabel1.setText("Tipo De Unidad");

        jLabel2.setText("A:");

        jLabel3.setText("Es:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo1, 0, 119, Short.MAX_VALUE)
                            .addComponent(txtUnidad1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUnidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUnidadesActionPerformed
        String opcion = (String) comboUnidades.getSelectedItem();
        //remover los item del combobox a rellenar con nuevos item
        combo1.removeAllItems();
        combo2.removeAllItems();

        if (opcion.equals("Longitud")) {
            for (String cambioLongitud : opcionesLongitudCombo1) {
                combo1.addItem(cambioLongitud);
                combo2.addItem(cambioLongitud);

                combo1.setEnabled(true);
                combo2.setEnabled(true);
                txtUnidad1.setEnabled(true);
                txtUnidad2.setEnabled(true);
            }
        }
        if (opcion.equals("Masa")) {
            for (String cambioMasa : opcionesMasaCombo1) {
                combo1.addItem(cambioMasa);
                combo2.addItem(cambioMasa);

                combo1.setEnabled(true);
                combo2.setEnabled(true);
                txtUnidad1.setEnabled(true);
                txtUnidad2.setEnabled(true);
            }
        }
        if (opcion.equals("Velocidad")) {
            for (String cambioVelocidad : opcionesVelocidadCombo1) {
                combo1.addItem(cambioVelocidad);
                combo2.addItem(cambioVelocidad);

                combo1.setEnabled(true);
                combo2.setEnabled(true);
                txtUnidad1.setEnabled(true);
                txtUnidad2.setEnabled(true);
            }
        }

        if (opcion.equals("...")) {
            combo1.addItem("Elija Unidad");
            combo2.addItem("Elija Unidad");

            combo1.setEnabled(false);
            combo2.setEnabled(false);
            txtUnidad1.setEnabled(false);
            txtUnidad2.setEnabled(false);
        }
    }//GEN-LAST:event_comboUnidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> comboUnidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtUnidad1;
    private javax.swing.JTextField txtUnidad2;
    // End of variables declaration//GEN-END:variables
}
