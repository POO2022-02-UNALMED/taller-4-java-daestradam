package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo; //set get
	private String nombre; //set get
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	private Tipo(int codigo) {
		this.setCodigo(codigo);
	}

	private Tipo(int codigo,String nombre) { //public
		this.setCodigo(codigo);
		this.setNombre(nombre);
	}
}
