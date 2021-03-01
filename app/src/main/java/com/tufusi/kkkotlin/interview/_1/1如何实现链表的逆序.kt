package com.tufusi.kkkotlin.interview._1

/**
 *
 * @author 鼠夏目 <a href="mailto:n_sxmu@3songshu.com">Contact me.</a>
 * @version 1.0
 * @since 2021/2/2 13:09
 *
 * @description 给定一个带头结点的单链表，请将其逆序。
 * 即如果单链表原来为head-＞1-＞2-＞3-＞4-＞5-＞6-＞7，
 * 则逆序后变为head-＞7-＞6-＞5-＞4-＞3-＞2-＞1。
 */
class `1如何实现链表的逆序` {

    /**
     * 对单链表进行逆序
     * @param head 链表头结点
     */
    fun reverse1(head: LNode) {
        // 判断链表是否为空
        if (head.next == null) {
            return
        }

        var pre: LNode? // 前驱结点
        var cur: LNode? // 当前结点
        var next: LNode? // 后继结点
        // 把链表首结点变为尾结点
        cur = head.next
    }

    fun main(args: Array<String>) {

    }

    class LNode {

        var next: LNode? = null
    }

}