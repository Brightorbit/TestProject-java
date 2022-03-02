package Polynomial;

import java.util.List;

public class Main {
    public static void main(String[]args){
        System.out.println();
        System.out.print("다항식 A >> ");
        Polynomial A = new Polynomial();
        A.insertNode(4,3);
        A.insertNode(3,2);
        A.insertNode(5,1);
        A.print();
        System.out.println();

        System.out.print("다항식 B >> ");
        Polynomial B = new Polynomial();
        B.insertNode(3,4);
        B.insertNode(1,3);
        B.insertNode(2,1);
        B.insertNode(1,0);
        B.print();
        System.out.println();

        System.out.println("다항식 A와 B를 합친 C를 출력합니다...");
        System.out.print("다항식 C >> ");
        Polynomial C = AddPolynomial(A,B);
        C.print();
        System.out.println();

        System.out.println("다항식 A와 B를 곱한 D를 출력합니다..");
        System.out.print("다항식 D >> ");
        Polynomial D = MultPolynomial(A,B);
        D.print();
        System.out.println();
    }

    static Polynomial AddPolynomial (Polynomial A, Polynomial B){
        ListNode a = A.head;
        ListNode b = B.head;
        Polynomial C = new Polynomial();

        while(a != null && b != null){
            if(a.expo < b.expo){
                C.insertNode(b.coef, b.expo);
                b = b.next;
            }
            else if(a.expo > b.expo){
                C.insertNode(a.coef,a.expo);
                a = a.next;
            }
            else {
                C.insertNode(a.coef + b.coef, a.expo);
                a = a.next;
                b = b.next;
            }
        }

        while(a != null){
            C.insertNode(a.coef, a.expo);
            a = a.next;
        }

        while(b != null){
            C.insertNode(b.coef, b.expo);
            b = b.next;
        }
        return C;
    }

    /*static Polynomial MultPolynomial(Polynomial A, Polynomial B){
        ListNode a = A.head;
        ListNode b = B.head;
        ListNode b_F = b;
        Polynomial D = new Polynomial(); //최종
        Polynomial F = new Polynomial(); //중간 곱한거 더하는 다항식

        while(a != null && b != null){
            if(b != null){
                F.insertNode(a.coef * b.coef, a.expo + b.expo);
                b = b.next;
            }
            else{
                a = a.next;
                if(a == null){
                    break;
                }
                b = b_F;
                System.out.println(b);
                D = AddPolynomial(D,F);
                F.head = null;
            }
        }

        return D;
    }*/

    static Polynomial MultPolynomial(Polynomial A, Polynomial B){
        ListNode a = A.head;
        ListNode b = B.head;
        while(false){

        }
    }
}
