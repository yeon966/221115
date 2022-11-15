import java.util.Scanner;

public class OderList {
	Scanner scan = new Scanner(System.in);
	private Coffee c;
	
	public void showList() {
		c = oderInput();
		System.out.println("<주문서> (직원확인용)");
		nameOutput();
		sizeOutput();
		System.out.println("결제 금액 : " + priceOutput() + "원");
	}
	
	
	public Coffee oderInput() {
		System.out.println("커피 메뉴를 선택하세요. 1.아메리카노 2.카페라떼 3.카페모카");
		int nameNum = scan.nextInt();
		System.out.println("커피 사이즈를 선택하세요. 1.small 2.medium 3.large");
		int sizeNum = scan.nextInt();
		System.out.println("뜨거운 음료입니까? true. 차가운 음료입니까? false.");
		boolean hotAndIce = scan.nextBoolean();
		
		Coffee c = new Coffee(nameNum, sizeNum, hotAndIce);
		return c;
	}
	public void nameOutput() {
		switch (c.getNameNum()) {
		case 1:
			System.out.println("선택 된 메뉴 : 아메리카노");
			break;
		case 2:
			System.out.println("선택 된 메뉴 : 카페라떼");
			break;
		case 3:
			System.out.println("선택 된 메뉴 : 카페모카");
			break;
		default :
			break;
		}
	}
	public void sizeOutput() {
		switch (c.getSizeNum()) {
		case 1:
			System.out.println("선택 된 사이즈 : small");
			break;
		case 2:
			System.out.println("선택 된 사이즈 : medium");
			break;
		case 3:
			System.out.println("선택 된 사이즈 : large");
			break;
		default :
			break;
		}
	}
	public int priceOutput() {
		int price = 0;
		switch (c.getNameNum()) {
		case 1:
			return price = c.getAMERICANO() + sizePrice();
		case 2:
			
			return price = c.getCAFE_LATTE() + sizePrice();
		case 3:
			
			return price = c.getCAFFE_MOCHA() + sizePrice();
		default :
			return 0;
		}
	}
	public int sizePrice() {
		switch (c.getSizeNum()) {
		case 1:
			return 0;
		case 2:
			return c.getSizePrice() + 500;
		case 3:
			return c.getSizePrice() + 1000;
		default :
			return 0;
		}
	}
	
}
