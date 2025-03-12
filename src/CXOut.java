import java.io.PrintWriter;

public class CXOut {
	
	// ô 2
	PrintWriter out;
	// ô 3
	CXOut(){
		out = new PrintWriter(System.out);
	}
	
	// có 2 tham số
	
	void thongBao(CXNoiThanh cx) {
		out.println("Đã thêm thành công CX Nội thành!");
		out.flush();
//		out.println("[MA CX]: " + cx.maCX);
//		out.println("[HO TEN TX: ]" + cx.hoTenTX);
		out.println(cx);
		out.flush();
	}
	
	void thongBao(CXNgoaiThanh cx) {
		out.println("Đã thêm thành công CX Ngoại thành!");
		out.flush();
		out.println("[MA CX]: " + cx.maCX);
		out.flush();
	}

}
