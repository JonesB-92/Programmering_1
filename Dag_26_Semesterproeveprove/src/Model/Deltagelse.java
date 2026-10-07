package Model;

public class Deltagelse {
    private boolean registreret = false;
    private DeltagerStatus status = DeltagerStatus.TILSTEDE;
    //Link
    private Lektion lektion;
    private Student studerende;


    //Deltagelse objekt altid værdien false i registreret og TILSTEDE i status.
    //Skal have én studerende.
    public Deltagelse(Lektion lektion, Student studerende) {
        this.registreret = false;
        this.status = DeltagerStatus.TILSTEDE;
        this.lektion = lektion;
        this.studerende = studerende;
    }

    public boolean isRegistreret() {
        return registreret;
    }

    public Student getStuderende(){
        return studerende;
    }

    public DeltagerStatus getStatus() {
        return status;
    }

    public Lektion getLektion() {
        return lektion;
    }

    public void setRegistreret(boolean registreret) {
        this.registreret = registreret;
    }

    public void setStatus(DeltagerStatus status) {
        this.status = status;
    }

    public void setLektion(Lektion lektion) {
        this.lektion = lektion;
    }

    public void setStuderende(Student studerende) {
        this.studerende = studerende;
    }

    //Tilføj til klassen Deltagelse metoden erRegistreretFraværende(): boolean, der returnerer,
    //hvorvidt den studerende er registreret fraværende i den pågældende lektion.
    public boolean erRegistreretFraværende() {
        return registreret && status != DeltagerStatus.TILSTEDE;
    }


}
