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
public class BenuaKedua {
    private String BenuaKedua = "Afrika", Negara="Mozambik", Beribukota="Maputo";
    protected void benuakedua(){
        System.out.println("Benua" +BenuaKedua);
        System.out.println("Yang salah satu negaranya" +Negara);
        System.out.println("dengan beribukota di" +Beribukota);
    }
    private String BenuaBerikut = "Afrika", Nation="Mesir", capitalcity="Kairo";
    protected void benuaberikut(){
        System.out.println("Benua" +BenuaBerikut);
        System.out.println("Yang salah satu negaranya" +Nation);
        System.out.println("dengan beribukota di" +capitalcity);
    }
    private String BenuaSetelahnya = "Afrika", country="Maroko", capital="Rabat";
    protected void benuasetelahnya(){
        System.out.println("Benua" +BenuaSetelahnya);
        System.out.println("Yang salah satu negaranya" +country);
        System.out.println("dengan beribukota di" +capital);
    }
}
