package programmers.level.zero

/**
 * 프로그래머스 Level 0 a와 b 출력하기
 * url : https://school.programmers.co.kr/learn/courses/30/lessons/181951
 *
 * 문제 설명
 * 정수 a와 b가 주어집니다.
 * 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
 * -100,000 ≤ a, b ≤ 100,000
 */
fun main(args: Array<String>) {
    example1(args)
}

private fun example1(args: Array<String>) {
    val (a, b) = readln().split(" ")
    println("a = $a")
    println("b = $b")
}