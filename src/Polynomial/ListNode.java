package Polynomial;

public class ListNode {
    int coef; //계수의 coefficient
    int expo; //지수의 exponent
    ListNode next;

    public ListNode(){
        next = null;
    }

    public ListNode(int coef, int expo){
        this.coef = coef;
        this.expo = expo;
        this.next = next;
    }

    public int getCoef(){
        return this.coef;
    }

    public int getExpo(){
        return this.expo;
    }
}