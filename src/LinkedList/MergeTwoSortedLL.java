//package LinkedList;
//
//public class MergeTwoSortedLL {
//    class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//        }
//        public Node(){
//            this.data=data;
//        }
//    }
//    public Node mergeTwoLL(Node list1,Node list2){
//        Node Dummy=new Node();
//        Node temp=Dummy;
//        while(list1!=null && list2!=null){
//            if(list1.val<list2.val){
//                temp.next=list1;
//                temp=temp.next;
//                list1=list1.next;
//            }
//            else{
//                temp.next=list2;
//                temp=temp.next;
//                list2=list2.next;
//            }
//        }
//        if(list1==null){
//            temp.next=list2;
//        }
//        if(list2==null){
//            temp.next=list1;
//        }
//        return temp.next;
//    }
//}
