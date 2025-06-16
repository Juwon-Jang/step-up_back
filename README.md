# 🧠 StepUp Backend

Spring Boot 기반 멘토링 매칭 웹서비스 **StepUp**의 백엔드 레포지토리입니다.

> 해당 프로젝트는 2025년 웹프로그래밍 과목의 과제 제출용입니다.

---

## 📦 주요 기능

- 회원가입 / 로그인
- 멘토 리스트 제공
- 멘토링 등록 / 조회
- 리뷰 등록 / 조회
- 내장 H2 데이터베이스 사용 (종료 시 초기화 가능)

---

## ⚙️ 실행 방법

### ✅ 1. 환경 준비

- JDK 17 이상
- IntelliJ IDEA (또는 VSCode + Maven)

### ✅ 2. 실행 절차

1. IDE에서 `StepupBackendApplication.java` 실행
2. 콘솔에 아래 메시지 확인:
Tomcat started on port(s): 8080
Started StepupBackendApplication


3. 브라우저 또는 프론트엔드에서 `http://localhost:8080`으로 API 통신 가능

---

## 💾 DB 정보

- 내장형 H2 데이터베이스 사용 (파일 설치 필요 없음)
- 어플리케이션 종료 시 데이터 초기화 허용됨
- H2 Console 접근은 별도 설정 없음

---

## 🔗 API 엔드포인트 요약

| 엔드포인트 | 설명 |
|------------|------|
| `POST /users/register` | 회원가입 |
| `POST /users/login` | 로그인 |
| `GET /users/mentors` | 멘토 리스트 조회 |
| `POST /mentoring/register` | 멘토링 등록 |
| `GET /mentoring/all` | 전체 멘토링 목록 조회 |
| `POST /review` | 리뷰 등록 |
| `GET /review/all` | 전체 리뷰 목록 조회 |

---

## 🤝 프론트엔드 연동

프론트엔드가 `localhost:3000`에서 실행 중일 때,  
백엔드에서 CORS 허용이 되어 있어 별도 설정 없이 통신 가능합니다.
