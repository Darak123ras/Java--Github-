/*
 * https://www.codechef.com/learn/course/linked-lists/LINKEDLIST02/problems/LINK02P10
 */


public class MusicPlayer {
    private static class MyDoublyList {

        private class node {
            int value;
            node next;
            node prev;

            public node(int val) {
                this.value = val;
                this.next = null;
                this.prev = null;
            }
        }

        node head;
        node cur;
        
        // It is suggested to maintain head pointer for the first element of the list and cur pointer for the current song node
        public MyDoublyList(){
            head=null;
            cur=null;
        }

        public void addSong(int songId){
            node newsong = new node(songId);
            // Consider the case when list is empty too
            if(head==null){
                cur=newsong;
                head=newsong;
            }else{
                node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newsong;
                newsong.prev = temp;
            }
            
            
        }

        public void nextSong(){
            if (cur != null && cur.next != null) {
                cur = cur.next;
            }
        }

        public void prevSong(){
           if (cur != null && cur.prev != null) {
                cur = cur.prev;
            }
        }

        public void switchSong(int songId){
           node temp = head;
            while (temp != null) {
                if (temp.value == songId) {
                    cur = temp; 
                    break;
                }
                temp = temp.next;
            }
        }

        public int current(){
            if (cur != null) {
                return cur.value;
            }
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyDoublyList list = new MyDoublyList();
        while(n>0){
            int q = sc.nextInt();
            if(q==1){
                int songId = sc.nextInt();
                list.addSong(songId);
            }
            else if(q==2){
                list.nextSong();
            }
            else if(q==3){
                list.prevSong();
            }
            else if(q==4){
                int songId = sc.nextInt();
                list.switchSong(songId);
            }
            else{
                int ans = list.current();
                System.out.println(ans);
            }
            n--;
        }
    }
}
