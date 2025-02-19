import java.util.Scanner;

public class DuLieuNhapXuat {

	//khai báo biến
	Scanner keyboardInput;
	NhanHaiSo tich2So;
	
	
	//khai báo và định nghĩa hàm
	DuLieuNhapXuat(){
		//code
		keyboardInput = new Scanner(System.in);
	}
	
	void nhapXuatDuLieu() {
		//code
		float number1;
		float number2;
		float tich = 0;
		//khởi tạo đối tượng
		System.out.print("[NHAP VAO SO THU NHAT]:");
		number1 = keyboardInput.nextFloat();
		System.out.print("[NHAP VAO SO THU HAI]:");
		number2 = keyboardInput.nextFloat();
		
		//LỜI GỌ HÀM
		//tich = tinhTich2So(number1, number2);
		tich2So = new NhanHaiSo(number1, number2);
		tich = tich2So.tinhTich2So();
		
		System.out.println("Tich 2 so: " + tich);
		return;//end
		
	}
	
}
