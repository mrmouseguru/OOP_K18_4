
public class CXStorage {
	
	// ô 2
	
	// ô 3
//	CXStorage(){
//		
//	}
	
	void insertCXNoi(CXNoiThanh cx) {
		//gọi static hàm đến lớp MemoryCXDB
		//thông qua tên lớp
		MemoryCXDB.addCXNoi(cx);
	}
	
	void insertNgoai(CXNgoaiThanh cx) {
		MemoryCXDB.addCXNgoai(cx);
	}

}
