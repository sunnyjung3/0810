
public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		동물 a동물 = new 동물();
		a동물.숨쉬다();
		
		고양이 a고양이 = new 고양이();
		a고양이.숨쉬다();
		a고양이.야옹();
		
	}

}

class 동물 {
	void 숨쉬다() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}

class 고양이 extends 동물 { 
	void 야옹() {
		System.out.println("야옹~");
	}
}


