import java.io.Serializable;

public class Matrix implements Serializable {

	public Matrix() {} 
	
	public int N;
    public double[][] A;
    public double[] B;
    
    public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public double[][] getA() {
		return A;
	}

	public void setA(double[][] a) {
		A = a;
	}

	public double[] getB() {
		return B;
	}

	public void setB(double[] b) {
		B = b;
	}
}
