package ejercicio;

public class persona {
	private String nombre,apellido,clave;
	private int cedula;
	private float saldo;

	
	public persona(int cedula,String nombre,String apellido,Float saldo,String clave) {
		this.cedula= cedula;
		this.nombre=nombre;
		this.apellido=apellido;
		this.saldo=saldo;
		this.clave=clave;
	}
	
	public int getCedula() {
		return cedula;
	}
	
	public void setCedula(int cedula) {
		this.cedula=cedula;
	}
	
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
