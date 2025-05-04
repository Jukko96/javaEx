package access;

public class BankAccount {
    private int valance;

    public BankAccount() {
        this.valance = 0;
    }
    public void deposit(int amount){
        if(isAmountValid(amount)){
            this.valance += amount;
        }else{
            System.out.println("유효한 금액이 아닙니다.");
        }
    }
    public void withdraw(int amount){
        if(isAmountValid(amount)&& this.valance >= amount){
//            if(this.valance >= amount){
                this.valance -= amount;
//            }else{
//                System.out.println("출금하려는 금액이 현재 잔액보다 많습니다.");
//            }
        }else{
            System.out.println("유효한 금액이 아닙니다.");
        }
    }
    private boolean isAmountValid(int amount){
        return amount > 0;
    }
    public int getValance(){
        return this.valance;
    }
}
