package Student;

public class MainStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Marcão");
        st.setCourse("Engenharia");
        st.setEntryyear((short) 2018);
        st.setAprovediscipline((byte) 23);
        st.setTotaldiscipline((byte) 30);
    
        st.credit(st.getTotaldiscipline());
        st.yearsSpend(st.getEntryyear(), (short) 2022);

        System.out.printf("STUDENT INFO\nName: %s\nCourse: %s\nEntry Year: %d\nAproved Disciplines: %d\nTotal Disciplines: %d\nCredit: %d\nYears Spend: %d",
        st.name, st.course, st.entryyear, st.aprovediscipline, st.totaldiscipline, st.totaldiscipline, st.credit(st.getTotaldiscipline()), st.yearsSpend(st.entryyear, (short) 2022));
    }
}
