package view;

import control.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import model.Instrucao;
import model.MemoriaCache;
import model.MemoriaPrincipal;

public class Programa extends javax.swing.JFrame {

    private String principalPath, cpuPath, configPath;
    public MapeamentoDireto mapeamento;

    public Programa() {
        initComponents();
//        this.principalPath = "C:/Users/Vanessa Furtado/Desktop/RAM.txt";
//        this.cpuPath = "C:/Users/Vanessa Furtado/Desktop/CPU.txt";
//        this.configPath = "C:/Users/Vanessa Furtado/Desktop/CPU.txt";
        this.mapeamento = new MapeamentoDireto(this.configPath);
        this.mapeamento.addCpu(this.cpuPath);
        this.mapeamento.addPrincipal(this.principalPath);
    }

    public Programa(String caminhoMemoria, String caminhoInstrucoes, String caminhoConfiguracoes) {
        this.principalPath = caminhoMemoria;
        this.cpuPath = caminhoInstrucoes;
        this.configPath = caminhoConfiguracoes;
        this.mapeamento = new MapeamentoDireto(this.configPath);
        this.mapeamento.addCpu(this.cpuPath);
        this.mapeamento.addPrincipal(this.principalPath);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMemoria = new javax.swing.JPanel();
        tabPrincipal = new javax.swing.JTabbedPane();
        painelExecucao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        conteudoMemoria = new javax.swing.JTextArea();
        textoInstrucaoAtual = new javax.swing.JLabel();
        atualEndereco = new javax.swing.JTextField();
        atualOperacao = new javax.swing.JTextField();
        botaoProxima = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        linhaMemoria = new javax.swing.JTextArea();
        textoInstrucaoOP = new javax.swing.JLabel();
        textoMemoria = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        conteudoCache = new javax.swing.JTextArea();
        textoMemoriaLinha = new javax.swing.JLabel();
        textoCache = new javax.swing.JLabel();
        textoCacheQTD = new javax.swing.JLabel();
        textoCacheHIT = new javax.swing.JLabel();
        textoCacheAcerto = new javax.swing.JLabel();
        hit = new javax.swing.JLabel();
        textoCacheMISS = new javax.swing.JLabel();
        miss = new javax.swing.JLabel();
        situacao = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tagCache = new javax.swing.JTextArea();
        textoInstrucaoOP1 = new javax.swing.JLabel();
        textoInstrucaoOP2 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        linhaCache = new javax.swing.JTextArea();
        textoInstrucaoOP3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        acertos = new javax.swing.JLabel();
        tudo = new javax.swing.JButton();
        painelCache = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inst = new javax.swing.JTextArea();
        enderecos = new javax.swing.JScrollPane();
        ends = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tag = new javax.swing.JLabel();
        linha = new javax.swing.JLabel();
        bloco = new javax.swing.JLabel();

        javax.swing.GroupLayout painelMemoriaLayout = new javax.swing.GroupLayout(painelMemoria);
        painelMemoria.setLayout(painelMemoriaLayout);
        painelMemoriaLayout.setHorizontalGroup(
            painelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        painelMemoriaLayout.setVerticalGroup(
            painelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPrincipalMouseClicked(evt);
            }
        });

        conteudoMemoria.setColumns(20);
        conteudoMemoria.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        conteudoMemoria.setRows(5);
        conteudoMemoria.setText("00000000000000000000000000000000");
        conteudoMemoria.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane1.setViewportView(conteudoMemoria);

        textoInstrucaoAtual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textoInstrucaoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucaoAtual.setText("Instrução Atual");

        atualEndereco.setText("ENDERECO");

        atualOperacao.setText("OPERACAO");

        botaoProxima.setLabel("Executar Instrução");
        botaoProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximaActionPerformed(evt);
            }
        });

        linhaMemoria.setColumns(20);
        linhaMemoria.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        linhaMemoria.setRows(5);
        jScrollPane5.setViewportView(linhaMemoria);

        textoInstrucaoOP.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        textoInstrucaoOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucaoOP.setText("Linha");

        textoMemoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoMemoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoMemoria.setText("MEMÓRIA PRINCIPAL");

        conteudoCache.setColumns(20);
        conteudoCache.setRows(5);
        conteudoCache.setText("00000000000000000000000000000000");
        conteudoCache.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane6.setViewportView(conteudoCache);

        textoMemoriaLinha.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        textoMemoriaLinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoMemoriaLinha.setText("Linha");

        textoCache.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoCache.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCache.setText("CACHE");

        textoCacheQTD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheQTD.setText("Quantidade:");

        textoCacheHIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheHIT.setText("HIT:");

        textoCacheAcerto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheAcerto.setText("Situação:");

        hit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hit.setText("nHIT");

        textoCacheMISS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheMISS.setText("MISS:");

        miss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miss.setText("nMISS");

        situacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        situacao.setText("HIT ou MISS");

        tagCache.setColumns(20);
        tagCache.setRows(5);
        tagCache.setText("000000");
        jScrollPane8.setViewportView(tagCache);

        textoInstrucaoOP1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        textoInstrucaoOP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucaoOP1.setText("Conteúdo");

        textoInstrucaoOP2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        textoInstrucaoOP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucaoOP2.setText("Tag");

        linhaCache.setColumns(20);
        linhaCache.setRows(5);
        linhaCache.setText("0000000000000000");
        jScrollPane9.setViewportView(linhaCache);

        textoInstrucaoOP3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        textoInstrucaoOP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucaoOP3.setText("Conteudo");

        jLabel9.setText("Porcentagem de Acertos");

        acertos.setText("jLabel10");

        tudo.setText("Executar Tudo");
        tudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelExecucaoLayout = new javax.swing.GroupLayout(painelExecucao);
        painelExecucao.setLayout(painelExecucaoLayout);
        painelExecucaoLayout.setHorizontalGroup(
            painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExecucaoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelExecucaoLayout.createSequentialGroup()
                                .addComponent(textoInstrucaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(atualOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(atualEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(tudo)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoProxima, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelExecucaoLayout.createSequentialGroup()
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCacheAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoCacheQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(situacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(textoCacheHIT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(textoCacheMISS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(miss, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(acertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelExecucaoLayout.createSequentialGroup()
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelExecucaoLayout.createSequentialGroup()
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(textoMemoriaLinha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addGap(18, 18, 18))
                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                        .addComponent(textoInstrucaoOP1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96))))
                            .addGroup(painelExecucaoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(textoMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCache, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelExecucaoLayout.createSequentialGroup()
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(textoInstrucaoOP2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                        .addComponent(textoInstrucaoOP, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoInstrucaoOP3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(407, 407, 407))
        );
        painelExecucaoLayout.setVerticalGroup(
            painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExecucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoMemoria)
                    .addComponent(textoCache, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoMemoriaLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoInstrucaoOP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoInstrucaoOP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoInstrucaoOP)
                    .addComponent(textoInstrucaoOP3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(jScrollPane9))
                    .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoInstrucaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoProxima, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tudo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCacheAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCacheQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheHIT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheMISS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(miss, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Execução", painelExecucao);

        painelCache.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Seja bem-vindo ao Simulador Cache");
        painelCache.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 5, 320, -1));
        painelCache.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 16, -1, -1));
        painelCache.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 16, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Esse trabalho foi desenvolvido por: Gustavo Luiz, Thomas Costa e Vanessa Furtado");
        painelCache.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 600, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Como selecionado por você (Usuário), as instruções a serem executadas serão:");
        painelCache.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        inst.setColumns(20);
        inst.setRows(5);
        jScrollPane2.setViewportView(inst);

        painelCache.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 110, 180, 220));

        ends.setColumns(20);
        ends.setRows(5);
        enderecos.setViewportView(ends);

        painelCache.add(enderecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 210, 220));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("De acordo com o arquivo de configuração escolhido, sua CACHE foi projetada para possuir:");
        painelCache.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel4.setText("TAG");
        painelCache.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 354, -1, 30));

        jLabel5.setText("Linha");
        painelCache.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 80, 20));

        jLabel8.setText("Bloco");
        painelCache.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 60, 20));
        painelCache.add(tag, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));
        painelCache.add(linha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));
        painelCache.add(bloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        tabPrincipal.addTab("Instruções", painelCache);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximaActionPerformed

        try {
            situacao.setText( this.mapeamento.executarInstrucao());
        } catch (CPUException e) {
            JOptionPane.showMessageDialog(null, e, e.getMessage(), WIDTH, null);

        }
        executarMapeamento();
        miss.setText(String.valueOf(this.mapeamento.getMiss()));
        hit.setText(String.valueOf(this.mapeamento.getHit()));
        this.mapeamento.imprimeCpu();

    }//GEN-LAST:event_botaoProximaActionPerformed

    private void tabPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrincipalMouseClicked
        // TODO add your handling code here:
        inst.setText("");
        ends.setText("");
        List<Instrucao> instrucoes = this.mapeamento.getCpu();
        for(Instrucao i : instrucoes){
            inst.append(i.getOperacao());
            inst.append("\n");
            ends.append(i.getEndereco());
            ends.append("\n");
        
        }
        tag.setText(String.valueOf(this.mapeamento.getTag()));
        linha.setText(String.valueOf(this.mapeamento.getLinha()));
        bloco.setText(String.valueOf(this.mapeamento.getBloco()));
        executarMapeamento();
    }//GEN-LAST:event_tabPrincipalMouseClicked

    private void tudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tudoActionPerformed
    
        this.mapeamento.mapeamento();
        List<MemoriaCache> cache = this.mapeamento.getCache();
        for (MemoriaCache a : cache) {
            tagCache.append(a.getTag());
            linhaCache.append(a.getLinha());
            conteudoCache.append(a.getDado());
            linhaCache.append("\n");
            tagCache.append("\n");
            conteudoCache.append("\n");
        }
        miss.setText(String.valueOf(this.mapeamento.getMiss()));
        hit.setText(String.valueOf(this.mapeamento.getHit()));
        acertos.setText(String.valueOf(this.mapeamento.getPorcentagem()));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tudoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    public void executarMapeamento() {

        linhaMemoria.setText("");
        conteudoMemoria.setText("");
        tagCache.setText("");
        linhaCache.setText("");
        conteudoCache.setText("");
        List<MemoriaPrincipal> principal = this.mapeamento.getRAM();
        List<MemoriaCache> cache = this.mapeamento.getCache();
        for (MemoriaPrincipal a : principal) {
            linhaMemoria.append(a.getLinha());
            conteudoMemoria.append(a.getDado());
            linhaMemoria.append("\n");
            conteudoMemoria.append("\n");
        }
        for (MemoriaCache a : cache) {
            tagCache.append(a.getTag());
            linhaCache.append(a.getLinha());
            conteudoCache.append(a.getDado());
            linhaCache.append("\n");
            tagCache.append("\n");
            conteudoCache.append("\n");
        }
        try {
            Instrucao atual = this.mapeamento.getProximaInstrucao(0);

            atualOperacao.setText(atual.getOperacao());
            atualEndereco.setText(atual.getEndereco());
        } catch (InstrucaoException e) {
            atualOperacao.setText(e.getMessage());
            atualEndereco.setText(e.getMessage());
            acertos.setText(String.valueOf(this.mapeamento.getPorcentagem()));
            JOptionPane.showMessageDialog(null, e, e.getMessage(), WIDTH, null);

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertos;
    private javax.swing.JTextField atualEndereco;
    private javax.swing.JTextField atualOperacao;
    private javax.swing.JLabel bloco;
    private javax.swing.JButton botaoProxima;
    private javax.swing.JTextArea conteudoCache;
    private javax.swing.JTextArea conteudoMemoria;
    private javax.swing.JScrollPane enderecos;
    private javax.swing.JTextArea ends;
    private javax.swing.JLabel hit;
    private javax.swing.JTextArea inst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel linha;
    private javax.swing.JTextArea linhaCache;
    private javax.swing.JTextArea linhaMemoria;
    private javax.swing.JLabel miss;
    private javax.swing.JPanel painelCache;
    private javax.swing.JPanel painelExecucao;
    private javax.swing.JPanel painelMemoria;
    private javax.swing.JLabel situacao;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JLabel tag;
    private javax.swing.JTextArea tagCache;
    private javax.swing.JLabel textoCache;
    private javax.swing.JLabel textoCacheAcerto;
    private javax.swing.JLabel textoCacheHIT;
    private javax.swing.JLabel textoCacheMISS;
    private javax.swing.JLabel textoCacheQTD;
    private javax.swing.JLabel textoInstrucaoAtual;
    private javax.swing.JLabel textoInstrucaoOP;
    private javax.swing.JLabel textoInstrucaoOP1;
    private javax.swing.JLabel textoInstrucaoOP2;
    private javax.swing.JLabel textoInstrucaoOP3;
    private javax.swing.JLabel textoMemoria;
    private javax.swing.JLabel textoMemoriaLinha;
    private javax.swing.JButton tudo;
    // End of variables declaration//GEN-END:variables
}
