package programmers.level.zero

/**
 * 프로그래머스 Level 0 문자열 출력하기
 * url : https://school.programmers.co.kr/learn/courses/30/lessons/181952
 *
 * 문제 설명
 * 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
 * 1 ≤ str의 길이 ≤ 1,000,000
 * str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
 */
fun main(args: Array<String>) {
    example1(args)
    example2(args)
    example3(args)
}

/**
 * readln 함수를 사용한 예시
 * readln 은 null 을 반환하지 않으므로 Safe Call 을 사용할 필요가 없음
 */
private fun example1(args: Array<String>) {
    val input = readln()
    println(input)
}

/**
 * readlnOrNull 함수를 사용한 예시
 * readlnOrNull 의 경우 null 을 반환하기 때문에 Safe Call 을 사용해야합니다.
 */
private fun example2(args: Array<String>) {
    readlnOrNull()?.let(::println)
}

/**
 * 제한사항까지 포함시킨 예시
 * takeIf 는 null 을 반환하기 때문에 Safe Call 을 사용해야 합니다.
 */
private fun example3(args: Array<String>) {
    readln().takeIf { it.length <= 1000000 }?.let(::println)
}