package web.model;

public class SmSyllabus {
    private String syllabusoid;

    private String syname;

    private String syduration;

    private Integer systartweek;

    private Integer syendweek;

    private String syteacher;

    private Integer systartclass;

    private Integer syendclass;

    private String syownerid;

    private String syownername;

    private String syowneryear;

    private String syownerterm;

    private String syaddress;

    private Integer systate;

    public SmSyllabus(String syllabusoid, String syname, String syduration, Integer systartweek, Integer syendweek, String syteacher, Integer systartclass, Integer syendclass, String syownerid, String syownername, String syowneryear, String syownerterm, String syaddress, Integer systate) {
        this.syllabusoid = syllabusoid;
        this.syname = syname;
        this.syduration = syduration;
        this.systartweek = systartweek;
        this.syendweek = syendweek;
        this.syteacher = syteacher;
        this.systartclass = systartclass;
        this.syendclass = syendclass;
        this.syownerid = syownerid;
        this.syownername = syownername;
        this.syowneryear = syowneryear;
        this.syownerterm = syownerterm;
        this.syaddress = syaddress;
        this.systate = systate;
    }

    public SmSyllabus() {
        super();
    }

    public String getSyllabusoid() {
        return syllabusoid;
    }

    public void setSyllabusoid(String syllabusoid) {
        this.syllabusoid = syllabusoid == null ? null : syllabusoid.trim();
    }

    public String getSyname() {
        return syname;
    }

    public void setSyname(String syname) {
        this.syname = syname == null ? null : syname.trim();
    }

    public String getSyduration() {
        return syduration;
    }

    public void setSyduration(String syduration) {
        this.syduration = syduration == null ? null : syduration.trim();
    }

    public Integer getSystartweek() {
        return systartweek;
    }

    public void setSystartweek(Integer systartweek) {
        this.systartweek = systartweek;
    }

    public Integer getSyendweek() {
        return syendweek;
    }

    public void setSyendweek(Integer syendweek) {
        this.syendweek = syendweek;
    }

    public String getSyteacher() {
        return syteacher;
    }

    public void setSyteacher(String syteacher) {
        this.syteacher = syteacher == null ? null : syteacher.trim();
    }

    public Integer getSystartclass() {
        return systartclass;
    }

    public void setSystartclass(Integer systartclass) {
        this.systartclass = systartclass;
    }

    public Integer getSyendclass() {
        return syendclass;
    }

    public void setSyendclass(Integer syendclass) {
        this.syendclass = syendclass;
    }

    public String getSyownerid() {
        return syownerid;
    }

    public void setSyownerid(String syownerid) {
        this.syownerid = syownerid == null ? null : syownerid.trim();
    }

    public String getSyownername() {
        return syownername;
    }

    public void setSyownername(String syownername) {
        this.syownername = syownername == null ? null : syownername.trim();
    }

    public String getSyowneryear() {
        return syowneryear;
    }

    public void setSyowneryear(String syowneryear) {
        this.syowneryear = syowneryear == null ? null : syowneryear.trim();
    }

    public String getSyownerterm() {
        return syownerterm;
    }

    public void setSyownerterm(String syownerterm) {
        this.syownerterm = syownerterm == null ? null : syownerterm.trim();
    }

    public String getSyaddress() {
        return syaddress;
    }

    public void setSyaddress(String syaddress) {
        this.syaddress = syaddress == null ? null : syaddress.trim();
    }

    public Integer getSystate() {
        return systate;
    }

    public void setSystate(Integer systate) {
        this.systate = systate;
    }
}