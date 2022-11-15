import java.util.Scanner;

public class OderList {
	Scanner scan = new Scanner(System.in);
	private Coffee c;
	
	public void showList() {
		c = oderInput();
		System.out.println("<주문서> (직원확인용)");
		nameOutput();
		sizeOutput();
		hotAndIceOutput();
		System.out.println("결제 금액 : " + priceOutput() + "원");
	}
	
	
	private Coffee oderInput() {
		
		System.out.println("커피 메뉴를 선택하세요. 1.아메리카노 2.카페라떼 3.카페모카");
		int nameNum = scan.nextInt();
		System.out.println("커피 사이즈를 선택하세요. 1.small 2.medium 3.large");
		int sizeNum = scan.nextInt();
		System.out.println("뜨거운 음료로 주문하시겠습니까? 1번. 차가운 음료로 주문하시겠습니까? 2번.");
		int hotAndIce = scan.nextInt();
		
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
			System.out.println("올바른 값을 입력해주세요.");
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
		switch (c.getNameNum()) {
		case 1:
			return c.getAMERICANO() + sizePrice();
		case 2:
			return c.getCAFE_LATTE() + sizePrice();
		case 3:
			return c.getCAFFE_MOCHA() + sizePrice();
		default :
			return 0;
		}
	}
	public int sizePrice() {
		switch (c.getSizeNum()) {
		case 1:
			return c.getSizePrice() + 0;
		case 2:
			return c.getSizePrice() + 500;
		case 3:
			return c.getSizePrice() + 1000;
		default :
			return 0;
		}
	}
	public void hotAndIceOutput() {
		switch (c.getHotAndIce()) {
		case 1:
			System.out.println("HOT&ICE : HOT");
			break;
		case 2:
			System.out.println("HOT&ICE : ICE");
			break;
		default :
			break;
		}
	}
	public void needForCoffee() {
		switch (c.getNameNum()) {
		case 1:
			System.out.println("에스프레소 + 물");
			break;
		case 2:
			System.out.println("에스프레소 + 우유");
			break;
		case 3:
			System.out.println("에스프레소 + 우유 + 초콜릿");
			break;
		}
		switch (c.getSizeNum()) {
		case 1:
			System.out.println("small 사이즈 컵");
			break;
		case 2:
			System.out.println("medium 사이즈 컵");
			break;
		case 3:
			System.out.println("large 사이즈 컵");
			break;
		}
	}
}
