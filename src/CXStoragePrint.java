import java.util.ArrayList;

public class CXStoragePrint {
	
	// ô 2
	
	
	// ô 3
	ArrayList<CXNoiThanh> getDSCXNoi(){
		ArrayList<CXNoiThanh> dsNoi;
		
		//gọi đến hàm getCXNoi() 
		//của lớp MemoryCXB
		//thông qua tên class
		dsNoi = MemoryCXDB.getCXNoi();
		return dsNoi;
		
	}
	
	ArrayList<CXNgoaiThanh> getDSCXNgoai(){
		return MemoryCXDB.getCXNgoai();
	}

}
