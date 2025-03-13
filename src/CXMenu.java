import java.io.PrintWriter;
import java.util.Scanner;

public class CXMenu {
	
	// ô 2
	PrintWriter out;
	Scanner in;
	String prompt;
	CXInput cxInput;
	CXControlPrint cxControlPrint;
	
	// ô 3
	CXMenu(){
		out = new PrintWriter(System.out);
		in = new Scanner(System.in);
		prompt = "->";
		cxInput = new CXInput();
		cxControlPrint = new CXControlPrint();
	}
	
	CXMenu(PrintWriter _out,
	Scanner _in,
	String _prompt){
		out = _out;
		in = _in;
		prompt = _prompt;
		
	}
	
	CXMenu(PrintWriter _out,
			Scanner _in,
			String _prompt, CXInput _cxInput){
				//out = _out;
				//in = _in;
				//prompt = _prompt;
			//gọi hàm khởi tạo 3 tham số của chính nó
				this(_out, _in, _prompt);
				cxInput = _cxInput;
				
			}
	
	void controlLoop() {
		out.println("hãy gõ lệnh \"help\" để được hỗ trợ!!");
		out.flush();
		while(true) {
			String command;//lệnh
			out.print(prompt);
			out.flush();
			command = in.nextLine();//dừng và chờ người dùng nhập lệnh
			                       // [HELP], [ADD], [PRINT], [ABOUT], [QUIT]
			//cắt khoảng trắng ở 2 đầu command
			command = command.trim();
			
			//kiểm tra
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
			
			if("quit".equalsIgnoreCase(command)) {
				break;
			}
			
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			
			if("print".equalsIgnoreCase(command)) {
				print();
				continue;
			}
			
		}
	}

	

	private void print() {
		
		//gửi thông điệp
		cxControlPrint.printCX();
	}

	private void add() {
		// gửi thông điệp đến hành vi input()
		//của đối tượng CXInput
		cxInput.input();// đã thực hiện 3 bước rồi
	}

	private void help() {
		//code
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
		out.println("[HELP] huong dan su dung phan mem");
		out.flush();
		out.println("[ABOUT] thong tin ve PM quan lý chuyến xe");
		out.flush();
		out.println("[ADD] them mới một chuyến xe");
		out.flush();
		out.println("[PRINT] in tất cả chuyến xe");
		out.flush();
		out.println("[QUIT] thoát khỏi phần mềm");
		out.flush();
		out.println("~~~~~~~~User Help Menu~~~~~~~~");
		out.flush();
	}

}
