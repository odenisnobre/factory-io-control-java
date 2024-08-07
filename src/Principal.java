
/*
    Denis Nobre - Noobres Sistemas
    Agosto/2024
    Controlando Factory IO com Java via Modbus
*/

// importa bibliotecas principais para controle
import de.re.easymodbus.modbusclient.*;
import java.awt.Color;


public class Principal extends javax.swing.JFrame {

    //cria objetos globais
    ModbusClient mbclient;
    Thread monitoraCom;
    private boolean runMonitora;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        txt_ip = new javax.swing.JTextField();
        txt_porta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_entrada_desliga = new javax.swing.JButton();
        btn_desconectar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_reseetfio = new javax.swing.JButton();
        btn_conectar = new javax.swing.JButton();
        btn_entrada_liga = new javax.swing.JButton();
        btn_saida_desliga = new javax.swing.JButton();
        btn_saida_liga = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Factory IO");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("IP:");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Controle Conexão");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Porta:");

        txt_ip.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txt_ip.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_ip.setText("192.168.1.48");

        txt_porta.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txt_porta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_porta.setText("502");
        txt_porta.setToolTipText("");
        txt_porta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_entrada_desliga.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_entrada_desliga.setText("Desliga");
        btn_entrada_desliga.setBorderPainted(false);
        btn_entrada_desliga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_entrada_desliga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrada_desligaActionPerformed(evt);
            }
        });

        btn_desconectar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_desconectar.setText("Desconectar");
        btn_desconectar.setBorderPainted(false);
        btn_desconectar.setEnabled(false);
        btn_desconectar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desconectarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Status");
        jLabel4.setToolTipText("");

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jSeparator2.setBackground(new java.awt.Color(204, 204, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 204, 102));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Controle Estação de Transporte");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Correia de Entrada");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Correia de Saída");

        btn_reseetfio.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btn_reseetfio.setText("Reset Factory IO");
        btn_reseetfio.setEnabled(false);
        btn_reseetfio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reseetfioActionPerformed(evt);
            }
        });

        btn_conectar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_conectar.setText("Inicia Conexão");
        btn_conectar.setBorderPainted(false);
        btn_conectar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conectarActionPerformed(evt);
            }
        });

        btn_entrada_liga.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_entrada_liga.setText("Liga");
        btn_entrada_liga.setBorderPainted(false);
        btn_entrada_liga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_entrada_liga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrada_ligaActionPerformed(evt);
            }
        });

        btn_saida_desliga.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_saida_desliga.setText("Desliga");
        btn_saida_desliga.setBorderPainted(false);
        btn_saida_desliga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_saida_desliga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saida_desligaActionPerformed(evt);
            }
        });

        btn_saida_liga.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_saida_liga.setText("Liga");
        btn_saida_liga.setToolTipText("");
        btn_saida_liga.setBorderPainted(false);
        btn_saida_liga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_saida_liga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saida_ligaActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(204, 204, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 204, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setBackground(new java.awt.Color(204, 204, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ip)
                            .addComponent(txt_porta)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_conectar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_desconectar)
                                .addGap(8, 8, 8)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_reseetfio)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_entrada_liga))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_saida_liga))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_saida_desliga)
                                    .addComponent(btn_entrada_desliga))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_porta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_conectar)
                            .addComponent(btn_desconectar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(btn_entrada_desliga)
                                    .addComponent(btn_entrada_liga))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_saida_desliga)
                                        .addComponent(btn_saida_liga)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_reseetfio)
                                .addGap(39, 39, 39)))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrada_desligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrada_desligaActionPerformed
        
        // desliga correia de entrada
        if(mbclient.isConnected()){
            try {
                mbclient.WriteSingleCoil(301, false);
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_btn_entrada_desligaActionPerformed

    private void btn_desconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desconectarActionPerformed
        
        // desconecta conexao com o factory IO
        try {
            mbclient.Disconnect();
        } catch (Exception e) {
        }
        if (this.monitoraCom != null && this.monitoraCom.isAlive()) {
            // seta variavel de controle para false
            runMonitora = false;
            // finaliza a thread de monitoramento
            this.monitoraCom.interrupt();
        }
        
    }//GEN-LAST:event_btn_desconectarActionPerformed

    private void btn_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conectarActionPerformed
        
        // inicia monitoramento da conexao com o factoryio
        try {
            this.monitoraCom = new Thread(this::monitoraConexaoMB);
            // seta variavel de controle para true
            runMonitora = true;
            // inicial thread de monitoramento
            this.monitoraCom.start();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btn_conectarActionPerformed

    private void btn_entrada_ligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrada_ligaActionPerformed
        
        // liga correia de entrada
        if(mbclient.isConnected()){
            try {
                mbclient.WriteSingleCoil(301, true);
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_btn_entrada_ligaActionPerformed

    private void btn_saida_desligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saida_desligaActionPerformed
       
        // desliga correia de saida
        if(mbclient.isConnected()){
            try {
                mbclient.WriteSingleCoil(300, false);
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_btn_saida_desligaActionPerformed

    private void btn_saida_ligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saida_ligaActionPerformed
        
        // liga correia de saida
        if(mbclient.isConnected()){
            try {
                mbclient.WriteSingleCoil(300, true);
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_btn_saida_ligaActionPerformed

    private void btn_reseetfioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reseetfioActionPerformed
        
        // reseta factoryio
        if(mbclient.isConnected()){
            try {
                mbclient.WriteSingleCoil(302, true);
                Thread.sleep(500);
                mbclient.WriteSingleCoil(302, false);
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_btn_reseetfioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_conectar;
    private javax.swing.JButton btn_desconectar;
    private javax.swing.JButton btn_entrada_desliga;
    private javax.swing.JButton btn_entrada_liga;
    private javax.swing.JButton btn_reseetfio;
    private javax.swing.JButton btn_saida_desliga;
    private javax.swing.JButton btn_saida_liga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JTextField txt_porta;
    // End of variables declaration//GEN-END:variables

    
    // Rotina para ficar monitorando a conexão da aplicação
    // com o Factory IO
    private void monitoraConexaoMB(){
        String ip = txt_ip.getText();
        int porta = Integer.parseInt(txt_porta.getText());
        while(runMonitora){
            try {
                // faz monitoramento a cada 5 segundos
                Thread.sleep(5000);
                mbclient =  new ModbusClient(ip, porta);
                mbclient.Connect();
                System.out.println("Monitorando Conexao....");
                if(mbclient.isConnected()){
                    // habilita objetos quando conectado
                    btn_desconectar.setEnabled(true);
                    panel1.setBackground(Color.green);
                    btn_entrada_liga.setEnabled(true);
                    btn_entrada_desliga.setEnabled(true);
                    btn_saida_liga.setEnabled(true);
                    btn_saida_desliga.setEnabled(true);
                    btn_reseetfio.setEnabled(true);
                } else {
                    // habilita objetos quando nao conectado
                    btn_desconectar.setEnabled(false);
                    panel1.setBackground(Color.red);
                    btn_entrada_liga.setEnabled(false);
                    btn_entrada_desliga.setEnabled(false);
                    btn_saida_liga.setEnabled(false);
                    btn_saida_desliga.setEnabled(false);
                    btn_reseetfio.setEnabled(false);
                }
            } catch (Exception e) {
                // habilita objetos quando falhga na conexao
                btn_desconectar.setEnabled(false);
                panel1.setBackground(Color.red);
                btn_entrada_liga.setEnabled(false);
                btn_entrada_desliga.setEnabled(false);
                btn_saida_liga.setEnabled(false);
                btn_saida_desliga.setEnabled(false);
                btn_reseetfio.setEnabled(false);
            }
        }

    }


}
