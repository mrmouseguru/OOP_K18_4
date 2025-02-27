
public class SinhVien {
	
	//ô 2 - biến đối tượng
	//field, attribute
	int maSV;
	String hoTen;
	float diemLT;
	float diemTH;
	
	//ô3
	SinhVien()
	{
		maSV = 0;
		hoTen = null;
		diemLT = 0;
		diemTH = 0;
	}
	
	SinhVien(int _maSV, String _hoTen, float _diemLT, 
			float _diemTH)
	{
		maSV = _maSV;
		hoTen = _hoTen;
		diemLT = _diemLT;
		diemTH = _diemTH;
	}
	
	//phương thức - method
	float tinhDiemTrungBinh() {
		float diemTB;
		diemTB = (diemLT + diemTH)/2;
		return diemTB;
		
	}

}
