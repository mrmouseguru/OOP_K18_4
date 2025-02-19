import java.util.Scanner;

public class AppNhanHaiSo {

	public static void main(String[] args) {//begin
		// TODO Auto-generated method stub
		//lời gọi hàm
		nhapXuatDuLieu();
		return;
	}
	
	static void nhapXuatDuLieu() {//begin
		float number1;
		float number2;
		Scanner keyboardInput;
		float tich;
		//khởi tạo đối tượng
		keyboardInput = new Scanner(System.in);
		System.out.print("[NHAP VAO SO THU NHAT]:");
		number1 = keyboardInput.nextFloat();
		System.out.print("[NHAP VAO SO THU HAI]:");
		number2 = keyboardInput.nextFloat();
		
		//LỜI GỌ HÀM
		tich = tinhTich2So(number1, number2);
		
		System.out.println("Tich 2 so: " + tich);
		return;//end
	}//end
	
	static float tinhTich2So(float a, float b) {
		float result  = 0;
		result = a * b;
		return result;
	}

}
