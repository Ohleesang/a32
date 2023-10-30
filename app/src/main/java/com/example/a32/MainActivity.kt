package com.example.a32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(a: IntArray, b: IntArray): Int {
                var answer: Int = 0
                for(index in 0..a.size-1){
                    answer += a[index]*b[index]
                }
                return answer
            }
        }
        val a =Solution()
        a.solution(intArrayOf(1,2,3,4),intArrayOf(-3,-1,0,2))
        a.solution(intArrayOf(-1,0,1),intArrayOf(1,0,-1))
    }
}