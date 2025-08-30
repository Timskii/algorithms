package reverseInt;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int x = 0;

        /*Example 1:
        Input: x = 123
        Output: 321*/
        x = 123;
        System.out.println(solution.reverse(x));

        /*Example 2:

        Input: x = -123
        Output: -321*/
        x = -123;
        System.out.println(solution.reverse(x));

        /*Example 3:

        Input: x = 120
        Output: 21*/

        x = 120;
        System.out.println(solution.reverse(x));
    }
}
