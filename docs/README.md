## 기능 요구사항

- [x] 자동차 이름의 정상적인 입력 받기
- [x] 쉼표(,)를 기준으로 구분하여 자동차 이름 입력값 파싱하기
- [x] 자동차 이름의 비정상적인 입력 받기
  - [x] 이름이 비어있는 경우
  - [x] 크기가 6자 이상인 경우
- [x] 자동차 이름의 입력값으로 모든 자동차 정보를 가지는 클래스 만들기
- [x] 이동 횟수 정상적인 입력 받기
- [ ] 이동 횟수 비정상적인 입력 받기
    - [ ] 숫자가 아닌 경우
- [ ] 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우 전진 하기
- [ ] 매 라운드 마다 자동차 위치 출력하기
- [ ] 우승자 계산하기
- [ ] 우승자 출력하기

## 프로그래밍 요구사항

- [ ] 들여쓰기의 깊이는 최대 2
- [ ] 3항 연산자 쓰지 않기
- [ ] 함수는 한 가지 일만 하도록 구현하기
- [ ] 함수의 길이가 15라인을 넘지 않도록 구현하기
- [ ] else 예약어 쓰지 않기
- [ ] camp.nextstep.edu.missionutils API 사용
    - [ ] Randoms.pickNumberInRange()를 사용하여 랜덤값 추출
    - [ ] Console.readLine()를 사용하여 사용자 입력값 받기

## 프로그래밍 요구사항 - Car 객체

- [ ] Car 기본 생성자 추가하지 않기
- [ ] name, position 변수의 접근 제어자인 private을 변경하지 않기
- [ ] setPosition(int position) 메소드를 추가하지 않기

## 과제 제출 전 확인

- [ ] https://github.com/woowacourse/java-racingcar-precourse 에서 fork/clone 받기
- [ ] docs/README.md에 구현할 기능 목록 정리
- [ ] 커밋 메시지 컨벤션을 지키며, 기능 목록 단위로 커밋 남기기
- [ ] https://github.com/woowacourse/woowacourse-docs/tree/master/precourse 참고하여 과제 제출
- [ ] https://apply.techcourse.co.kr 에 접속하여 과제 제출
- [ ] java -version 으로 자바 8버전 확인
- [ ] ./gradlew clean test 으로 모든 테스트가 통과하는지 확인