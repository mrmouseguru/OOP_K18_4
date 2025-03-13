import java.io.PrintWriter;
import java.util.ArrayList;

public class CXOutPrint {
	
	// ô 2
	PrintWriter out;
	
	// ô 3
	
	public CXOutPrint() {
		out = new PrintWriter(System.out);
	}
	
	void printAllCX(ArrayList<CXNoiThanh> dsNoi,
			ArrayList<CXNgoaiThanh> dsNgoai) {
		
		//xử lý code để in
		//for-each
		for(CXNoiThanh cxNoi : dsNoi) {
			out.println(cxNoi);
			out.flush();
		}
		
		for(CXNgoaiThanh cxNgoai : dsNgoai) {
			out.println(cxNgoai);
			out.flush();
		}
		
		
	}

}
