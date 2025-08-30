package addTwoNumbers;

import java.util.List;

public class ListNode {
      int val;
      ListNode next;

      ListNode() {
      }

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int[] values){
          ListNode next = new ListNode();
          for (int i = 0; i < values.length; i++){
              if (i < 1 && values.length > 1) {
                  this.next = new ListNode(values[i + 1]);
                  this.val = values[i];
                  next = this.next;
              }

              if (i < values.length -1 && i > 0){
                  next.next = new ListNode(values[i+1]);
                  next = next.next;
              }
          }
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
 }
