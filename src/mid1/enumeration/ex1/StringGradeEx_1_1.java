package mid1.enumeration.ex1;


public class StringGradeEx_1_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
//        int vip = discountService.discount(StringGrade.VIP,price); // 컴파일 오류

        int basic = discountService.discount(StringGrade.BASIC,price);
        int gold = discountService.discount(StringGrade.GOLD,price);
        int diamond = discountService.discount(StringGrade.DIAMOND,price);
        System.out.println("BASIC 할인금액 : " + basic);
        System.out.println("GOLD 할인금액 : " + gold);
        System.out.println("DIAMOND 할인금액 : " + diamond);
//        System.out.println("VIP 할인금액 : " + vip);
    }
}
