package programmers.level.zero
/**
 * 문자열 반복해서 출력하기
 * url : https://school.programmers.co.kr/learn/courses/30/lessons/181950
 *
 * 문제 설명
 * 문자열 str과 정수 n이 주어집니다.
 * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
 * 1 ≤ str의 길이 ≤ 10
 * 1 ≤ n ≤ 5
 */
fun main(args: Array<String>) {
    example1(args)
    println("")
    example2(args)
}

/**
 * repeat 을 사용한 반복 예시
 */
private fun example1(args: Array<String>) {
    val (msg, count) = readln().split(" ")

    repeat(count.toInt()) {
        print(msg)
    }
}

/**
 * for 문을 사용한 반복 예시
 */
private fun example2(args: Array<String>) {
    val (msg, count) = readln().split(" ")

    for(i in 0 until count.toInt()) {
        print(msg)
    }
}