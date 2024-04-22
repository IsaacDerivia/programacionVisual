package DIagnostico;

public class Jugador {
    private String dorsal;
    private personas persona;

    //constructor cargado
    public Jugador(String dorsal, personas persona) {
        this.dorsal = dorsal;
        this.persona = persona;
    }
    //getters and setters
    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public personas getPersona() {
        return persona;
    }

    public void setPersona(personas persona) {
        this.persona = persona;
    }

}
