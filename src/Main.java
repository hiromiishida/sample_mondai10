public class Main {
    static ListElement listHead = null;

    public static void main(String[] args) {
        // あらかじめ値をセットする
        append('基');
        append('本');
        append('情');
        append('報');
        append('技');
        append('術');
        append('者');

        // セットした値の確認
        ListElement current = listHead;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }

        // 問題にある関数を呼ぶ
        delNode(3);

        // 削除されたかの確認
        current = listHead;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    private static void delNode(int pos){
        ListElement prev;
        int i;
        if(pos == 1){
            listHead = listHead.next;
        }else {
            prev = listHead;
            /* posが2を等しいときは繰り返し処理を実効しない */
            for(i = 2; i<= pos -1; i++){
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
    }

    private static void append(char qVal){
        ListElement prev, curr;

        curr = new ListElement(qVal);

        if(listHead == null) {
            listHead = curr;
        }else{
            prev = listHead;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = curr;
            curr.prev = prev;
        }
    }
}