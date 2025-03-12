import java.util.ArrayList;

public class MemoryCXDB {
	
	//ô 2
	static ArrayList<CXNoiThanh> databaseNoiThanh
	= new ArrayList<CXNoiThanh>();
	
	static ArrayList<CXNgoaiThanh> databaseNgoaiThanh
	= new ArrayList<CXNgoaiThanh>();
	
	//tạo dữ liệu sẵn có cho 2 database
	static {
		CXNoiThanh cxNoi1 = new CXNoiThanh(1111, "Le van teo", 
				"teo 11", 700, 3, 10);
		addCXNoi(cxNoi1);
		CXNgoaiThanh cxNgoai1 = new CXNgoaiThanh(222, "le van ngo", 
				"ngo 222", 900, "ca mau", 2);
		addCXNgoai(cxNgoai1);
	}
	
	//ô 3
	static void addCXNoi(CXNoiThanh cx) {
		databaseNoiThanh.add(cx);
	}
	
	static void addCXNgoai(CXNgoaiThanh cx) {
		databaseNgoaiThanh.add(cx);
	}

}
