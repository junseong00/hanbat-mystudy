# hanbat-mystudy
한밭대학교 특강 실습 프로젝트(박준성)



## 프로젝트 개요
Java와 Gradle을 활용한 기본적인 콘솔 애플리케이션입니다.

## 기술 스택
- **Language**: Java 21
- **Build Tool**: Gradle 8.x
- **Dependencies**: 
  - Google Guava 33.4.5
  - JUnit 5.12.1

## 프로젝트 구조
```
├── app/
│   ├── src/main/java/org/example/myapp/
│   │   └── App.java                 # 메인 애플리케이션
│   ├── src/main/resources/          # 리소스 파일
│   └── src/test/java/               # 테스트 코드
├── doc/                             # 프로젝트 문서
├── gradle/                          # Gradle 래퍼
├── build.gradle                     # 빌드 스크립트
└── settings.gradle                  # 프로젝트 설정
```

## 실행 방법

### 개발 환경 실행
```bash
./gradlew run
```

### JAR 파일 빌드 및 실행
```bash
# JAR 파일 생성
./gradlew jar

# 생성된 JAR 실행 (myapp.jar로 설정됨)  
java -jar app/build/libs/myapp.jar
```

### 테스트 실행
```bash
./gradlew test
```

## 개발 환경
- Java 21 이상
- Gradle (래퍼 포함)

## 작성자
- **이름**: 박준성
- **소속**: 한밭대학교
- **GitHub**: [@junseong00](https://github.com/junseong00)

## 라이선스
이 프로젝트는 교육 목적으로 작성되었습니다.