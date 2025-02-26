
public class AppDemoBien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Biến cơ bản + Kiểu dữ liệu cơ bản
		//khai báo biến cơ bản có tên là soNguyen
		//có kiểu dữ liệu cở bản là int
		int soNguyen;
		//gán cho biến soNguyen dữ liệu là 4
		soNguyen = 4;
		
		//biến tham chiếu đối tượng + 
		//kiểu dữ liệu tham chiếu đối tượng
		//khai báo biến tham chiếu đối tượng có tên
		//là hcn có kiểu dữ liệu là HinhChuNhat
		//BƯỚC 1
		HinhChuNhat hcn;
		
		//gủi thông điệp
		hcn.tinhDienTich();
		
		//bước 3  //BƯỚC 2
		hcn =    new HinhChuNhat();
		
		//sử dụng remote hcn
		//để gửi thông điệp đến đối tượng hình chữ nhật
		//yêu cầu tính chu vi, diện tích
		hcn.tinhDienTich();

	}

}
