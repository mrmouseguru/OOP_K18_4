import java.util.Scanner;

public class AppHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code
		//khai báo biến có kiểu HinhChuNhat
		HinhChuNhat hcn;
		Scanner keyboardInput;
		float chieuDai = 0;
		float chieuRong = 0;
		float dienTich = 0;
		float chuVi = 0;
		//float chieuDai;
		//khởi tạo đối tượng Scanner
		keyboardInput = new Scanner(System.in);
		System.out.print("[CHIEU DAI]:");
		chieuDai = keyboardInput.nextFloat();
		System.out.print("[CHIEU RONG]:");
		chieuRong = keyboardInput.nextFloat();
		
		//khởi tạo đối tượng
		//sử dụng hàm khởi tạo đối tượng 
		//constructror
		hcn = new HinhChuNhat(chieuDai, chieuRong);
		//gọi hàm
		dienTich = hcn.tinhDienTich();
		chuVi = hcn.tinhChuVi();

		//hiển thị kết quả
		System.out.println("[DIEN TICH HCN]: " + dienTich);
		System.out.println("[CHU VI HCN]: " + chuVi);
	}

}
