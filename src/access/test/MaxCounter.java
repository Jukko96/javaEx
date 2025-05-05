package access.test;

public class MaxCounter {
    private int maxCount;
    private int count;

    MaxCounter (int maxCount){
        this.count = 0;
        this.maxCount = maxCount;
    }
    public void increment(){
        if(countValid()){
            this.count += 1;
        }else{
            System.out.println("최대 수치에 도달했습니다.");
        }
    }
    public int getCount (){
        return this.count;
    }
    private boolean countValid(){
        return maxCount > count;
    }

}
