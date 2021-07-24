# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 3단계 - 자동차 경주 Todo-List 🎯
- [X] 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가
- [X] 자동차 클래스(RacingCar) 추가
  - [X] 전진(forward) 함수 테스트 구현
  - [X] 전진 함수 구현
  - [X] 위치 변수(pos) 추가
  - [X] 위치 변수 get/set 함수 추가
- [X] 입력 클래스(InputView) 추가
  - [X] 자동차 대수 입력 기능 구현
  - [X] 이동 횟수 입력 기능 구현
- [X] 출력 클래스(ResultView) 추가
  - [X] 실행 결과 출력 기능 구현
- [X] 유틸 클래스(Util) 추가
  - [X] 0 ~ 9 랜덤 값 생성 함수(generateForwardValue) 기능 테스트 구현  
  - [X] 0 ~ 9 랜덤 값 생성 함수 기능 구현
- [X] 경주 진행 관련 클래스(RaceMain) 추가
  - [X] 자동차 수 변수(racingCarNum) / 이동 횟수 변수(forwardCount) 추가
  - [X] 여러 개의 차를 관리하는 ArrayList 변수(racingCars) 추가
  
- [X] 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분
- [X] UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리

## 🕵️‍ 제약사항
- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- else 예약어를 쓰지 않는다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가
