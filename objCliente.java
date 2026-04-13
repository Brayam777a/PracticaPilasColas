public class objCliente {
    private int id;
    private String nombre;
    private String tipoServicio;
    private String horaLLegada;
    private boolean atendido;
    public objCliente() {
    }
    public objCliente(int id, String nombre, String tipoServicio, String horaLLegada, boolean atendido) {
        this.id = id;
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.horaLLegada = horaLLegada;
        this.atendido = atendido;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoServicio() {
        return tipoServicio;
    }
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    public String getHoraLLegada() {
        return horaLLegada;
    }
    public void setHoraLLegada(String horaLLegada) {
        this.horaLLegada = horaLLegada;
    }
    public boolean isAtendido() {
        return atendido;
    }
    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
    

}
