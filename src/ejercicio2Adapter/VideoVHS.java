package ejercicio2Adapter;

public class VideoVHS {

	public CintaVHS cinta;

	public void setCinta(CintaVHS c1) {
		this.cinta = c1;
	}

	public void reproducirCinta() {
		this.cinta.reproducirVHS();
	}
}
