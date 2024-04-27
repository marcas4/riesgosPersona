package modelo;

public class Riesgo extends Escenario{
	
	private Integer idRiesgo;
	private String riesgo;
	private String posibilidad;
	private String impacto;
	private Integer val_posibilidad;
	private Integer val_impacto;
	private double val_riesgo;
	
		
	@Override
	public String toString() {
		return "Riesgo [idRiesgo=" + idRiesgo + ", riesgo=" + riesgo + ", posibilidad=" + posibilidad + ", impacto="
				+ impacto + "]";
	}

	public Riesgo() {
		
	}
	
	public Riesgo(Integer idRiesgo, String riesgo) {
		super();
		this.idRiesgo = idRiesgo;
		this.riesgo = riesgo;
	}
	
	public Integer getIdRiesgo() {
		return idRiesgo;
	}
	public void setIdRiesgo(Integer idRiesgo) {
		this.idRiesgo = idRiesgo;
	}
	public String getRiesgo() {
		return riesgo;
	}
	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}
	public String getPosibilidad() {
		return posibilidad;
	}
	public void setPosibilidad(String posibilidad) {
		this.posibilidad = posibilidad;
	}
	public String getImpacto() {
		return impacto;
	}
	public void setImpacto(String impacto) {
		this.impacto = impacto;
	}
	
	public Integer getVal_posibilidad() {
		return val_posibilidad;
	}

	public void setVal_posibilidad(Integer val_posibilidad) {
		this.val_posibilidad = val_posibilidad;
	}

	public Integer getVal_impacto() {
		return val_impacto;
	}

	public void setVal_impacto(Integer val_impacto) {
		this.val_impacto = val_impacto;
	}

	public double getVal_riesgo() {
		return val_riesgo;
	}

	public void setVal_riesgo(double val_riesgo) {
		this.val_riesgo = val_riesgo;
	}
	
	
	
}
