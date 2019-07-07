/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.*;
import java.util.HashMap;
import java.util.List;
import model.Instrucao;
import model.MemoriaPrincipal;

/**
 *
 * @author thoma
 */
public class Programa extends javax.swing.JFrame {

    /**
     * Creates new form Programa
     */
    public Programa() {
        initComponents();
    }

    public Programa(String caminhoMemoria, String caminhoInstrucoes, String caminhoCache) {
        String memoria, instrucoes, cache;
        
        memoria = caminhoMemoria;
        instrucoes = caminhoInstrucoes;
        cache = caminhoCache;
        
        MapeamentoDireto m = new MapeamentoDireto();
        
        m.addCpu(instrucoes);
        m.addPrincipal(memoria);
        List<Instrucao> listInstrucao = m.getCpu();
        HashMap<String, MemoriaPrincipal> principal = m.getRAM().imprimePrincipal();
        
        jTextArea1.setText(listInstrucao.toString());
        jTextArea3.setText(principal.toString());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMemoria = new javax.swing.JPanel();
        tabPrincipal = new javax.swing.JTabbedPane();
        painelExecucao = new javax.swing.JPanel();
        textoProximaInstrucao = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        areatextoMemoriaDado = new javax.swing.JTextArea();
        textoInstrucaoAtual = new javax.swing.JLabel();
        campoOperacaoP = new javax.swing.JTextField();
        campoEnderecoP = new javax.swing.JTextField();
        campoOperacao = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        botaoProxima = new javax.swing.JButton();
        botaoTodas = new javax.swing.JButton();
        textoBuscada = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areatextoInstrucoesEndereco = new javax.swing.JTextArea();
        textoInstrucao = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        areatextoMemoriaLinha = new javax.swing.JTextArea();
        textoInstrucaoEndereco = new javax.swing.JLabel();
        textoInstrucaoOP = new javax.swing.JLabel();
        textoMemoria = new javax.swing.JLabel();
        textoPrincipal = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        areatextoInstrucoesOP = new javax.swing.JTextArea();
        textoMemoriaLinha = new javax.swing.JLabel();
        textoMemoriaDado = new javax.swing.JLabel();
        campoBuscadaLinha = new javax.swing.JTextField();
        campoBuscadaDado = new javax.swing.JTextField();
        textoCacheINFO = new javax.swing.JLabel();
        textoCache = new javax.swing.JLabel();
        textoCacheQTD = new javax.swing.JLabel();
        textoCacheHIT = new javax.swing.JLabel();
        textoCacheTag = new javax.swing.JLabel();
        textoCacheAcerto = new javax.swing.JLabel();
        textoCacheHIT1 = new javax.swing.JLabel();
        textoCacheMISS = new javax.swing.JLabel();
        textoCachenMISS = new javax.swing.JLabel();
        textoCacheHITMISS = new javax.swing.JLabel();
        textoCacheLinha = new javax.swing.JLabel();
        textoCacheBloco = new javax.swing.JLabel();
        painelCache = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        textoProximaInstrucao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textoProximaInstrucao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoProximaInstrucao.setText("Próxima Instrução");

        areatextoMemoriaDado.setColumns(20);
        areatextoMemoriaDado.setRows(5);
        areatextoMemoriaDado.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane1.setViewportView(areatextoMemoriaDado);

        textoInstrucaoAtual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textoInstrucaoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucaoAtual.setText("Instrução Atual");

        campoOperacaoP.setText("OPERACAO");
        campoOperacaoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoOperacaoPActionPerformed(evt);
            }
        });

        campoEnderecoP.setText("ENDERECO");

        campoOperacao.setText("OPERACAO");

        campoEndereco.setText("ENDERECO");

        botaoProxima.setText("Próxima Instrução");

        botaoTodas.setText("Todas Instruções");

        textoBuscada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textoBuscada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBuscada.setText("Memória Buscada");

        areatextoInstrucoesEndereco.setColumns(20);
        areatextoInstrucoesEndereco.setRows(5);
        areatextoInstrucoesEndereco.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane4.setViewportView(areatextoInstrucoesEndereco);

        textoInstrucao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoInstrucao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucao.setText("Instruções");

        areatextoMemoriaLinha.setColumns(20);
        areatextoMemoriaLinha.setRows(5);
        areatextoMemoriaLinha.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane5.setViewportView(areatextoMemoriaLinha);

        textoInstrucaoEndereco.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        textoInstrucaoEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucaoEndereco.setText("Endereço");

        textoInstrucaoOP.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        textoInstrucaoOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInstrucaoOP.setText("Operação");

        textoMemoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoMemoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoMemoria.setText("Memória");
        textoMemoria.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        textoPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPrincipal.setText("Principal");
        textoPrincipal.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        areatextoInstrucoesOP.setColumns(20);
        areatextoInstrucoesOP.setRows(5);
        areatextoInstrucoesOP.setPreferredSize(new java.awt.Dimension(160, 95));
        jScrollPane6.setViewportView(areatextoInstrucoesOP);

        textoMemoriaLinha.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        textoMemoriaLinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoMemoriaLinha.setText("Linha");

        textoMemoriaDado.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        textoMemoriaDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoMemoriaDado.setText("Dado Contido");

        campoBuscadaLinha.setText("LINHA");

        campoBuscadaDado.setText("DADO");

        textoCacheINFO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheINFO.setText("Dado na Cache:");

        textoCache.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoCache.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCache.setText("Cache");

        textoCacheQTD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheQTD.setText("Quantidade:");

        textoCacheHIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheHIT.setText("HIT:");

        textoCacheTag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheTag.setText("Tag");

        textoCacheAcerto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheAcerto.setText("Acerto na Cache?:");

        textoCacheHIT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheHIT1.setText("nHIT");

        textoCacheMISS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheMISS.setText("MISS:");

        textoCachenMISS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCachenMISS.setText("nMISS");

        textoCacheHITMISS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheHITMISS.setText("HIT ou MISS");

        textoCacheLinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheLinha.setText("Linha");

        textoCacheBloco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCacheBloco.setText("Bloco");

        javax.swing.GroupLayout painelExecucaoLayout = new javax.swing.GroupLayout(painelExecucao);
        painelExecucao.setLayout(painelExecucaoLayout);
        painelExecucaoLayout.setHorizontalGroup(
            painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelExecucaoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoInstrucao, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(textoMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoInstrucaoOP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoMemoriaLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoMemoriaDado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoInstrucaoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoInstrucaoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoBuscada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoProximaInstrucao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCache, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoOperacao)
                            .addComponent(campoOperacaoP)
                            .addComponent(campoBuscadaLinha, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(textoCacheINFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoCacheQTD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoCacheAcerto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelExecucaoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoBuscadaDado)
                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(painelExecucaoLayout.createSequentialGroup()
                                                    .addComponent(botaoTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(100, 100, 100)
                                                    .addComponent(botaoProxima, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(campoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                                    .addComponent(campoEnderecoP)))
                                            .addGroup(painelExecucaoLayout.createSequentialGroup()
                                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                                        .addComponent(textoCacheHIT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(textoCacheHIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(40, 40, 40)
                                                        .addComponent(textoCacheMISS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                                                        .addComponent(textoCacheTag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(textoCacheLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textoCachenMISS, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                    .addComponent(textoCacheBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(painelExecucaoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(textoCacheHITMISS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        painelExecucaoLayout.setVerticalGroup(
            painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExecucaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoMemoriaLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoMemoriaDado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane1)
                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                        .addComponent(textoMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(textoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoInstrucaoOP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoInstrucaoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(textoInstrucao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoProximaInstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoOperacaoP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoProxima, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoInstrucaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEnderecoP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoBuscada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBuscadaLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBuscadaDado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelExecucaoLayout.createSequentialGroup()
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCacheAcerto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheHITMISS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCacheQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheHIT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheHIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheMISS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCachenMISS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(painelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCacheINFO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheTag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCacheBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textoCache, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Execução", painelExecucao);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("CPU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("CACHE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("RAM");

        jButton1.setText("Executar Instrução");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("CACHE HIT");

        jLabel5.setText("CACHE MISS");

        jLabel8.setText("ACERTOS");

        javax.swing.GroupLayout painelCacheLayout = new javax.swing.GroupLayout(painelCache);
        painelCache.setLayout(painelCacheLayout);
        painelCacheLayout.setHorizontalGroup(
            painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCacheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painelCacheLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(painelCacheLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCacheLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(painelCacheLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGroup(painelCacheLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel6)))
                    .addGroup(painelCacheLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel9)))
                .addGap(145, 145, 145))
        );
        painelCacheLayout.setVerticalGroup(
            painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCacheLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane7))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(59, 59, 59)
                .addGroup(painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(painelCacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Cache", painelCache);

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

    private void campoOperacaoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoOperacaoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoOperacaoPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areatextoInstrucoesEndereco;
    private javax.swing.JTextArea areatextoInstrucoesOP;
    private javax.swing.JTextArea areatextoMemoriaDado;
    private javax.swing.JTextArea areatextoMemoriaLinha;
    private javax.swing.JButton botaoProxima;
    private javax.swing.JButton botaoTodas;
    private javax.swing.JTextField campoBuscadaDado;
    private javax.swing.JTextField campoBuscadaLinha;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoEnderecoP;
    private javax.swing.JTextField campoOperacao;
    private javax.swing.JTextField campoOperacaoP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JPanel painelCache;
    private javax.swing.JPanel painelExecucao;
    private javax.swing.JPanel painelMemoria;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JLabel textoBuscada;
    private javax.swing.JLabel textoCache;
    private javax.swing.JLabel textoCacheAcerto;
    private javax.swing.JLabel textoCacheBloco;
    private javax.swing.JLabel textoCacheHIT;
    private javax.swing.JLabel textoCacheHIT1;
    private javax.swing.JLabel textoCacheHITMISS;
    private javax.swing.JLabel textoCacheINFO;
    private javax.swing.JLabel textoCacheLinha;
    private javax.swing.JLabel textoCacheMISS;
    private javax.swing.JLabel textoCacheQTD;
    private javax.swing.JLabel textoCacheTag;
    private javax.swing.JLabel textoCachenMISS;
    private javax.swing.JLabel textoInstrucao;
    private javax.swing.JLabel textoInstrucaoAtual;
    private javax.swing.JLabel textoInstrucaoEndereco;
    private javax.swing.JLabel textoInstrucaoOP;
    private javax.swing.JLabel textoMemoria;
    private javax.swing.JLabel textoMemoriaDado;
    private javax.swing.JLabel textoMemoriaLinha;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoProximaInstrucao;
    // End of variables declaration//GEN-END:variables
}
