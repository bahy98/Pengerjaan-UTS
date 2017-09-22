/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benuapertama;

/**
 *
 * @author crowl
 */
public class BenuaKetiga {
    private String BenuaKetiga = "Eropa", Negara="Polandia", Beribukota="Warsawa";
    protected void benuaketiga(){
        System.out.println("Benua" +BenuaKetiga);
        System.out.println("Yang salah satu negaranya" +Negara);
        System.out.println("dengan beribukota di" +Beribukota);
    }
    private String BenuaSetelahnya = "Eropa", nationality="Rusia", capitalcity="Moscow";
    protected void benuasetelahnya(){
        System.out.println("Benua" +BenuaSetelahnya);
        System.out.println("Yang salah satu negaranya" +nationality);
        System.out.println("dengan beribukota di" +capitalcity);
    }
}

