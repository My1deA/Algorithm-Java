package com.example.demo.algorithm.part_2;

// 11078 不能移动的石子合并
/*Description
        做如下两个模型的石子合并，如下模型石子都不能移动出列，且合并都仅发生在相邻两堆石子中：
        （1）第一个模型：一行排列且相邻合并
        有n堆石子形成一行(a1,a2,…,an，ai为第i堆石子个数)，相邻两堆可合并，合并的分值为新堆的石子数。求合并为一堆的最低得分和最高得分。

        （2）第二个模型：一圈排列且相邻合并
        有n堆石子形成首位相连的一个环形(a1,a2,…,an，ai为第i堆石子个数，an和a1相邻)，相邻两堆可合并，合并的分值为新堆的石子数。求合并为一堆的最低得分和最高得分。
        例如4堆石子，每堆石子个数：9 4 4 5
        若排成一行，最小分值：(4+4)+(8+5)+(9+13)=43，最大分值：(9+4)+(13+4)+(17+5)=52。
        若排成圈状，最小分值：(4+4)+(8+5)+(9+13)=43，最大分值：(9+5)+(14+4)+(18+4)=54。
        此题以第一模型的最低得分为例，很多同学想着采用总是从最小的相邻两堆下手的思想，认为最后获得的也就是最低得分。但这个贪心策略是不对的。

        如下反例：                                    但9 4 6 1 5 若如下方式合并：                          或
        石子：9 4 6 1 5
        贪心策略：                                     13 6 1 5 计分13                                9 4 6 6 计分6
        9 4 6 6 计分6                                 13 6 6 计分6                                   9 4 12 计分12
        9 10 6 计分10                                 13 12 计分12                                   13 12 计分13
        9 16 计分16                                   25 计分25                                      25 计分25
        25 计分25                                     13+6+12+25=56                                 6+12+13+25=56
        得分共计：6+10+16+25=57

        后两种方式合并出的56都比贪心策略的57来的更低，因为总选择最小的相邻两堆去合并，并不能保证后续每步都可以最小，也许这轮最小导致后续几轮分值较大。

        Input
        两行。第一行n，第二行a1 a2 … an，每个ai(1<=i<=n)表示第i堆石子的个数，n<=100

        Output
        两行。第一行是第一个模型的最低得分和最高得分，中间空格相连，第二行是第二个模型的最低得分和最高得分，中间空格相连。

        Sample Input                                Sample Output
        4                                           43 52
        9 4 4 5                                     43 54

        Hint
        第一个石子合并模型,和书上3.1节的矩阵连乘问题类似.
        假设m[i,j]为合并石子ai…aj, 1≤i≤j≤n，所得到的最小得分，若没有“合并”这个动作，则为0。原问题所求的合并最小值即为m[1,n]。
        递推公式如下,其中min表示求最小,sum表示求和.
        (1) m[i,j]=0, ifi=j
        (2)m[i,j]=min{m[i,k]+m[k+1][j] | for i<=k<j} + sum{a(t) | for i<=t<=j}, if i<j
        至于求最大值完全同理.
        至于第二个石子合并的环行模型,完全可以转化为第一个模型来求解.
        将数组延伸为a[2n],即a[1…2n - 1], a1,a2…an,a1,a2…an-1,每次调用数组的长度为n即可
*/

public class T_11078 {
}
