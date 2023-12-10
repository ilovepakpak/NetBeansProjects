/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoee;

import java.awt.Color;
import static java.lang.String.valueOf;
import javax.swing.JOptionPane;

/**
 *
 * @author chessy
 */
public class GUI_TicTacToe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int i = 0;

    /**
     * Creates new form GUI_TicTacToe
     */
    public GUI_TicTacToe() {
        initComponents();
    }

    private void gameScore() {
        xScore.setText(String.valueOf(xCount));
        oScore.setText(String.valueOf(oCount));
        xScore.setBackground(Color.RED);
        oScore.setBackground(Color.BLUE);
    }

    private void choosePlayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void WinningGame() {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        if (b1 == "X" && b2 == "X" && b3 == "X") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn1.setBackground(Color.orange);
            btn2.setBackground(Color.orange);
            btn3.setBackground(Color.orange);
            winPlayer.setText("X WON");
            i = 0;

        }
        if (b4 == "X" && b5 == "X" && b6 == "X") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn4.setBackground(Color.orange);
            btn5.setBackground(Color.orange);
            btn6.setBackground(Color.orange);
            winPlayer.setText("X WON");
            i = 0;
        }
        if (b7 == "X" && b8 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn9.setBackground(Color.orange);
            btn8.setBackground(Color.orange);
            btn7.setBackground(Color.orange);
            winPlayer.setText("X WON");
            i = 0;
        }
        if (b1 == "X" && b4 == "X" && b7 == "X") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn1.setBackground(Color.orange);
            btn4.setBackground(Color.orange);
            btn7.setBackground(Color.orange);
            i = 0;
        }
        if (b2 == "X" && b5 == "X" && b8 == "X") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn2.setBackground(Color.orange);
            btn5.setBackground(Color.orange);
            btn8.setBackground(Color.orange);
            winPlayer.setText("X WON");
            i = 0;
        }
        if (b3 == "X" && b6 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn3.setBackground(Color.orange);
            btn6.setBackground(Color.orange);
            btn9.setBackground(Color.orange);
            winPlayer.setText("X WON");
            i = 0;
        }
        if (b1 == "X" && b5 == "X" && b9 == "X") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn1.setBackground(Color.orange);
            btn5.setBackground(Color.orange);
            btn9.setBackground(Color.orange);
            winPlayer.setText("X WON");
            i = 0;
        }
        if (b3 == "X" && b5 == "X" && b7 == "X") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn3.setBackground(Color.orange);
            btn5.setBackground(Color.orange);
            btn7.setBackground(Color.orange);
            winPlayer.setText("X WON");
            i = 0;
        }

        if (b1 == "O" && b2 == "O" && b3 == "O") {
            JOptionPane.showMessageDialog(this, "Player O  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            btn1.setBackground(Color.orange);
            btn2.setBackground(Color.orange);
            btn3.setBackground(Color.orange);
            winPlayer.setText("O WON");
            i = 0;
        }
        if (b4 == "O" && b5 == "O" && b6 == "O") {
            JOptionPane.showMessageDialog(this, "Player O Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            btn4.setBackground(Color.orange);
            btn5.setBackground(Color.orange);
            btn6.setBackground(Color.orange);
            winPlayer.setText("O WON");
            i = 0;
        }
        if (b7 == "O" && b8 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "Player X  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            btn9.setBackground(Color.orange);
            btn8.setBackground(Color.orange);
            btn7.setBackground(Color.orange);
            winPlayer.setText("O WON");
            i = 0;
        }
        if (b1 == "O" && b4 == "O" && b7 == "O") {
            JOptionPane.showMessageDialog(this, "Player O  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            btn1.setBackground(Color.orange);
            btn4.setBackground(Color.orange);
            btn7.setBackground(Color.orange);
            winPlayer.setText("O WON");
            i = 0;
        }
        if (b2 == "O" && b5 == "O" && b8 == "O") {
            JOptionPane.showMessageDialog(this, "Player O  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            btn2.setBackground(Color.orange);
            btn5.setBackground(Color.orange);
            btn8.setBackground(Color.orange);
            winPlayer.setText("O WON");
            i = 0;
        }
        if (b3 == "O" && b6 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "Player O  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            btn3.setBackground(Color.orange);
            btn6.setBackground(Color.orange);
            btn9.setBackground(Color.orange);
            winPlayer.setText("O WON");
            i = 0;
        }
        if (b1 == "O" && b5 == "O" && b9 == "O") {
            JOptionPane.showMessageDialog(this, "Player O  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn1.setBackground(Color.orange);
            btn5.setBackground(Color.orange);
            btn9.setBackground(Color.orange);
            winPlayer.setText("O WON");
            i = 0;
        }
        if (b3 == "O" && b5 == "O" && b7 == "O") {
            JOptionPane.showMessageDialog(this, "Player O  Win", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            btn3.setBackground(Color.orange);
            btn5.setBackground(Color.orange);
            btn7.setBackground(Color.orange);
            winPlayer.setText("O WON");
            i = 0;
        } else if (i == 9) {
            JOptionPane.showMessageDialog(this, "DRAW !!", "TICTACTOE", JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            winPlayer.setText("DRAW !!");
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

        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRank = new javax.swing.JButton();
        btnID = new javax.swing.JButton();
        oScore = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        winPlayer = new javax.swing.JButton();
        xScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOEEE");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
        jLabel1.setText("TIC TAC TOE");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setName("jLabel1"); // NOI18N

        btn1.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn1.setName("btn1"); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn2.setName("btn2"); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn3.setName("btn3"); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn5.setName("btn5"); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn6.setName("btn6"); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn9.setName("btn9"); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn4.setName("btn4"); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn8.setName("btn8"); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Linux Libertine Display O", 1, 60)); // NOI18N
        btn7.setName("btn7"); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        btnReset.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setName("btnReset"); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        btnStart.setText("Start");
        btnStart.setName("btnStart"); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setName("btnExit"); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRank.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        btnRank.setText("Ranking");
        btnRank.setName("btnRank"); // NOI18N
        btnRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankActionPerformed(evt);
            }
        });

        btnID.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        btnID.setText("ID Finder");
        btnID.setName("btnID"); // NOI18N
        btnID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDActionPerformed(evt);
            }
        });

        oScore.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        oScore.setText("O Score");
        oScore.setName("oScore"); // NOI18N

        btnBack.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.setName("btnBack"); // NOI18N

        winPlayer.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        winPlayer.setText("PlayerWin");
        winPlayer.setName("winPlayer"); // NOI18N
        winPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winPlayerActionPerformed(evt);
            }
        });

        xScore.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        xScore.setText("X Score");
        xScore.setName("xScore"); // NOI18N
        xScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnID, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(oScore, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(winPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRank, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(522, 522, 522)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRank, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(xScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(winPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.red);
            i++;
        } else {
            btn4.setForeground(Color.blue);
            i++;
        }
        choosePlayer();
        WinningGame();// TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRankActionPerformed

    private void btnIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIDActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.red);
            i++;
        } else {
            btn3.setForeground(Color.blue);
            i++;
        }
        choosePlayer();
        WinningGame();// TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnExitActionPerformed

    private void xScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xScoreActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code herbtn2.setText(startGame);
        btn1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.red);
            i++;
        } else {
            btn1.setForeground(Color.blue);
            i++;
        }
        choosePlayer();
        WinningGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        btn2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.red);
            i++;
        } else {
            i++;
            btn2.setForeground(Color.blue);
        }
        choosePlayer();
        WinningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            i++;
            btn5.setForeground(Color.red);
        } else {

            btn5.setForeground(Color.blue);
            i++;
        }
        choosePlayer();// 
        WinningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            i++;
            btn6.setForeground(Color.red);
        } else {
            i++;
            btn6.setForeground(Color.blue);
        }
        choosePlayer();
        WinningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            i++;
            btn7.setForeground(Color.red);
        } else {
            i++;
            btn7.setForeground(Color.blue);
        }
        choosePlayer();
        WinningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            i++;
            btn8.setForeground(Color.red);
        } else {
            i++;
            btn8.setForeground(Color.blue);
        }
        choosePlayer();
        WinningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            i++;
            btn9.setForeground(Color.red);
        } else {
            i++;
            btn9.setForeground(Color.blue);
        }
        choosePlayer();
        WinningGame();
    }//GEN-LAST:event_btn9ActionPerformed

    private void winPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winPlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_winPlayerActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        i=0;
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        i=0;
        winPlayer.setText("Game Started");
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    public javax.swing.JButton btn3;
    public javax.swing.JButton btn4;
    public javax.swing.JButton btn5;
    public javax.swing.JButton btn6;
    public javax.swing.JButton btn7;
    public javax.swing.JButton btn8;
    public javax.swing.JButton btn9;
    public javax.swing.JButton btnBack;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnID;
    public javax.swing.JButton btnRank;
    public javax.swing.JButton btnReset;
    public javax.swing.JButton btnStart;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JButton oScore;
    public javax.swing.JButton winPlayer;
    public javax.swing.JButton xScore;
    // End of variables declaration//GEN-END:variables
}
