
public class AppSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bước 1 khai báo 3 biến tham chiếu đối tượng
		SinhVien sv1;
		SinhVien sv2;
		SinhVien sv3;
		float diemTBSV1;
		
		        //bước 2 khởi tạo đối tượng SinhVien
	//bước 3	
		sv1    = new SinhVien(1111, "Le Van Teo", 2, 2);
		
		//gửi thông điệp
		diemTBSV1 = sv1.tinhDiemTrungBinh();
	
		
		//in
		System.out.println("DTBSV1: " + diemTBSV1);
		System.out.println("Ho ten: " + sv1.hoTen) ;

	}

}
