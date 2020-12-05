# KKKotlinDemo
kotlin语法、算法、设计模式、协程等汇总demo


---
title: LeetCode百日计划-数组
copyright: false
abbrlink: 26469
date: 2020-12-03 16:20:44
categories:
  - LeetCode
tags:
  - LeetCode刷题
top: 98
cover: >-
  https://cdn.jsdelivr.net/gh/LeoCheung0221/tufusiCDN@latest/cover/ligita-borkovska-OuVkyuGAM58-unsplash.jpg
---

**<center><a name="专栏目录">数组专栏目录</a> </center>**


|  来源   |  题号   |       题目         | 语言 | 难易程度 | 时间复杂度 | 空间复杂度 | 星级 | 完成 |
|:----------:|:---------:|--------------------|:--------:|:------:|:-------:|:-------:|:----:|:----:|
| LeetCode | 1       | 两数之和                     | <a href="#两数之和">Kotlin</a> | <font color=#008000>简单</font>   | O(n)  |      |   | :white_check_mark: | 
| LeetCode | 4       | 寻找两个正序数组的中位数       | <a href="#寻找两个正序数组的中位数">Kotlin</a> |  <font color=red>困难</font>   |      |      |    |
| LeetCode | 11      |  盛最多水的容器               | <a href="#盛最多水的容器">Kotlin</a> | <font color=#871F78>中等</font>   |      |      |   | :white_check_mark: | 
| LeetCode | 15      |  三数之和                    | <a href="#三数之和">Kotlin</a> | <font color=#871F78>中等</font>   |      |      |   |
| LeetCode | 16      |  最接近的三数之和             | <a href="#最接近的三数之和">Kotlin</a> | <font color=#871F78>中等</font>   |      |      |   |
| LeetCode | 18      |  四数之和                    | <a href="#四数之和">Kotlin</a> | <font color=#871F78>中等</font>   |      |      |   |
| LeetCode | 26      |  删除排序数组中的重复项       | <a href="#删除排序数组中的重复项">Kotlin</a> | <font color=#008000>简单</font>   |      |      |   |
| LeetCode | 27      |  移除元素                    | <a href="#移除元素">Kotlin</a> | <font color=#008000>简单</font>   |      |      |   |
| LeetCode | 31      |  下一个排列                  | <a href="#下一个排列">Kotlin</a> |     |      |      |   |
| LeetCode | 33      |  搜索旋转排序数组             | <a href="#搜索旋转排序数组">Kotlin</a> |     |      |      |   |
| LeetCode | 34      |  在排序数组中查找元素的第一个和最后一个位置   | <a href="#在排序数组中查找元素的第一个和最后一个位置">Kotlin</a> |     |      |      |   |
| LeetCode | 35      |  搜索插入位置                | <a href="#搜索插入位置">Kotlin</a> |     |      |      |   |
| LeetCode | 39      |  组合总和                    | <a href="#组合总和">Kotlin</a> | <font color=#871F78>中等</font>   |      |      |   |
| LeetCode | 40      |  组合总和 II                 | <a href="#组合总和 II">Kotlin</a> | <font color=#871F78>中等</font>   |      |      |   |
| LeetCode | 41      |  缺失的第一个正数             | <a href="#缺失的第一个正数">Kotlin</a> | <font color=red>困难</font>   |      |      |   |
| LeetCode | 42      |  接雨水                      | <a href="#接雨水">Kotlin</a> | <font color=red>困难</font>   |      |      |   |
| LeetCode | 45      |  跳跃游戏 II                 | <a href="#跳跃游戏 II">Kotlin</a> |     |      |      |   |
| LeetCode | 48      |  旋转图像                    | <a href="#旋转图像">Kotlin</a> |     |      |      |   |
| LeetCode | 53      |  最大子序和                  | <a href="#最大子序和">Kotlin</a> |     |      |      |   |
| LeetCode | 54      |  螺旋矩阵                    | <a href="#螺旋矩阵">Kotlin</a> |     |      |      |   |
| LeetCode | 55      |  跳跃游戏                    | <a href="#跳跃游戏">Kotlin</a> |     |      |      |   |
| LeetCode | 56      |  合并区间                    | <a href="#合并区间">Kotlin</a> |     |      |      |   |
| LeetCode | 57      |  插入区间                    | <a href="#插入区间">Kotlin</a> |     |      |      |   |
| LeetCode | 59      |  螺旋矩阵 II                 | <a href="#螺旋矩阵 II">Kotlin</a> |     |      |      |   |
| LeetCode | 62      |  不同路径                    | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 63      |  不同路径 II                 | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 64      |  最小路径和                  | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 66      |  加一                       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 73      |  矩阵置零                    | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 74      |  搜索二维矩阵                | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 75      |  颜色分类                    | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 78      |  子集                       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 79      |  单词搜索                    | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 80      |  删除排序数组中的重复项       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 81      |  搜索旋转排序数组 II          | <a href="#搜索旋转排序数组 II">Kotlin</a> |     |      |      |   |
| LeetCode | 84      |  柱状图中最大的矩形           | <a href="#柱状图中最大的矩形">Kotlin</a> |     |      |      |   |
| LeetCode | 85      |  最大矩形                    | <a href="#最大矩形">Kotlin</a> |     |      |      |   |
| LeetCode | 88      |  合并两个有序数组             | <a href="#合并两个有序数组">Kotlin</a> |     |      |      |   |
| LeetCode | 90      |  子集 II                     | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 105     |  从前序与中序遍历序列构造二叉树 | <a href="#从前序与中序遍历序列构造二叉树  ">Kotlin</a> |     |      |      |   |
| LeetCode | 106     |  从中序与后序遍历序列构造二叉树 | <a href="#从中序与后序遍历序列构造二叉树  ">Kotlin</a> |     |      |      |   |
| LeetCode | 118     |  杨辉三角                     | <a href="#杨辉三角">Kotlin</a> |     |      |      |   |
| LeetCode | 119     |  杨辉三角 II                  | <a href="#杨辉三角 II">Kotlin</a> |     |      |      |   |
| LeetCode | 120     |  三角形最小路径和              | <a href="#三角形最小路径和">Kotlin</a> |     |      |      |   |
| LeetCode | 121     |  买卖股票的最佳时机            | <a href="#买卖股票的最佳时机">Kotlin</a> |     |      |      |   |
| LeetCode | 122     |  买卖股票的最佳时机 II         | <a href="#买卖股票的最佳时机 II">Kotlin</a> |     |      |      |   |
| LeetCode | 123     |  买卖股票的最佳时机 III        | <a href="#买卖股票的最佳时机 III">Kotlin</a> |     |      |      |   |
| LeetCode | 126     |  单词接龙 II                  | <a href="#单词接龙 II">Kotlin</a> |     |      |      |   |
| LeetCode | 128     |  最长连续序列                  | <a href="#最长连续序列">Kotlin</a> |     |      |      |   |
| LeetCode | 152     |  乘积最大子数组                | <a href="#乘积最大子数组">Kotlin</a> |     |      |      |   |
| LeetCode | 153     |  寻找旋转排序数组中的最小值     | <a href="#寻找旋转排序数组中的最小值">Kotlin</a> |     |      |      |   |
| LeetCode | 154     |  寻找旋转排序数组中的最小值 II  | <a href="#寻找旋转排序数组中的最小值 II">Kotlin</a> |     |      |      |   |
| LeetCode | 162     |  寻找峰值                     | <a href="#寻找峰值">Kotlin</a> |     |      |      |   |
| LeetCode | 163     |  缺失的区间                   | <a href="#缺失的区间">Kotlin</a> |     |      |      |   |
| LeetCode | 167     |  两数之和 II - 输入有序        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 169     |  多数元素                     | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 189     |  旋转数组                     | <a href="#旋转数组">Kotlin</a> |     |      |      |   |
| LeetCode | 209     |  长度最小的子数组             | <a href="#长度最小的子数组">Kotlin</a> |     |      |      |   |
| LeetCode | 216     |  组合总和 III                 | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 217     |  存在重复元素                 | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 219     |  存在重复元素 II              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 228     |  汇总区间                     | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 229     |  求众数 II                    | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 238     |  除自身以外数组的乘积          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 243     |  最短单词距离           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 245     |  最短单词距离 III       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 259     |  较小的三数之和          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 268     |  丢失的数字            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 277     |  搜寻名人             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 280     |  摆动排序             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 283     |  移动零              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 287     |  寻找重复数            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 289     |  生命游戏             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 370     |  区间加法             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 380     |  常数时间插入、删除和获      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 381     |  O(1) 时间插入、删除和    | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 414     |  第三大的数            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 442     |  数组中重复的数据         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 448     |  找到所有数组中消失的数      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 457     |  环形数组循环           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 485     |  最大连续1的个数         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 495     |  提莫攻击             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 509     |  斐波那契数            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 531     |  孤独像素 I           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 532     |  数组中的 k-diff 数对   | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 533     |  孤独像素 II          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 548     |  将数组分割成和相等的子      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 560     |  和为K的子数组          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 561     |  数组拆分 I           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 562     |  矩阵中最长的连续1线段      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 565     |  数组嵌套             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 566     |  重塑矩阵             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 581     |  最短无序连续子数组        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 605     |  种花问题             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 611     |  有效三角形的个数         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 621     |  任务调度器            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 624     |  数组列表中的最大距离       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 628     |  三个数的最大乘积         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 643     |  子数组最大平均数 I       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 644     |  最大平均子段和 II       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 661     |  图片平滑器            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 665     |  非递减数列            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 667     |  优美的排列 II         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 670     |  最大交换             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 674     |  最长连续递增序列         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 689     |  三个无重叠子数组的最大      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 695     |  岛屿的最大面积          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 697     |  数组的度             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 713     |  乘积小于K的子数组        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 714     |  买卖股票的最佳时机含手      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 717     |  1比特与2比特字符        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 718     |  最长重复子数组          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 719     |  找出第 k 小的距离对      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 723     |  粉碎糖果             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 724     |  寻找数组的中心索引        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 729     |  我的日程安排表 I        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 746     |  使用最小花费爬楼梯        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 747     |  至少是其他数字两倍的最      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 755     |  倒水               | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 766     |  托普利茨矩阵           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 768     |  最多能完成排序的块 II     | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 769     |  最多能完成排序的块        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 775     |  全局倒置与局部倒置        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 782     |  变为棋盘             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 792     |  匹配子序列的单词数        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 795     |  区间子数组个数          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 825     |  适龄的朋友            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 830     |  较大分组的位置          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 832     |  翻转图像             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 835     |  图像重叠             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 840     |  矩阵中的幻方           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 849     |  到最近的人的最大距离       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 867     |  转置矩阵             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 870     |  优势洗牌             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 873     |  最长的斐波那契子序列的      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 888     |  公平的糖果交换          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 891     |  子序列宽度之和          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 896     |  单调数列             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 900     |  RLE 迭代器          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 905     |  按奇偶排序数组          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 907     |  子数组的最小值之和        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 914     |  卡牌分组             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 915     |  分割数组             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 918     |  环形子数组的最大和        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 922     |  按奇偶排序数组 II       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 926     |  将字符串翻转到单调递增      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 941     |  有效的山脉数组          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 945     |  使数组唯一的最小增量       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 950     |  按递增顺序显示卡牌        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 954     |  二倍数对数组           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 962     |  最大宽度坡            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 969     |  煎饼排序             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 974     |  和可被 K 整除的子数组     | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 977     |  有序数组的平方          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 978     |  最长湍流子数组          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 985     |  查询后的偶数和          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 989     |  数组形式的整数加法        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 999     |  可以被一步捕获的棋子数      | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1002    | 查找常用字符             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1007    | 行相等的最少多米诺旋         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1010    | 总持续时间可被 60 整       | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1011    | 在 D 天内送达包裹的        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1013    | 将数组分成和相等的三         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1014    | 最佳观光组合             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1018    | 可被 5 整除的二进制        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1031    | 两个非重叠子数组的最         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1035    | 不相交的线              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1040    | 移动石子直到连续 II        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1051    | 高度检查器              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1052    | 爱生气的书店老板           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1053    | 交换一次的先前排列          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1064    | 不动点                | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1074    | 元素和为目标值的子矩         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1085    | 最小元素各数位之和          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1086    | 前五科的均分             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1089    | 复写零                | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1099    | 小于 K 的两数之和         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1109    | 航班预订统计             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1122    | 数组的相对排序            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1128    | 等价多米诺骨牌对的数         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1133    | 最大唯一数              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1144    | 递减元素使数组呈锯齿         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1146    | 快照数组               | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1150    | 检查一个数是否在数组         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1151    | 最少交换次数来组合所         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1152    | 用户网站访问行为分析         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1157    | 子数组中占绝大多数的         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1160    | 拼写单词               | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1169    | 查询无效交易             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1170    | 比较字符串最小字母出         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1176    | 健身计划评估             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1177    | 构建回文串检测            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1184    | 公交站间的距离            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1185    | 一周中的第几天            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1200    | 最小绝对差              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1202    | 交换字符串中的元素          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1208    | 尽可能使字符串相等          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1217    | 玩筹码                | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1222    | 可以攻击国王的皇后          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1232    | 缀点成线               | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1233    | 删除子文件夹             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1243    | 数组变换               | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1252    | 奇数值单元格的数目          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1260    | 二维网格迁移             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1266    | 访问所有点的最小时间         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1267    | 统计参与通信的服务器         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1275    | 找出井字棋的获胜者          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1277    | 统计全为 1 的正方形        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1287    | 有序数组中出现次数超         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1292    | 元素和小于等于阈值的         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1295    | 统计位数为偶数的数字         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1296    | 划分数组为连续数字的         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1299    | 将每个元素替换为右侧         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1300    | 转变数组后最接近目标         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1304    | 和为零的N个唯一整数         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1313    | 解压缩编码列表            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1329    | 将矩阵按对角线排序          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1330    | 翻转子数组得到最大的         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1331    | 数组序号转换             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1333    | 餐厅过滤器              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1337    | 矩阵中战斗力最弱的 K        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1338    | 数组大小减半             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1343    | 大小为 K 且平均值大        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1346    | 检查整数及其两倍数是         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1351    | 统计有序矩阵中的负数         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1352    | 最后 K 个数的乘积         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1365    | 有多少小于当前数字的         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1366    | 通过投票对团队排名          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1375    | 灯泡开关 III           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1380    | 矩阵中的幸运数            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1385    | 两个数组间的距离值          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1386    | 安排电影院座位            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1389    | 按既定顺序创建目标数         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1394    | 找出数组中的幸运数          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1395    | 统计作战单位数            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1399    | 统计最大组的数目           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1409    | 查询带键的排列            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1413    | 逐步求和得到正数的最         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1414    | 和为 K 的最少斐波那        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1423    | 可获得的最大点数           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1424    | 对角线遍历 II           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1426    | 数元素                | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1427    | 字符串的左右移            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1428    | 至少有一个 1 的最左        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1431    | 拥有最多糖果的孩子          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1437    | 是否所有 1 都至少相        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1438    | 绝对差不超过限制的最         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1442    | 形成两个异或相等数组         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1450    | 在既定时间做作业的学         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1460    | 通过翻转子数组使两个         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1464    | 数组中两元素的最大乘         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1465    | 切割后面积最大的蛋糕         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1470    | 重新排列数组             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1471    | 数组中的 k 个最强值        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1475    | 商品折扣后的最终价格         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1476    | 子矩形查询              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1480    | 一维数组的动态和           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1481    | 不同整数的最少数目          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1482    | 制作 m 束花所需的最        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1486    | 数组异或操作             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1488    | 避免洪水泛滥             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1491    | 去掉最低工资和最高工         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1493    | 删掉一个元素以后全为         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1497    | 检查数组对是否可以被         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1499    | 满足不等式的最大值          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1500    | 设计文件分享系统           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1502    | 判断能否形成等差数列         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1503    | 所有蚂蚁掉下来前的最         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1508    | 子数组和排序后的区间         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1509    | 三次操作后最大值与最         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1512    | 好数对的数目             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1524    | 和为奇数的子数组数目         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1534    | 统计好三元组             | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1535    | 找出数组游戏的赢家          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1539    | 第 k 个缺失的正整数        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1550    | 存在连续三个奇数的数         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1552    | 两球之间的磁力            | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1560    | 圆形赛道上经过次数最         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1566    | 重复至少 K 次且长度        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1570    | 两个稀疏向量的点积          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1572    | 矩阵对角线元素的和          | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1574    | 删除最短的子数组使剩         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1582    | 二进制矩阵中的特殊位         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1583    | 统计不开心的朋友           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1588    | 所有奇数长度子数组的         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1590    | 使数组和能被 P 整除        | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1608    | 特殊数组的特征值           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1619    | 删除某些元素后的数组         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1629    | 按键持续时间最长的键         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1636    | 按照频率将数组升序排         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1640    | 能否连接形成数组           | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1646    | 获取生成数组中的最大         | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1652    | 拆炸弹                | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1656    | 设计有序流              | <a href="">Kotlin</a> |     |      |      |   |
| LeetCode | 1672    | 最富有客户的资产总量         | <a href="">Kotlin</a> |     |      |      |   |
| 剑指 Offer | 3       | 数组中重复的数字           | <a href="">Kotlin</a> |     |      |      |   |
| 剑指 Offer | 4       | 二维数组中的查找           | <a href="">Kotlin</a> |     |      |      |   |
| 剑指 Offer | 29      | 顺时针打印矩阵            | <a href="">Kotlin</a> |     |      |      |   |
| 剑指 Offer | 53 - I  | 在排序数组中查找数字 I       | <a href="">Kotlin</a> |     |      |      |   |
| 剑指 Offer | 53 - II |  0～n-1中缺失的数字       | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 1.01    | 判定字符是否唯一           | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 1.02    | 判定是否互为字符重排         | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 1.07    | 旋转矩阵               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 1.08    | 零矩阵                | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 5.08    | 绘制直线               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 8.03    | 魔术索引               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 8.04    | 幂集                 | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 10.01   | 合并排序的数组            | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 10.03   | 搜索旋转数组             | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.04   | 井字游戏               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.06   | 最小差                | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.1    | 生存人数               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.15   | 珠玑妙算               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.16   | 部分排序               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.17   | 连续数列               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.2    | T9键盘               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.21   | 交换和                | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.22   | 兰顿蚂蚁               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 16.24   | 数对和                | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 17.04   | 消失的数字              | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 17.05   |  字母与数字             | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 17.1    | 主要元素               | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 17.19   | 消失的两个数字            | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 17.21   | 直方图的水量             | <a href="">Kotlin</a> |     |      |      |   |
| 面试题      | 17.22   | 单词转换               | <a href="">Kotlin</a> |

# 数组专题

## :pencil2: <a name="两数之和"><center>两数之和</center></a>

> 给定一个整数数组 `nums` 和一个目标值 `target`，请你在该数组中找出和为目标值的那 **两个** 整数，并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

**示例：**

    给定 nums = [2, 7, 11, 15], target = 9

    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]

**题目大意**

> 在数组中找到两个数字之后等于给定目标值，结果是返回两个找出数字在数组中的下标。

**解题思路**

> 这道题考察对映射关系的敏感程度，一般使用暴力算法可以很快解决，但是这里采取Map映射，value对应给定数组的下标，key对应下标的值，接下来通过遍历数组，如果map表里包含有目标值target-map表中另一值，则返回对应结果；否则存储下标及下标对应值。

**代码**

```java
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            if (hashMap.containsKey(target - nums[i])) {
                return intArrayOf(hashMap[target - nums[i]]!!, i)
            }
            hashMap[nums[i]] = i
        }
        return intArrayOf(0)
    }
}
```

## <a name="寻找两个正序数组的中位数" href="#专栏目录"><center>寻找两个正序数组的中位数</center></a> 

> 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。


**示例 1：**

> 
> &emsp;&emsp;**输入：** nums1 = [1,3], nums2 = [2]
> 
> &emsp;&emsp;**输出：** 2.00000
> 
> &emsp;&emsp;**解释：** 合并数组 = [1,2,3] ，中位数 2
> 

**示例 2：**

> 
> &emsp;&emsp;**输入：** nums1 = [1,2], nums2 = [3,4]
> 
> &emsp;&emsp;**输出：** 2.50000
> 
> &emsp;&emsp;**解释：** 合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
> 

**示例 3：**

> 
> &emsp;&emsp;**输入：** nums1 = [0,0], nums2 = [0,0]
> 
> &emsp;&emsp;**输出：** 0.00000
> 

**题目大意**

> 给定两个大小为m、n的有序数组 $N_1$ 和 $N_2$
> 找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log())
>

**解题思路**

> * 首先要求时间复杂度为 O(log (m+n))，就无法通过合并两个数组再取出中位数。看到log复杂度，尝试二分查找法解决。
> 
> * 虽然不能真的合并，但是我们可以假设两个数组合成一个（左边$N_1$和右边$N_2$ => 保证$N_1$最右边的值是在$N_2$哪一个位置，$N_2$最左边的值是在$N_1$哪一个位置？才是解决问题的关键），这里举例说明理解更好。
> 
> * 假设两个有序数组如下： 
>
> &emsp;&emsp;&emsp;$N_1$: 1 3 4 9  &emsp;&emsp;&emsp;length1 = 4
> 
> &emsp;&emsp;&emsp;$N_2$: 1 2 3 4 5 6 7 8 9  &emsp;&emsp;&emsp;length2 = 9
>
> &emsp;两个有序数组的长度之和为13。那么中位数是两个有序数组中的第**7**个元素，因此只要找到第**k=7**个元素。
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 
> 


**代码**

## <a name="盛最多水的容器" href="#专栏目录"><center>11. 盛最多水的容器</center></a> 

> 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
>
> 说明：你不能倾斜容器。


**示例：**

![question_11.jpg](https://i.loli.net/2020/12/04/sc2RoipTSkdq3YB.jpg)

> 
> &emsp;&emsp;**输入：** [1,8,6,2,5,4,8,3,7]
> 
> &emsp;&emsp;**输出：** 49 
> 
> &emsp;&emsp;**解释：** 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。


**题目大意**

>  给出一个非负整数数组，$a_1$、$a_2$、$a_3$ ... $a_n$，每个整数代表一个垂直在坐标轴 `x` 位置的高度为 $a_y$ 的墙，选择两堵墙（两堵墙取最矮），和x轴构成方形区域，在这些可行性区域内容器最多能容纳的水量

**解题思路**

>  首先这题需要了解**指针对撞**：对一个排好序的数组，存在两个指针，分别指向最左端和最右端，我们可以通过与目标值的对比，动态的移动左指针和右指针，逐渐接近目标值。这样通过首尾两个指针，每次移动以后都分别判断长宽的乘积是否是最大。

**代码**

```java
    class Solution {
        fun maxArea(height: IntArray): Int {
            var max = 0
            var start = 0 // 左边界
            var end = height.size - 1 // 右边界

            while (start < end) {
                var width = end - start
                // 初始化高度为左边界对应高度值
                var high = height[start]
                if (height[start] < height[end]){
                    high = height[start]
                    start++
                }else{
                    high = height[end]
                    end --
                }

                val temp = width * high
                if (temp > max){
                    max = temp
                }
            }
            return max
        }
    }
```

15  三数之和  
16  最接近的三数之和  
18  四数之和  
26  删除排序数组中的重复项  
27  移除元素  
31  下一个排列  
33  搜索旋转排序数组  
34  在排序数组中查找元素的第一个和最后一个位置  
35  搜索插入位置  
39  组合总和  
40  组合总和 II  
41  缺失的第一个正数  
42  接雨水  
45  跳跃游戏 II  
48  旋转图像  
53  最大子序和  
54  螺旋矩阵  
55  跳跃游戏  
56  合并区间  
57  插入区间  
59  螺旋矩阵 II  
62  不同路径  
63  不同路径 II  
64  最小路径和  
66  加一  
73  矩阵置零  
74  搜索二维矩阵  
75  颜色分类  
78  子集  
79  单词搜索  
80  删除排序数组中的重复项 II  
81  搜索旋转排序数组 II  
84  柱状图中最大的矩形  
85  最大矩形  
88  合并两个有序数组  
90  子集 II  
105  从前序与中序遍历序列构造二叉树  
106  从中序与后序遍历序列构造二叉树  
118  杨辉三角  
119  杨辉三角 II  
120  三角形最小路径和  
121  买卖股票的最佳时机  
122  买卖股票的最佳时机 II  
123  买卖股票的最佳时机 III  
126  单词接龙 II  
128  最长连续序列  
152  乘积最大子数组  
153  寻找旋转排序数组中的最小值  
154  寻找旋转排序数组中的最小值 II  
162  寻找峰值  
163  缺失的区间  
167  两数之和 II - 输入有序数组  
169  多数元素  
189  旋转数组  
209  长度最小的子数组  
216  组合总和 III  
217  存在重复元素  
219  存在重复元素 II  
228  汇总区间  
229  求众数 II  
238  除自身以外数组的乘积  
243  最短单词距离  
245  最短单词距离 III  
259  较小的三数之和  
268  丢失的数字  
277  搜寻名人  
280  摆动排序  
283  移动零  
287  寻找重复数  
289  生命游戏  
370  区间加法  
380  常数时间插入、删除和获取随机元素  
381  O(1) 时间插入、删除和获取随机元素 - 允许重复  
414  第三大的数  
442  数组中重复的数据  
448  找到所有数组中消失的数字  
457  环形数组循环  
485  最大连续1的个数  
495  提莫攻击  
509  斐波那契数  
531  孤独像素 I  
532  数组中的 k-diff 数对  
533  孤独像素 II  
548  将数组分割成和相等的子数组  
560  和为K的子数组  
561  数组拆分 I  
562  矩阵中最长的连续1线段  
565  数组嵌套  
566  重塑矩阵  
581  最短无序连续子数组  
605  种花问题  
611  有效三角形的个数  
621  任务调度器  
624  数组列表中的最大距离  
628  三个数的最大乘积  
643  子数组最大平均数 I 
644  最大平均子段和 II  
661  图片平滑器  
665  非递减数列  
667  优美的排列 II  
670  最大交换  
674  最长连续递增序列  
689  三个无重叠子数组的最大和  
695  岛屿的最大面积  
697  数组的度  
713  乘积小于K的子数组  
714  买卖股票的最佳时机含手续费  
717  1比特与2比特字符  
718  最长重复子数组  
719  找出第 k 小的距离对  
723  粉碎糖果  
724  寻找数组的中心索引  
729  我的日程安排表 I  
746  使用最小花费爬楼梯  
747  至少是其他数字两倍的最大数  
755  倒水  
766  托普利茨矩阵  
768  最多能完成排序的块 II  
769  最多能完成排序的块  
775  全局倒置与局部倒置  
782  变为棋盘  
792  匹配子序列的单词数  
795  区间子数组个数  
825  适龄的朋友  
830  较大分组的位置  
832  翻转图像  
835  图像重叠  
840  矩阵中的幻方  
849  到最近的人的最大距离  
867  转置矩阵  
870  优势洗牌  
873  最长的斐波那契子序列的长度  
888  公平的糖果交换  
891  子序列宽度之和  
896  单调数列  
900  RLE 迭代器  
905  按奇偶排序数组  
907  子数组的最小值之和  
914  卡牌分组  
915  分割数组  
918  环形子数组的最大和  
922  按奇偶排序数组 II  
926  将字符串翻转到单调递增  
941  有效的山脉数组  
945  使数组唯一的最小增量  
950  按递增顺序显示卡牌  
954  二倍数对数组  
962  最大宽度坡  
969  煎饼排序  
974  和可被 K 整除的子数组  
977  有序数组的平方  
978  最长湍流子数组  
985  查询后的偶数和  
989  数组形式的整数加法  
999  可以被一步捕获的棋子数  
1002  查找常用字符  
1007  行相等的最少多米诺旋转  
1010  总持续时间可被 60 整除的歌曲  
1011  在 D 天内送达包裹的能力  
1013  将数组分成和相等的三个部分  
1014  最佳观光组合  
1018  可被 5 整除的二进制前缀  
1031  两个非重叠子数组的最大和  
1035  不相交的线  
1040  移动石子直到连续 II  
1051  高度检查器  
1052  爱生气的书店老板  
1053  交换一次的先前排列  
1064  不动点  
1074  元素和为目标值的子矩阵数量  
1085  最小元素各数位之和  
1086  前五科的均分  
1089  复写零  
1099  小于 K 的两数之和  
1109  航班预订统计  
1122  数组的相对排序  
1128  等价多米诺骨牌对的数量  
1133  最大唯一数  
1144  递减元素使数组呈锯齿状  
1146  快照数组  
1150  检查一个数是否在数组中占绝大多数  
1151  最少交换次数来组合所有的 1  
1152  用户网站访问行为分析  
1157  子数组中占绝大多数的元素  
1160  拼写单词  
1169  查询无效交易  
1170  比较字符串最小字母出现频次  
1176  健身计划评估  
1177  构建回文串检测  
1184  公交站间的距离  
1185  一周中的第几天  
1200  最小绝对差  
1202  交换字符串中的元素  
1208  尽可能使字符串相等  
1217  玩筹码  
1222  可以攻击国王的皇后 
1232  缀点成线  
1233  删除子文件夹  
1243  数组变换  
1252  奇数值单元格的数目  
1260  二维网格迁移  
1266  访问所有点的最小时间  
1267  统计参与通信的服务器  
1275  找出井字棋的获胜者  
1277  统计全为 1 的正方形子矩阵  
1287  有序数组中出现次数超过25%的元素  
1292  元素和小于等于阈值的正方形的最大边长  
1295  统计位数为偶数的数字  
1296  划分数组为连续数字的集合  
1299  将每个元素替换为右侧最大元素  
1300  转变数组后最接近目标值的数组和  
1304  和为零的N个唯一整数  
1313  解压缩编码列表  
1329  将矩阵按对角线排序  
1330  翻转子数组得到最大的数组值  
1331  数组序号转换  
1333  餐厅过滤器  
1337  矩阵中战斗力最弱的 K 行  
1338  数组大小减半  
1343  大小为 K 且平均值大于等于阈值的子数组数目  
1346  检查整数及其两倍数是否存在  
1351  统计有序矩阵中的负数  
1352  最后 K 个数的乘积  
1365  有多少小于当前数字的数字  
1366  通过投票对团队排名  
1375  灯泡开关 III  
1380  矩阵中的幸运数  
1385  两个数组间的距离值  
1386  安排电影院座位  
1389  按既定顺序创建目标数组  
1394  找出数组中的幸运数  
1395  统计作战单位数  
1399  统计最大组的数目  
1409  查询带键的排列  
1413  逐步求和得到正数的最小值  
1414  和为 K 的最少斐波那契数字数目  
1423  可获得的最大点数  
1424  对角线遍历 II  
1426  数元素  
1427  字符串的左右移  
1428  至少有一个 1 的最左端列  
1431  拥有最多糖果的孩子  
1437  是否所有 1 都至少相隔 k 个元素  
1438  绝对差不超过限制的最长连续子数组  
1442  形成两个异或相等数组的三元组数目  
1450  在既定时间做作业的学生人数  
1460  通过翻转子数组使两个数组相等  
1464  数组中两元素的最大乘积  
1465  切割后面积最大的蛋糕  
1470  重新排列数组  
1471  数组中的 k 个最强值  
1475  商品折扣后的最终价格  
1476  子矩形查询  
1480  一维数组的动态和  
1481  不同整数的最少数目  
1482  制作 m 束花所需的最少天数  
1486  数组异或操作  
1488  避免洪水泛滥  
1491  去掉最低工资和最高工资后的工资平均值  
1493  删掉一个元素以后全为 1 的最长子数组  
1497  检查数组对是否可以被 k 整除  
1499  满足不等式的最大值  
1500  设计文件分享系统  
1502  判断能否形成等差数列  
1503  所有蚂蚁掉下来前的最后一刻  
1508  子数组和排序后的区间和  
1509  三次操作后最大值与最小值的最小差  
1512  好数对的数目  
1524  和为奇数的子数组数目  
1534  统计好三元组  
1535  找出数组游戏的赢家  
1539  第 k 个缺失的正整数  
1550  存在连续三个奇数的数组  
1552  两球之间的磁力  
1560  圆形赛道上经过次数最多的扇区  
1566  重复至少 K 次且长度为 M 的模式  
1570  两个稀疏向量的点积  
1572  矩阵对角线元素的和  
1574  删除最短的子数组使剩余数组有序  
1582  二进制矩阵中的特殊位置  
1583  统计不开心的朋友  
1588  所有奇数长度子数组的和  
1590  使数组和能被 P 整除  
1608  特殊数组的特征值  
1619  删除某些元素后的数组均值  
1629  按键持续时间最长的键  
1636  按照频率将数组升序排序  
1640  能否连接形成数组  
1646  获取生成数组中的最大值  
1652  拆炸弹  
1656  设计有序流  
1672  最富有客户的资产总量  
剑指 Offer 03  数组中重复的数字  
剑指 Offer 04  二维数组中的查找  
剑指 Offer 29  顺时针打印矩阵  
剑指 Offer 53 - I  在排序数组中查找数字 I 
剑指 Offer 53 - II  0～n-1中缺失的数字  
面试题 01.01  判定字符是否唯一  
面试题 01.02  判定是否互为字符重排  
面试题 01.07  旋转矩阵  
面试题 01.08  零矩阵  
面试题 05.08  绘制直线  
面试题 08.03  魔术索引  
面试题 08.04  幂集  
面试题 10.01  合并排序的数组  
面试题 10.03  搜索旋转数组  
面试题 16.04  井字游戏  
面试题 16.06  最小差  
面试题 16.10  生存人数  
面试题 16.15  珠玑妙算  
面试题 16.16  部分排序  
面试题 16.17  连续数列  
面试题 16.20  T9键盘  
面试题 16.21  交换和  
面试题 16.22  兰顿蚂蚁  
面试题 16.24  数对和  
面试题 17.04  消失的数字  
面试题 17.05   字母与数字  
面试题 17.10  主要元素  
面试题 17.19  消失的两个数字  
面试题 17.21  直方图的水量  
面试题 17.22  单词转换
