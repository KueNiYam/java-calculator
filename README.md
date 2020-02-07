# java-calculator
문자열 계산기 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 요구사항
- 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
- 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
- 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

## 구현할 기능 목록
- [x] 사용자로부터 입력값을 받는다. 
    - 사용자는 숫자와 기호 사이를 공백으로 분리하여 입력한다.
    - [예외처리] 입력값이 없는 경우
- [x] 공백을 기준으로 split 한다.
- [x] 숫자인지 아닌지 판별
- [ ] 연산 기호별 계산 진행
    - [예외처리] 유효하지 않은 연산 기호 입력하는 경우
    - [예외처리] 0으로 나눌 경우
- [x] 계산한 결과값 출력
