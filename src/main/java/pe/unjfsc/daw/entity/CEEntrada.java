package pe.unjfsc.daw.entity;

public class CEEntrada {
	int NumeroUbicacion;
	String NombreDueño;
	String TipoVehiculo;
	String Placa;
	String Hora;
	String Moneda;
	double Precio;
	public int getNumeroUbicacion() {
		return NumeroUbicacion;
	}
	public void setNumeroUbicacion(int numeroUbicacion) {
		NumeroUbicacion = numeroUbicacion;
	}
	public String getNombreDueño() {
		return NombreDueño;
	}
	public void setNombreDueño(String nombreDueño) {
		NombreDueño = nombreDueño;
	}
	public String getTipoVehiculo() {
		return TipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		TipoVehiculo = tipoVehiculo;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}
	public String getMoneda() {
		return Moneda;
	}
	public void setMoneda(String moneda) {
		Moneda = moneda;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	@Override
	public String toString() {
		return "CEEntrada [NumeroUbicacion=" + NumeroUbicacion + ", NombreDueño=" + NombreDueño + ", TipoVehiculo="
				+ TipoVehiculo + ", Placa=" + Placa + ", Hora=" + Hora + ", Moneda=" + Moneda + ", Precio=" + Precio
				+ "]";
	}
	
}
