Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].

计算隔几天温度会比当日高。
思路，
以某个元素为出发点，第一想法是将后续所有元素入栈，再遍历栈顶与当前元素比较。
遍历过程中我们要找的是首个更大值的下标，某个大值后的较小值对我们毫无意义，剔除降序片段，所以我们的目标是 维护一个从栈顶至栈底递增的栈 。

根据栈后进先出的特性，要从后往前遍历数组。目的是获取下标差值，所以栈保存下标而不是值。

如果当前元素大于等于栈顶元素，则重复pop，直到栈顶元素大于当前元素，二者下标差值即为所求。
如果栈为空，说明栈中没有大于当前元素的值，保存0。
将当前元素（新的最小值）入栈。


```java
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = T.length - 1; i >= 0; i--) {
            // 循环pop，直到栈顶大于当前元素
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) stack.pop();
            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return result;


    }
}
```
