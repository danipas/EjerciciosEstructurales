package ejercicio3Puente;

public class MotorMoto implements Motor {
	private String tipo;

	public MotorMoto(String _tipo) {
		this.tipo = _tipo;
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String marca) {
		this.tipo = marca;
	}

}
