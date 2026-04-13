public class ObjPagina {
    private String url;
    private String nombre;
    private String fecha;
    public ObjPagina() {
    }
    public ObjPagina(String url, String nombre, String fecha) {
        this.url = url;
        this.nombre = nombre;
        this.fecha = fecha;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
