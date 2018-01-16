package web.model;

import java.util.Date;

public class SmMessage {
    private String messageoid;

    private String meuserid;

    private String meusername;

    private String meinfo;

    private String melevel;

    private Integer menews1;

    private Integer menews2;

    private Integer menews3;

    private Integer menews4;

    private Integer menews5;

    private Integer menews6;

    private Integer menews7;

    private Integer menews8;

    private String mesyllabusid;

    private Date medatetime;

    public SmMessage(String messageoid, String meuserid, String meusername, String meinfo, String melevel, Integer menews1, Integer menews2, Integer menews3, Integer menews4, Integer menews5, Integer menews6, Integer menews7, Integer menews8, String mesyllabusid, Date medatetime) {
        this.messageoid = messageoid;
        this.meuserid = meuserid;
        this.meusername = meusername;
        this.meinfo = meinfo;
        this.melevel = melevel;
        this.menews1 = menews1;
        this.menews2 = menews2;
        this.menews3 = menews3;
        this.menews4 = menews4;
        this.menews5 = menews5;
        this.menews6 = menews6;
        this.menews7 = menews7;
        this.menews8 = menews8;
        this.mesyllabusid = mesyllabusid;
        this.medatetime = medatetime;
    }

    public SmMessage() {
        super();
    }

    public String getMessageoid() {
        return messageoid;
    }

    public void setMessageoid(String messageoid) {
        this.messageoid = messageoid == null ? null : messageoid.trim();
    }

    public String getMeuserid() {
        return meuserid;
    }

    public void setMeuserid(String meuserid) {
        this.meuserid = meuserid == null ? null : meuserid.trim();
    }

    public String getMeusername() {
        return meusername;
    }

    public void setMeusername(String meusername) {
        this.meusername = meusername == null ? null : meusername.trim();
    }

    public String getMeinfo() {
        return meinfo;
    }

    public void setMeinfo(String meinfo) {
        this.meinfo = meinfo == null ? null : meinfo.trim();
    }

    public String getMelevel() {
        return melevel;
    }

    public void setMelevel(String melevel) {
        this.melevel = melevel == null ? null : melevel.trim();
    }

    public Integer getMenews1() {
        return menews1;
    }

    public void setMenews1(Integer menews1) {
        this.menews1 = menews1;
    }

    public Integer getMenews2() {
        return menews2;
    }

    public void setMenews2(Integer menews2) {
        this.menews2 = menews2;
    }

    public Integer getMenews3() {
        return menews3;
    }

    public void setMenews3(Integer menews3) {
        this.menews3 = menews3;
    }

    public Integer getMenews4() {
        return menews4;
    }

    public void setMenews4(Integer menews4) {
        this.menews4 = menews4;
    }

    public Integer getMenews5() {
        return menews5;
    }

    public void setMenews5(Integer menews5) {
        this.menews5 = menews5;
    }

    public Integer getMenews6() {
        return menews6;
    }

    public void setMenews6(Integer menews6) {
        this.menews6 = menews6;
    }

    public Integer getMenews7() {
        return menews7;
    }

    public void setMenews7(Integer menews7) {
        this.menews7 = menews7;
    }

    public Integer getMenews8() {
        return menews8;
    }

    public void setMenews8(Integer menews8) {
        this.menews8 = menews8;
    }

    public String getMesyllabusid() {
        return mesyllabusid;
    }

    public void setMesyllabusid(String mesyllabusid) {
        this.mesyllabusid = mesyllabusid == null ? null : mesyllabusid.trim();
    }

    public Date getMedatetime() {
        return medatetime;
    }

    public void setMedatetime(Date medatetime) {
        this.medatetime = medatetime;
    }
}