package programmers.level.zero

/**
 * 대소문자 바꿔서 출력하기
 * url : https://school.programmers.co.kr/learn/courses/30/lessons/181949
 *
 * 문제 설명
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
 * 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
 * 1 ≤ str의 길이 ≤ 20
 * str은 알파벳으로 이루어진 문자열입니다.
 */
fun main(args: Array<String>) {
    example1(args)
    example2(args)
    example3(args)
    example4(args)
}

/**
 * map 안에서 if문을 사용한 예시
 */
private fun example1(args: Array<String>) {
    val msg = readln().map {
        if (it.isUpperCase()) {
            it.lowercase()
        } else {
            it.uppercase()
        }
    }.joinToString("") // 컬렉션 요소를 문자열로 변환시키는 함수

    println(msg)
}

/**
 * map 안에서 takeIf 문을 사용한 예시
 */
private fun example2(args: Array<String>) {
    val msg = readln().map {
        it.takeIf { it.isUpperCase() }?.lowercase() ?: it.uppercase()
    }.joinToString("")

    println(msg)
}

/**
 * 대소문자 변환 기능을 분리한 예시
 */
private fun example3(args: Array<String>) {
    val msg = readln().map(::convertCase).joinToString("")
    println(msg)
}

private fun convertCase(char: Char) = if (char.isUpperCase()) char.lowercaseChar() else char.uppercaseChar()

/**
 * 확장함수를 사용한 예시
 */
private fun example4(args: Array<String>) {
    val msg = readln().map(Char::convertCase2).joinToString("")
    println(msg)
}

private fun Char.convertCase2() = if (isUpperCase()) lowercaseChar() else uppercaseChar()