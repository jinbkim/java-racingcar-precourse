## 기능 요구사항
- [x] 경주할 자동차 이름을 쉼표로 구분하여 정상적인 입력값으로 입력받기
- [x] 경주할 자동차 이름을 비정상적인 입력값으로 입력받기
  - [x] 6자 이상의 이름을 입력으로 받았을 경우
  - [x] 이름이 공백일 경우
  - [x] 중복된 자동차 이름이 존재할 경우
- [x] 경주 시도 횟수 정상적인 입력값으로 입력받기
- [x] 경주 시도 횟수 비정상적인 입력값으로 입력받기
  - [x] 숫자가 아닌 경우
  - [x] 자연수가 아닌 경우
- [ ] 0에서 9사이의 무작위 값을 이용해 4 이상일 경우, 말 전진하기
- [ ] 게임 완료후, 우승자 출력하기
  - [ ] 우숭자가 여러 명일 경우 쉼표(,)로 구분하여 출력하기

## 프로그래밍 요구사항
- [x] java 8 버전 확인하기
- [ ] ./gradlew clean test의 모든 테스트를 통과하기
- [ ] 자바 컨벤션 지키기
- [ ] 들여쓰기의 깊이는 최대 2까지 허용
- [ ] 3항 연산자 쓰지 않기
- [ ] 함수가 한가지 일만 하도록 최대한 작게 만들기
- [ ] 함수의 길이가 15라인이 넘지 않도록 구현하기
- [ ] else 사용 x
- [ ] switch/case 사용 x
- [ ] camp.nextstep.edu.missionutils 에서 제공하는 Randoms, Console API 사용하기
  - [ ] Randoms.pickNumberInRange()로 랜덤변수 생성하기
  - [ ] Console.readLine()로 입력 받기

## 프로그래밍 요구사항 - Car 객체
- [ ] Car 기본 생성자 추가 x
- [ ] name, position 변수의 접근 제어자인 private을 변경 x
- [ ] setPosition(int position) 메소드를 추가 x

## 과제 진행 요구사항

- [ ] https://github.com/woowacourse/java-racingcar-precourse 에서 포크하고 클론받기
- [ ] 구현할 기능목록 작성하기
- [ ] 커밋 단위는 기능목록 단위
- [ ] 의미있는 커밋 메시지 작성하기
- [ ] https:/github.com/woowacourse/woowacourse-docs/tree/master/precourse 를 참고하여 과제 제출하기

## 학습한 내용

### String 메소드

- trim() : 문자열 앞 뒤 공백 제거

### Arrays 메소드

- asList() : 배열을 리스트로 변환

### 제네릭 와일드 카드

- \<?> : 타입 변수에 모든 타입을 사용 가능
- \<? extends T> : T 타입과 T 타입을 상속받는 자손 클래스 타입만이 사용 가능
- \<? super T> :  타입과 T 타입이 상속받은 조상 클래스 타입만이 사용 가능

### 함수형 인터페이스

- Consumer<T> : Type T 인자를 받고 리턴 값이 없는 함수형 인터페이스

### List 메소드

- forEach(Consumer<? super T> action) : 리스트의 모든 요소들을 Consumer을 구현한 함수로 처리

### Effectively Final

- 초기화 된 이후 값이 한번도 변경되지 않은 값

### Capturing Lambda

- 외부 변수를 이용하는 람다식
- 람다식에서 사용되는 외부 지역 변수는 복사본
- 외부 지역 변수는 final 혹은 effectively final 이어야 함
- 복사된 지역 변수 값은 람다식 내부에서도 변경할 수 없음

### Non Capturing Lambda

- 외부 변수로 인스턴스 변수 혹은 클래스 변수를 이용하는 람다식
- Capturing Lambda와 다르게 final 제약 조건이 없고, 지역 변수는 복사본이 아님

### Checked Exception

- RuntimeException을 상속받지 않은 클래스
- 명시적으로 꼭 처리해야하는 예외

### Unchecked Exception

- RuntimeException을 상속받은 클래스
- 명시적으로 처리하지 않아도 되는 예외
