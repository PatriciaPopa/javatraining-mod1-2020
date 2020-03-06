package classes_demo;

/* clasa in sine */
public class NumarReal {
	// campuri membru
	private long parteIntreaga;
	/* cand nu scriem nimic, modificatorul de access este package(se mai numeste si default) */
	double parteFractionara;
	public int doarDeTest;


	// constructori
	public NumarReal() {
	}

	public NumarReal(long parteIntreaga, double parteFractionara) {
		//		super();
		this.parteIntreaga = parteIntreaga;
		this.parteFractionara = parteFractionara;
	}

	public NumarReal(long parteIntreaga) {
		//		super();
		this.parteIntreaga = parteIntreaga;
	}


	// metode membru
	public long getParteIntreaga() {
		return parteIntreaga;
	}

	public void setParteIntreaga(long parteIntreaga) {
		this.parteIntreaga = parteIntreaga;
	}

	public double getParteFractionara() {
		return parteFractionara;
	}

	public void setParteFractionara(double parteFractionara) {
		this.parteFractionara = parteFractionara;
	}

	@Override
	public String toString() {
		return "NumarReal [parteIntreaga=" + parteIntreaga + ", parteFractionara=" + parteFractionara + ", doarDeTest="
				+ doarDeTest + "]";
	}

	//	@Override
	//	public String toString() {
	//		return "" + (parteIntreaga + parteFractionara);
	//	}


}
