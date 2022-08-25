package Student;
public class Student {
    public String name, course;
    public short entryyear;
    public byte aprovediscipline, totaldiscipline;

    public Student() {
    }

    public short credit(byte totaldiscipline) {
        short credit = (byte) (totaldiscipline * 4);
        return credit;
    }
    public short yearsSpend(short entryyear, short finalyear) {
        short yearsSpend =  (short) (entryyear - finalyear);
        return yearsSpend;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public short getEntryyear() {
        return entryyear;
    }
    public void setEntryyear(short entryyear) {
        this.entryyear = entryyear;
    }
    public byte getAprovediscipline() {
        return aprovediscipline;
    }
    public void setAprovediscipline(byte aprovediscipline) {
        this.aprovediscipline = aprovediscipline;
    }
    public byte getTotaldiscipline() {
        return totaldiscipline;
    }
    public void setTotaldiscipline(byte totaldiscipline) {
        this.totaldiscipline = totaldiscipline;
    }

}