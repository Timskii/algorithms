package addTwoNumbers;



public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        /*Example 1:
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.*/

        ListNode listNode = new ListNode(new int[]{2,4,3});
        ListNode listNode2 =  new ListNode(new int[]{5,6,4});
        ListNode result = solution.addTwoNumbers(listNode, listNode2);
        System.out.println(result.val);

        /* Example 2:
        Input: l1 = [0], l2 = [0]
        Output: [0]*/

        listNode = new ListNode(new int[]{0});
        listNode2 =  new ListNode(new int[]{0});
        result = solution.addTwoNumbers(listNode, listNode2);
        System.out.println(result.val);

        /* Example 3:
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]*/


         listNode = new ListNode(new int[]{9,9,9,9,9,9,9});
         listNode2 =  new ListNode(new int[]{9,9,9,9});
         result = solution.addTwoNumbers(listNode, listNode2);
         System.out.println(result.val);
    }
}
