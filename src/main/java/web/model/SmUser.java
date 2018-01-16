package web.model;

public class SmUser {
    private String useroid;

    private String usnum;

    private String uspassword;

    private Integer uslimit;

    private String uscollege;

    private String usschool;

    private Integer usstate;

    public SmUser(String useroid, String usnum, String uspassword, Integer uslimit, String uscollege, String usschool, Integer usstate) {
        this.useroid = useroid;
        this.usnum = usnum;
        this.uspassword = uspassword;
        this.uslimit = uslimit;
        this.uscollege = uscollege;
        this.usschool = usschool;
        this.usstate = usstate;
    }

    public SmUser() {
        super();
    }

    public String getUseroid() {
        return useroid;
    }

    public void setUseroid(String useroid) {
        this.useroid = useroid == null ? null : useroid.trim();
    }

    public String getUsnum() {
        return usnum;
    }

    public void setUsnum(String usnum) {
        this.usnum = usnum == null ? null : usnum.trim();
    }

    public String getUspassword() {
        return uspassword;
    }

    public void setUspassword(String uspassword) {
        this.uspassword = uspassword == null ? null : uspassword.trim();
    }

    public Integer getUslimit() {
        return uslimit;
    }

    public void setUslimit(Integer uslimit) {
        this.uslimit = uslimit;
    }

    public String getUscollege() {
        return uscollege;
    }

    public void setUscollege(String uscollege) {
        this.uscollege = uscollege == null ? null : uscollege.trim();
    }

    public String getUsschool() {
        return usschool;
    }

    public void setUsschool(String usschool) {
        this.usschool = usschool == null ? null : usschool.trim();
    }

    public Integer getUsstate() {
        return usstate;
    }

    public void setUsstate(Integer usstate) {
        this.usstate = usstate;
    }
}