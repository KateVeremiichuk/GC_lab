import parcs.*;

public class Part implements AM {
	public void run(AMInfo info) {
		Matrix mat = (Matrix) info.parent.readObject();
		int ccc = info.parent.readInt();
		System.out.println("Cur " + ccc);
		double CC;
		for (int k = 0; k < mat.N; ++k) {
			CC = mat.A[ccc][k] / mat.A[k][k];
			for (int j = 0; j < mat.N; ++j) {
				mat.A[ccc][j] = mat.A[ccc][j] - (CC * mat.A[k][j]);
			}
			mat.B[ccc] = mat.B[ccc] - (CC * mat.B[k]);
		}

		ccc++;
		if (ccc < mat.N) {
			point p = info.createPoint();
			channel c = p.createChannel();
			p.execute("Part");

			c.write(mat);
			c.write(ccc);
			Matrix mt = (Matrix) c.readObject();
			info.parent.write(mt);
		} else {
			info.parent.write(mat);
		}
	}
}
