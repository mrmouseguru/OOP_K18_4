import java.util.ArrayList;

public class CXControlPrint {
	
	//ô 2
	CXStoragePrint cxStoragePrint;
	CXOutPrint cxOutPrint;
	
	// ô 3
	
	public CXControlPrint() {
		cxStoragePrint = new CXStoragePrint();
		cxOutPrint = new CXOutPrint();
	}
	
	void printCX() {
		
		ArrayList<CXNoiThanh> dsNoi;
		ArrayList<CXNgoaiThanh> dsNgoai;
		//gử thông điệp đến đối tượng CXStoragePrint
		dsNoi = cxStoragePrint.getDSCXNoi();
		dsNgoai = cxStoragePrint.getDSCXNgoai();
		
		//gửi thông điệp đến đối tượng CXOUtPrint
		cxOutPrint.printAllCX(dsNoi, dsNgoai);
	}
	
	

}
