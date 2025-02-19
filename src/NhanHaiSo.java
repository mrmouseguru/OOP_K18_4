
public class NhanHaiSo {
	
	//biến
	float number1;
	float number2;
	
	
	//hàm
	NhanHaiSo(){
		
	}
	
	NhanHaiSo(float n1, float n2)
	{
		number1 = n1;
		number2 = n2;
	}
	
	float tinhTich2So() {
		return number1 * number2;
	}

}
