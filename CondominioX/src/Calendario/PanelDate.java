package Calendario;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;

public class PanelDate extends javax.swing.JLayeredPane {

    private int month;
    private int year;

    public PanelDate(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }

    private void init() {
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        sun.asTitle();
        setDate();
    }

    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  //  month jan as 0 so start from 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for (Component com : getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1); //  up 1 day
            }
        }
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new Calendario.Cell();
        mon = new Calendario.Cell();
        tue = new Calendario.Cell();
        wed = new Calendario.Cell();
        thu = new Calendario.Cell();
        fri = new Calendario.Cell();
        sat = new Calendario.Cell();
        cell8 = new Calendario.Cell();
        cell9 = new Calendario.Cell();
        cell10 = new Calendario.Cell();
        cell11 = new Calendario.Cell();
        cell12 = new Calendario.Cell();
        cell13 = new Calendario.Cell();
        cell14 = new Calendario.Cell();
        cell15 = new Calendario.Cell();
        cell16 = new Calendario.Cell();
        cell17 = new Calendario.Cell();
        cell18 = new Calendario.Cell();
        cell19 = new Calendario.Cell();
        cell20 = new Calendario.Cell();
        cell21 = new Calendario.Cell();
        cell22 = new Calendario.Cell();
        cell23 = new Calendario.Cell();
        cell24 = new Calendario.Cell();
        cell25 = new Calendario.Cell();
        cell26 = new Calendario.Cell();
        cell27 = new Calendario.Cell();
        cell28 = new Calendario.Cell();
        cell29 = new Calendario.Cell();
        cell30 = new Calendario.Cell();
        cell31 = new Calendario.Cell();
        cell32 = new Calendario.Cell();
        cell33 = new Calendario.Cell();
        cell34 = new Calendario.Cell();
        cell35 = new Calendario.Cell();
        cell36 = new Calendario.Cell();
        cell37 = new Calendario.Cell();
        cell38 = new Calendario.Cell();
        cell39 = new Calendario.Cell();
        cell40 = new Calendario.Cell();
        cell41 = new Calendario.Cell();
        cell42 = new Calendario.Cell();
        cell43 = new Calendario.Cell();
        cell44 = new Calendario.Cell();
        cell45 = new Calendario.Cell();
        cell46 = new Calendario.Cell();
        cell47 = new Calendario.Cell();
        cell48 = new Calendario.Cell();
        cell49 = new Calendario.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setText("Segunda");
        sun.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunActionPerformed(evt);
            }
        });
        add(sun);

        mon.setText("Terça");
        mon.setToolTipText("");
        mon.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monActionPerformed(evt);
            }
        });
        add(mon);

        tue.setText("Quarta");
        tue.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(tue);

        wed.setText("Quinta");
        wed.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(wed);

        thu.setText("Sexta");
        thu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(thu);

        fri.setText("Sábado");
        fri.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(fri);

        sat.setText("Domingo");
        sat.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        sat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satActionPerformed(evt);
            }
        });
        add(sat);

        cell8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell8);

        cell9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell9);

        cell10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell10);

        cell11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell14);

        cell15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell15);

        cell16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell16);

        cell17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell17);

        cell18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell18);

        cell19.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell21);

        cell22.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell22);

        cell23.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell24);

        cell25.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell25);

        cell26.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell27);

        cell28.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell28);

        cell29.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell32);

        cell33.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell34);

        cell35.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell35);

        cell36.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell36);

        cell37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell41);

        cell42.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell42);

        cell43.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell43);

        cell44.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sunActionPerformed

    private void monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monActionPerformed

    private void satActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Calendario.Cell cell10;
    private Calendario.Cell cell11;
    private Calendario.Cell cell12;
    private Calendario.Cell cell13;
    private Calendario.Cell cell14;
    private Calendario.Cell cell15;
    private Calendario.Cell cell16;
    private Calendario.Cell cell17;
    private Calendario.Cell cell18;
    private Calendario.Cell cell19;
    private Calendario.Cell cell20;
    private Calendario.Cell cell21;
    private Calendario.Cell cell22;
    private Calendario.Cell cell23;
    private Calendario.Cell cell24;
    private Calendario.Cell cell25;
    private Calendario.Cell cell26;
    private Calendario.Cell cell27;
    private Calendario.Cell cell28;
    private Calendario.Cell cell29;
    private Calendario.Cell cell30;
    private Calendario.Cell cell31;
    private Calendario.Cell cell32;
    private Calendario.Cell cell33;
    private Calendario.Cell cell34;
    private Calendario.Cell cell35;
    private Calendario.Cell cell36;
    private Calendario.Cell cell37;
    private Calendario.Cell cell38;
    private Calendario.Cell cell39;
    private Calendario.Cell cell40;
    private Calendario.Cell cell41;
    private Calendario.Cell cell42;
    private Calendario.Cell cell43;
    private Calendario.Cell cell44;
    private Calendario.Cell cell45;
    private Calendario.Cell cell46;
    private Calendario.Cell cell47;
    private Calendario.Cell cell48;
    private Calendario.Cell cell49;
    private Calendario.Cell cell8;
    private Calendario.Cell cell9;
    private Calendario.Cell fri;
    private Calendario.Cell mon;
    private Calendario.Cell sat;
    private Calendario.Cell sun;
    private Calendario.Cell thu;
    private Calendario.Cell tue;
    private Calendario.Cell wed;
    // End of variables declaration//GEN-END:variables
}
