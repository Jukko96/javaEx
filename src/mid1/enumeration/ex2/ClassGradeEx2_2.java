package mid1.enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        ClassGrade newClassGrade = new ClassGrade();
        System.out.println(newClassGrade.BASIC+" ClassGradeEx2_2 newClassGrade.BASIC");
        int basic = discountService.discount(newClassGrade.BASIC,price);
//        int gold = discountService.discount(newClassGrade.GOLD,price);
//        int diamond = discountService.discount(newClassGrade.DIAMOND,price);

        System.out.println("BASIC 등급의 할인 금액 : "+basic);
//        System.out.println("GOLD 등급의 할인 금액 : "+gold);
//        System.out.println("DIAMOND 등급의 할인 금액 : "+diamond);
    }
}
