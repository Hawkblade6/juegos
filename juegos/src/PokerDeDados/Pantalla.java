/*aaa
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokerDeDados;

public class Pantalla extends javax.swing.JFrame {

    boolean segundaVez = false;
    String dadosSellecionados = "";
    String sonidoDados;
    String sonidoDados2;
    // new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado5.PNG"

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        this.sonidoDados = (getClass().getResource("/PokerDeDados/fotos/rolldice.wav")).toString().substring(6);

        this.sonidoDados2 = (getClass().getResource("/PokerDeDados/fotos/rolldice2.wav")).toString().substring(6);
        initComponents();
    }

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Pantalla pantalla = new Pantalla();
            Metodos.iniciarPantalla(pantalla, pantalla.bkgrnd, pantalla.Rojo,
                    pantalla.Rojo2, pantalla.Rojo3, pantalla.Rojo4, pantalla.Rojo5);

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TLPlayerSet1 = new javax.swing.JPanel();
        TLPlayerName1 = new javax.swing.JLabel();
        TLPlayerOrder1 = new javax.swing.JLabel();
        TLPlayerPlay1 = new javax.swing.JLabel();
        TLPlayerPoints1 = new javax.swing.JLabel();
        TRPlayerSet1 = new javax.swing.JPanel();
        TRPlayerName1 = new javax.swing.JLabel();
        TRPlayerOrder1 = new javax.swing.JLabel();
        TRPlayerPlay1 = new javax.swing.JLabel();
        TRPlayerPoints1 = new javax.swing.JLabel();
        Transparencia2 = new javax.swing.JLabel();
        Transparencia3 = new javax.swing.JLabel();
        Transparencia4 = new javax.swing.JLabel();
        Transparencia5 = new javax.swing.JLabel();
        Transparencia = new javax.swing.JLabel();
        Rojo = new javax.swing.JLabel();
        Rojo2 = new javax.swing.JLabel();
        Rojo3 = new javax.swing.JLabel();
        Rojo4 = new javax.swing.JLabel();
        Rojo5 = new javax.swing.JLabel();
        King = new javax.swing.JLabel();
        Queen = new javax.swing.JLabel();
        Jack = new javax.swing.JLabel();
        Ten = new javax.swing.JLabel();
        Ace = new javax.swing.JLabel();
        Queen2 = new javax.swing.JLabel();
        King2 = new javax.swing.JLabel();
        Jack2 = new javax.swing.JLabel();
        Ten2 = new javax.swing.JLabel();
        Ace2 = new javax.swing.JLabel();
        Jack3 = new javax.swing.JLabel();
        King3 = new javax.swing.JLabel();
        Queen3 = new javax.swing.JLabel();
        Ten3 = new javax.swing.JLabel();
        Ace3 = new javax.swing.JLabel();
        Nine4 = new javax.swing.JLabel();
        King4 = new javax.swing.JLabel();
        Queen4 = new javax.swing.JLabel();
        Jack4 = new javax.swing.JLabel();
        Ten4 = new javax.swing.JLabel();
        Ace4 = new javax.swing.JLabel();
        Ten5 = new javax.swing.JLabel();
        King5 = new javax.swing.JLabel();
        Queen5 = new javax.swing.JLabel();
        Jack5 = new javax.swing.JLabel();
        Ace5 = new javax.swing.JLabel();
        Nine = new javax.swing.JLabel();
        Nine2 = new javax.swing.JLabel();
        Nine3 = new javax.swing.JLabel();
        Nine5 = new javax.swing.JLabel();
        TLPlayerSet = new javax.swing.JPanel();
        TLPlayerName = new javax.swing.JLabel();
        TLPlayerOrder = new javax.swing.JLabel();
        TLPlayerPlay = new javax.swing.JLabel();
        TLPlayerPoints = new javax.swing.JLabel();
        TRPlayerSet = new javax.swing.JPanel();
        TRPlayerName = new javax.swing.JLabel();
        TRPlayerOrder = new javax.swing.JLabel();
        TRPlayerPlay = new javax.swing.JLabel();
        TRPlayerPoints = new javax.swing.JLabel();
        BRPlayerSet = new javax.swing.JPanel();
        BRPlayerName = new javax.swing.JLabel();
        BRPlayerOrder = new javax.swing.JLabel();
        BRPlayerPlay = new javax.swing.JLabel();
        BRPlayerPoints = new javax.swing.JLabel();
        BLPlayerSet = new javax.swing.JPanel();
        BLPlayerName = new javax.swing.JLabel();
        BLPlayerOrder = new javax.swing.JLabel();
        BLPlayerPoints = new javax.swing.JLabel();
        BLPlayerPlay = new javax.swing.JLabel();
        Tirar = new javax.swing.JButton();
        bkgrnd = new javax.swing.JLabel();

        TLPlayerName1.setText("Jugador 4");

        TLPlayerOrder1.setText("4º");

        TLPlayerPlay1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TLPlayerPlay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TLPlayerPlay1.setText("DP");
        TLPlayerPlay1.setMaximumSize(new java.awt.Dimension(20, 20));
        TLPlayerPlay1.setMinimumSize(new java.awt.Dimension(20, 20));
        TLPlayerPlay1.setPreferredSize(new java.awt.Dimension(20, 20));

        TLPlayerPoints1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TLPlayerPoints1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TLPlayerPoints1.setText("10");

        javax.swing.GroupLayout TLPlayerSet1Layout = new javax.swing.GroupLayout(TLPlayerSet1);
        TLPlayerSet1.setLayout(TLPlayerSet1Layout);
        TLPlayerSet1Layout.setHorizontalGroup(
            TLPlayerSet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TLPlayerSet1Layout.createSequentialGroup()
                .addGroup(TLPlayerSet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TLPlayerSet1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TLPlayerPlay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TLPlayerSet1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(TLPlayerName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TLPlayerOrder1)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TLPlayerSet1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TLPlayerPoints1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        TLPlayerSet1Layout.setVerticalGroup(
            TLPlayerSet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TLPlayerSet1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TLPlayerSet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TLPlayerName1)
                    .addComponent(TLPlayerOrder1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TLPlayerPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TLPlayerPoints1)
                .addContainerGap())
        );

        TRPlayerName1.setText("Jugador 1");

        TRPlayerOrder1.setText("1º");

        TRPlayerPlay1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TRPlayerPlay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRPlayerPlay1.setText("TRIO");
        TRPlayerPlay1.setMaximumSize(new java.awt.Dimension(20, 20));
        TRPlayerPlay1.setMinimumSize(new java.awt.Dimension(20, 20));
        TRPlayerPlay1.setPreferredSize(new java.awt.Dimension(20, 20));

        TRPlayerPoints1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TRPlayerPoints1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRPlayerPoints1.setText("10");

        javax.swing.GroupLayout TRPlayerSet1Layout = new javax.swing.GroupLayout(TRPlayerSet1);
        TRPlayerSet1.setLayout(TRPlayerSet1Layout);
        TRPlayerSet1Layout.setHorizontalGroup(
            TRPlayerSet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRPlayerSet1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(TRPlayerName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRPlayerOrder1)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(TRPlayerSet1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TRPlayerSet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TRPlayerPlay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRPlayerPoints1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TRPlayerSet1Layout.setVerticalGroup(
            TRPlayerSet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRPlayerSet1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TRPlayerSet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TRPlayerName1)
                    .addComponent(TRPlayerOrder1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRPlayerPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TRPlayerPoints1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Transparencia2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Transparencia2MouseClicked(evt);
            }
        });
        getContentPane().add(Transparencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, 100));

        Transparencia3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Transparencia3MouseClicked(evt);
            }
        });
        getContentPane().add(Transparencia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 100));

        Transparencia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Transparencia4MouseClicked(evt);
            }
        });
        getContentPane().add(Transparencia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 100));

        Transparencia5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Transparencia5MouseClicked(evt);
            }
        });
        getContentPane().add(Transparencia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 100));

        Transparencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransparenciaMouseClicked(evt);
            }
        });
        getContentPane().add(Transparencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 100));

        Rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/fondorojo.png"))); // NOI18N
        getContentPane().add(Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 100));

        Rojo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/fondorojo.png"))); // NOI18N
        getContentPane().add(Rojo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, 100));

        Rojo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/fondorojo.png"))); // NOI18N
        getContentPane().add(Rojo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 100));

        Rojo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/fondorojo.png"))); // NOI18N
        getContentPane().add(Rojo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 100));

        Rojo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/fondorojo.png"))); // NOI18N
        getContentPane().add(Rojo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 100));

        King.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado.PNG"))); // NOI18N
        getContentPane().add(King, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 100));

        Queen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado2.png"))); // NOI18N
        getContentPane().add(Queen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 100));

        Jack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado3.PNG"))); // NOI18N
        getContentPane().add(Jack, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 100));

        Ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado4.PNG"))); // NOI18N
        getContentPane().add(Ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 100));

        Ace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado5.PNG"))); // NOI18N
        getContentPane().add(Ace, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 100));

        Queen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado2.png"))); // NOI18N
        getContentPane().add(Queen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, 100));

        King2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado.PNG"))); // NOI18N
        getContentPane().add(King2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, 100));

        Jack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado3.PNG"))); // NOI18N
        getContentPane().add(Jack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, 100));

        Ten2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado4.PNG"))); // NOI18N
        getContentPane().add(Ten2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, 100));

        Ace2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado5.PNG"))); // NOI18N
        getContentPane().add(Ace2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, 100));

        Jack3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado3.PNG"))); // NOI18N
        getContentPane().add(Jack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 100));

        King3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado.PNG"))); // NOI18N
        getContentPane().add(King3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 100));

        Queen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado2.png"))); // NOI18N
        getContentPane().add(Queen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 100));

        Ten3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado4.PNG"))); // NOI18N
        getContentPane().add(Ten3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 100));

        Ace3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado5.PNG"))); // NOI18N
        getContentPane().add(Ace3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 100));

        Nine4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado6.PNG"))); // NOI18N
        getContentPane().add(Nine4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 100));

        King4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado.PNG"))); // NOI18N
        getContentPane().add(King4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 100));

        Queen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado2.png"))); // NOI18N
        getContentPane().add(Queen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 100));

        Jack4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado3.PNG"))); // NOI18N
        getContentPane().add(Jack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 100));

        Ten4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado4.PNG"))); // NOI18N
        getContentPane().add(Ten4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 100));

        Ace4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado5.PNG"))); // NOI18N
        getContentPane().add(Ace4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 100, 100));

        Ten5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado4.PNG"))); // NOI18N
        getContentPane().add(Ten5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 100));

        King5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado.PNG"))); // NOI18N
        getContentPane().add(King5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 100));

        Queen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado2.png"))); // NOI18N
        getContentPane().add(Queen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 100));

        Jack5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado3.PNG"))); // NOI18N
        getContentPane().add(Jack5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 100));

        Ace5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado5.PNG"))); // NOI18N
        getContentPane().add(Ace5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 100));

        Nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado6.PNG"))); // NOI18N
        getContentPane().add(Nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 100));

        Nine2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado6.PNG"))); // NOI18N
        getContentPane().add(Nine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, 100));

        Nine3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado6.PNG"))); // NOI18N
        getContentPane().add(Nine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 100));

        Nine5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/dado6.PNG"))); // NOI18N
        getContentPane().add(Nine5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 100, 100));

        TLPlayerSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        TLPlayerName.setText("Jugador 4");

        TLPlayerOrder.setText("4º");

        TLPlayerPlay.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TLPlayerPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TLPlayerPlay.setText("DP");
        TLPlayerPlay.setMaximumSize(new java.awt.Dimension(20, 20));
        TLPlayerPlay.setMinimumSize(new java.awt.Dimension(20, 20));
        TLPlayerPlay.setPreferredSize(new java.awt.Dimension(20, 20));

        TLPlayerPoints.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TLPlayerPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TLPlayerPoints.setText("10");

        javax.swing.GroupLayout TLPlayerSetLayout = new javax.swing.GroupLayout(TLPlayerSet);
        TLPlayerSet.setLayout(TLPlayerSetLayout);
        TLPlayerSetLayout.setHorizontalGroup(
            TLPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TLPlayerSetLayout.createSequentialGroup()
                .addGroup(TLPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TLPlayerSetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TLPlayerPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TLPlayerSetLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(TLPlayerName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TLPlayerOrder)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(TLPlayerSetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TLPlayerPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        TLPlayerSetLayout.setVerticalGroup(
            TLPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TLPlayerSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TLPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TLPlayerName)
                    .addComponent(TLPlayerOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TLPlayerPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TLPlayerPoints)
                .addContainerGap())
        );

        getContentPane().add(TLPlayerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 110));

        TRPlayerSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        TRPlayerName.setText("Jugador 1");

        TRPlayerOrder.setText("1º");

        TRPlayerPlay.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TRPlayerPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRPlayerPlay.setText("TRIO");
        TRPlayerPlay.setMaximumSize(new java.awt.Dimension(20, 20));
        TRPlayerPlay.setMinimumSize(new java.awt.Dimension(20, 20));
        TRPlayerPlay.setPreferredSize(new java.awt.Dimension(20, 20));

        TRPlayerPoints.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        TRPlayerPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TRPlayerPoints.setText("10");

        javax.swing.GroupLayout TRPlayerSetLayout = new javax.swing.GroupLayout(TRPlayerSet);
        TRPlayerSet.setLayout(TRPlayerSetLayout);
        TRPlayerSetLayout.setHorizontalGroup(
            TRPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRPlayerSetLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(TRPlayerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRPlayerOrder)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(TRPlayerSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TRPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TRPlayerPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRPlayerPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TRPlayerSetLayout.setVerticalGroup(
            TRPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRPlayerSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TRPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TRPlayerName)
                    .addComponent(TRPlayerOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRPlayerPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TRPlayerPoints)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(TRPlayerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 140, 110));

        BRPlayerSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        BRPlayerName.setText("Jugador 2");

        BRPlayerOrder.setText("2º");

        BRPlayerPlay.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BRPlayerPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BRPlayerPlay.setText("PÓKER");
        BRPlayerPlay.setMaximumSize(new java.awt.Dimension(20, 20));
        BRPlayerPlay.setMinimumSize(new java.awt.Dimension(20, 20));
        BRPlayerPlay.setPreferredSize(new java.awt.Dimension(20, 20));

        BRPlayerPoints.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BRPlayerPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BRPlayerPoints.setText("10");

        javax.swing.GroupLayout BRPlayerSetLayout = new javax.swing.GroupLayout(BRPlayerSet);
        BRPlayerSet.setLayout(BRPlayerSetLayout);
        BRPlayerSetLayout.setHorizontalGroup(
            BRPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BRPlayerSetLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BRPlayerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BRPlayerOrder)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(BRPlayerSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BRPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BRPlayerPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BRPlayerPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BRPlayerSetLayout.setVerticalGroup(
            BRPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BRPlayerSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BRPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BRPlayerName)
                    .addComponent(BRPlayerOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BRPlayerPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BRPlayerPoints)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(BRPlayerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, 140, 110));

        BLPlayerSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        BLPlayerName.setText("Jugador 3");

        BLPlayerOrder.setText("3º");

        BLPlayerPoints.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BLPlayerPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLPlayerPoints.setText("10");

        BLPlayerPlay.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BLPlayerPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BLPlayerPlay.setText("NADA");
        BLPlayerPlay.setMaximumSize(new java.awt.Dimension(20, 20));
        BLPlayerPlay.setMinimumSize(new java.awt.Dimension(20, 20));
        BLPlayerPlay.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout BLPlayerSetLayout = new javax.swing.GroupLayout(BLPlayerSet);
        BLPlayerSet.setLayout(BLPlayerSetLayout);
        BLPlayerSetLayout.setHorizontalGroup(
            BLPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLPlayerSetLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BLPlayerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BLPlayerOrder)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(BLPlayerSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BLPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLPlayerPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BLPlayerPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BLPlayerSetLayout.setVerticalGroup(
            BLPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLPlayerSetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BLPlayerSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BLPlayerName)
                    .addComponent(BLPlayerOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BLPlayerPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLPlayerPoints)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(BLPlayerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 140, 110));

        Tirar.setBackground(new java.awt.Color(255, 51, 51));
        Tirar.setForeground(new java.awt.Color(0, 255, 0));
        Tirar.setText("TIRAR DADOS");
        Tirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TirarMousePressed(evt);
            }
        });
        Tirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TirarActionPerformed(evt);
            }
        });
        getContentPane().add(Tirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 110, 60));

        bkgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokerDeDados/fotos/foto.jpg"))); // NOI18N
        getContentPane().add(bkgrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TirarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TirarMousePressed

        Metodos.playMusic(sonidoDados);

        javax.swing.JLabel dado[][] = {
            {King, Queen, Jack, Nine, Ten, Ace
            },
            {King2, Queen2, Jack2, Nine2, Ten2, Ace2
            },
            {King3, Queen3, Jack3, Nine3, Ten3, Ace3
            },
            {King4, Queen4, Jack4, Nine4, Ten4, Ace4
            },
            {King5, Queen5, Jack5, Nine5, Ten5, Ace5
            }

        };

        if (this.segundaVez == false) {

            for (int i = 0; i < dado.length; i++) {

                Metodos.rollDice(dado[i][0], dado[i][1], dado[i][2],
                        dado[i][3], dado[i][4],
                        dado[i][5]);

            }
            this.segundaVez = true;

        } else {
            int[] selec = new int[this.dadosSellecionados.length()];

            for (int j = 0; j < selec.length; j++) {
                selec[j] = Character.getNumericValue(this.dadosSellecionados.charAt(j));

            }

            for (int i = 0; i < selec.length; i++) {

                Metodos.rollDice(dado[selec[i]][0], dado[selec[i]][1], dado[selec[i]][2],
                        dado[selec[i]][3], dado[selec[i]][4], dado[selec[i]][5]);

            }

            
            this.dadosSellecionados = "";
            Tirar.setEnabled(false);
            this.segundaVez = false;

        }
        Metodos.playMusic(sonidoDados2);
    

    }//GEN-LAST:event_TirarMousePressed

    private void TransparenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransparenciaMouseClicked

        if (!Rojo.isVisible()) {
            Rojo.setVisible(true);
            dadosSellecionados = dadosSellecionados + "0";
        } else {
            Rojo.setVisible(false);
            dadosSellecionados = dadosSellecionados.replace("0", "");
        }

    }//GEN-LAST:event_TransparenciaMouseClicked


    private void Transparencia2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Transparencia2MouseClicked

        if (!Rojo2.isVisible()) {
            Rojo2.setVisible(true);
            dadosSellecionados = dadosSellecionados + "1";
        } else {
            Rojo2.setVisible(false);
            dadosSellecionados = dadosSellecionados.replace("1", "");
        }
    }//GEN-LAST:event_Transparencia2MouseClicked

    private void Transparencia3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Transparencia3MouseClicked
        if (!Rojo3.isVisible()) {
            Rojo3.setVisible(true);
            dadosSellecionados = dadosSellecionados + "2";
        } else {
            Rojo3.setVisible(false);
            dadosSellecionados = dadosSellecionados.replace("2", "");
        }
    }//GEN-LAST:event_Transparencia3MouseClicked

    private void Transparencia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Transparencia4MouseClicked
        if (!Rojo4.isVisible()) {
            Rojo4.setVisible(true);
            dadosSellecionados = dadosSellecionados + "3";
        } else {
            Rojo4.setVisible(false);
            dadosSellecionados = dadosSellecionados.replace("3", "");
        }
    }//GEN-LAST:event_Transparencia4MouseClicked

    private void Transparencia5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Transparencia5MouseClicked
        if (!Rojo5.isVisible()) {
            Rojo5.setVisible(true);
            dadosSellecionados = dadosSellecionados + "4";
        } else {
            Rojo5.setVisible(false);
            dadosSellecionados = dadosSellecionados.replace("4", "");
        }
    }//GEN-LAST:event_Transparencia5MouseClicked

    private void TirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TirarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ace;
    private javax.swing.JLabel Ace2;
    private javax.swing.JLabel Ace3;
    private javax.swing.JLabel Ace4;
    private javax.swing.JLabel Ace5;
    private javax.swing.JLabel BLPlayerName;
    private javax.swing.JLabel BLPlayerOrder;
    private javax.swing.JLabel BLPlayerPlay;
    private javax.swing.JLabel BLPlayerPoints;
    private javax.swing.JPanel BLPlayerSet;
    private javax.swing.JLabel BRPlayerName;
    private javax.swing.JLabel BRPlayerOrder;
    private javax.swing.JLabel BRPlayerPlay;
    private javax.swing.JLabel BRPlayerPoints;
    private javax.swing.JPanel BRPlayerSet;
    private javax.swing.JLabel Jack;
    private javax.swing.JLabel Jack2;
    private javax.swing.JLabel Jack3;
    private javax.swing.JLabel Jack4;
    private javax.swing.JLabel Jack5;
    private javax.swing.JLabel King;
    private javax.swing.JLabel King2;
    private javax.swing.JLabel King3;
    private javax.swing.JLabel King4;
    private javax.swing.JLabel King5;
    private javax.swing.JLabel Nine;
    private javax.swing.JLabel Nine2;
    private javax.swing.JLabel Nine3;
    private javax.swing.JLabel Nine4;
    private javax.swing.JLabel Nine5;
    private javax.swing.JLabel Queen;
    private javax.swing.JLabel Queen2;
    private javax.swing.JLabel Queen3;
    private javax.swing.JLabel Queen4;
    private javax.swing.JLabel Queen5;
    private javax.swing.JLabel Rojo;
    private javax.swing.JLabel Rojo2;
    private javax.swing.JLabel Rojo3;
    private javax.swing.JLabel Rojo4;
    private javax.swing.JLabel Rojo5;
    private javax.swing.JLabel TLPlayerName;
    private javax.swing.JLabel TLPlayerName1;
    private javax.swing.JLabel TLPlayerOrder;
    private javax.swing.JLabel TLPlayerOrder1;
    private javax.swing.JLabel TLPlayerPlay;
    private javax.swing.JLabel TLPlayerPlay1;
    private javax.swing.JLabel TLPlayerPoints;
    private javax.swing.JLabel TLPlayerPoints1;
    private javax.swing.JPanel TLPlayerSet;
    private javax.swing.JPanel TLPlayerSet1;
    private javax.swing.JLabel TRPlayerName;
    private javax.swing.JLabel TRPlayerName1;
    private javax.swing.JLabel TRPlayerOrder;
    private javax.swing.JLabel TRPlayerOrder1;
    private javax.swing.JLabel TRPlayerPlay;
    private javax.swing.JLabel TRPlayerPlay1;
    private javax.swing.JLabel TRPlayerPoints;
    private javax.swing.JLabel TRPlayerPoints1;
    private javax.swing.JPanel TRPlayerSet;
    private javax.swing.JPanel TRPlayerSet1;
    private javax.swing.JLabel Ten;
    private javax.swing.JLabel Ten2;
    private javax.swing.JLabel Ten3;
    private javax.swing.JLabel Ten4;
    private javax.swing.JLabel Ten5;
    private javax.swing.JButton Tirar;
    private javax.swing.JLabel Transparencia;
    private javax.swing.JLabel Transparencia2;
    private javax.swing.JLabel Transparencia3;
    private javax.swing.JLabel Transparencia4;
    private javax.swing.JLabel Transparencia5;
    private javax.swing.JLabel bkgrnd;
    // End of variables declaration//GEN-END:variables
}
