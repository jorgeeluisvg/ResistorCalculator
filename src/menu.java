import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{

    public menu() {
        super("Calculadora de resistencias");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1290, 780);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#e2e2e2"));


    }

    public void alta(){
        //paneles
        JPanel panelizq = new JPanel();
        panelizq.setLayout(null);
        Border blackline = BorderFactory.createLineBorder(Color.black); //bordes
        panelizq.setBackground(Color.decode("#e2e2e2"));
        panelizq.setBorder(blackline);
        panelizq.setBounds(20, 20, 610, 630);
        add(panelizq);

        JPanel panelder = new JPanel();
        panelder.setLayout(null);
        panelder.setBackground(Color.decode("#e2e2e2"));
        panelder.setBorder(blackline);
        panelder.setBounds(650, 20, 600, 630);
        add(panelder);

        //labels
        JLabel color = new JLabel("Color", SwingConstants.CENTER);
        color.setBounds(40, 40, 100, 30);
        color.setForeground(Color.black);
        color.setBorder(blackline);
        panelizq.add(color);

        JLabel numero = new JLabel("Numero", SwingConstants.CENTER);
        numero.setBounds(170, 40, 100, 30);
        numero.setForeground(Color.black);
        numero.setBorder(blackline);
        panelizq.add(numero);

        JLabel multi = new JLabel("Multiplicador", SwingConstants.CENTER);
        multi.setBounds(300, 40, 100, 30);
        multi.setForeground(Color.black);
        multi.setBorder(blackline);
        panelizq.add(multi);

        JLabel tole = new JLabel("Tolerancia", SwingConstants.CENTER);
        tole.setBounds(430, 40, 100, 30);
        tole.setForeground(Color.black);
        tole.setBorder(blackline);
        panelizq.add(tole);

        //Numeros - Jlabels
        JLabel lcero = new JLabel("0", SwingConstants.CENTER);
        lcero.setBounds(170, 80, 100, 30);
        lcero.setForeground(Color.white);
        lcero.setBackground(Color.black);
        lcero.setOpaque(true);
        lcero.setBorder(blackline);
        panelizq.add(lcero);

        JLabel luno = new JLabel("1", SwingConstants.CENTER);
        luno.setBounds(170, 120, 100, 30);
        luno.setForeground(Color.white);
        luno.setBackground(Color.decode("#a75e11"));
        luno.setOpaque(true);
        luno.setBorder(blackline);
        panelizq.add(luno);

        JLabel ldos = new JLabel("2", SwingConstants.CENTER);
        ldos.setBounds(170, 160, 100, 30);
        ldos.setForeground(Color.black);
        ldos.setBackground(Color.red);
        ldos.setOpaque(true);
        ldos.setBorder(blackline);
        panelizq.add(ldos);

        JLabel ltres = new JLabel("3", SwingConstants.CENTER);
        ltres.setBounds(170, 200, 100, 30);
        ltres.setForeground(Color.black);
        ltres.setBackground(Color.orange);
        ltres.setOpaque(true);
        ltres.setBorder(blackline);
        panelizq.add(ltres);

        JLabel lcuatro = new JLabel("4", SwingConstants.CENTER);
        lcuatro.setBounds(170, 240, 100, 30);
        lcuatro.setForeground(Color.black);
        lcuatro.setBackground(Color.yellow);
        lcuatro.setOpaque(true);
        lcuatro.setBorder(blackline);
        panelizq.add(lcuatro);

        JLabel lcinco = new JLabel("5", SwingConstants.CENTER);
        lcinco.setBounds(170, 280, 100, 30);
        lcinco.setForeground(Color.black);
        lcinco.setBackground(Color.green);
        lcinco.setOpaque(true);
        lcinco.setBorder(blackline);
        panelizq.add(lcinco);

        JLabel lseis = new JLabel("6", SwingConstants.CENTER);
        lseis.setBounds(170, 320, 100, 30);
        lseis.setForeground(Color.black);
        lseis.setBackground(Color.blue);
        lseis.setOpaque(true);
        lseis.setBorder(blackline);
        panelizq.add(lseis);

        JLabel lsiete = new JLabel("7", SwingConstants.CENTER);
        lsiete.setBounds(170, 360, 100, 30);
        lsiete.setForeground(Color.black);
        lsiete.setBackground(Color.pink);
        lsiete.setOpaque(true);
        lsiete.setBorder(blackline);
        panelizq.add(lsiete);

        JLabel locho = new JLabel("8", SwingConstants.CENTER);
        locho.setBounds(170, 400, 100, 30);
        locho.setForeground(Color.black);
        locho.setBackground(Color.gray);
        locho.setOpaque(true);
        locho.setBorder(blackline);
        panelizq.add(locho);

        JLabel lnueve = new JLabel("9", SwingConstants.CENTER);
        lnueve.setBounds(170, 440, 100, 30);
        lnueve.setForeground(Color.black);
        lnueve.setBackground(Color.white);
        lnueve.setOpaque(true);
        lnueve.setBorder(blackline);
        panelizq.add(lnueve);

        JLabel loro = new JLabel("", SwingConstants.CENTER);
        loro.setBounds(170, 480, 100, 30);
        loro.setForeground(Color.black);
        loro.setBackground(Color.yellow);
        loro.setOpaque(true);
        loro.setBorder(blackline);
        panelizq.add(loro);

        JLabel lplata = new JLabel("", SwingConstants.CENTER);
        lplata.setBounds(170, 520, 100, 30);
        lplata.setForeground(Color.black);
        lplata.setBackground(Color.gray);
        lplata.setOpaque(true);
        lplata.setBorder(blackline);
        panelizq.add(lplata);

        JLabel lnin = new JLabel("", SwingConstants.CENTER);
        lnin.setBounds(170, 560, 100, 30);
        lnin.setForeground(Color.black);
        lnin.setBackground(Color.decode("#e2e2e2"));
        lnin.setOpaque(true);
        lnin.setBorder(blackline);
        panelizq.add(lnin);

        //label multiplicador
        JLabel loro2 = new JLabel("0.1", SwingConstants.RIGHT);
        loro2.setBounds(300, 480, 100, 30);
        loro2.setForeground(Color.black);
        loro2.setBackground(Color.yellow);
        loro2.setOpaque(true);
        loro2.setBorder(blackline);
        panelizq.add(loro2);

        JLabel lplata2 = new JLabel("0.01", SwingConstants.RIGHT);
        lplata2.setBounds(300, 520, 100, 30);
        lplata2.setForeground(Color.black);
        lplata2.setBackground(Color.gray);
        lplata2.setOpaque(true);
        lplata2.setBorder(blackline);
        panelizq.add(lplata2);

        JLabel lnin2 = new JLabel("", SwingConstants.CENTER);
        lnin2.setBounds(300, 560, 100, 30);
        lnin2.setForeground(Color.black);
        lnin2.setBackground(Color.decode("#e2e2e2"));
        lnin2.setOpaque(true);
        lnin2.setBorder(blackline);
        panelizq.add(lnin2);

        //tolerancia - labels
        JLabel ltcero = new JLabel("", SwingConstants.CENTER);
        ltcero.setBounds(430, 80, 100, 30);
        ltcero.setForeground(Color.white);
        ltcero.setBackground(Color.black);
        ltcero.setOpaque(true);
        ltcero.setBorder(blackline);
        panelizq.add(ltcero);

        JLabel ltuno = new JLabel("", SwingConstants.CENTER);
        ltuno.setBounds(430, 120, 100, 30);
        ltuno.setForeground(Color.white);
        ltuno.setBackground(Color.decode("#a75e11"));
        ltuno.setOpaque(true);
        ltuno.setBorder(blackline);
        panelizq.add(ltuno);

        JLabel ltdos = new JLabel("", SwingConstants.CENTER);
        ltdos.setBounds(430, 160, 100, 30);
        ltdos.setForeground(Color.black);
        ltdos.setBackground(Color.red);
        ltdos.setOpaque(true);
        ltdos.setBorder(blackline);
        panelizq.add(ltdos);

        JLabel lttres = new JLabel("", SwingConstants.CENTER);
        lttres.setBounds(430, 200, 100, 30);
        lttres.setForeground(Color.black);
        lttres.setBackground(Color.orange);
        lttres.setOpaque(true);
        lttres.setBorder(blackline);
        panelizq.add(lttres);

        JLabel ltcuatro = new JLabel("", SwingConstants.CENTER);
        ltcuatro.setBounds(430, 240, 100, 30);
        ltcuatro.setForeground(Color.black);
        ltcuatro.setBackground(Color.yellow);
        ltcuatro.setOpaque(true);
        ltcuatro.setBorder(blackline);
        panelizq.add(ltcuatro);

        JLabel ltcinco = new JLabel("", SwingConstants.CENTER);
        ltcinco.setBounds(430, 280, 100, 30);
        ltcinco.setForeground(Color.black);
        ltcinco.setBackground(Color.green);
        ltcinco.setOpaque(true);
        ltcinco.setBorder(blackline);
        panelizq.add(ltcinco);

        JLabel ltseis = new JLabel("", SwingConstants.CENTER);
        ltseis.setBounds(430, 320, 100, 30);
        ltseis.setForeground(Color.black);
        ltseis.setBackground(Color.blue);
        ltseis.setOpaque(true);
        ltseis.setBorder(blackline);
        panelizq.add(ltseis);

        JLabel ltsiete = new JLabel("", SwingConstants.CENTER);
        ltsiete.setBounds(430, 360, 100, 30);
        ltsiete.setForeground(Color.black);
        ltsiete.setBackground(Color.pink);
        ltsiete.setOpaque(true);
        ltsiete.setBorder(blackline);
        panelizq.add(ltsiete);

        JLabel ltocho = new JLabel("", SwingConstants.CENTER);
        ltocho.setBounds(430, 400, 100, 30);
        ltocho.setForeground(Color.black);
        ltocho.setBackground(Color.gray);
        ltocho.setOpaque(true);
        ltocho.setBorder(blackline);
        panelizq.add(ltocho);

        JLabel ltnueve = new JLabel("", SwingConstants.CENTER);
        ltnueve.setBounds(430, 440, 100, 30);
        ltnueve.setForeground(Color.black);
        ltnueve.setBackground(Color.white);
        ltnueve.setOpaque(true);
        ltnueve.setBorder(blackline);
        panelizq.add(ltnueve);

        JLabel ltoro = new JLabel("+- 5%", SwingConstants.RIGHT);
        ltoro.setBounds(430, 480, 100, 30);
        ltoro.setForeground(Color.black);
        ltoro.setBackground(Color.yellow);
        ltoro.setOpaque(true);
        ltoro.setBorder(blackline);
        panelizq.add(ltoro);

        JLabel ltplata = new JLabel("+- 10%", SwingConstants.RIGHT);
        ltplata.setBounds(430, 520, 100, 30);
        ltplata.setForeground(Color.black);
        ltplata.setBackground(Color.gray);
        ltplata.setOpaque(true);
        ltplata.setBorder(blackline);
        panelizq.add(ltplata);

        JLabel ltnin = new JLabel("+- 20%", SwingConstants.RIGHT);
        ltnin.setBounds(430, 560, 100, 30);
        ltnin.setForeground(Color.black);
        ltnin.setBackground(Color.decode("#e2e2e2"));
        ltnin.setOpaque(true);
        ltnin.setBorder(blackline);
        panelizq.add(ltnin);

        /* Alta labels resistencia
         *
         */

        JLabel cres = new JLabel("");
        cres.setBounds(150, 30, 300, 80);
        cres.setBackground(Color.black);
        cres.setOpaque(true);
        cres.setBorder(blackline);
        panelder.add(cres);

        JLabel cresp1 = new JLabel("");
        cresp1.setBounds(70, 70, 100, 10);
        cresp1.setBackground(Color.black);
        cresp1.setOpaque(true);
        cresp1.setBorder(blackline);
        panelder.add(cresp1);

        JLabel cresp2 = new JLabel("");
        cresp2.setBounds(440, 70, 100, 10);
        cresp2.setBackground(Color.black);
        cresp2.setOpaque(true);
        cresp2.setBorder(blackline);
        panelder.add(cresp2);

        //labels resistencias
        JLabel cres1 = new JLabel("");
        cres1.setBounds(40, 0, 20, 100);
        cres1.setBackground(Color.BLACK);
        cres1.setOpaque(true);
        cres1.setBorder(blackline);
        cres.add(cres1);

        JLabel cres2 = new JLabel("");
        cres2.setBounds(80, 0, 20, 100);
        cres2.setBackground(Color.BLACK);
        cres2.setOpaque(true);
        cres2.setBorder(blackline);
        cres.add(cres2);

        JLabel cres3 = new JLabel("");
        cres3.setBounds(120, 0, 20, 100);
        cres3.setBackground(Color.BLACK);
        cres3.setOpaque(true);
        cres3.setBorder(blackline);
        cres.add(cres3);

        JLabel cres4 = new JLabel("");
        cres4.setBounds(200, 0, 20, 100);
        cres4.setBackground(Color.BLACK);
        cres4.setOpaque(true);
        cres4.setBorder(blackline);
        cres.add(cres4);

        JLabel indica = new JLabel("", SwingConstants.CENTER);
        indica.setBounds(150, 200, 300, 30);
        indica.setBackground(Color.BLACK);
        indica.setForeground(Color.white);
        indica.setOpaque(true);
        indica.setBorder(blackline);
        panelder.add(indica);

        JLabel banda1 = new JLabel("Primer Color", SwingConstants.CENTER);
        banda1.setBounds(50, 250, 250, 30);
        banda1.setForeground(Color.black);
        banda1.setBorder(blackline);
        panelder.add(banda1);

        JLabel banda1res = new JLabel("", SwingConstants.CENTER);
        banda1res.setBounds(320, 250, 250, 30);
        banda1res.setForeground(Color.black);
        banda1res.setBorder(blackline);
        panelder.add(banda1res);

        JLabel banda2 = new JLabel("Segundo Color", SwingConstants.CENTER);
        banda2.setBounds(50, 290, 250, 30);
        banda2.setForeground(Color.black);
        banda2.setBorder(blackline);
        panelder.add(banda2);

        JLabel banda2res = new JLabel("", SwingConstants.CENTER);
        banda2res.setBounds(320, 290, 250, 30);
        banda2res.setForeground(Color.black);
        banda2res.setBorder(blackline);
        panelder.add(banda2res);

        JLabel banda3 = new JLabel("Multiplicador", SwingConstants.CENTER);
        banda3.setBounds(50, 330, 250, 30);
        banda3.setForeground(Color.black);
        banda3.setBorder(blackline);
        panelder.add(banda3);

        JLabel banda3res = new JLabel("", SwingConstants.CENTER);
        banda3res.setBounds(320, 330, 250, 30);
        banda3res.setForeground(Color.black);
        banda3res.setBorder(blackline);
        panelder.add(banda3res);

        JLabel banda5 = new JLabel("Valor De Resistencia", SwingConstants.CENTER);
        banda5.setBounds(50, 370, 250, 30);
        banda5.setForeground(Color.black);
        banda5.setBorder(blackline);
        panelder.add(banda5);

        JLabel banda5res = new JLabel("", SwingConstants.CENTER);
        banda5res.setBounds(320, 370, 250, 30);
        banda5res.setForeground(Color.black);
        banda5res.setBorder(blackline);
        panelder.add(banda5res);

        JLabel banda6 = new JLabel("Rango Min", SwingConstants.CENTER);
        banda6.setBounds(50, 410, 250, 30);
        banda6.setForeground(Color.black);
        banda6.setBorder(blackline);
        panelder.add(banda6);

        JLabel banda6res = new JLabel("", SwingConstants.CENTER);
        banda6res.setBounds(320, 410, 250, 30);
        banda6res.setForeground(Color.black);
        banda6res.setBorder(blackline);
        panelder.add(banda6res);

        JLabel banda7 = new JLabel("Rango Max", SwingConstants.CENTER);
        banda7.setBounds(50, 450, 250, 30);
        banda7.setForeground(Color.black);
        banda7.setBorder(blackline);
        panelder.add(banda7);

        JLabel banda7res = new JLabel("", SwingConstants.CENTER);
        banda7res.setBounds(320, 450, 250, 30);
        banda7res.setForeground(Color.black);
        banda7res.setBorder(blackline);
        panelder.add(banda7res);

        //color - checkbox
        JCheckBox nbox = new JCheckBox("Negro");
        nbox.setBackground(Color.black);
        nbox.setForeground(Color.white);
        nbox.setBounds(40, 80, 100, 30);
        nbox.setBorder(blackline);
        nbox.setBorderPainted(true);
        nbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("0");
                    cres1.setBackground(Color.black);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("0");
                    cres2.setBackground(Color.black);
                    indica.setText("Selecciona Multiplicador");
                    nbox.setSelected(true);

                }
            }
        });
        panelizq.add(nbox);

        JCheckBox cafebox = new JCheckBox("Cafe");
        cafebox.setBackground(Color.decode("#a75e11"));
        cafebox.setForeground(Color.black);
        cafebox.setBounds(40, 120, 100, 30);
        cafebox.setBorder(blackline);
        cafebox.setBorderPainted(true);
        cafebox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("1");
                    cres1.setBackground(Color.decode("#a75e11"));
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("1");
                    cres2.setBackground(Color.decode("#a75e11"));
                    indica.setText("Selecciona Multiplicador");
                    cafebox.setSelected(true);
                }
            }
        });
        panelizq.add(cafebox);

        JCheckBox redbox = new JCheckBox("Rojo");
        redbox.setBackground(Color.red);
        redbox.setForeground(Color.black);
        redbox.setBounds(40, 160, 100, 30);
        redbox.setBorder(blackline);
        redbox.setBorderPainted(true);
        redbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("2");
                    cres1.setBackground(Color.red);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("2");
                    cres2.setBackground(Color.red);
                    indica.setText("Selecciona Multiplicador");
                    redbox.setSelected(true);
                }
            }
        });
        panelizq.add(redbox);

        JCheckBox nabox = new JCheckBox("Naranja");
        nabox.setBackground(Color.orange);
        nabox.setForeground(Color.black);
        nabox.setBounds(40, 200, 100, 30);
        nabox.setBorder(blackline);
        nabox.setBorderPainted(true);
        nabox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("3");
                    cres1.setBackground(Color.ORANGE);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("3");
                    cres2.setBackground(Color.ORANGE);
                    indica.setText("Selecciona Multiplicador");
                    nabox.setSelected(true);
                }
            }
        });
        panelizq.add(nabox);

        JCheckBox amabox = new JCheckBox("Amarillo");
        amabox.setBackground(Color.yellow);
        amabox.setForeground(Color.black);
        amabox.setBounds(40, 240, 100, 30);
        amabox.setBorder(blackline);
        amabox.setBorderPainted(true);
        amabox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("4");
                    cres1.setBackground(Color.yellow);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("4");
                    cres2.setBackground(Color.yellow);
                    indica.setText("Selecciona Multiplicador");
                    amabox.setSelected(true);
                }
            }
        });
        panelizq.add(amabox);

        JCheckBox vebox = new JCheckBox("Verde");
        vebox.setBackground(Color.green);
        vebox.setForeground(Color.black);
        vebox.setBounds(40, 280, 100, 30);
        vebox.setBorder(blackline);
        vebox.setBorderPainted(true);
        vebox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("5");
                    cres1.setBackground(Color.green);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("5");
                    cres2.setBackground(Color.green);
                    indica.setText("Selecciona Multiplicador");
                    vebox.setSelected(true);
                }
            }
        });
        panelizq.add(vebox);

        JCheckBox azbox = new JCheckBox("Azul");
        azbox.setBackground(Color.blue);
        azbox.setForeground(Color.black);
        azbox.setBounds(40, 320, 100, 30);
        azbox.setBorder(blackline);
        azbox.setBorderPainted(true);
        azbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("6");
                    cres1.setBackground(Color.blue);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("6");
                    cres2.setBackground(Color.blue);
                    indica.setText("Selecciona Multiplicador");
                    azbox.setSelected(true);
                }
            }
        });
        panelizq.add(azbox);

        JCheckBox vibox = new JCheckBox("Violeta");
        vibox.setBackground(Color.pink);
        vibox.setForeground(Color.black);
        vibox.setBounds(40, 360, 100, 30);
        vibox.setBorder(blackline);
        vibox.setBorderPainted(true);
        vibox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("7");
                    cres1.setBackground(Color.pink);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("7");
                    cres2.setBackground(Color.pink);
                    indica.setText("Selecciona Multiplicador");
                    vibox.setSelected(true);
                }
            }
        });
        panelizq.add(vibox);

        JCheckBox gbox = new JCheckBox("Gris");
        gbox.setBackground(Color.gray);
        gbox.setForeground(Color.black);
        gbox.setBounds(40, 400, 100, 30);
        gbox.setBorder(blackline);
        gbox.setBorderPainted(true);
        gbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("8");
                    cres1.setBackground(Color.gray);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("8");
                    cres2.setBackground(Color.gray);
                    indica.setText("Selecciona Multiplicador");
                    gbox.setSelected(true);
                }
            }
        });
        panelizq.add(gbox);

        JCheckBox blbox = new JCheckBox("Blanco");
        blbox.setBackground(Color.white);
        blbox.setForeground(Color.black);
        blbox.setBounds(40, 440, 100, 30);
        blbox.setBorder(blackline);
        blbox.setBorderPainted(true);
        blbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (banda1res.getText().isEmpty()){
                    banda1res.setText("9");
                    cres1.setBackground(Color.white);
                    indica.setForeground(Color.white);
                    indica.setText("Selecciona Segundo Color");
                }
                else{
                    banda2res.setText("9");
                    cres2.setBackground(Color.white);
                    indica.setText("Selecciona Multiplicador");
                    blbox.setSelected(true);
                }
            }
        });
        panelizq.add(blbox);

        JCheckBox orobox = new JCheckBox("Oro");
        orobox.setBackground(Color.yellow);
        orobox.setForeground(Color.black);
        orobox.setBounds(40, 480, 100, 30);
        orobox.setBorder(blackline);
        orobox.setBorderPainted(true);
        orobox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indica.setText("Click A Boton Calcular");
                cres4.setBackground(Color.yellow);
            }
        });
        panelizq.add(orobox);

        JCheckBox plbox = new JCheckBox("Plata");
        plbox.setBackground(Color.gray);
        plbox.setForeground(Color.black);
        plbox.setBounds(40, 520, 100, 30);
        plbox.setBorder(blackline);
        plbox.setBorderPainted(true);
        plbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indica.setText("Click A Boton Calcular");
                cres4.setBackground(Color.gray);
            }
        });
        panelizq.add(plbox);

        JCheckBox nnbox = new JCheckBox("Ninguna");
        nnbox.setBackground(Color.decode("#e2e2e2"));
        nnbox.setForeground(Color.black);
        nnbox.setBounds(40, 560, 100, 30);
        nnbox.setBorder(blackline);
        nnbox.setBorderPainted(true);
        nnbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indica.setText("Click A Boton Calcular");
                cres4.setBackground(Color.white);
            }
        });
        panelizq.add(nnbox);

        //multiplicador - Jcheckbox
        JCheckBox n1box = new JCheckBox("1");
        n1box.setHorizontalTextPosition(SwingConstants.RIGHT);
        n1box.setBackground(Color.black);
        n1box.setForeground(Color.white);
        n1box.setBounds(300, 80, 100, 30);
        n1box.setBorder(blackline);
        n1box.setBorderPainted(true);
        n1box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("1");
                cres3.setBackground(Color.BLACK);
                indica.setText("Selecciona Tolerancia");

            }
        });
        panelizq.add(n1box);

        JCheckBox cafebox2 = new JCheckBox("10");
        cafebox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        cafebox2.setBackground(Color.decode("#a75e11"));
        cafebox2.setForeground(Color.black);
        cafebox2.setBounds(300, 120, 100, 30);
        cafebox2.setBorder(blackline);
        cafebox2.setBorderPainted(true);
        cafebox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("10");
                cres3.setBackground(Color.decode("#a75e11"));
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(cafebox2);

        JCheckBox redbox2 = new JCheckBox("100");
        redbox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        redbox2.setBackground(Color.red);
        redbox2.setForeground(Color.black);
        redbox2.setBounds(300, 160, 100, 30);
        redbox2.setBorder(blackline);
        redbox2.setBorderPainted(true);
        redbox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("100");
                cres3.setBackground(Color.red);
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(redbox2);

        JCheckBox nabox2 = new JCheckBox("1000");
        nabox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        nabox2.setBackground(Color.orange);
        nabox2.setForeground(Color.black);
        nabox2.setBounds(300, 200, 100, 30);
        nabox2.setBorder(blackline);
        nabox2.setBorderPainted(true);
        nabox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("1000");
                cres3.setBackground(Color.orange);
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(nabox2);

        JCheckBox amabox2 = new JCheckBox("10000");
        amabox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        amabox2.setBackground(Color.yellow);
        amabox2.setForeground(Color.black);
        amabox2.setBounds(300, 240, 100, 30);
        amabox2.setBorder(blackline);
        amabox2.setBorderPainted(true);
        amabox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("10000");
                cres3.setBackground(Color.yellow);
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(amabox2);

        JCheckBox vebox2 = new JCheckBox("100000");
        vebox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        vebox2.setBackground(Color.green);
        vebox2.setForeground(Color.black);
        vebox2.setBounds(300, 280, 100, 30);
        vebox2.setBorder(blackline);
        vebox2.setBorderPainted(true);
        vebox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("100000");
                cres3.setBackground(Color.green);
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(vebox2);

        JCheckBox azbox2 = new JCheckBox("1000000");
        azbox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        azbox2.setBackground(Color.blue);
        azbox2.setForeground(Color.black);
        azbox2.setBounds(300, 320, 100, 30);
        azbox2.setBorder(blackline);
        azbox2.setBorderPainted(true);
        azbox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("1000000");
                cres3.setBackground(Color.blue);
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(azbox2);

        JCheckBox vibox2 = new JCheckBox("10000000");
        vibox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        vibox2.setBackground(Color.pink);
        vibox2.setForeground(Color.black);
        vibox2.setBounds(300, 360, 100, 30);
        vibox2.setBorder(blackline);
        vibox2.setBorderPainted(true);
        vibox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("10000000");
                cres3.setBackground(Color.pink);
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(vibox2);

        JCheckBox gbox2 = new JCheckBox("100000000");
        gbox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        gbox2.setBackground(Color.gray);
        gbox2.setForeground(Color.black);
        gbox2.setBounds(300, 400, 100, 30);
        gbox2.setBorder(blackline);
        gbox2.setBorderPainted(true);
        gbox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("100000000");
                cres3.setBackground(Color.gray);
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(gbox2);

        JCheckBox blbox2 = new JCheckBox("1000000000");
        blbox2.setHorizontalTextPosition(SwingConstants.RIGHT);
        blbox2.setBackground(Color.white);
        blbox2.setForeground(Color.black);
        blbox2.setBounds(300, 440, 100, 30);
        blbox2.setBorder(blackline);
        blbox2.setBorderPainted(true);
        blbox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banda3res.setText("1000000000");
                cres3.setBackground(Color.white);
                indica.setText("Selecciona Tolerancia");
            }
        });
        panelizq.add(blbox2);

        /* botones
         *
         */
        JButton breset = new JButton("Resetear Resistencia");
        breset.setHorizontalTextPosition(SwingConstants.CENTER);
        breset.setBackground(Color.black);
        breset.setForeground(Color.white);
        breset.setBounds(490,670,300,40);
        breset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox resetCheckbox = null;
                for (Component c:panelizq.getComponents()){
                    if (c.getClass().toString().contains("javax.swing.JCheckBox")){
                        resetCheckbox = (JCheckBox)c;
                        resetCheckbox.setSelected(false);
                    }
                }
                //Labels
                banda1res.setText("");
                banda2res.setText("");
                banda3res.setText("");

                banda5res.setText("");
                banda6res.setText("");
                banda7res.setText("");
                cres1.setBackground(Color.black);
                cres2.setBackground(Color.black);
                cres3.setBackground(Color.black);
                cres4.setBackground(Color.black);
            }
        });
        add(breset);

        JButton bcalc = new JButton("Calcular Resistencia");
        bcalc.setHorizontalTextPosition(SwingConstants.CENTER);
        bcalc.setBackground(Color.black);
        bcalc.setForeground(Color.white);
        bcalc.setBounds(40,670,300,40);
        bcalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double []espacio = new double[8];
                String pcolor = String.format(banda1res.getText());
                String scolor = String.format(banda2res.getText());
                Double t = Double.parseDouble(banda3res.getText());

                String ps = pcolor+scolor;
                espacio[1] = Double.parseDouble(ps);
                espacio[2] = espacio[1];

                if (orobox.isSelected() == true){
                    int valor = (int) (espacio[2]*t);
                    banda5res.setText(String.format(valor + (" ohm")));
                    espacio[3] = ((valor) *(0.05));

                    espacio[4] =(valor)-(espacio[3]);
                    banda6res.setText(String.format(espacio[4] + (" ohm")));

                    espacio[5] =(valor)+(espacio[3]);
                    banda7res.setText(String.format(espacio[5] + (" ohm")));
            }
                else if (plbox.isSelected() == true){
                    int valor = (int) (espacio[2]*t);
                    banda5res.setText(String.format(valor + (" ohm")));
                    espacio[3] = ((valor) *(0.1));

                    espacio[4] =(valor)-(espacio[3]);
                    banda6res.setText(String.format(espacio[4] + (" ohm")));

                    espacio[5] =(valor)+(espacio[3]);
                    banda7res.setText(String.format(espacio[5] + (" ohm")));
                }

                if (nnbox.isSelected() == true){
                    int valor = (int) (espacio[2]*t);
                    banda5res.setText(String.format(valor + (" ohm")));
                    espacio[3] = ((valor) *(0.2));

                    espacio[4] =(valor)-(espacio[3]);
                    banda6res.setText(String.format(espacio[4] + (" ohm")));

                    espacio[5] =(valor)+(espacio[3]);
                    banda7res.setText(String.format(espacio[5] + (" ohm")));
                }
            }
        });
        add(bcalc);
        this.setVisible(true);

    }

        public static void main (String[]args){
            menu xx = new menu();
            xx.alta();
        }
    }




