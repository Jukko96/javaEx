package poly.pay1;

public class NewPay implements Pay{
    int totalAmount = 5000;
    @Override
    public boolean pay(int amount) {
        System.out.println("new 페이 시스템과 연결합니다.");
        System.out.println(amount+"원 결재를 시도헙니다.");
        if((totalAmount - amount) >=0){
            return true;
        }else{
            return  false;
        }

    }
}
