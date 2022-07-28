
package Modelo;

/**
 *
 * @author Patricia Forero López
 */
public class DatosDB {
    private String nit;
    private String nombreEmpresa;
    
    private int idDepartamento;
    private String nombreDep;
    
    //Datos estructura tabla Empleados
    private int idempleado;
    private String nombreEmp;
    private String apellidos;
    private String tipoDocumento;
    private String documento;
    private String correo;
    
    
    
    public DatosDB(){
        //Inicializar las variables de empresa, departamento y empleado
        this.nit ="";
        this.nombreEmpresa="";
        this.idDepartamento= 0;
        this.nombreDep="";
        this.idempleado= 0;
        this.nombreEmp="";
        this.apellidos="";
        this.tipoDocumento="";
        this.documento="";
        this.correo="";
        
        
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
