# Day29-greedy-part3

● 1005.K次取反后最大化的数组和 

先排序，然后从前往后把数字正负转换直到此数字比后一个数字小或者到达终点。代表目前数字是绝对值最小的。

● 134. 加油站

思路：如果全部的gas 减去 cost小于0，那么一定走不完所有的地点。然后一开始先设置起始点为0点，如果到一个点当前gas减去cost为负的，那么设置起始点为下一个点。

● 135. 分发糖果  

先初始所有小孩都有一颗糖果，然后从左到右遍历，如果一个小孩的rating比左边的小孩大，那么这个小孩的糖果数量就是左边小孩的数量加一。然后从右向左遍历，如果一个小孩的rating比右边小孩的大，那么这个小孩的糖果数量就是本身糖果数量和右边小孩的糖果数量加一的最大值。
